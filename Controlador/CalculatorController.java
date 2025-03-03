/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author pipe7
 */
import Model.Vehiculo;
import Model.CalculadoraImpuestos;
import View.CalculatorView;
import java.awt.event.*;

public class CalculatorController {
    private CalculatorView vista;

    public CalculatorController(CalculatorView vista) {
        this.vista = vista;
        this.vista.addCalcularListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vehiculo vehiculo = new Vehiculo(
                    vista.getMarca(),
                    vista.getModelo(),
                    vista.getAnio(),
                    vista.getCilindraje(),
                    vista.getAvaluo(),
                    vista.getTipoUso()
                );
                double impuesto = CalculadoraImpuestos.calcularImpuesto(vehiculo);
                vista.setResultado(impuesto);
            }
        });
    }
}
