package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 20;
        student2.grade = 100;

        Student[] students = new Student[] {student1,student2};//학생의 참조값을 배열에 담는다

        for (int i = 0;i < students.length;i++){
            System.out.println(" 이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }
        //향상된 for 문
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        System.out.println("이름:" + students[0].name + "나이 : " + students[0].age + "성적 : " + students[0].grade);
        System.out.println("이름:" + students[1].name + "나이 : " + students[1].age + "성적 : " + students[1].grade);
    }
}
