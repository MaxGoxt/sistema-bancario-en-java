package querymysql.contas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class SQLService {

    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpwd";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static String createCC(String nome, String sobrenome, String email, String senha) {
        try (Connection connection = getConnection(); Statement statement = connection.createStatement();) {
            System.out.println(statement.execute("INSERT INTO conta(nome_titular, sobrenome_titular, email, senha) VALUES('" + nome + "', '" + sobrenome + "', '" + email + "', '" + senha + "');"));

            return "ok";
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
    }

    public static HashMap<String, String> getCC(String email, String senha) {

        HashMap<String, String> conta = new HashMap<String, String>();

        try (Connection connection = getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery("SELECT * FROM conta WHERE email = '" + email + "' AND senha = '" + senha + "';")) {

            while (resultSet.next()) {
                // Leer los resultados
                String id = resultSet.getString("id");
                String date = resultSet.getString("data_criacao");
                String nome = resultSet.getString("nome_titular");
                String sobrenome = resultSet.getString("sobrenome_titular");
                String saldo = resultSet.getString("saldo");

                // Hacer algo con los resultado
                conta.put("id", id);
                conta.put("data", date);
                conta.put("nome", nome);
                conta.put("sobrenome", sobrenome);
                conta.put("saldo", saldo);
                conta.put("email", email);
                conta.put("senha", senha);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conta;
    }

    public static String setSaldo(Integer id, Float cant) {
        try (Connection connection = getConnection(); Statement statement = connection.createStatement();) {
            Integer rows = statement.executeUpdate("UPDATE conta SET saldo = " + cant + " WHERE id = " + id);
            if (rows == 0) {
                return "notfound404";
            }
            return "ok";
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
    }

    public static String tranferir(Integer id, String email, Float cant) {
        try (Connection connection = getConnection(); Statement statement = connection.createStatement();) {
            Integer rows = statement.executeUpdate("UPDATE conta SET saldo = saldo - " + cant + " WHERE id = " + id + ";")
                    + statement.executeUpdate("UPDATE conta SET saldo = saldo + " + cant + " WHERE email = '" + email + "';");
            if (rows == 0) {
                return "notfound404";
            }

            return "ok";
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
    }

}
