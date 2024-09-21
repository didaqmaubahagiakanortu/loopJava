import java.util.Scanner;

public class rataRataSiswa {
    public static void main(String[] args) throws InterruptedException {
        
        // cover

        System.out.println("Selamat datang di Kalkulator Rata-Rata!\n");

        // input
        
        Scanner in = new Scanner(System.in);
        System.out.println("Berapa jumlah siswa anda?");
        int amount = in.nextInt();
        System.out.println();

        // do while loop input

        int count = 1;
        int total = 0;
        do { 
            
            System.out.println("Masukkan nilai ke-" + count);
            total += in.nextInt();
            System.out.println();
            count++;

        } while (count <= amount);

        int average = total / amount;

        // delay

        System.out.println("Mohon menunggu rata-rata semua siswa dihitung.");
        Thread.sleep(5000);
        System.out.println();

        // output

        System.out.println("Rata-rata dari keseluruhan siswa anda yang berjumlah " + amount + " siswa adalah " + average + ".");
        System.out.println();

        // credits

        System.out.println("Sekian, terimakasih.");
        System.out.println("Code written by @kurniawandidaw");

    }
}