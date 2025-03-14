package com.mycompany.loggin_arellano;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arell
 */
public class Back {
    //CONEXION CON LA BD
    private Connection conexion;

    public Back(Connection conexion) {
        this.conexion = conexion;
    }

    public Back() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/loggin", "root", "56234512");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }
    //METODOS CRUD CON SP
    // Método para crear usuario
    public void crearUsuario(String nombre, String contraseña) {
        try {
            CallableStatement stmt = conexion.prepareCall("{CALL sp_CrearUsuario(?, ?)}");
            stmt.setString(1, nombre);
            stmt.setString(2, contraseña);
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
}
