package datasource;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LocalidadeMapper implements RowMapper<Localidade> {

	@Override
	public Localidade mapRow(ResultSet rs, int rowNum) throws SQLException {
		Localidade l = new Localidade();
		l.setId(rs.getInt("id"));
		l.setNome(rs.getString("nome"));
		l.setUf(rs.getString("uf"));
		return l;
	}

}
