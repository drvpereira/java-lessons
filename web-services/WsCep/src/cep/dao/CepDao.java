package cep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cep.dominio.Logradouro;

public class CepDao {

	private Connection getConnection() throws Exception {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(
				"jdbc:postgresql://10.9.0.94/sistemas_comum",
				"comum_user", "comum_user");
	}
	
	public Logradouro buscarLogradouroPorCep(String cep) {
		String sql = "select l.id as l_id, l.nome as l_nome, "
			+ "l.tipo_logradouro, b.id as b_id, b.nome as b_nome, "
			+ "loc.id as loc_id, loc.nome as loc_nome, e.id as e_id, "
			+ "e.nome as e_nome, e.sigla as e_sigla "
			+ "from correios.logradouro l " 
			+ "left join correios.bairro b on (l.id_bairro = b.id) "
			+ "left join correios.localidade loc on (b.id_localidade = loc.id) "
			+ "left join correios.estado e on (loc.id_estado = e.id) "
			+ "where l.cep = ?";

		Connection con = null;
		
		try {
			con = getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setLong(1, Long.valueOf(cep));
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
				Logradouro l = new Logradouro();
				l.setId(rs.getInt("l_id"));
				l.setNome(rs.getString("l_nome"));
				l.setCep(cep);
				l.setTipo(rs.getString("tipo_logradouro"));
				l.getBairro().setId(rs.getInt("b_id"));
				l.getBairro().setNome(rs.getString("b_nome"));
				l.getBairro().getLocalidade().setId(rs.getInt("loc_id"));
				l.getBairro().getLocalidade().setNome(rs.getString("loc_nome"));
				l.getBairro().getLocalidade().getEstado().setId(rs.getInt("e_id"));
				l.getBairro().getLocalidade().getEstado().setNome(rs.getString("e_nome"));
				l.getBairro().getLocalidade().getEstado().setSigla(rs.getString("e_sigla"));
				return l;
			}
			
			return null;
		} catch(Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
