public class AugmentedAssignmentsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Augmented Assignments
         *
         * Instruksi: Lengkapi semua tugas latihan di bawah ini untuk berlatih
         * operator augmented assignment dan memahami efisiensinya.
         */

        // ===== AUGMENTED ASSIGNMENTS DASAR =====
        System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

        // Latihan 1
        int score = 100;
        score += 25;
        System.out.println("Setelah += 25: " + score);
        score -= 15;
        System.out.println("Setelah -= 15: " + score);
        score *= 2;
        System.out.println("Setelah *= 2: " + score);
        score /= 4;
        System.out.println("Setelah /= 4: " + score);
        score %= 10;
        System.out.println("Setelah %= 10: " + score);

        // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
        System.out.println("\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

        // Latihan 2
        int value1 = 50;
        int value2 = 50;

        value1 = value1 + 30;
        value2 += 30;
        System.out.println("Regular assignment value1 = " + value1);
        System.out.println("Augmented assignment value2 = " + value2);

        value1 = 80;
        value2 = 80;
        value1 = value1 * 3;
        value2 *= 3;
        System.out.println("Regular assignment value1 = " + value1);
        System.out.println("Augmented assignment value2 = " + value2);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 3
        double bankBalance = 1000;
        bankBalance += 250; // deposit
        bankBalance -= 75;  // withdraw
        bankBalance *= 1.05; // interest 5%
        System.out.println("Saldo akhir bankBalance = " + bankBalance);

        // Latihan 4
        int totalSales = 0;
        totalSales += 150;
        totalSales += 200;
        totalSales += 175;

        double productionCount = 1000;
        productionCount -= 25; // defect
        productionCount *= 1.1; // bonus
        System.out.println("Total Sales = " + totalSales);
        System.out.println("Production Count = " + productionCount);

        // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
        System.out.println("\n=== TIPE DATA BERBEDA ===");

        // Latihan 5
        double temperature = 20.5;
        temperature += 5.7;
        temperature *= 1.8;
        temperature += 32;
        System.out.println("Temperature dalam Fahrenheit = " + temperature);

        // Latihan 6
        String message = "Hello";
        message += " World";
        message += "!";
        System.out.println("Pesan akhir = " + message);

        // Latihan 7
        double investment = 5000;
        investment *= 1.07;
        investment *= 1.07;
        investment *= 1.07;
        System.out.println("Nilai investasi akhir = " + investment);
        double profit = investment - 5000;
        System.out.println("Profit = " + profit);
    }
}
