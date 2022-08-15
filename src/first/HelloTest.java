package first;

public class HelloTest {
    public static void main(String[] args) {
        Hello start = new Hello("스타벅스",3,0);
        start.showCafeInfo();
        int currentCustomerNum = start.customerNum;
        start.currentSituation(currentCustomerNum);

        start.setCustomerNum(30);
        start.showCafeInfo();
        start.currentSituation(start.customerNum);


    }
}
