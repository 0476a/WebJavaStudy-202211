package j04_연산자;

/**
 *           <<<<<<<<<<<<<< 논리연산자 >>>>>>>>>>>>>>
 *
 *           Ture(1), False(0)
 *
 *        AND  &&  -> 곱   T X T => T,  T X F => F,   F X F => F 하나라도 거짓이면 무조건 거짓
 *        OR   ||  -> 합   T + T => T,  T + F => T,   F + F => F 하나라도 참이면 무조건 참
 *        NOT  !   -> 부정
 *
 */
public class Operation2 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T x T => " + result1); // 출력값 : T x T => true

        boolean result2 = flag1 && flag2;
        System.out.println("T x F => " + result2); // 출력값 : T x F => false

        boolean result3 = flag2 && flag2;
        System.out.println("F x F => " + result3); // 출력값 : F x F => false

        System.out.println();

        boolean result4 = flag1 || flag1;
        System.out.println("T x T => " + result4); // 출력값 : T x T => true

        boolean result5 = flag1 || flag2;
        System.out.println("T x F => " + result5); // 출력값 : T x F => true

        boolean result6 = flag2 || flag2;
        System.out.println("F x F => " + result6); // 출력값 : F x F => false

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x T =>" + result7); // 출력값 : T + F x T => ture
        System.out.println(!result7); // 출력값 : false

        System.out.println();

        boolean result8 = 10 % 3 != 0;
        System.out.println("10 % 3 != 0 => " + result8); // 출력값 : 10 % 3 != 0 => true

        System.out.println();

        int year = 2022;
        boolean result9 = year % 2 == 0 && year % 300 != 0 || year % 100 == 0;
        System.out.println(result9); // 출력값 : true

    }
}
