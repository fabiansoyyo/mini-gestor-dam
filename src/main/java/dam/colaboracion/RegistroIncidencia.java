package dam.colaboracion;

import java.util.Scanner;

public class RegistroIncidencia {

    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Título de la incidencia: ");
        String titulo = teclado.nextLine();

        System.out.print("Descripción breve: ");
        String descripcion = teclado.nextLine();

        System.out.println("Incidencia registrada: " + titulo);
    }
}
