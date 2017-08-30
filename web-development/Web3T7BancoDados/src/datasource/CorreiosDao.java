package datasource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CorreiosDao {

	@Inject
	private JdbcTemplate jt;
	
	public int buscarQtdEstados() {
		return jt.queryForInt("select count(*) from correios.estado");
	}

	public int buscarQtdCidadesNoEstado(String sigla) {
		return jt.queryForInt("select count(*) from correios.localidade "
				+ "where uf = ?", sigla);
	}
	
	public int inserirEstado(String nome, String sigla) {
		int id = jt.queryForInt("select nextval('correios.estado_seq')");
		
		jt.update("insert into correios.estado (id, nome, sigla) values (?, ?, ?)",
				id, nome, sigla);
		
		return id;
	}
	
	public String buscarNomeEstadoPorSigla(String sigla) {
		return jt.queryForObject("select nome from correios.estado where "
				+ "sigla = ?", String.class, sigla);
	}
	
	private RowMapper<Localidade> localidadeMapper = new RowMapper<Localidade>() {
		public Localidade mapRow(ResultSet rs, int rowNum) throws SQLException {
			Localidade l = new Localidade();
			l.setId(rs.getInt("id"));
			l.setNome(rs.getString("nome"));
			l.setUf(rs.getString("uf"));
			return l;
		}
	};
	
	public Localidade buscarLocalidadePorId(int id) {
		return jt.queryForObject("select * from correios.localidade "
				+ " where id = ?", localidadeMapper, id);
		
	}
	
	public List<Localidade> buscarLocalidadesPorUf(String sigla) {
		return jt.query("select * from correios.localidade " +
				"where uf = ?", new LocalidadeMapper(), sigla);
	}
	

	
	
	
}





