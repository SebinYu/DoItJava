package cote;

public class HeaterArray {
    public static void main(String[] args) {
        int[][] office = {{1, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 1, 0}};
        int k = 2;
        int[][] kArray = new int[k][k];

        int count = 0;
        int topValue = 0;
        int temp = 0;

        System.out.println(office.length);
        //배열출력
        for (int i = 0; i <= (office.length - k); i++) {
            if( (k+i) < office.length){
                for (int j = i; j < (k + i); j++) {
                    for (int z = i; z < (k + i); z++) {
                        kArray[j][z] = office[j][z];
                        if (kArray[j][z] == 1) {
                            count++;
                        }
                    }
                }
            }

        }

        System.out.println(count);


    }
}


