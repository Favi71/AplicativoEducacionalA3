package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoMysql {
    
    private static final String URL = "jdbc:mysql://localhost:3306/aplicativoeducacional";
    private static final String USER = "root";
    private static final String PWD = "123123";

    private Connection dbconn = null;
    private Statement sqlmgr = null;

    public void OpenConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            dbconn = DriverManager.getConnection(URL, USER, PWD);
            sqlmgr = dbconn.createStatement();
            System.out.println("Conectado com sucesso em: " + URL);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void CloseConnection() {
        try {
            if (sqlmgr != null) {
                sqlmgr.close();
            }
            if (dbconn != null) {
                dbconn.close();
                System.out.println("Conexão fechada com sucesso.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }

    public int ExecutaQuery(String sql) {
        try {
            return sqlmgr.executeUpdate(sql); // insert/delete/update/create
        } catch (SQLException e) {
            System.out.println("Erro ao executar query: " + e.getMessage());
            return -1; // Retorna -1 em caso de erro SQL
        }
    }
}