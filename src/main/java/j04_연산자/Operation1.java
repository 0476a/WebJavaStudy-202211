package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {
        int num = 10;
        num = num + 1;
        System.out.println(num); // 출력값 : 11
        // System.out.println(num++); // 출력값 : 11
        // System.out.println(++num); // 출력값 : 12
        // System.out.println(num); // 출력값 : 10출력값 : 12
        // ++num; 선증가 (증가를 먼저 시켜라 -> 바로 증가함)
        // num++; 후증가 (지금은 값을 쓰고 나중에 값을 증가시켜라 -> 다음에 증가함)

        // System.out.println(--num); // 출력값 : 10
        // System.out.println(num--); // 출력값 : 11
        // System.out.println(num); // 출력값 : 10
    }


}
