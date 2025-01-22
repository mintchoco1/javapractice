package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1 = new Student();//학생을 실제 메모리에 만든다
        //Student 타입을 받을 수 있는 변수 선언
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 100;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 25;
        student3.grade = 200;

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
        System.out.println(student3.name + " " + student3.age + " " + student3.grade);
    }
}
