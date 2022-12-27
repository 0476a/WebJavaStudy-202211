package j07_반복;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*"); // 별을 넣는 반복

            }

            System.out.println(); // 줄바꾸는 반복
        }


        for (int i = 0; i < 10; i++) { // 변할 수가 없음 (10줄이 나오기 때문)

           for (int j = 0; j < 10 - i; j++) {
               System.out.print("*");
           }

            System.out.println();
        }


        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }


        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
