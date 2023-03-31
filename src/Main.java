public class Main {
    public static void main(String[] args) {

        // Ejercicios Clase 1
        // 1)

        // a) Utilizando sentencia "while", imprimir todos los números entre dos variables
        // b) Se imprimen sólo los pares
        // c) Con una variable se elige si se deben mostrar los números pares o impares (boolean verPar = true/false)

        /*

        int numIni = 5;
        int numFin = 15;
        boolean verPar = true;

        while (numIni < numFin) {

            if (verPar) {

                if (numIni % 2 == 0) {
                    System.out.println("Número par " + numIni);
                }

            } else {

                if (numIni % 2 != 0) {
                    System.out.println("Número impar " + numIni);
                }

            }

            numIni++;
        }

    }

}

*/

//----------------------------------------------------------------------------------

/*

        // d) Utilizando sentencia "for", hacer lo mismo que en (b) pero invirtiendo el orden

        int numIni = 5;
        int numFin = 15;
        boolean verPar = true;

        while (numIni < numFin) {

            if (verPar) {

                if (numIni % 2 == 0) {
                    System.out.println("Número par " + numIni);
                }

            } else {

                if (numIni % 2 != 0) {
                    System.out.println("Número impar " + numIni);
                }

            }

            numIni++;
        }

    }

}


 */

// -----------------------------------------------------------------------------------

        // Ejercicios Clase 1
        // 2)

        // Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
        //persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en
        //papel y lápiz y sólo implementar el cuarto.

        // ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        //(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
        //● Tener 3 o más vehículos con una antigüedad menor a 5 años.
        //● Tener 3 o más inmuebles.
        //● Poseer una embarcación, una aeronave de lujo o ser titular de activos
        //societarios que demuestren capacidad económica plena.”

        // a. Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.

        // float ingMes = 125000
        // int cantVehic = 2
        // int antigVehic = 5
        // int inmueble = 2
        // int lujo = 0
        // boolean ingAltos = true

        //b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo
        //c. Piense en un arbol de decision, tambien como se vio en clase si puede resolver el problema, dadas las entradas

        // Si: ingMes >= 489083 entonces ingAltos; si no,
        // Si: cantVehic >= 3 y antigVehic <= 5 entonces ingAltos; si no,
        // Si: inmueble >= 3 entonces ingAltos; si no,
        // Si: lujo >= 1 entonces ingAltos; si no,
        // No es ingAltos

        // d. Finalmente, vea si puede resolver el problema utilizando código Java.

        float ingMes = 350000;
        int cantVehic = 2;
        int antigVehic = 3;
        int inmueble = 2;
        int lujo = 0;
        boolean ingAltos = true;


        if(ingMes >= 489083 || (cantVehic >= 3 && antigVehic <= 5) || inmueble >= 3 || lujo >= 1) {
            ingAltos = true;
            System.out.println("La persona declarada pertenece al segmento de ingresos altos.");
        } else {
            ingAltos = false;
            System.out.println("La persona declarada NO pertenece al segmento de ingresos altos.");
        }




    }
}