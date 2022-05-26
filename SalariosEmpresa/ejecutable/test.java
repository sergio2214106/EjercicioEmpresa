package ejecutable;

import controlador.Controlador;
import modelo.Empresa;
import vista.VentanaPrincipal;

public class test 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Empresa miCarro = null;
        Controlador miControlador = new Controlador(miVentana, miCarro);
    }
}