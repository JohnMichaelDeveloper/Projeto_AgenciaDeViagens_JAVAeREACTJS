package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Atendimento;

public class AtendimentoDao implements CRUD3 {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Atendimento atendimento) {
		 sql = "INSERT INTO atendimentos VALUES (null, ?, ?, ?, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, atendimento.getNome());
			 preparedStatement.setString(2, atendimento.getEmail());
			 preparedStatement.setString(3, atendimento.getData_do_atend());
			 preparedStatement.setString(4, atendimento.getDuvida());
		         preparedStatement.setString(5, atendimento.getSatisfacao());
			 
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
	
	public static void delete(int atendimentoIdAtend) {
		sql = "DELETE FROM atendimentos WHERE idAtend = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, atendimentoIdAtend);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on atendimento");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on atendimento. " + e.getMessage());
		}
	}
	
	public static List<Atendimento> find(String pesquisa){
		
		sql = String.format("SELECT * FROM atendimentos WHERE nome like '%s%%' OR data_do_atend LIKE '%s%%' ", pesquisa, pesquisa);
		List<Atendimento> atendimentos = new ArrayList<Atendimento>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Atendimento atendimento = new Atendimento();
				
				atendimento.setIdAtend(resultSet.getInt("idAtend"));
				atendimento.setNome(resultSet.getString("nome"));
				atendimento.setEmail(resultSet.getString("email"));
				atendimento.setData_do_atend(resultSet.getString("data_do_atend"));
				atendimento.setDuvida(resultSet.getString("duvida"));
				atendimento.setSatisfacao(resultSet.getString("satisfacao"));
				
				
				atendimentos.add(atendimento);
				
			}
			
			System.out.println("--correct find atendimentos");
			return atendimentos;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find atendimentos. " + e.getMessage());
			return null;
		}
		
		
	}
	
	public static Atendimento findByPk(int atendimentoIdAtend) {
		sql = String.format("SELECT * FROM atendimentos WHERE idAtend = %d ", atendimentoIdAtend);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Atendimento atendimento = new Atendimento();
			
			while (resultSet.next()) {
				
				atendimento.setIdAtend(resultSet.getInt("idAtend"));
				atendimento.setNome(resultSet.getString("nome"));
				atendimento.setEmail(resultSet.getString("email"));
				atendimento.setData_do_atend(resultSet.getString("data_do_atend"));
				atendimento.setDuvida(resultSet.getString("duvida"));
				atendimento.setSatisfacao(resultSet.getString("satisfacao"));
			}
			
			System.out.println("--correct find by pk atendimentos");
			return atendimento;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk atendimentos. " + e.getMessage());
			return null;
		}
	}
	
	public static void update(Atendimento atendimento) {
		sql = "UPDATE atendimentos SET nome=?, email=?, data_do_atend=?, duvida=?, satisfacao=? WHERE idAtend=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, atendimento.getNome());
			 preparedStatement.setString(2, atendimento.getEmail());
			 preparedStatement.setString(3, atendimento.getData_do_atend());
			 preparedStatement.setString(4, atendimento.getDuvida());
			 preparedStatement.setString(5, atendimento.getSatisfacao());   			 
			 preparedStatement.setInt(6, atendimento.getIdAtend());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
}
