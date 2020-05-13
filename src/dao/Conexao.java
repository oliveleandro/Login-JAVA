package dao;

import java.sql.*;

public class Conexao {
	
	private String driver = "com.mysql.jdbc.Driver";
	/*-- Apenas utilizar se o seu SGBD for o SQL Server
	//private String url_sqlserver = "jdbc:microsoft:sqlserver://localhost:1433";
	 */
    private String url_mysql = "jdbc:mysql://localhost/projeto";
	private String usuario = "root";
	private String senha = "root";
	private Connection conexao;
	
    /*
	Criando o metodo Conexao. Como ele tem o mesmo nome da classe, chamamos
	de metodo construtor, ou seja, ele e chamado toda vez que a classe for instanciada
	 */
	 
	public Conexao(){
		try{
			Class.forName(driver);
			conexao = (Connection)
			DriverManager.getConnection(url_mysql, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	/*
	 * Metodo GetConexao
	 */
	public Connection getConexao() {
		return conexao;
	}
	/*
	 * Metodo fecharConexao
	 */
	public void fecharConexao() {
		try {
			conexao.close();
		    } catch (SQLException e) {
		    	e.printStackTrace();
		}
	}

}
