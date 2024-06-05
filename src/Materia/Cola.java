package Materia;

import java.util.NoSuchElementException;

import Materia.Modesl.Node;

public class Cola {
    private Node first;
    private Node last;

    public Cola() {
        this.first = null;
        this.last = null;
    }

    //Metodo para agregar un Node a la cola
    public void addNode(int value){
        Node nuevoNodo = new Node(value);
        if (isEmpty()) {
            first = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next = nuevoNodo;
          last = nuevoNodo;
        }
    }

    /////
    public int peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");  
        }
        return first.value;
    }


    /////
    public boolean isEmpty(){
        return first == null;
    }

    ////
    public int remove(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
  
        }
        int value = first.value;
        first = first.next;
        if (first == null) {
            last = null;
            
        }
        return value;
    }
        
        

    
    
    
}
