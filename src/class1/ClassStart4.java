package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
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

        Student[] students = new Student[2];//학생의 참조값을 배열에 담는다
        students[0] = student1;
        students[1] = student2;//배열에 객체를 보관한다
        //자바에서 대입은 항상 변수에 들어 잇는 값을 복사해서 전달한다

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
        System.out.println(student3.name + " " + student3.age + " " + student3.grade);
    }
}
