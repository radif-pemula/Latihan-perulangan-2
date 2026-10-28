public class Latihan3 {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            int jumlah = 0;
            System.out.print("n = " + n + " -> jumlah kuadrat = ");
            for (int k = 1; k <= n; k++) {
                int kuadrat = k * k;
                jumlah += kuadrat;
                System.out.print(kuadrat);
                if (k < n) {
                    System.out.print(" + ");
                }
            }
            if (n > 1) {
                System.out.print(" = " + jumlah);
            }
            System.out.println();
        }
    }
}