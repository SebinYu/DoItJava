package cafe;

public class Staff {
    String staffName;
    Baverage caffeLatte;

    private int tip;

    public Staff(String staffName){
        this.staffName = staffName;

        caffeLatte = new Baverage();
    }

    public int getTip(int tip) {
        return tip;
    }

    public void setTip(int tip, String staffName) {
        this.tip = tip;
        System.out.println("팁: " + tip + "원 지불");
        if(tip < 1000){
            System.out.println(staffName + "이 화가 나서 슬리퍼를 던졌습니다.. 팁을 더 주세요");
        }
    }

    public void workingStaff(String menuName){
        System.out.println(staffName + " 직원이 "+ menuName + "을 만들고 있습니다!");
    }
}
