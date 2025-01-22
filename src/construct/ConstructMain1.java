package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        Memberconstruct member1 = new Memberconstruct();//인자 없는 생성자 호출
        Memberconstruct member2 = new Memberconstruct("user1", 15, 50);
        //
        Memberconstruct members[] = {member1,member2};

        for (Memberconstruct s : members) {
            System.out.println("이름: " + s.name + "나이: " + s.age + " 성적: " + s.grade);
        }
    }   
}
