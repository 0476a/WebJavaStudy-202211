package j05_Scanner;

import java.util.Scanner;

public class input3 {

    /*
     *  이름 : 된찌삼겹            name
     *  나이 : 22                  age
     *  주소 : 부산 금정구         address
     *  연락처 : 010 1234 5678     phone
     *
     *  사용자의 이름은 된찌삼겹이고 나이는 22살입니다.
     *  주소는 부산 금정구 이며 연락처는 010 1234 5678입니다.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String  address = null;
        String phone = null;

        System.out.print("이름: ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();
        scanner.nextLine(); // 허공에 하나를 만들어준다. 앞에 엔터가 적용되기 때문에

        System.out.print("주소: ");
        address = scanner.nextLine();

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "살입니다.");
        System.out.println("주소는 " + address + "이며 연락처는 " + phone + "입니다.");
    }
}
