package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {

        Constructor c1 = new Constructor();
        c1.showInfo(); // 출력값 : NoArgsConstructor(기본생성자)
                                // num: 0
                                // name: null

        Constructor c2 = new Constructor(10);
        c2.showInfo(); // 출력값 : RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)
                                // num: 10
                                // name: null
        
        Constructor c3 = new Constructor(10, "된찌삼겹");
        c3.showInfo(); // 출력값 : AllArgsConstructor(전체 생성자)
                                // num: 10
                               // name: 된찌삼겹


    }

}
