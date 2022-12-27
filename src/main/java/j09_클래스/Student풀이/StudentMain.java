package j09_클래스.Student풀이;

import j09_클래스.Student풀이.Student;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.name = "된찌삼겹";

        s2.schoolName = "서울대학교";
        s2.studentCode = 20220002;
        s2.studentYear = 3;
        s2.name = "김치삽겹";

        s1.showStudentInfo(); // 출력값 : 학교: 부산대학교
                                       // 학번: 20220001
                                       // 학년: 1
                                       // 이름: 된찌삼겹
        s2.showStudentInfo(); // 출력값 : 학교: 서울대학교
                                       // 학번: 20220002
                                       // 학년: 3
                                       // 이름: 김치삽겹

        System.out.println("<<<<<<< 학년증가 반복>>>>>>>");
//        for (int i = 0; i < 10; i++) {
//            s1.increaseStudentYear();
//        }

        s1.increaseStudentYear(2); // 출력값 : 학교: 부산대학교
                                            // 학번: 20220001
                                            // 학년: 3
                                            // 이름: 된찌삼겹
        s1.increaseStudentYear(2); // 출력값 : 학교: 부산대학교
                                            // 학번: 20220001
                                            // 학년: 5
                                            // 이름: 된찌삼겹
        s1.increaseStudentYear(2); // 출력값 : 2학년을 더하면 7학년이 되어서 5학년을 넘어섭니다.

        s1.showStudentInfo(); // 출력값 : 학교: 부산대학교
                                       // 학번: 20220001
                                       // 학년: 5
                                       // 이름: 된찌삼겹

        s2.increaseStudentYear(5); // 출력값 : 5학년을 더하면 8학년이 되어서 5학년을 넘어섭니다.




    }

}
