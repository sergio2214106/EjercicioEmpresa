package ejecutable;

import controlador.Controlador;
import modelo.Empresa;
import vista.VentanaPrincipal;

public class test 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Empresa empresa = new Empresa("",0,0);
        Controlador miControlador = new Controlador(miVentana, empresa );
    }
}