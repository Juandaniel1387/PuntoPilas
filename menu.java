
import java.util.Scanner;
import java.util.Stack;

public class menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        Stack<Integer> Pila = new Stack<>();
        System.out.println("***BIENVENIDO A LA SERIE DE FIBONACCI****");
        boolean bandera = true;
        int opcion = 0;
        while (bandera) {
            System.out.println("Escoga la opción que desea: \n1)Ingresar terminos a la serie de fibonacci.\n2)Buscar y eliminar un término de la serie.\n3)Salir. ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Pila = m.llenadopila();
                    Pila = m.ordenarPila(Pila);
                    System.out.println("Está es la pila de elementos generada aleatoriamente: ");
                    m.mostrarpila(Pila);
                    Pila = m.calcularFibonacci(Pila);
                    Pila = m.ordenarPila(Pila);
                    System.out.println("Esta es la pila que contiene la serie de fibonacci generada a partir de los primeros dos elementos de la anterior: ");
                    m.mostrarpila(Pila);
                    break;
                case 2:
                    if (Pila.isEmpty()) {
                        System.out.println("Primero llene la serie de fibonacci.");
                        break;
                    } else {
                        Pila = m.buscar_eliminar(Pila);
                        Pila = m.ordenarPila(Pila);
                        m.mostrarpila(Pila);

                    }
                    break;
                case 3:
                    bandera = false;
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones dadas.");
            }

        }
    }
}
