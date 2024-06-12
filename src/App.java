import java.util.LinkedList;
import java.util.Stack;

import Materia.Cola;
import Materia.ColaGenerica;
import Materia.Ejercicio_01_sign.SingValidator;
import Materia.Ejercicio_02_sorting.StackSorter;
import Materia.Ejercicio_03_linkedLists.LinkedListsEjr;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Modesl.Pantalla;
import Materia.Modesl.Pilas.PilaGenerica;
import Materia.Modesl.Pilas.Pilas;
import Materia.Modesl.ListaEnlazadaGenerica;
import Materia.Modesl.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Pila
        Pilas pila = new Pilas();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en la cima es: "+ pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la cima es: "+ pila.peek());



        /// pila generica
        PilaGenerica <Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home Page", "/home"));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantalla("Settings Page", "/home/menu/settings"));


        System.out.println("Estoy en la pantalla:\n\t -->"+pilaPantallas.peek().getNombre());
        System.out.println("Estoy en la pantalla:\n\t -->"+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t -->"+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t -->"+pilaPantallas.peek().getNombre());

        //COLAS
        Cola queue = new Cola();
        //Anadir elementos cola
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        
        //Mostrar el elemento en el frete 
        System.out.println("Elemento en el frente: "+queue.peek());//10
        
        //Retirar elementos de la cola
        System.out.println("Elemento retirado: "+queue.remove());//10
        System.out.println("Elemento en el frente: "+queue.peek());//10

        System.out.println("Elemento retirado: "+queue.remove());//20
        System.out.println("Elemento en el frente: "+queue.peek());//10

        //Verificar si la cola esta vacia
        System.out.println("la cola esta vacia?: "+(queue.isEmpty() ? "Si" : "No"));// false

        //COLAS GENERICAS
        ColaGenerica<Pantalla> queuegenGenerica=new ColaGenerica<>();
        queuegenGenerica.addNode(new Pantalla("home","1"));
        queuegenGenerica.addNode(new Pantalla("Menu","2"));
        queuegenGenerica.addNode(new Pantalla("Settings","3"));
        System.out.println("\nLa cola tiene mas "+queuegenGenerica.size()+ " elemento");
        
        System.out.println(" Estoy en la pantalla\t"+
        queuegenGenerica.peek().getNombre());
        System.out.println("Pantalla destruida\t"+
        queuegenGenerica.remove().getNombre());
        queuegenGenerica.addNode(new Pantalla("user page", "4"));
        System.out.println(" Estoy en la pantalla\t"+
        queuegenGenerica.peek().getNombre());
        System.out.println("Pantalla destruida\t"+
        queuegenGenerica.remove().getNombre());
        System.out.println("Pantalla destruida\t"+
        queuegenGenerica.remove().getNombre());
        System.out.println(" Estoy en la pantalla\t"+
        queuegenGenerica.peek().getNombre());
        
        System.out.println("\nLa cola tiene mas "+queuegenGenerica.size()+ " elemento");


        // EJERCICIO 1 SING
        SingValidator validador = new SingValidator();

        String input1 = "([]){}";
        System.out.println(validador.isValid(input1));  // Output: true

        String input2 = "([)]";
        System.out.println(validador.isValid(input2));  // Output: false

        String input3 = "{[]}";
        System.out.println(validador.isValid(input3));  // Output: true

        String input4 = "([)";
        System.out.println(validador.isValid(input4));  // Output: false

        /// Ejercicio 02
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        StackSorter sorter = new StackSorter();
       sorter.sortStack(stack);

       while (!stack.isEmpty()) {
          System.out.print(stack.pop() + " ");
        }
        // Output: 1 2 4 5

        ////
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);
        lista.print();
        lista.deleteNode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();


        ListaEnlazadaGenerica<Integer> listaEnteros = new ListaEnlazadaGenerica<>();

        // Agregar nodos a la lista
        listaEnteros.addNode(1);
        listaEnteros.addNode(2);
        listaEnteros.addNode(3);
        listaEnteros.addNode(4);
        listaEnteros.addNode(5);

        // Imprimir la lista
        System.out.println("Lista original:");
        listaEnteros.print();

        // Eliminar un nodo de la lista
        listaEnteros.deleteNode(2);

        // Imprimir la lista después de eliminar un nodo
        System.out.println("Lista después de eliminar 2:");
        listaEnteros.print();

        ///
        System.out.println("-------------------------------------------------------");
        LinkedListsEjr lista3 = new LinkedListsEjr();
        lista3.addNode2(1);
        lista3.addNode2(2);
        lista3.addNode2(5);
        lista3.addNode2(7);
        lista3.addNode2(6);

        int posicion = 1;
        int resultado = lista3.getByPoss(posicion);
        System.out.println("El nodo en la posicion "+ posicion +" desde el final es: "+ resultado);


    }


    

}
