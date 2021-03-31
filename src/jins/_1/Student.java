package jins._1;

/*
- 학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성.

- Student 클래스 생성
- String name, no를 가짐 (이름과 학번)

- 학생들을 ArrayList에 저장한 이후,
- 계속 검색을 하냐? 'Y' -> 반복,
- 종료하고싶으면    'N' -> 프로그램 종료

- 학생 이름이 있는 경우 그 학생의 학번을 출력
- 학생 이름이 없으면, 없는 학생이름이라고 출력
> while, flag, ArrayList, foreach
 */

public class Student {

    private String name;
    private String no;

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
