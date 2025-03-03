/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

/**
 *
 * @author pipe7
 */

import View.CalculatorView;
import Controlador.CalculatorController;

public class Main {
    public static void main(String[] args) {
        CalculatorView vista = new CalculatorView();
        new CalculatorController(vista);
        vista.setVisible(true);
    }
}

