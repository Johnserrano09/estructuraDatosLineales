package Materia.Ejercicio_01_sign;

import Materia.Modesl.Pilas.PilaGenerica;

public class SingValidator {

    public boolean isValid(String s){
        
        PilaGenerica<Character> pila1=new PilaGenerica<>();
        for(char a : s.toCharArray()){

            if (a == '(' || a == '{' || a == '[') {
                pila1.push(a);

            }  else if (a == ')' || a == '}' || a == ']') {
                if (pila1.isEmpty()) {
                    return false;
                }
                char top = pila1.pop();
                if ((a == ')' && top != '(') || 
                    (a == '}' && top != '{') || 
                    (a == ']' && top != '[')) {
                    return false;

                }
            }
        }   
        return pila1.isEmpty();
    }

     
}