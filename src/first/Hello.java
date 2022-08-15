package first;

public class Hello {
    String cafe;
    int cafeStaffNum;
    int customerNum = 1;

    public Hello(String cafe, int cafeStaffNum, int customerNum){
        this.cafe = cafe;
        this.cafeStaffNum = cafeStaffNum;
        this.customerNum = customerNum;
    }

    public String getCafe() {
        return cafe;
    }

    public void setCafe(String cafe) {
        this.cafe = cafe;
    }

    public int getCafeStaffNum() {
        return cafeStaffNum;
    }

    public void setCafeStaffNum(int cafeStaffNum) {
        this.cafeStaffNum = cafeStaffNum;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public void currentSituation(int customerNum) {
        if (customerNum > 0) {
            System.out.println("손님이 계시니 일을 하도록하자");
        }else{
            System.out.println("오예, 꿀알바다");
        }
    }

    public void showCafeInfo(){
        System.out.println(cafe + "의 직원수는" + cafeStaffNum + "이며, 현재 손님 수는" + customerNum);
    }
}