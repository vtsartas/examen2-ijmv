package examen2ijmv;

public class Estacion {

    // declaramos el número de meses
    public final int MESES=12;
    
    // atributos de la clase 'Estacion'
    private String nombre=""; // nombre de la estación
    private String localizacion=""; // ubicación de la estación
    private double [] tempminima=new double [MESES]; // array que recoge las temperaturas mínimas de los 12 meses

    // método constructor de la clase 'Estacion'
    public Estacion(String nombre, String localizacion, double[] tempminima) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.tempminima = tempminima;
    }


    // getters/setters de la clase 'Estacion'
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public double[] getTempminima() {
        return tempminima;
    }
    public void setTempminima(double[] tempminima) {
        this.tempminima = tempminima;
    }

    // obtenemos los meses
    public int getMeses() {
        return MESES;
    }

    

} // fin de la clase 'Estacion'