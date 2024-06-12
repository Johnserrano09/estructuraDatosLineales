package Materia.Modesl;

import Materia.Modesl.NodoGenerico;

public class ListaEnlazadaGenerica <T> {

    private NodoGenerico<T> head;

    public ListaEnlazadaGenerica(){

    }

   //Agregar Nodos a la lista 
public void addNode(T value){
    if(head== null){
        head=new NodoGenerico<T>(value);
        return;
    }

    NodoGenerico<T> current =head;
    while (current.next!=null) {
        current=current.next;
    }

    current.next=new NodoGenerico<T>(value);
}

// el metodo para eliminar 
public void deleteNode(T value){
    if (head==null) return;  //no hay elementos no haga nada

    if (head.data.equals(value)) {
        head=head.next;
        return;
    }
    NodoGenerico<T> current=head;
    while (current.next!=null) {
        if(current.next.data.equals(value)){
            current.next= current.next.next;
            return;
        }
        current=current.next;
    }
}

public void print(){
    if (head==null) {
        System.out.println("Lista vacia");
        return;
    }
    NodoGenerico<T> current=head;
    while (current.next!=null) {
        System.out.println("Node->"+current.data);
        current=current.next;
    }
    System.out.println("Node->"+current.data);
    System.out.println("Fin de la lista");

    }
    
}
