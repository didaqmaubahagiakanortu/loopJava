
import java.util.Scanner;


public class kelipatanEnam {
    public static void main(String[] args) throws InterruptedException{
        
        // cover

        System.out.println("Selamat datang di Kelipatan 6!\n");

        // input

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka yang anda akan gunakan sebagai titik awal kelipatan.");
        int start = in.nextInt();
        System.out.println();

        // delay

        System.out.println("Mohon menunggu hingga kelipatan di siapkan.\n");
        Thread.sleep(5000);

        // while loop

        int temp = start % 6;

        if (temp != 0) {
            start = start + (6 - temp);
        }

        while (start <= 72) {

            if (start < 72) {
                System.out.print(start + ", ");
            } else {
                System.out.println(start + ".");
            }

            start += 6;

            Thread.sleep(500);

        }

        // credits

        System.out.println();
        System.out.println("Sekian terimakasih.");
        System.out.println("Code written by @kurniawandidaw");
    }
}