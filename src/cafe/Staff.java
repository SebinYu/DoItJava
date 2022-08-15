package cafe;

public class Staff {
    String staffName;
    Baverage caffeLatte;

    public Staff(String staffName){
        this.staffName = staffName;

        caffeLatte = new Baverage();
    }

    public void workingStaff(String menuName){
        System.out.println(staffName + " 직원이 "+ menuName + "을 만들고 있습니다!");
    }
}
