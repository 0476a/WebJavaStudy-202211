package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        /**
         *  문자열 입력 :
         *  next()   ---> 띄어쓰기 포함 x
         *  nextLine() ---> 띄어쓰기 포함 o
         */

        String name = "kbs";

        Scanner scanner = new Scanner(System.in); // 딱 한번 선언
        //                           System.in => 입력을 한다!

        // int s = scanner.next(); String을 받아야 하는데 int에는 대입 불가

//        String s = scanner.next(); // next : 띄어쓰기 불가
//        String s2 = scanner.next();
//        String s3 = scanner.next();

        String s = scanner.nextLine(); // nextLine : 띄어쓰기 가능
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        System.out.println("입력 받은 값1: " + s); // 출력값 : s 입력값
        System.out.println("입력 받은 값2: " + s2); // 출력값 : s2 입력값
        System.out.println("입력 받은 값2: " + s3); // 출력값 : s3 입력값

    }

}
