package cafe;

public class OrderTest {
    public static void main(String[] args) {
        Order firstOrder = new Order();
        Staff st1 = new Staff("빠니보틀");
        System.out.println("주문번호: " + firstOrder.orderNum);
        System.out.println("static 자료형 아닌 생성자 ++ : "+ firstOrder.testnum);
        firstOrder.orderBaverage(st1, "카페라떼");
        System.out.println(firstOrder.orderCount + "개 지금까지 주문받음");
        System.out.println("-----------------------------------");

        Order secondOrder = new Order();
        System.out.println("주문번호: " + secondOrder.orderNum);
        System.out.println("static 자료형 아닌 생성자 ++ : "+ secondOrder.testnum);
        firstOrder.orderBaverage(st1, "아메리카노");
        st1.setTip(500, st1.staffName);
        System.out.println(secondOrder.orderCount + "개 지금까지 주문받음");

    }
}
