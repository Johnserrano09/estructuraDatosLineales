package Materia.Modesl;

public class NodoGenerico <T>{
    public String value = null;
    public T data;
    public NodoGenerico <T> next;

    public NodoGenerico(T data){
        this.data = data;
    }
    
}
