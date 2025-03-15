package Back;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arell
 */
public class Backend {
    //CONEXION CON LA BD
    private Connection conexion;

    public Backend(Connection conexion) {
        this.conexion = conexion;
    }

    public Backend() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/loggin", "root", "56234512");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }
    //METODOS CRUD CON SP
    // Método para crear usuario
    public void crearUsuario(Usuario usuario) {
        try {
            // Encriptar la contraseña antes de persistir el usuario
            CallableStatement stmt = conexion.prepareCall("{CALL sp_CrearUsuario(?, ?)}");
            stmt.setString(1, usuario.Nombre);
            stmt.setString(2, hashPassword(usuario.Contraseña));
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear usuario: " + e.getMessage());
        }
    }

    // Método para obtener usuario por ID
    public void obtenerUsuario(int id) {
        try {
            CallableStatement stmt = conexion.prepareCall("{CALL sp_ObtenerUsuario(?)}");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "ID: " + rs.getInt("ID") + 
                        "\nNombre: " + rs.getString("NOMBRE") + 
                        "\nContraseña: " + rs.getString("CONTRASEÑA"));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener usuario: " + e.getMessage());
        }
    }

    // Método para actualizar usuario
    public void actualizarUsuario(int id, String nombre, String contraseña) {
        try {
            CallableStatement stmt = conexion.prepareCall("{CALL sp_ActualizarUsuario(?, ?, ?)}");
            stmt.setInt(1, id);
            stmt.setString(2, nombre);
            stmt.setString(3, contraseña);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario: " + e.getMessage());
        }
    }

    // Método para eliminar usuario
    public void eliminarUsuario(int id) {
        try {
            CallableStatement stmt = conexion.prepareCall("{CALL sp_EliminarUsuario(?)}");
            stmt.setInt(1, id);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario: " + e.getMessage());
        }
    }
    // Método para verificar usuario y contraseña usando el procedimiento almacenado
     // Método para verificar el login
    public int Loggin(Usuario usuario) {
        int userId = -1;

        try {
            CallableStatement stmt = conexion.prepareCall("{CALL SP_Loggin(?)}");
            stmt.setString(1, usuario.Nombre);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String hashedPassword = rs.getString("CONTRASEÑA");

                // Verificar si la contraseña ingresada coincide con el hash almacenado
                if (BCrypt.checkpw(usuario.Contraseña, hashedPassword)) {
                    userId = rs.getInt("ID"); // Retorna el ID del usuario
                    System.out.println("Loggin Exitoso");
                }
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en login: " + e.getMessage());
        }

        return userId; // Retorna -1 si no se encontró el usuario o la contraseña no es válida
    }
    
    // METODOS DE ENCRIPTACION
         // Método para encriptar la contraseña usando BCrypt
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    // Método para verificar la contraseña (al hacer login)
    public boolean verifyPassword(String password, String storedHashedPassword) {
        return BCrypt.checkpw(password, storedHashedPassword);
    }
    
    // Método para verificar si el hash es de BCrypt
    private boolean isBCryptHash(String hash) {
        return hash != null && hash.startsWith("$2a$") || hash.startsWith("$2b$") || hash.startsWith("$2y$");
    }
}
