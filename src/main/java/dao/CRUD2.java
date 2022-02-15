package dao;

import java.util.List;

import model.Pacote;

public interface CRUD2 {
	
	public static void create(Pacote pacote) {};
	public static void delete(int pacoteIdPacotes) {};
	public static List<Pacote> find(String pesquisa){return null;}
	public static Pacote findByPk(int pacoteIdPacotes) {return null;}
	public static void update(Pacote pacote) {}
}
