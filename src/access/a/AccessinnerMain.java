package access.a;

public class AccessinnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicfield = 1;
        data.publicmethod();

        //같은 패키지 default 호출 가능
        data.defaultfield = 2;
        data.deflaultmethod();

        //private 호출 불가능
        //data.privatefield = 3;
        //data.privatemethod();

        //public 이면 이라서 외부에서 호출 가능함
        data.inneraccess();
    }
}
