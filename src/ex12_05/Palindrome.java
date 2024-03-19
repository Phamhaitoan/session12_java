package ex12_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi cần kiểm tra");
        String inputString = scanner.nextLine();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >=0  ; i--) {
              queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString)){
            System.out.println("đây là chuỗi đối xứng");
        } else {
            System.out.println("đây không phải chuỗi đôi xứng");
        }
    }
}


//class KiemTraChuoiDoiXung {
//    public static void main(String[] args) {
//        System.out.print("Nhập vào chuỗi bạn muốn kiểm tra:");
//        Scanner in=new Scanner(System.in);
//        String inputString = in.nextLine();
//        Stack stack = new Stack();
//        for (int i = 0; i < inputString.length(); i++) {
//            stack.push(inputString.charAt(i));
//        }
//        String reverseString = "";
//
//        while (!stack.isEmpty()) {
//            reverseString = reverseString+stack.pop();
//        }
//        if (inputString.equals(reverseString))
//            System.out.println("Đây là chuỗi đối xứng.");
//        else
//            System.out.println("Đây không phải là chuỗi đối xứng.");
//    }
//}
