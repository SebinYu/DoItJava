package cafe;

public class MenuTest {
    public static void main(String[] args) {
        Menu cafe1 = new Menu();
        cafe1.setCafeLatte(5000,"카페라떼");
        cafe1.setAmericano(2000,"아이스 아메리카노");
        cafe1.showMenuInfo();
    }
}
