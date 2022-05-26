package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empresa;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Empresa model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empresa pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("registrar"))
        {   
            //Validar datos entrada              
                venPrin.miPanelResultado.mostrarResultado("Informacion");
                venPrin.miPanelResultado.mostrarResultado("Nombre empleado:  " + model.getNombre());
                venPrin.miPanelResultado.mostrarResultado("Fecha de nacimiento: " + model.getEdad());
                venPrin.miPanelResultado.mostrarResultado("Fecha de ingreso en la empresa: " + model.getAntiguedad());  
        }

        if(comando.equals("pagar"))
        {

        }
        
    }    
}