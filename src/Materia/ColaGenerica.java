package Materia;

import java.util.NoSuchElementException;

import Materia.Modesl.NodoGenerico;

public class ColaGenerica <T> {
    private NodoGenerico<T> first;
    private NodoGenerico <T>last;
    private int size;

    public ColaGenerica() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    /////uihhghj
    public void addNode(T data){
        NodoGenerico<T> nuevonode=new NodoGenerico<>(data);
        if (isEmpty()){
            first=nuevonode;
            last=nuevonode;
        }else{
            last.next=nuevonode;
            last=nuevonode;
        }
        size ++;
    }

    /////
    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esat vacia");
        }
        T value=first.data;
        first=first.next;
        if (first==null){
            last=null;
        }
        size --;
        return value;
    } 

    //////
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }


    /////
    public boolean isEmpty(){
        return first==null;
    }

    ///
    public int size(){
        return size;
    }
    
        

    
}
