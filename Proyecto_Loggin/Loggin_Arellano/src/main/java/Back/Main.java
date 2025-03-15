/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Back;

import Front.LogginPantalla;

/**
 *
 * @author Arell
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Backend back = new Backend();
        LogginPantalla loggin = new LogginPantalla();
     //   Usuario usuario = new Usuario("Santiago", "123");
      // back.crearUsuario(usuario);
       // System.out.println(back.Loggin(usuario));
       loggin.setVisible(true);
    }
}
