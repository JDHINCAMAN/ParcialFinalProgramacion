package parcialfinal;

import javax.swing.JOptionPane;

public class ParcialFinal {
    public static void main(String[] args) {
        opciones op = new opciones();
        int contador = 0;
        String opcion;
        String contraseña = "123456";
        JOptionPane.showMessageDialog(null, "               ▐▓█▀▀▀▀▀▀▀▀▀█▓▌░▄▄▄▄▄░\n" +
                                            "               ▐▓█░░▀░░▀▄░░█▓▌░█▄▄▄█░\n" +
                                            "               ▐▓█░░▄░░▄▀░░█▓▌░█▄▄▄█░\n" +
                                            "               ▐▓█▄▄▄▄▄▄▄▄▄█▓▌░█████░\n" +
                                            "               ░░░░▄▄███▄▄░░░░░█████░\n" +
                                            "Bienvenido a nuestro sistema de drogas G.A.P", "Inicio",JOptionPane.PLAIN_MESSAGE);
        String usuario = JOptionPane.showInputDialog("Ingrese el usuario: ");
        String pass = JOptionPane.showInputDialog("Ingrese el la contraseña: ");
        
        while(!"123456".equals(pass)) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta, intente de nuevo",
                "Mensaje de error", JOptionPane.ERROR_MESSAGE);   
            contador++;
            pass = JOptionPane.showInputDialog("Ingrese el la contraseña: ");
            if  (contador >= 2){
                JOptionPane.showMessageDialog(null, "ACCESO DENEGADO",
                "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                break; 
            }
        }
        
        if (contraseña.equals(pass)) {
            do {
                String  menu = JOptionPane.showInputDialog(null, "███████████████████████████████████████████████████████████████████████████████████████████████\n" +
                                                  "█░░░░░░░░░░░░███░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█\n" +
                                                  "█░░▄▀▄▀▄▀▄▀░░░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                                  "█░░▄▀░░░░▄▀▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░░░█\n" +
                                                  "█░░▄▀░░██░░▄▀░░█░░▄▀░░████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░██░░▄▀░░█░░▄▀░░█████████\n" +
                                                  "█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░░░█\n" +
                                                  "█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░░░░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                                  "█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░░░░░░░░░▄▀░░█\n" +
                                                  "█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█████████░░▄▀░░█\n" +
                                                  "█░░▄▀░░░░▄▀▄▀░░█░░▄▀░░██░░▄▀░░░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░░░░░░░░░▄▀░░█\n" +
                                                  "█░░▄▀▄▀▄▀▄▀░░░░█░░▄▀░░██░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                                  "█░░░░░░░░░░░░███░░░░░░██░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░░░░░░░░░█\n" +
                                                  "███████████████████████████████████████████████████████████████████████████████████████████████\n" +
                                                  "                                   ████████████████████████████████████████████████████████████\n" +
                                                  "                                   █░░░░░░░░░░░░░░████████░░░░░░░░░░░░░░████████░░░░░░░░░░░░░░█\n" +
                                                  "                                   █░░▄▀▄▀▄▀▄▀▄▀░░████████░░▄▀▄▀▄▀▄▀▄▀░░████████░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                                  "                                   █░░▄▀░░░░░░░░░░████████░░▄▀░░░░░░▄▀░░████████░░▄▀░░░░░░▄▀░░█\n" +
                                                  "                                   █░░▄▀░░████████████████░░▄▀░░██░░▄▀░░████████░░▄▀░░██░░▄▀░░█\n" +
                                                  "                                   █░░▄▀░░████████████████░░▄▀░░░░░░▄▀░░████████░░▄▀░░░░░░▄▀░░█\n" +
                                                  "                                   █░░▄▀░░██░░░░░░████████░░▄▀▄▀▄▀▄▀▄▀░░████████░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                                  "                                   █░░▄▀░░██░░▄▀░░████████░░▄▀░░░░░░▄▀░░████████░░▄▀░░░░░░░░░░█\n" +
                                                  "                                   █░░▄▀░░██░░▄▀░░████████░░▄▀░░██░░▄▀░░████████░░▄▀░░█████████\n" +
                                                  "                                   █░░▄▀░░░░░░▄▀░░█░░░░░░█░░▄▀░░██░░▄▀░░█░░░░░░█░░▄▀░░█████████\n" +
                                                  "                                   █░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█░░▄▀░░█████████\n" +
                                                  "                                   █░░░░░░░░░░░░░░█░░░░░░█░░░░░░██░░░░░░█░░░░░░█░░░░░░█████████\n" +
                                                  "███████████████████████████████████████████████████████████████████████████████████████████████\n" +
                                                  "\n" +
                                                  "███████████████████████████████████████████████████████████████████████████████████████████████\n" +
                                                  "\n" +
                                                  "                                                                          1. INGRESAR PRODUCTOS\n" +
                                                  "                                                                          2. BUSQUEDA DE PRODUCTO\n" +
                                                  "                                                                          3. FACTURACION\n" +
                                                  "                                                                          4. SALIR\n" +
                                                  "███████████████████████████████████████████████████████████████████████████████████████████████\n" +
                                                  "Porfavor digite la opcion que necesite");
                opcion = menu;
                switch (opcion) {
                    case "1":
                        op.ingresarProductos();
                        break;
                    case "2":
                        op.busquedaProductos();
                        break;
                    case "3":
                        op.facturacion();
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "Gracias Por usar el programa\n"
                                + "Creado por:\n"
                                + "Juan David Hincapie Manrique\n"
                                + "Cristian David Gonzalez Gonzalez\n"
                                + "Carlos Esteban Bermudez Obando\n"
                                + "Harol Andres Rodriguez Camargo\n"
                                + "Miguel Angel Villamil Muñoz\n"
                                + "EMPRESA DE DESARROLLO G.A.P");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, intente de nuevo",
                                                   "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                        break;
                    } 
            } while(!"4".equals(opcion));
        }
    }   
}
