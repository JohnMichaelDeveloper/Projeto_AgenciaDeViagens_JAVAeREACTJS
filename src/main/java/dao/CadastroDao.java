package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Cadastro;

public class CadastroDao implements CRUD {
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(Cadastro cadastro) {
		 sql = "INSERT INTO cadastros VALUES (null, ?, ?, ?, ?, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, cadastro.getNome());
			 preparedStatement.setString(2, cadastro.getCpf());
			 preparedStatement.setString(3, cadastro.getNascimento());
			 preparedStatement.setString(4, cadastro.getLogin());
		         preparedStatement.setString(5, cadastro.getSenha());
			 preparedStatement.setString(6, cadastro.getTipoDeConta());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
	}
	
	public static void delete(int cadastroId) {
		sql = "DELETE FROM cadastros WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, cadastroId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on cadastro");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on cadastro. " + e.getMessage());
		}
	}
	
	public static List<Cadastro> find(String pesquisa){
		
		sql = String.format("SELECT * FROM cadastros WHERE nome like '%s%%' OR cpf LIKE '%s%%' ", pesquisa, pesquisa);
		List<Cadastro> cadastros = new ArrayList<Cadastro>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Cadastro cadastro = new Cadastro();
				
				cadastro.setId(resultSet.getInt("id"));
				cadastro.setNome(resultSet.getString("nome"));
				cadastro.setCpf(resultSet.getString("cpf"));
				cadastro.setNascimento(resultSet.getString("nascimento"));
				cadastro.setLogin(resultSet.getString("login"));
				cadastro.setSenha(resultSet.getString("senha"));
				cadastro.setTipoDeConta(resultSet.getString("tipoDeConta"));
				
				cadastros.add(cadastro);
				
			}
			
			System.out.println("--correct find cadastros");
			return cadastros;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find cadastros. " + e.getMessage());
			return null;
		}
		
		
	}
	
	public static Cadastro findByPk(int cadastroId) {
		sql = String.format("SELECT * FROM cadastros WHERE id = %d ", cadastroId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Cadastro cadastro = new Cadastro();
			
			while (resultSet.next()) {
				cadastro.setId(resultSet.getInt("id"));
				cadastro.setNome(resultSet.getString("nome"));
				cadastro.setCpf(resultSet.getString("cpf"));
				cadastro.setNascimento(resultSet.getString("nascimento"));
				cadastro.setLogin(resultSet.getString("login"));
				cadastro.setSenha(resultSet.getString("senha"));
				cadastro.setTipoDeConta(resultSet.getString("tipoDeConta"));
			}
			
			System.out.println("--correct find by pk cadastros");
			return cadastro;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk cadastros. " + e.getMessage());
			return null;
		}
	}
	
	public static void update(Cadastro cadastro) {
		sql = "UPDATE cadastros SET nome=?, cpf=?, nascimento=?, login=?, senha=?, tipoDeConta=? WHERE id=?";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, cadastro.getNome());
			 preparedStatement.setString(2, cadastro.getCpf());
			 preparedStatement.setString(3, cadastro.getNascimento());
			 preparedStatement.setString(4, cadastro.getLogin());
			 preparedStatement.setString(5, cadastro.getSenha());
   			 preparedStatement.setString(6, cadastro.getTipoDeConta());
			 preparedStatement.setInt(7, cadastro.getId());
			 
			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct update on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect update on database. " + e.getMessage());
		 }
	}
}
