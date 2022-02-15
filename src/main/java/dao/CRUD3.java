package dao;

import java.util.List;

import model.Atendimento;

public interface CRUD3 {
	
	public static void create(Atendimento atendimento) {};
	public static void delete(int atendimentoIdAtend) {};
	public static List<Atendimento> find(String pesquisa){return null;}
	public static Atendimento findByPk(int atendimentoIdAtend) {return null;}
	public static void update(Atendimento atendimento) {}
}
