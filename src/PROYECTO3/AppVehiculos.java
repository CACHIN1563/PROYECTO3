/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROYECTO3;

/**
 *
 * @author cachi
 */
import javax.swing.*;
import java.awt.*;

public class AppVehiculos {
    static ListaVehiculos lista = 
            new ListaVehiculos();
    

    public static void main(String[] args) {
        UIManager.put
        ("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 14));
        UIManager.put
        ("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 13));

        String[] opciones = {
                "INSERTAR VEHÍCULO",
                "BUSCAR VEHÍCULO",
                "ELIMINAR VEHÍCULO",
                "MOSTRAR REGISTROS",
        };

        while (true) {
            String seleccion
                    = (String) JOptionPane.showInputDialog(
                    null,
                    "SELECCIONE UNA OPCIÓN:\n",
                    "MENÚ PRINCIPAL",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (seleccion == null || seleccion.contains("SALIR")) break;

            switch (seleccion) {
                case "INSERTAR VEHÍCULO" 
                        -> insertarVehiculo();
                case "BUSCAR VEHÍCULO" 
                        -> buscarVehiculo();
                case "ELIMINAR VEHÍCULO" 
                        -> eliminarVehiculo();
                case "MOSTRAR REGISTROS" 
                        -> mostrarTodosConClave();
            }
        }
    }

    static void insertarVehiculo() {
        try {
            String placa;
            do {
                placa = JOptionPane.showInputDialog
        ("INGRESE LA PLACA (EJ: M584JPG):");
                if 
                        (placa == null) return;
                placa = placa.toUpperCase();
                if 
                        (!placa.matches("^[A-Z]{1}\\d{3}[A-Z]{3}$")) {
                    JOptionPane.showMessageDialog
        (null, "FORMATO DE PLACA INVÁLIDO");
                } else break;
            } while 
                    (true);

            String color;
            do {
                color = JOptionPane.showInputDialog
        ("INGRESE COLOR:");
                if 
                        (color == null) return;
                color = color.toUpperCase();
                if 
                        (color.isBlank()) {
                    JOptionPane.showMessageDialog
        (null, "INGRESE UN DATO, NO PUEDE DEJARLO VACÍO.");
                } else break;
            } while (true);

            String linea;
            do {
                linea = JOptionPane.showInputDialog
        ("INGRESE LÍNEA:");
                if
                        (linea == null) return;
                linea = linea.toUpperCase();
                if 
                        (linea.isBlank()) {
                    JOptionPane.showMessageDialog
        (null, "INGRESE UN DATO, NO PUEDE DEJARLO VACÍO.");
                } else break;
            } while (true);

            String modeloStr;
            int modelo;
            do {
                modeloStr = JOptionPane.showInputDialog
        ("INGRESE MODELO (AÑO, 4 DÍGITOS):");
                if 
                        (modeloStr == null) return;
                if 
                        (!modeloStr.matches("\\d{4}")) {
                    JOptionPane.showMessageDialog
        (null, "EL MODELO DEBE SER UN AÑO VÁLIDO (4 DÍGITOS).");
                } else {
                    modelo = Integer.parseInt(modeloStr);
                    break;
                }
            } while (true);

            String propietario;
            do {
                propietario = JOptionPane.showInputDialog
        ("INGRESE PROPIETARIO (NOMBRE Y APELLIDO):");
                if 
                        (propietario == null) return;
                propietario = propietario.toUpperCase();
                if
                        (!propietario.matches("^[A-ZÁÉÍÓÚÜÑ]+\\s+[A-ZÁÉÍÓÚÜÑ]+$")) {
                    JOptionPane.showMessageDialog
        (null, "EL NOMBRE DEL PROPIETARIO DEBE TENER SOLO LETRAS, NOMBRE Y APELLIDO.");
                } else break;
            } while (true);

            Vehiculo v = new Vehiculo(placa, color, linea, modelo, propietario);
            lista.insertar(v);
            JOptionPane.showMessageDialog
        (null, "VEHÍCULO AGREGADO CORRECTAMENTE.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog
        (null, "ERROR: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
    }

    static void buscarVehiculo() {
        String[] campos = {"PLACA", "COLOR", "LÍNEA", "MODELO", "PROPIETARIO"};
        String campo = (String) JOptionPane.showInputDialog(null,
                "SELECCIONE EL CAMPO A BUSCAR",
                "BUSCAR VEHÍCULO",
                JOptionPane.QUESTION_MESSAGE,
                null,
                campos,
                campos[0]);

        if 
                (campo != null) {
            String valor = JOptionPane.showInputDialog
        ("INGRESE EL DATO A BUSCAR EN " + campo + ":");
            if
                    (valor == null) return;
            valor = valor.toUpperCase();

            String resultado = lista.buscarPorCampo(campo, valor);

            JTextArea area = new JTextArea(resultado.toUpperCase(), 20, 60);
            area.setEditable(false);
            area.setFont(new Font("Monospaced", Font.PLAIN, 13));
            area.setLineWrap(true);
            area.setWrapStyleWord(true);

            JScrollPane scroll = new JScrollPane(area);
            JOptionPane.showMessageDialog(null, scroll, "RESULTADO DE BÚSQUEDA", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void eliminarVehiculo() {
        String placa = JOptionPane.showInputDialog
        ("INGRESE LA PLACA DEL VEHÍCULO A ELIMINAR:");
        if 
                (placa == null) return;
        placa = placa.toUpperCase();
        if 
                (lista.eliminarPorPlaca(placa)) {
            JOptionPane.showMessageDialog(null, "VEHÍCULO ELIMINADO CORRECTAMENTE.");
        } else {
            JOptionPane.showMessageDialog(null, "VEHÍCULO NO ENCONTRADO.");
        }
    }

    static void mostrarTodosConClave() {
        String clave = JOptionPane.showInputDialog
        ("INGRESE LA CLAVE PARA VER TODOS LOS VEHÍCULOS:");
        if 
                (clave == null) return;
        if 
                ("0000".equals(clave)) {
            String todos = lista.mostrarTodos();

            JTextArea area = 
                    new JTextArea(todos.toUpperCase(), 20, 60);
            area.setEditable(false);
            area.setFont
            (new Font("Monospaced", Font.PLAIN, 13));
            area.setLineWrap(true);
            area.setWrapStyleWord(true);

            JScrollPane scroll = new JScrollPane(area);
            JOptionPane.showMessageDialog
        (null, scroll, "REGISTRO DE VEHÍCULOS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog
        (null, "CLAVE INCORRECTA. ACCESO DENEGADO; COMUNIQUESE CON LOS INGENIEROS RUBEN GARCIA O CARLOS CACHIN.");
        }
    }
}

