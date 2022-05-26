package modelo;

public class Empresa 
{
    //--------------------------
    //Atributos
    //--------------------------
    private static int dobleSalarioMinimo = 2000000;
    private String nombre;
    private int edad;
    private int antiguedad;
    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public Empresa(String pNombre, int pEdad, int pAntiguedad)
    {
        this.nombre = pNombre;
        this.edad = pEdad;
        this.antiguedad = pAntiguedad;
    }
    
    public int getDobleSalarioMinimo()
    {
        return dobleSalarioMinimo;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    
    public int getAntiguedad()
    {
        return this.antiguedad;
    }


    
    public String toString()
    {
        return "";
    }
}