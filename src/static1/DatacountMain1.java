package static1;

public class DatacountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count);
        //count가 차례대로 1 2 3 으로 출력이 되지 않는다
        //객체를 생성할 때 마다 data1 인스턴스는 새로 만들어진다. 그리고 인스턴스에 포함된 count 변수도 새로 만들어지기 때문이다
    }
}
