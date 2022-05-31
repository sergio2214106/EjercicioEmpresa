package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bPagar;
    public JButton bRegistrar;
    public JButton bAcelerar;
    public JButton bFrenar;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bPagar = new JButton("Pagar");
        bPagar.setFont(new Font("Arial", BOLD, 12));
        bPagar.setBounds(10,20,90,20);
        add(bPagar);
        bPagar.setActionCommand("pagar");
        
        
        bRegistrar = new JButton("Registrar");
        bRegistrar.setFont(new Font("Arial", BOLD, 12));
        bRegistrar.setBounds(105,20,90,20);
        add(bRegistrar);
        bRegistrar.setActionCommand("registrar");
        
        bAcelerar = new JButton("Hallar");
        bAcelerar.setFont(new Font("Arial", BOLD, 12));
        bAcelerar.setBounds(200,20,90,20);
        add(bAcelerar);
        bAcelerar.setActionCommand("hallar");
        
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bPagar.addActionListener(pAL);
        bRegistrar.addActionListener(pAL);
        bAcelerar.addActionListener(pAL);
        bFrenar.addActionListener(pAL);
    }
}