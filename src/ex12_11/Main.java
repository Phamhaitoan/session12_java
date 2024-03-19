package ex12_11;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int [] array = {1,2,3,4,5,6,8};
        for (int i = 0; i < array.length; i++) {
            if(stack.isEmpty() || array[i]>stack.peek()){
                stack.push(array[i]);
            }
        }
        System.out.println("phần tử lớn nhất là : " + stack.peek());
    }
}
