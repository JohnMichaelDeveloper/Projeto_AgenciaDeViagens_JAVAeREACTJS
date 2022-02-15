package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Pacote;

public class PacoteDao implements CRUD2 {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Pacote pacote) {
		 sql = "INSERT INTO pacotes VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 	 
			 preparedStatement.setString(1, pacote.getNome());
			 preparedStatement.setString(2, pacote.getOrigem());
			 preparedStatement.setString(3, pacote.getDestino());
			 preparedStatement.setString(4, pacote.getSaida());
			 preparedStatement.setString(5, pacote.getRetorno());
			 preparedStatement.setString(6, pacote.getPreco_Unt());
			 preparedStatement.setString(7, pacote.getInform_add());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
	
	public static void delete(int pacoteIdPacotes) {
		sql = "DELETE FROM pacotes WHERE idPacotes = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, pacoteIdPacotes);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on pacote");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on pacote. " + e.getMessage());
		}
	}
	
	public static List<Pacote> find(String pesquisa){
		
		sql = String.format("SELECT * FROM pacotes WHERE nome like '%s%%' OR destino LIKE '%s%%' ", pesquisa, pesquisa);
		List<Pacote> pacotes = new ArrayList<Pacote>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Pacote pacote = new Pacote();
				
				pacote.setIdPacotes(resultSet.getInt("idPacotes"));
				pacote.setNome(resultSet.getString("nome"));
				pacote.setOrigem(resultSet.getString("origem"));
				pacote.setDestino(resultSet.getString("destino"));
				pacote.setSaida(resultSet.getString("saida"));
				pacote.setRetorno(resultSet.getString("retorno"));
				pacote.setPreco_Unt(resultSet.getString("preco_Unt"));
				pacote.setInform_add(resultSet.getString("inform_add"));
		
				
				pacotes.add(pacote);
				
			}
			
			System.out.println("--correct find pacotes");
			return pacotes;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find pacotes. " + e.getMessage());
			return null;
		}
		
		
	}
	
	public static Pacote findByPk(int pacoteIdPacotes) {
		sql = String.format("SELECT * FROM pacotes WHERE idPacotes = %d ", pacoteIdPacotes);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Pacote pacote = new Pacote();
			
			while (resultSet.next()) {
				
				pacote.setIdPacotes(resultSet.getInt("idPacotes"));
				pacote.setNome(resultSet.getString("nome"));
				pacote.setOrigem(resultSet.getString("origem"));
				pacote.setDestino(resultSet.getString("destino"));
				pacote.setSaida(resultSet.getString("saida"));
				pacote.setRetorno(resultSet.getString("retorno"));
				pacote.setPreco_Unt(resultSet.getString("preco_Unt"));
				pacote.setInform_add(resultSet.getString("inform_add"));
			}
			
			System.out.println("--correct find by pk pacotes");
			return pacote;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk pacotes. " + e.getMessage());
			return null;
		}
	}
	
	public static void update(Pacote pacote) {
		sql = "UPDATE pacotes SET nome=?, origem=?, destino=?, saida=?, retorno=?, preco_Unt=?, inform_add=?   WHERE idPacotes=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, pacote.getNome());
			 preparedStatement.setString(2, pacote.getOrigem());
			 preparedStatement.setString(3, pacote.getDestino());
			 preparedStatement.setString(4, pacote.getSaida());
			 preparedStatement.setString(5, pacote.getRetorno());
			 preparedStatement.setString(6, pacote.getPreco_Unt());
			 preparedStatement.setString(7, pacote.getInform_add());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
}

