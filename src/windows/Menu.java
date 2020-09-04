/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import holamundo.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Menu extends JFrame implements ActionListener {
    JLabel labelSub, labelRegister;
    JTextField txtRegister;
    JButton save, cancel;
    
    public Menu(){
        components();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setTitle("Menú Principal");
    }
    
    public void components(){
        labelSub = new JLabel();
        labelSub.setBounds(135, 20, 180, 20);
        labelSub.setText("Ingrese el polinomnio:");
        add(labelSub);
        
        save = new JButton();
        save.setBounds(50, 70, 300, 20);
        save.setText("Guardar");
        add(save);
        save.addActionListener(this);

        cancel = new JButton();
        cancel.setBounds(50, 100, 300, 20);
        cancel.setText("Cancelar");
        add(cancel);  
        cancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource().equals(save)){
      
      // System.out.println("Se ha pulsado el botón Guardar");
      // System.out.println("Esta accion abrira una futura ventana de Guardado");
       this.dispose();
       new Registro();
        }
    }

} //fin
