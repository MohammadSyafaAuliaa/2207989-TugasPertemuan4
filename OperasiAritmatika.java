//Buatlah algoritma dalam bahasa Java, berupa menu yang dapat memasukan pilihan jika
//menginputkan karakter operator aritmatika ‘+’ akan melakukan penjumlahan, jika ‘-‘
//pengurangan sampai karakter ‘*’, ‘/’ dan ‘%’ dua bilangan integer.

import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        // Memasukkan bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        // Memasukkan operator aritmatika
        System.out.print("Masukkan operator aritmatika (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        int hasil;
        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                // Memastikan pembagian tidak oleh nol
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                    return;
                }
                break;
            case '%':
                if (bilangan2 != 0) {
                    hasil = bilangan1 % bilangan2;
                } else {
                    System.out.println("Modulus tidak boleh nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operator aritmatika tidak valid.");
                return;
        }

        // Menampilkan hasil operasi aritmatika
        System.out.println("Hasil " + operator + " dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + hasil);
    }
}
