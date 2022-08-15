package cafe;

public class Order {
    static int orderCount;
    int orderNum = 100;
    public Order(){
        orderCount++;
        orderNum += orderCount;
    }
    public void orderBaverage(Staff staff, String menuName){
        staff.workingStaff(menuName);
    }
}


