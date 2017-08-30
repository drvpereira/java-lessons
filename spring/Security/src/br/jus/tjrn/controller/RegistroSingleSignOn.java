package br.jus.tjrn.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RegistroSingleSignOn {

	@Autowired
	private JdbcTemplate jt;
	
	public void adicionar(TokenSingleSignOn sso) {
		jt.update("insert into tokensso (sessionId, valid, login, "
				+ "dataDeCriacao, dataDeInvalidacao, ip) values "
				+ "(?, ?, ?, ?, ?, ?)", new Object[] { sso.getKey(),
						sso.isValid(), sso.getUsername(), sso.getCreatedAt(),
						sso.getInvalidatedAt(), sso.getIp()});
	}
	
	public void invalidar(String key) {
		jt.update("update tokensso set valid = 0 where valid = 1 "
				+ "and sessionId = ?", new Object[] { key });
	}

	public TokenSingleSignOn getValidByUserName(String login) {
		List query = jt.query("select top 1 * from tokensso where valid = 1 "
					+ "and login = ? order by dataDeCriacao desc", new Object[] { login }, new RowMapper() {
						public Object mapRow(ResultSet rs, int rowNum)
								throws SQLException {
							TokenSingleSignOn sso = new TokenSingleSignOn();
							sso.setId(rs.getInt("id"));
							sso.setKey(rs.getString("sessionId"));
							sso.setCreatedAt(rs.getTimestamp("dataDeCriacao"));
							sso.setInvalidatedAt(rs.getTimestamp("dataDeInvalidacao"));
							sso.setValid(rs.getBoolean("valid"));
							sso.setIp(rs.getString("ip"));
							sso.setUsername(rs.getString("login"));
							return sso;
						}
					});
		if (query != null && !query.isEmpty())
			return (TokenSingleSignOn) query.get(0);
		else
			return null;
	}
	
}
