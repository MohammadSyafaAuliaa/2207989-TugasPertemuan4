import java.util.Scanner;

public class HitungLamaWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jam mulai
        System.out.print("Jam Mulai (Jam, Menit): ");
        int jamMulai = scanner.nextInt();
        int menitMulai = scanner.nextInt();

        // Memasukkan jam selesai
        System.out.print("Jam Keluar (Jam, Menit): ");
        int jamSelesai = scanner.nextInt();
        int menitSelesai = scanner.nextInt();
        
        // Konversi ke 24 jam jika jamSelesai kurang dari 10
        if (jamSelesai < 10) {
            jamSelesai += 12;
        }

        // Menghitung selisih waktu dalam menit
        int selisihMenit = (jamSelesai * 60 + menitSelesai) - (jamMulai * 60 + menitMulai);

        // Menghitung lama dalam jam dan menit
        int lamaJam = selisihMenit / 60;
        int lamaMenit = selisihMenit % 60;

        // Menampilkan hasil
        System.out.println("Lama (menit): " + selisihMenit);
        System.out.println("Lama (Jam, Menit): " + lamaJam + " jam " + lamaMenit + " menit");
    }
}
