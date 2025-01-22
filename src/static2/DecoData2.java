package static2;

public class DecoData2 {
    private int instancevalue;
    private static int staticvalue;

    public static void staticcall(){
        //intstancevalue++;  //인스턴스 변수 접근, compile error
        //instancemethod();  //인스턴스 메서드 접근, compile error

        staticvalue++;       //정적 변수 접근
        staticcall();        //정적 메소드 접근
    }

    public void instancecall(){
        instancevalue++;
        instancecall();

        staticvalue++;
        staticcall();
    }

    private void instancemethod(){
        System.out.println("instancemethod");
    }
}
