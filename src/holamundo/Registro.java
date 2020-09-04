

package holamundo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import windows.Menu;

public class Registro extends JFrame implements ActionListener {
   
    private JLabel labelSubtitulo,labelNombres,labelApellidos, leableEdad;
    private JTextField txtNombres,txtApellidos, txtEdad;
    private JButton save,cancel;
   
    public Registro(){

        componentes();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(400,450); // Tamaño de la Ventana Ancho y Largo
        setLocationRelativeTo(null); // Centra la ventana en el monitor
        setLayout(null); // elimina toda plantilla.
        setResizable(false); // evita modificar el tamaño de ventana
        setVisible(true); // hace visible la ventana
        setTitle("             Registro              "); // Pone titulo a la ventana   
   
    }
   
    public void componentes(){
       
        labelSubtitulo = new JLabel();
        labelSubtitulo.setBounds(92, 20, 260, 20);
        labelSubtitulo.setText("Ingrese los datos");
        add(labelSubtitulo);
       
        /*--------- Campos  formulario---------*/
       
        labelNombres = new JLabel(); // etiqueta
        labelNombres.setBounds(20, 50, 150,20);
        labelNombres.setText("Nombres");
        add(labelNombres);
        txtNombres = new JTextField();       // recuadro a rellenar
        txtNombres.setBounds(90, 50, 250, 20);
        add(txtNombres);
       
        labelApellidos = new JLabel();
        labelApellidos.setBounds(20, 80, 150, 20);
        labelApellidos.setText("Apellidos");
        add(labelApellidos);      
        txtApellidos = new  JTextField();
        txtApellidos.setBounds(90, 80, 250, 20);
        add(txtApellidos);
        
        leableEdad = new JLabel();
        leableEdad.setBounds(20, 110, 150, 20);
        leableEdad.setText("Edad");
        add(leableEdad);       
        txtEdad = new  JTextField();
        txtEdad.setBounds(90, 110, 250, 20);
        add(txtEdad);
       
        /*---------- Boton ----------*/
       
        save = new JButton();
        save.setBounds(100, 300, 100, 20);
        save.setText("Guardar");
        save.addActionListener(this);
        add(save);

        cancel = new JButton();
        cancel.setBounds(220, 300, 100, 20);
        cancel.setText("Cancelar");
        cancel.addActionListener(this);
        add(cancel);
   
    }

@Override
  public void actionPerformed(ActionEvent e) {
       
     if(e.getSource().equals(save)){
       System.out.println("Lanzamos una rutina para grabar los datos");
       this.dispose(); 
       new Menu();
        }
    }
   
}