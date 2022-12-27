package j09_클래스;

public class ClassAMain {

    public static void main(String[] args) {
        System.out.println(new ClassA()); // 출력값 : j09_클래스.ClassA@6a5fc7f7
        System.out.println(new ClassA()); // 출력값 : j09_클래스.ClassA@3b6eb2ec
        System.out.println(new ClassA()); // 출력값 : j09_클래스.ClassA@1e643faf
        System.out.println(new ClassA()); // 출력값 : j09_클래스.ClassA@6e8dacdf

        ClassA a1 = new ClassA(); // 주소를 넣어줌

        ClassA a2 = new ClassA();

        a1.name = "된찌삼겹"; // a1 name에 접근해서 값을 넣는다.

        System.out.println(a1.name); // 출력값 : 된찌삼겹

        a2.name = "김치삼겹"; // a2 name에 접근해서 값을 넣는다.

        System.out.println(a1.name); // 출력값 : 된찌삼겹
        System.out.println(a2.name); // 출력값 : 김치삼겹

        a1.callName(); // 출력값 : 된찌삼겹을(를) 부릅니다.
        a2.callName(); // 출력값 : 김치삼겹을(를) 부릅니다.



    }

}
