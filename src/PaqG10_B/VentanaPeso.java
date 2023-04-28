//Alejo Arenas Moreira

package PaqG10_B;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPeso extends JFrame{
    private JPanel panel1;
    private JLabel pesoLabel;
    private JButton volverButton;

    public VentanaPeso(Puerto hub){
        int peso=0;

        setContentPane(panel1);
        setTitle("Informacion del contenedor");
        setSize(420,210);
        setLocationRelativeTo(null);
        setVisible(true);

        //Se ejecuta un bucle que suma el peso total
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                peso += hub.almacen[i][j].getPeso();
            }
        }

        //Se muestra el peso total en la ventana
        pesoLabel.setText(String.valueOf(peso));

        //Al pulsar el boton vuelve al panel inicial
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
