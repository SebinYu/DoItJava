package drama;

public class WooYungWoo {
    private String role;
    private String realName;


    public WooYungWoo(){
    }
    public WooYungWoo(String role, String realName){
        this.role = role;
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void showInfo(){
        System.out.println("배역: " + role + "/ 실명: " + realName);
    }
}
