import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahProduk;
        do {
            System.out.print("Jumlah produk (minimal 1): ");
            jumlahProduk = sc.nextInt();
            if (jumlahProduk < 1) {
                System.out.println("  Input tidak valid, ulangi!");
            }
        } while (jumlahProduk < 1);
        int jumlahHari;
        do {
            System.out.print("Jumlah hari (minimal 1): ");
            jumlahHari = sc.nextInt();
            if (jumlahHari < 1) {
                System.out.println("  Input tidak valid, ulangi!");
            }
        } while (jumlahHari < 1);
        int totalSemua = 0;
        int p = 1;
        while (p <= jumlahProduk) {
            System.out.println("\nProduk " + p);
            int totalProduk = 0;
            for (int h = 1; h <= jumlahHari; h++) {
                int jumlah;
                do {
                    System.out.print("  Hari " + h + ": ");
                    jumlah = sc.nextInt();
                    if (jumlah < 0) {
                        System.out.println("  Jumlah terjual tidak boleh negatif, ulangi!");
                    }
                } while (jumlah < 0);
                totalProduk += jumlah;
            }
            double rataRata = (double) totalProduk / jumlahHari;
            System.out.println("Total produk " + p + " = " + totalProduk);
            System.out.printf("Rata-rata harian produk %d = %.2f%n", p, rataRata);
            totalSemua += totalProduk;
            p++;
        }
        System.out.println("\nTotal semua produk = " + totalSemua);
    }
}