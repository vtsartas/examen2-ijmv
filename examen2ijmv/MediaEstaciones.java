/* Módulo 2. Examen práctico
MF0964_3: Desarrollo de elementos software para gestión de sistemas 
FECHA: 22/01/2020

La Agencia Estatal de Meteorología (AEMET) tiene repartidas 5 estaciones climatológicas en el término de Jumilla,
 que almacenan varios parámetros sobre temperaturas. Entre ellos el que nos van a proporcionar es la temperatura
 mínima registrada durante todo el mes.
 Nos piden desarrollar un programa (en Java) que calcule la media de estas  temperaturas para el 2019 y las muestre
 por pantalla.
 Primero por cada estación climatológica la media  del año y
 segundo, por cada mes la media de las 5 estaciones.
 También una media total de todas las estaciones durante todo el año.
 
 Debemos crear la estructura de datos más adecuada e inicializar las temperaturas, bien aleatoriamente
 (entre -10 y 30), bien manualmente.

Para empezar a trabajar crear un repositorio vacío en github.com con el nombre examen2-<nombre> y clonarlo en Visual
Studio Cloud. Al terminar el proyecto subirlo a github y enviar un  mail a cursoprog2019@gmail.com con nombre,
apellidos, dni y la URL del repositorio. En el asunto indicar Módulo 2 . Examen práctico. */

package examen2ijmv;

public class MediaEstaciones {

    public static void main(String[] args) {

        // declaramos en una constante el número de estaciones existentes
        final int NUM_ESTACIONES=5;

        // creamos un array de estaciones
        Estacion [] estaciones=new Estacion [NUM_ESTACIONES];

        // rellenamos los datos del array con las estaciones
        UtilsMediaEstaciones.tomadatosEstaciones(estaciones);

        // mostramos la media por estación
        System.out.println("\n");
        System.out.println("MOSTRAMOS LA MEDIA ANUAL POR ESTACIÓN");
        UtilsMediaEstaciones.mediaEstacion(estaciones);
        
        // mostramos la media por mes
        System.out.println("\n");
        System.out.println("MOSTRAMOS LAS MEDIAS POR MES");
        UtilsMediaEstaciones.mediaMesEstaciones(estaciones);

        // mostramos la media del año
        System.out.println("\n");
        System.out.println("MOSTRAMOS LA MEDIAS TOTAL DEL AÑO");
        UtilsMediaEstaciones.mediaAnyo(estaciones);

    } // final del main
    
} // final de la clase principal