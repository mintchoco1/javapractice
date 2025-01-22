package construct;

public class Memberthis {
    String namefield;

    void initmember(String nameparameter){
        namefield = nameparameter;//매개변수가 지역변수에 없기 때문에 this 생략 가능
    }
}
