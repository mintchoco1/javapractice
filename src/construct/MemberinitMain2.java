package construct;

public class MemberinitMain2 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        initmember(member1, "user1", 15, 90);

        Memberinit member2 = new Memberinit();
        initmember(member2, "user2", 20, 90);

        Memberinit members[]= {member1, member2};

        for (Memberinit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적: " + s.grade);
        }
    }

    static void initmember(Memberinit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
