package j07_반복;

public class BreakAndContinue {

    public static void main(String[] args) {

        int i = 0;

        while (true) { // true가 들어가면 무한 반복
            if(i > 9) {
                break;
            }
            System.out.println(i); // 출력값 : 0 ~ 9까지 출력됨!
            i++;
        }

        for (int j = 0; j < 10; j++) {
            if(j == 7) {
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j); // 출력값 : 0 ~ 6까지 출력되고 "7을만났습니다." 출력됨!
        }

        System.out.println("<<<<<<<<<<Continue>>>>>>>>>>");

        for (int j = 0; j < 100; j++) {

            if(j % 5 != 0 || j == 0) {
                continue; // continue를 만나면 밑의 반복문을
                          // 실행하는 것이 아니라 다음 반복으로 넘어감!
            }
            System.out.println(j); // 출력값 : 5부터 95까지 5의 배수가 출력됨!
        }

    }
}
