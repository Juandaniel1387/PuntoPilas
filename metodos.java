
import java.util.Scanner;
import java.util.Stack;

public class metodos {

    Scanner sc = new Scanner(System.in);

    public Stack<Integer> llenadopila() {
        Stack<Integer> pila = new Stack<>();

        boolean bandera = true;

        while (bandera) {
            pila.push((int) (Math.random() * 1000 + 1));
            int opt = 0;
            System.out.println("Desea ingresar otro elemento a la serie?\n1) Si.\n2)No.");
            opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
        }

        return pila;
    }

    public Stack<Integer> calcularFibonacci(Stack<Integer> Pila) {
        Stack<Integer> Pila_Serie = new Stack<>();
        int tamano = Pila.size();
        int inicial = Pila.pop();
        int segundo = Pila.pop();
        int siguiente = 0;
        Pila_Serie.push(inicial);
        Pila_Serie.push(segundo);
        for (int i = 0; i < tamano; i++) {
            siguiente = inicial + segundo;
            Pila_Serie.push(siguiente);
            inicial = segundo;
            segundo = siguiente;
        }
        return Pila_Serie;
    }

    public Stack<Integer> ordenarPila(Stack<Integer> Pila) {
        Stack<Integer> Pilatemporal = new Stack<>();
        while (!Pila.isEmpty()) {
            int auxiliar = Pila.peek();
            Pila.pop();
            while (!Pilatemporal.isEmpty() && Pilatemporal.peek() > auxiliar) {
                Pila.push(Pilatemporal.peek());
                Pilatemporal.pop();
            }
            Pilatemporal.push(auxiliar);
        }

        return Pilatemporal;
    }

    public Stack<Integer> buscar_eliminar(Stack<Integer> Pila) {
        Stack<Integer> Pila_final = new Stack<>();
        int tamano = Pila.size();
        System.out.println("Esta es la pila y sus elemetos, ingrese el elemento que desea eliminar: ");
        System.out.println(Pila);
        int elemento = 0;
        elemento = sc.nextInt();
        for (int i = 0; i < tamano; i++) {
            if (elemento == Pila.peek()) {
                System.out.println("Elemento encontrado y borrado con éxito.");
                Pila.pop();
            } else {
                Pila_final.push(Pila.peek());
                Pila.pop();
            }
        }
        return Pila_final;
    }

    public void mostrarpila(Stack<Integer> Pila) {
        System.out.println(Pila);
    }

}
