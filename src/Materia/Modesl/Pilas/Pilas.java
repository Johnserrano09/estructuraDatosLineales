package Materia.Modesl.Pilas;
import java.util.EmptyStackException;

import Materia.Modesl.Node;

public class Pilas {
    private Node top;

    public Pilas(){
        top = null;

    }

    //push agregar elemento a la pila
    public void push (int value){
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = top;
        top = nuevoNodo;

    }
//// Elimina el elemento
    public int pop(){
        if (top == null) {
            System.out.println("la pila esta vacia");
            throw new EmptyStackException();
            
        }else{
            int value = top.value;
            top = top.next;
            return value;
        }

    }
/// MIRA EL ELEMENTO
    public int peek(){
        if (top == null) {
            System.out.println("la pila esta vacia");
            throw new EmptyStackException(); 
        }
        return top.value;

    }
    /// cOMPRUEBA SI ESTA VACIO
    public boolean isEmpty(){
        return top == null;
    }
    
}
