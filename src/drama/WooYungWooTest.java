package drama;

public class WooYungWooTest {
    public static void main(String[] args) {
        WooYungWoo[] casting1 = new WooYungWoo[2];
        int size = 0;

        casting1[0] = new WooYungWoo("우영우", "박은빈"); size++;
        casting1[1] = new WooYungWoo("이준호", "강태오"); size++;

        System.out.println("casting1");
        for(int i = 0; i < size; i++){
            casting1[i].showInfo();
        }
        System.out.println("-----------------");

        WooYungWoo[] casting2 = new WooYungWoo[2];


        casting2[0] = new WooYungWoo();
        casting2[1] = new WooYungWoo();

        for(int i = 0; i < size; i++){
            casting2[i].setRole(casting1[i].getRole());
            casting2[i].setRealName(casting1[i].getRealName());
        }

        casting1[0].setRealName("개나리");

        System.out.println("casting1 수정이후");
        for(int i = 0; i < size; i++){
            casting1[i].showInfo();
        }

        System.out.println("-----------------");

        System.out.println("casting2");
        for(int i = 0; i < size; i++){
            casting2[i].showInfo();
        }

        System.out.println("-----------------");
        System.out.println("향상된 for문");
        for(WooYungWoo a: casting1){
            a.showInfo();
        }


    }
}
