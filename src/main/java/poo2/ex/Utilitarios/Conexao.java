package poo2.ex.Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String String_Conexao="jdbc:mysql://localhost:8080/mysql";
    private static final String Usuario_Conexao="";
    private static final String Senha_Conexao="";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(String_Conexao, Usuario_Conexao, Senha_Conexao);
    }
    
}
