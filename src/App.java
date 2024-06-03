import Materia.Modesl.Pantalla;
import Materia.Modesl.Pilas.PilaGenerica;
import Materia.Modesl.Pilas.Pilas;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

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

    }

}
