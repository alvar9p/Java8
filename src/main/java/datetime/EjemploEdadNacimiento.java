package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjemploEdadNacimiento {
    public static void main(String[] args) {

        //String nacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento con el siguiente formato yyyy-MM-dd");

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento con el siguiente formato yyyy-MM-dd");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy, dd MMM");

        String nacimiento = s.nextLine();
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual.format(df));

        LocalDate fechaNacimiento = LocalDate.parse(nacimiento);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.format(df));
        
        Period edad = Period.between(fechaNacimiento, fechaActual);

        System.out.printf("Su edad es: %d años, %d meses, %d días",
                edad.getYears(), edad.getMonths(), edad.getDays());

        /*String resultado = "Su edad es: " +
                "\n\tAños: " + edad.getYears() +
                "\n\tMeses: " + edad.getMonths() +
                "\n\tDías: " + edad.getDays();
        JOptionPane.showMessageDialog(null, resultado);*/

    }
}