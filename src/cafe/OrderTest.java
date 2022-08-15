package cafe;

public class OrderTest {
    public static void main(String[] args) {
        Order firstOrder = new Order();
        Staff st1 = new Staff("빠니보틀");
        System.out.println("주문번호: " + firstOrder.orderNum);
        firstOrder.orderBaverage(st1, "카페라떼");
        System.out.println(firstOrder.orderCount + "개 지금까지 주문받음");

        Order secondOrder = new Order();
        System.out.println("주문번호: " + secondOrder.orderNum);
        firstOrder.orderBaverage(st1, "아메리카노");
        System.out.println(secondOrder.orderCount + "개 지금까지 주문받음");

    }
}
