import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int prioridad_total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Gestor de tareas ===");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas (pendiente)");
        System.out.println("3. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if(opcion >= 1 && opcion <= 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la tarea:");
                    String nombre_tarea = scanner.nextLine();
                    System.out.println("Ingrese la prioridad de la tarea (1 a 5):");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine();
                    if(prioridad < 1 || prioridad > 5) {
                        System.out.println("La prioridad debe ser un numero entero entre el 1 y el 5.");
                        break;
                    }
                    prioridad_total += prioridad;
                    System.out.println("Tarea creada: " + nombre_tarea + "(prioridad: " +  prioridad + ")");
                    System.out.println("Suma total de prioridades: " + prioridad_total);
                    break;
                case  2:
                    System.out.println("Funcionalidad pendiente.");
                    break;
                case  3:
                    System.out.println("¡Nos vemos!");
                    break;
            }
        } else {
            System.out.println("Opcion invalida.");
        }
        scanner.close();
    }
}