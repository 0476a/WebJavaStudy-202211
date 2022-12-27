package j06_조건;

public class Condition1 {
    public static void main(String[] args) {

        int num = -10;

        if (num < 0) {
            System.out.println("num은 음수입니다.");
        }

        // 조건식 안에 true or false 값이 들어감.
        if(num > 0 || num == 0) {
            System.out.println("num이 0이거나 num은 양수 입니다.");
        } else {
            System.out.println("num은 음수입니다."); // num이 조건식과 다르므로 "num은 음수입니다." 출력
        }


    }
}
