package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        char cast1 = 'a';
        System.out.println((int)cast1); // 출력값 : 97
        // 문자인 자료형이 정수형으로 바뀜
        int cast2 = cast1; // 정수를 담는곳에 문자형이 들어갈 수 있다.
        System.out.println(cast2); // 출력값 : 97

        // downcasting(다운캐스팅)
        int cast3 = 98;
        // char cast4 = cast3; 문자형에는 정수가 들어올 수 없다.(오류 발생)
        char cast4 = (char) cast3;
        System.out.println(cast4); // 출력값 : b

        double cast5 = 3.14;
        int cast6 = (int) cast5;
        System.out.println(cast6); // 출력값 : 3
        // int는 정수 부분만 표시할 수 있기 때문에 소수 부분을 버림
        double cast7 = cast6;
        System.out.println(cast7); // 출력값 : 3.0
        // 이미 소수점이 버려졌기 때문에 3.0이라는 값이 나옴!


    }
}
