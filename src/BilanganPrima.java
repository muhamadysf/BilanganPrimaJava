import java.util.*;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = input.nextInt();

        prima(total);
    }

    static void prima(int total){
        for (int i = 2; i <= total ; i++) {
            int temp = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp <= 2){
                System.out.print(i + " ");
            }
        }
    }
}


// prima adl bil. yang hanya bisa dibagi oleh bilangan itu sendiri dan angka 1