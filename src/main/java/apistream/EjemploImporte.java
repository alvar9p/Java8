package apistream;

import java.util.Arrays;
import java.util.List;

public class EjemploImporte {
    public static void main(String[] args) {

        List<Producto> lista = Arrays.asList(
                new Producto(220.3, 5),
                new Producto(550.5, 3),
                new Producto(330.2, 2),
                new Producto(767.8, 8));

        Double resultado = lista.stream()
                .map(e -> e.getCantidad() * e.getPrecio())
                /*.peek(System.out::println)*/
                .reduce(0d, Double::sum);

        System.out.println("Total: " + resultado);
    }
}