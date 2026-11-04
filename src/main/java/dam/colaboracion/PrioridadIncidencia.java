package dam.colaboracion;

import java.util.Scanner;

public class PrioridadIncidencia {

	public static void ejecutar() {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("Nivel de urgencia (1-BAJA, 2-MEDIA, 3-ALTA): ");
        int nivel = sc.nextInt();
        
        sc.close();

        if (nivel == 1) {
            System.out.println("Prioridad asignada: BAJA");
        } else if (nivel == 2) {
            System.out.println("Prioridad asignada: MEDIA");
        } else if (nivel == 3) {
            System.out.println("Prioridad asignada: ALTA");
        } else {
            System.out.println("Nivel no válido");
        }

		
	}
}
