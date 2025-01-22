package Pack;


import Pack.a.User;//가져다가 쓴다는 의미
                   //코드 첫 번째에 package 쓰고 두번째 줄 부터 import 사용
import Pack.a.*;//패키지 안에 있는 클래스를 모두 불러서 가능

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();//클래스 명만 써도 가능
    }
}