/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author pipe7
 */
import javax.swing.*;
import java.awt.event.*;

public class CalculatorView extends JFrame {
    private JTextField txtMarca, txtModelo, txtAnio, txtCilindraje, txtAvaluo;
    private JComboBox<String> cbTipoUso;
    private JButton btnCalcular;
    private JLabel lblResultado;

    public CalculatorView() {
        setTitle("Cálculo de Impuestos");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Marca:");
        lbl1.setBounds(20, 20, 100, 20);
        add(lbl1);
        txtMarca = new JTextField();
        txtMarca.setBounds(150, 20, 200, 20);
        add(txtMarca);

        JLabel lbl2 = new JLabel("Modelo:");
        lbl2.setBounds(20, 50, 100, 20);
        add(lbl2);
        txtModelo = new JTextField();
        txtModelo.setBounds(150, 50, 200, 20);
        add(txtModelo);

        JLabel lbl3 = new JLabel("Año:");
        lbl3.setBounds(20, 80, 100, 20);
        add(lbl3);
        txtAnio = new JTextField();
        txtAnio.setBounds(150, 80, 200, 20);
        add(txtAnio);

        JLabel lbl4 = new JLabel("Cilindraje:");
        lbl4.setBounds(20, 110, 100, 20);
        add(lbl4);
        txtCilindraje = new JTextField();
        txtCilindraje.setBounds(150, 110, 200, 20);
        add(txtCilindraje);

        JLabel lbl5 = new JLabel("Avalúo:");
        lbl5.setBounds(20, 140, 100, 20);
        add(lbl5);
        txtAvaluo = new JTextField();
        txtAvaluo.setBounds(150, 140, 200, 20);
        add(txtAvaluo);

        JLabel lbl6 = new JLabel("Tipo de Uso:");
        lbl6.setBounds(20, 170, 100, 20);
        add(lbl6);
        cbTipoUso = new JComboBox<>(new String[]{"particular", "publico"});
        cbTipoUso.setBounds(150, 170, 200, 20);
        add(cbTipoUso);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        add(btnCalcular);

        lblResultado = new JLabel("Impuesto: $");
        lblResultado.setBounds(20, 240, 300, 20);
        add(lblResultado);
    }

    public String getMarca() { return txtMarca.getText(); }
    public String getModelo() { return txtModelo.getText(); }
    public int getAnio() { return Integer.parseInt(txtAnio.getText()); }
    public int getCilindraje() { return Integer.parseInt(txtCilindraje.getText()); }
    public double getAvaluo() { return Double.parseDouble(txtAvaluo.getText()); }
    public String getTipoUso() { return (String) cbTipoUso.getSelectedItem(); }

    public void setResultado(double impuesto) { lblResultado.setText("Impuesto: $" + impuesto); }
    public void addCalcularListener(ActionListener listener) { btnCalcular.addActionListener(listener); }
}