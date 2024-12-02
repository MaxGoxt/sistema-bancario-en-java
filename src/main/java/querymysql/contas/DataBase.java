package querymysql.contas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DataBase {

    private static final String URL = "jdbc:mysql://localhost:3306/banco";
    private static final String USER = "root";
    private static final String PASSWORD = "rootpwd";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Conta createCount(String nome, String sobrenome, String email, String senha) {
        
        Conta conta = null;
        
        try (Connection connection = getConnection()) {
            String sql = "{CALL CREATE_COUNT(?, ?, ?, ?)}";  // Llamada al procedimiento

            // Preparar el statement para ejecutar el procedimiento
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                ps.setString(1, nome);
                ps.setString(2, sobrenome);
                ps.setString(3, email);
                ps.setString(4, senha);

                // Ejecutar el procedimiento y obtener el resultado
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // Obtener los datos de la cuenta recién creada
                        int id = rs.getInt("id");
                        String data = rs.getString("data_criacao");
                        String nomeTitular = rs.getString("nome_titular");
                        String sobrenomeTitular = rs.getString("sobrenome_titular");
                        String emailCuenta = rs.getString("email");
                        String senhaCuenta = rs.getString("senha");

                        return new Conta(id, nomeTitular, sobrenomeTitular, Double.NaN, senhaCuenta, emailCuenta, data);
                        
                    } else {
                        return conta;
                    }
                } catch (SQLException e) {
                    System.out.println("Error al obtener el resultado del procedimiento: " + e.getMessage());
                    return conta;
                }

            } catch (SQLException e) {
                System.out.println("Error al ejecutar el procedimiento: " + e.getMessage());
                return conta;
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return conta;
        }
    }

    public static Conta getCC(String email, String senha) {

        Conta conta = null;
        String sql = "SELECT * FROM conta WHERE email = ? AND senha = ?;";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
            
            
            ps.setString(1, email);
            ps.setString(2, senha);
            
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()) {
                    // Leer los resultados
                    Integer id = rs.getInt("id");
                    String data = rs.getString("data_criacao");
                    String nome = rs.getString("nome_titular");
                    String sobrenome = rs.getString("sobrenome_titular");
                    String emailCuenta = rs.getString("email");
                    Double saldo = rs.getDouble("saldo");

                    conta = new Conta(id, nome, sobrenome, saldo, senha,emailCuenta, data);
                }
            } catch (Exception e) {
                e.getStackTrace();
                return conta;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conta;
    }

    public static String setSaldo(Integer id, Double mount) {
        
        String sql = "{CALL SET_SALDO(?, ?)}";
        
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
            
            ps.setInt(1, id);
            ps.setDouble(2, mount);
            ps.execute();
            return "ok";
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
    }

    public static String tranferir(int fromCount, String toCountEmail, double mount) {
        try (Connection connection = getConnection()) {
            String sql = "{CALL TRANSFER(?, ?, ?)}";  // Llamada al procedimiento

            // Preparar el statement para ejecutar el procedimiento
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                // Establecer los valores de los parámetros
                ps.setInt(1, fromCount);
                ps.setString(2, toCountEmail);
                ps.setDouble(3, mount);
                ps.executeQuery();
                return "ok";

            } catch (SQLException e) {
                System.out.println("Error al ejecutar el procedimiento: " + e.getMessage());
                return "error";
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
            return "error";
        }
    }
    
    
    public static String deleteCount(int countId) {

        String sql = "{CALL DELETE_COUNT(?)}";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, countId);
            ps.execute();
            return "ok";
        } catch (Exception e) {
            return "Error al eliminar cuenta";
        }
    }


}
