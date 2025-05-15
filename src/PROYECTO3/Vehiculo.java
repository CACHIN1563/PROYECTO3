/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTO3;

/**
 *
 * @author cachi
 */
public class Vehiculo {
    String placa;
    String color;
    String linea;
    int modelo;
    String propietario;

    public Vehiculo(String placa, String color, String linea, int modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "PLACA: " + placa +
                "\nCOLOR: " + color +
                "\nLINEA: " + linea +
                "\nMODELO: " + modelo +
                "\nPROPIETARIO: " + propietario + "\n";
    }
}

