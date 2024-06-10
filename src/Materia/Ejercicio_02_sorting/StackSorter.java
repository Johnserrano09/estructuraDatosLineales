package Materia.Ejercicio_02_sorting;

import java.util.Stack;

import Materia.Modesl.Pilas.PilaGenerica;
public class StackSorter {

    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
