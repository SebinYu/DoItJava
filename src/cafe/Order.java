package cafe;

public class Order {
    static int orderCount;
    int testnum;
    int orderNum = 100;
    public Order(){
        testnum++;
        orderCount++;
        orderNum += orderCount;
    }
    public void orderBaverage(Staff staff, String menuName){
        staff.workingStaff(menuName);
    }
}


