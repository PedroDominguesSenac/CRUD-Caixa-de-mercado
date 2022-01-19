package projetointegrador;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    
    public static Connection connect() throws Exception {
       // 1 - Carregar o Driver
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       
       // 2 - Conectar no Banco
       // jdbc:sqlserver://localhost:1433;databaseName=projeto_loja;user=sa;password=pedro154789;       
       Connection conexao = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=caixa;user=sa;password=0502");
       
       // 3 - Retorna uma conexao para quem chamou
       return conexao;
    }
    
    public static void main(String[] args) throws Exception {
        connect();
        System.out.println("CONECTADO!!");
    }
}