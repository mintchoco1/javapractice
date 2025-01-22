package construct;

public class Memberconstruct {
    String name;
    int age;
    int grade;
    
    //객체 생성시 바로 호출
    //인자 매우 중요
    //인자의 종류 갯수에 따라서 다름 = 오버로딩 가능
    Memberconstruct() {
        System.out.println("인자 없는 생성자");
    }
    
    Memberconstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name  = " + name + " , age  = " + age + " , grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
