package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;
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
                model.setNombre(venPrin.miPanelEntradaDatos.gettfNombre());

                //Hallar la edad
                model.setEdad(Integer.parseInt(venPrin.miPanelEntradaDatos.gettfEdad()));
                model.HallarEdad();           

                //Hallar la antiguedad
                model.setAntiguedad(Integer.parseInt(venPrin.miPanelEntradaDatos.gettfAntiguedad()));
                model.HallarAntiguedad();

                //imprimir en resultados
                venPrin.miPanelResultado.mostrarResultado("-----Informacion Empleado--------");
                venPrin.miPanelResultado.mostrarResultado("\n--- Nombre empleado:  " + model.getNombre() + " ---");
                venPrin.miPanelResultado.mostrarResultado("--- Edad: " + model.getEdad() + " ---");
                venPrin.miPanelResultado.mostrarResultado("--- Años en la empresa: " + model.getAntiguedad() + model.getError() + " ---");  
        }

        if(comando.equals("pagar"))
        {
            model.setHoras(Integer.parseInt(venPrin.miPanelEntradaDatos.gettfHoras()));
            model.PagarCantidad();
            venPrin.miPanelResultado.mostrarResultado("Valor a pagar salario: " + model.getHoras() + "\n Valor pagar auxilio de transporte= " + model.getvalorAuxilio());
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }    
}