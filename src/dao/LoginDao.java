package dao;

import java.sql.*;

public class LoginDao {
	
	//atributos
	private Conexao obj_conexao;
    //inicializando as variaveis String
	String sql_select_login ="select login, senha from usuario where login = ? AND senha = aes_encrypt(?,'fatec')";
	
	//metodo construtor
	public LoginDao() {
		 //instanciamos uma nova conexao ao SGBD
		 obj_conexao = new Conexao();		
	}
	
			//metodo selecionar
	public String validaLogin(String login, String senha) {
		String status="invalido";
		try{
	
			PreparedStatement obj_sql = 
			(PreparedStatement) obj_conexao.getConexao().prepareStatement(sql_select_login);
			//definindo o parametro da query
			obj_sql.setString(1, login);
			obj_sql.setString(2, senha);
			ResultSet obj_result = obj_sql.executeQuery();
			System.out.println("Foi efetuado o select:"+ obj_sql.toString());
			while (obj_result.next()) { ;
			      status = "valido";	
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {obj_conexao.fecharConexao();}
	return status;
	}	
}
