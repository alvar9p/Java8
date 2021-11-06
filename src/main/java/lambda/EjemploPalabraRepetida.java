package lambda;
import java.util.HashMap;
import java.util.Map;

public class EjemploPalabraRepetida {
    public static void main(String[] args) {

        Repeticion palabraRepetida = (cadena) -> {
            Map<String, Integer> mapaResultante = new HashMap<>();
            int vecesRepetida = 0;
            String palabra = "";

            String cadenaFormateada = cadena.toLowerCase()
                    .replace(",", "")
                    .replace(".", "");

            String[] arregloPalabras = cadenaFormateada.split(" ");

            for (int i = 0; i < arregloPalabras.length; i ++) {

                int contador = 0;

                for (int j = 0; j < arregloPalabras.length; j ++){
                    if (arregloPalabras[i].equalsIgnoreCase(arregloPalabras[j])){
                        contador++;
                    }
                }

                if(contador > vecesRepetida){
                    vecesRepetida = contador;
                    palabra = arregloPalabras[i];
                }
            }

            mapaResultante.put(palabra, vecesRepetida);
            return mapaResultante;

        };

        String frase = " Yo ni te conozco, ni te he visto, ni, se tu nombre, ni, te hablaré, ni me interesas. NI SE NI, QUIERO tampoco";
        palabraRepetida.repetida(frase).forEach( (palabra, veces) -> System.out.println("La palabra mas repetida fue: " +
                palabra + " \nLa cantidad de veces fue: " + veces));

    }
}