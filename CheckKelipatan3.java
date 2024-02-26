import java.util.Scanner;

public class CheckKelipatan3 {
    public static void main(String[] args) {
        // Masukan bilangan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan ril: ");
        double bilangan = scanner.nextDouble();
        scanner.close();

        // Memisahkan bagian depan dan belakang koma
        int depanKoma = (int) bilangan;
        int belakangKoma = (int) ((bilangan - depanKoma) * 100);

        // Memeriksa apakah angka di depan koma dan di belakang koma adalah kelipatan 3
        if (depanKoma % 3 == 0 && belakangKoma % 3 == 0) {
            System.out.println("Angka di depan dan di belakang koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka di depan dan di belakang koma bukan kelipatan 3.");
        }
    }
}