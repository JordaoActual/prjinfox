/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Guilherme
 */
public class ModuloConexao {
    
      public static Connection conector(){
    
    java.sql.Connection conexao = null;
    
    // a linha abaixo "chama" o driver
    
        String driver = "com.mysql.jdbc.Driver";
    //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user= "root";
        String pass = "";
        
    //estabelecendo a conexao com o banco
    
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
            
        } catch (Exception e) {
            
            System.out.println("Deu Erro na conexao!" + e);
            return null;
            
        }
    
    
     }
    

    
}
