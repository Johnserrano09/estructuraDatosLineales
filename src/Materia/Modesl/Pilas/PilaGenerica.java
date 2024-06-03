package Materia.Modesl.Pilas;

import java.util.EmptyStackException;

import Materia.Modesl.NodoGenerico;

public class PilaGenerica <T> {
    private NodoGenerico <T> top;

    public PilaGenerica(){
        top = null;
    }

    public void push(T data){
        NodoGenerico<T>  nuevoNodo = new NodoGenerico<T>(data);
        nuevoNodo.next = top;

        top = nuevoNodo;
    }

    ////////
    public boolean isEmpty(){
        return top == null;
    }
    ////////
    public T pop(){
        if (isEmpty()) {
            System.out.println("lA PILA ESTA VACIA");
            throw new EmptyStackException();
            
        }

        T data = top.data;
        top = top.next;
        return data;
    }
    ////////
    public T peek(){
        if (isEmpty()) {
            System.out.println("lA PILA ESTA VACIA");
            throw new EmptyStackException();
            
        }
        return top.data;
    }    
        
    
}
