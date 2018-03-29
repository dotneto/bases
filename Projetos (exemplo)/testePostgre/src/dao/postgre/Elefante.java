package dao.postgre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class Elefante {

	private Connection con;

	public Elefante() {
		con = ConnectionFactory.getConnection();
	}

	public List<Pessoa> getLista() {
		List<Pessoa> result = new ArrayList<>();

		try {

			PreparedStatement stmt = this.con.prepareStatement("select * from pessoas");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setIdade(rs.getInt("idade"));

				result.add(p);
			}

			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

		return result;
	}
}
