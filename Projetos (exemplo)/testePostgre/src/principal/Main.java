package principal;

import java.util.List;

import dao.mysql.Functions;
import dao.postgre.Elefante;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		Functions f = new Functions();
		Elefante e = new Elefante();

		List<Pessoa> mysql = f.getLista();
		List<Pessoa> postgre = e.getLista();

		System.out.println(">>>> MySQL <<<<");
		for (Pessoa p : mysql) {
			System.out.println(p.getId() + ", " + p.getNome() + ", " + p.getIdade());
		}

		System.out.println(">>>> Postgree <<<<");
		for (Pessoa p : postgre) {
			System.out.println(p.getId() + ", " + p.getNome() + ", " + p.getIdade());
		}

	}

}
