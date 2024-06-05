import Materia.Cola;
import Materia.ColaGenerica;
import Materia.Modesl.Pantalla;
import Materia.Modesl.Pilas.PilaGenerica;
import Materia.Modesl.Pilas.Pilas;

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





    }

}
