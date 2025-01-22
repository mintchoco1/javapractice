package construct;

public class Memberinit {
    String name;
    int age;
    int grade;

    //추가
    void initmember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        //this 는 자시 자신의 인스터스를 가리킨다
    }
}
