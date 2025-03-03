/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pipe7
 */
public class CalculadoraImpuestos {
    public static double calcularImpuesto(Vehiculo vehiculo) {
        double tasa = vehiculo.getTipoUso().equals("publico") ? 0.01 : 0.015;
        double impuestoBase = vehiculo.getAvaluo() * tasa;

        // Ajustes según antigüedad
        int aniosAntiguedad = 2024 - vehiculo.getAnioFabricacion();
        double descuentoAntiguedad = aniosAntiguedad > 10 ? 0.10 : 0.0;

        // Ajuste por cilindraje
        double recargoCilindraje = vehiculo.getCilindraje() > 2000 ? 0.05 : 0.0;

        double impuestoFinal = impuestoBase * (1 - descuentoAntiguedad + recargoCilindraje);
        return impuestoFinal;
    }
}
