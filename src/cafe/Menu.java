package cafe;

public class Menu {
    Baverage cafeLatte;
    Baverage americano;

    public Menu(){
        cafeLatte = new Baverage();
        americano = new Baverage();
    }

    public void setCafeLatte(int price, String name){
        cafeLatte.setBaveragePrice(price);
        cafeLatte.setBaverageName(name);
    }

    public void setAmericano(int price, String name){
        americano.setBaveragePrice(price);
        americano.setBaverageName(name);
    }

    public void showMenuInfo(){
        System.out.println("현재 주문가능한 메뉴는 "+ cafeLatte.getBaverageName()+"와 "+ americano.getBaverageName());
    }

}
