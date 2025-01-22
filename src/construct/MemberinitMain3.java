package construct;

public class MemberinitMain3 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        member1.initmember("user1", 15, 90);

        Memberinit member2 = new Memberinit();
        member2.initmember("user2", 20, 90);

        Memberinit members[]= {member1, member2};

        for (Memberinit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적: " + s.grade);
        }
    }
}
