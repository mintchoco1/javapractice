package access.a;

public class AccessData {
    public int publicfield;
    int defaultfield;
    private int privatefield;

    public void publicmethod() {
        System.out.println("publicmethod 호출 " + publicfield);
    }
    void deflaultmethod() {
        System.out.println("defalutmethod 호출 " + defaultfield);
    }
    private void privatemethod() {
        System.out.println("privatemethod 호출 " + privatefield);
    }
    public void inneraccess(){
        System.out.println("내부 호출");
        publicfield = 100;
        defaultfield = 200;
        privatefield = 300;
        publicmethod();
        privatemethod();
        deflaultmethod();
    }

}
