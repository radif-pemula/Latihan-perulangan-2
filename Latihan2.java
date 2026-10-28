public class Latihan2 {
    public static void main(String[] args) {
        char huruf = 'a';
        for (int baris = 0; baris < 5; baris++) {
            int jumlahHuruf = 2 * baris + 1;
            for (int j = 0; j < jumlahHuruf; j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}