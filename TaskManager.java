import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tareas = new String[10];
        int numeroDeTareas = 0;
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver tareas");
            System.out.println("2. Añadir tarea");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            if (opcion == 1) {
                if (numeroDeTareas == 0) {
                    System.out.println("No hay tareas.");
                } else {
                    for (int i = 0; i < numeroDeTareas; i++) {
                        System.out.println((i + 1) + ". " + tareas[i]);
                    }
                }
            } else if (opcion == 2) {
                System.out.print("Escribe la tarea: ");
                String nuevaTarea = scanner.nextLine();
                tareas[numeroDeTareas] = nuevaTarea;
                numeroDeTareas++;
                System.out.println("Tarea añadida.");
            } else if (opcion == 3) {
                System.out.println("Adiós.");
            } else {
                System.out.println("Opción incorrecta.");
            }
        }
    }
}
