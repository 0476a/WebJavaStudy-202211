package j05_Scanner;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x입력: ");
        int x = scanner.nextInt(); // 숫자를 입력받을때 사용

        System.out.print("y입력: ");
        int y = scanner.nextInt();

        // System.out.println("x + y = " + x + y); 문자열에 더하는 거라 문자열이 되어버림
        System.out.println("x + y = " + (x + y)); // 괄호로 묶어 줘야함!
    }
}
