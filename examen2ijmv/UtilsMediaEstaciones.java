package examen2ijmv;

import java.util.Random;

public class UtilsMediaEstaciones {

    // Método para tomar las medidas de temperatura de las 5 estaciones
    // Rellena de forma aleatoria los datos del listado de estaciones que le pasemos
        
    public static void tomadatosEstaciones(Estacion [] listestaciones){

        int i,j; //variables para el bucle

        // declaramos las temperaturas máxima y mínima a obtener para la generación aletoria
        final double TEMPMAX=30.0; // temperatura máxima posible
        final double TEMPMIN=-10.0; // temperatura mínima posible


        // obtenemos el número de meses del primer elemento
        int num_meses=12;

        // obtenemos el número de estaciones
        int num_estac=listestaciones.length;
        // array en el que almacenaremos de forma temporal las temperaturas        

        Random aleatorio = new Random(); // Creamos un objeto 'aleatorio' de la clase "Random"

        // Rellenamos una por una las estaciones
        for (i=0;i<num_estac;i++){

            // creamos un objeto axiliar de la clase 'Estacion'
            double [] tempmeses=new double [num_meses];
            Estacion estac=new Estacion("","",tempmeses);
            // obtenemos el nombre a partir del número de estación
            estac.setNombre(nombresEstacion(i));
            // obtenemos la localización a partir del número de estación
            estac.setLocalizacion(localizaEstacion(i));

            System.out.println("Tomando los datos de la estación "+estac.getNombre()+" ("+(i+1)+" de "+num_estac+").");
            
            // metemos en el array auxiliar la temperatura aleatoria que será la temperatura mínima más
            // la amplitud térmica posible por el aleatorio (entre 0 y 1)
            for (j=0;j<num_meses;j++){
                tempmeses[j]=TEMPMIN+(aleatorio.nextDouble()*(TEMPMAX-TEMPMIN));
                System.out.printf(" Mes %d:%.2f",(j+1),tempmeses[j]);
            }

            System.out.print("\n");
            // asignamos el array de temperaturas generado al objeto auxiliar
            estac.setTempminima(tempmeses);

            // Por último, teniendo ya relleno el objeto auxiliar 'estac' lo asignamos al array de estaciones
            listestaciones[i]=estac;
        }




    } // final tomadatosEstaciones(Estacion [] listestaciones)


    // método para asignar los nombres de las estaciones
    public static String nombresEstacion (int numestacion){

        String [] nombres={
            "Oficial AEMET",
            "Carche",
            "Santa Ana",
            "Sierra Buey",
            "Salinas"
        };

        return nombres[numestacion];
    } // final nombresEstacion (int numestacion)


    // método para asignar las localizaciones de las estaciones
    public static String localizaEstacion (int numestac){

        String [] localizaciones={
            "Casco urbano",
            "Refugio",
            "Convento Santa Ana",
            "Base molinos",
            "Carretera de Hellín"
        };

        return localizaciones[numestac];
    } // final localizaEstacion (int numestac)


    // método para mostrar los datos de una estación
    public static void muestraEstaciones (Estacion [] e,int n){
            double [] temp=e[n].getTempminima();
            String temperaturas="";
            for (int j=0;j<e[n].getMeses();j++){
                temperaturas=temperaturas+" "+temp[j];
            }
        
            System.out.println(e[n].getNombre()+" "+e[n].getLocalizacion()+" "+temperaturas);
    } // final muestraEstaciones (Estacion [] e,int n)


    // sobrecargamos el método para mostrar todas las estaciones
    public static void muestraEstaciones (Estacion [] e){
        
        for (int i=0;i<e.length;i++){
            muestraEstaciones(e ,i);
        }

    } // final muestraEstaciones (Estacion [] e)

    

    // método para calcular la media anual en cada una estación
    public static void mediaEstacion(Estacion [] est){
        
        int meses=est[0].getMeses();
        int numest=est.length;

        double mediaestacion;
        double sumatemp;
        double [] listatemp=new double[meses];

        for (int i=0;i<numest;i++){
            listatemp=est[i].getTempminima();
            sumatemp=0;

            for (int j=0;j<meses;j++){
                sumatemp+=listatemp[j];
            }
            mediaestacion=sumatemp/(double)meses;
            System.out.printf("La media de temperatura del año de la estación %d (%s) fue de %.2f.\n",(i+1),est[i].getNombre(),mediaestacion);
        }

    }

        // método para calcular la media anual en cada una estación
        public static void mediaMesEstaciones(Estacion [] est){
        
            int meses=est[0].getMeses();
            int numest=est.length;
    
            double sumatemp;
            double mediames;
            
    
            for (int i=0;i<meses;i++){
                sumatemp=0;

                double [] listatemp=new double[meses];
                for (int j=0;j<numest;j++){
                    
                    listatemp=est[j].getTempminima();
                    sumatemp+=listatemp[i];
                }
                mediames=sumatemp/(double)numest;
                System.out.printf("La media de temperatura del mes %d fue de %.2f grados.\n",(i+1),mediames);
            }
    
        }

        // media total del año
        public static void mediaAnyo(Estacion [] est){
        
            int meses=est[0].getMeses();
            int numest=est.length;
    
            double sumatemp;
            double mediames,mediaanyo;
            double totalmeses=0;

            
    
            for (int i=0;i<meses;i++){
                sumatemp=0;

                double [] listatemp=new double[meses];
                for (int j=0;j<numest;j++){
                    
                    listatemp=est[j].getTempminima();
                    sumatemp+=listatemp[i];
                }
                mediames=sumatemp/(double)numest;
                totalmeses+=mediames;
            }

            mediaanyo=totalmeses/meses;
            System.out.printf("La media total de todas las estaciones durante el año fue de %.2f grados",mediaanyo);
    
        } // final de mediaAnyo(Estacion [] est)


} // final de la clase principal