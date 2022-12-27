package j02_변수상수;


/*변수*/
public class Variable {
    public static void main(String[] args) {
        
        // 논리자료형
        boolean checkFlag = false;
        System.out.println(checkFlag); // 출력값 : false
        checkFlag = true;
        System.out.println(checkFlag); // 출력값 : true

        // 문자자료형 변수
        char name1 = '된';
        char name2 = '삼';
        char name3 = '겹';
        System.out.println(name1); // 출력값 : 된
        System.out.println(name2); // 출력값 : 삼
        System.out.println(name3); // 출력값 : 겹
        System.out.println(name1 + name2 + name3); // 출력값 : 139665
        //            정수로 변환이 되서 유니코드로 더해짐! 따라서 값이 숫자임!
        System.out.println("" + name1 + name2 + name3); // 출력값 : 된삼겹
        //            -> ("")더해지면 문자열이 됨! (문자열이랑 더해지면 문자열이 됨.)
        System.out.println('가' + 0); // 출력값 : 44032
        int a = '가' + 0;
        System.out.println(Integer.toHexString(a)); // 출력값 : ac00
        
        // 문자열자료형 변수
        String name = "된찌삼겹";
        // String name2 = "" // name2가 이미 선언되어있음.
        String name4 = "우삼겹";
        String name5 = name + name4;
        System.out.println(name5); // 출력값 : 된찌삼겹우삼겹
        System.out.println(name); // 출력값 : 된찌삼겹

        // 정수자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult); // 출력값 : 300
        System.out.println(widthResult2); // 출력값 : 300400

        // long 자료형
        long time = System.currentTimeMillis(); // 현재 시간 날짜를 표기 
        System.out.println(time); // 출력값 : 1669827700114 (컴퓨터가 알아보기 쉬운 숫자임)
        
        // int time2 = 1669827700114; int는 21억까지만 넣을 수 있는데 그 이상을 넣어서 오류 발생
        long time2 = 1669827700114L; // 접미사 L or l 사용 (숫자랑 햇갈려서 대문자 사용 권장)
        System.out.println(time2); // 출력값 : 1669827700114
        
        // 실수자료형 변수
        double pi = 30000000.1415926535999999999;
        System.out.println(pi); // 출력값 : 3.0000000141592655E7
                                          // E7 = 10^7

        final String FILE_PATH = "C:/Users/kbs";
        // FILE_PATH = "D:/Users/aaa"; 상수이기 때문에 바꿀 수 없다.(오류 발생)
        System.out.println(FILE_PATH); // 출력값 : C:/Users/kbs
        // 상수는 모두 스네이크 표기법




    }
}
