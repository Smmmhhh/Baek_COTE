import java.util.Scanner;

public class baek_16953_AB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        int count = 1;

        while (true) {
            if (B % 10 == 1) B /=  10;
            else if(B % 2 == 0) B /= 2;
            else if(B % 2 == 1){
                count = -1;
                break;
            }

            count++;

            if(A == B) break;
            else if(A > B) {
                count = -1;
                break;
            }
        }
        System.out.println(count);

    }
}