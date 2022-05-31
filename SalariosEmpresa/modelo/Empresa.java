package modelo;

public class Empresa 
{
    //--------------------------
    //Atributos
    //--------------------------
    private static int dobleSalarioMinimo = 2000000;
    private String nombre;
    private String error= "";
    private int edad;
    private int antiguedad;
    private int horas;
    private int valorHora= 50000;
    private int valorAuxilio= 0;
    
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

    public void setNombre(String pNombre)
    {
        this.nombre=pNombre; 
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setEdad(int pEdad)
    {
        this.edad=pEdad; 
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public void setAntiguedad(int pAntiguedad)
    {
        this.antiguedad=pAntiguedad; 
    }

    public int getAntiguedad()
    {
        return antiguedad;
    }
    public void setHoras(int pHoras)
    {
        this.horas=pHoras;
    }
    public int getHoras()
    {
        return horas;
    }
    public String getError()
    {
        return error;
    }
    public int getvalorAuxilio()
    {
        return valorAuxilio;
    }


    public  void HallarEdad()
    {
                int Fecha=20220530;
                edad= (Fecha - edad)/10000;           

    }

    public void HallarAntiguedad()
    {
        int FechaInicio=20220530;
        antiguedad= (FechaInicio - antiguedad)/10000; 
               
        if(edad<antiguedad)
        {
            antiguedad= 0;
            error = " error 0";
        }
    }

    public void PagarCantidad()
    {
        horas= horas*valorHora;
        if(horas<dobleSalarioMinimo)
        {
            valorAuxilio= 130000;
        }
    }

    
    public String toString()
    {
        return "";
    }
}