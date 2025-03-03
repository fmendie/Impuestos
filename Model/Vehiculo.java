/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pipe7
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private int cilindraje;
    private double avaluo;
    private String tipoUso; // "particular" o "publico"

    public Vehiculo(String marca, String modelo, int anioFabricacion, int cilindraje, double avaluo, String tipoUso) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.cilindraje = cilindraje;
        this.avaluo = avaluo;
        this.tipoUso = tipoUso;
    }

    public double getAvaluo() { return avaluo; }
    public String getTipoUso() { return tipoUso; }
    public int getAnioFabricacion() { return anioFabricacion; }
    public int getCilindraje() { return cilindraje; }
}
