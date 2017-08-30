package br.jus.tjrn.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioRegistroEntradaImpl implements RepositorioRegistroEntrada {

	private static final RowMapper MAPPER = new RowMapper() {
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			RegistroEntrada reg = new RegistroEntrada();
			reg.setId(rs.getLong("id"));
			reg.setLogin(rs.getString("login"));
			reg.setDataLogon(rs.getTimestamp("dataDeLogon"));
			reg.setDataLogoff(rs.getTimestamp("dataDeLogoff"));
			reg.setRemoteAddress(rs.getString("remoteAddress"));
			reg.setSessionId(rs.getString("sessionId"));
			return reg;
		}
	};
	
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void adicionar(RegistroEntrada re) {
		jt.update("insert into registroentrada (login, dataDeLogon, "
				+ "dataDeLogoff, remoteAddress, sessionId) values (?, ?, ?, ?, ?)",
				new Object[] { re.getLogin(), re.getDataLogon(), re.getDataLogoff(), re.getRemoteAddress(),
						re.getSessionId()});
	}

	@Override
	public void atualizar(RegistroEntrada re) {
		jt.update("update registroentrada set login=?, dataDeLogon=?, dataDeLogoff=?, "
				+ "remoteAddress=?, sessionId=? where id = ?", new Object[] { re.getLogin(),
						re.getDataLogon(), re.getDataLogoff(), re.getRemoteAddress(), re.getSessionId(),
						re.getId() });
	}

	@Override
	public RegistroEntrada pegarRegistroEntrada(String sessionId) {
		return (RegistroEntrada) jt.queryForObject("select * from registroentrada where sessionId=?", 
			new Object[] { sessionId }, MAPPER );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegistroEntrada> pegarPorLogin(String login) {
		return jt.query("select * from registroentrada where login = ?", new Object[] { login }, MAPPER);
	}

}
