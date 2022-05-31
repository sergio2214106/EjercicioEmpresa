package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbNombre;
    private JLabel lbEdad;
    private JLabel lbAntiguedad;
    private JLabel lbHoras;
    private JTextField tfNombre;
    private JTextField tfEdad;
    private JTextField tfAntiguedad;
    private JTextField tfHoras;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/carro.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,20,126,126);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNombre = new JLabel("Nombre= ");
        lbNombre.setBounds(140,10,60,20);
        add(lbNombre);
        
        lbEdad = new JLabel("Fecha de nacimiento= ");
        lbEdad.setBounds(140,40,160,20);
        add(lbEdad);
        
        lbAntiguedad = new JLabel("Fecha ingreso empresa= ");
        lbAntiguedad.setBounds(140,70,160,20);
        add(lbAntiguedad);

        lbHoras = new JLabel("Horas Trabajadas= ");
        lbHoras.setBounds(140,100,160,20);
        add(lbHoras);


        
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField("");
        tfNombre.setBounds(300, 10, 60, 20);
        add(tfNombre);
        
        tfEdad = new JTextField("");
        tfEdad.setBounds(300, 40, 60, 20);
        add(tfEdad);
        
        tfAntiguedad = new JTextField("");
        tfAntiguedad.setBounds(300, 70, 60, 20);
        add(tfAntiguedad);

        tfHoras = new JTextField("");
        tfHoras.setBounds(300, 100, 60, 20);
        add(tfHoras);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String gettfNombre()
    {
        return tfNombre.getText();
    }
    
    public String gettfEdad()
    {
        return tfEdad.getText();
    }
    
    public String gettfAntiguedad()
    {
        return tfAntiguedad.getText();
    }
    public String gettfHoras()
    {
        return tfHoras.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfEdad.setText("");
        tfNombre.setText("");
        tfAntiguedad.setText("");
        tfHoras.setText("");
    }
}