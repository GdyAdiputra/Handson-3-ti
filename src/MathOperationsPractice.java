public class MathOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Matematika
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
         * operator aritmatika dan memahami berbagai operasi numerik.
         */

        // ===== OPERATOR ARITMATIKA DASAR =====
        System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

        // Latihan 1: Berlatih operasi aritmatika dasar
        // - Deklarasikan dua integer: num1 = 25, num2 = 4
        int num1 = 25;
        int num2 = 4;

        // - Hitung dan simpan hasil penjumlahan num1 dan num2
        int penjumlahan = num1 + num2;

        // - Hitung dan simpan hasil pengurangan num1 dan num2
        int pengurangan = num1 + num2;

        // - Hitung dan simpan hasil perkalian num1 dan num2
        int perkalian = num1 * num2;

        // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
        int pembagian = num1 / num2;

        // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
        int modulus = num1 % num2;

        // - Print semua hasil dengan label yang deskriptif
        System.out.println("Hasil penjumlahan : " + penjumlahan);
        System.out.println("Hasil pengurangan : " + pengurangan);
        System.out.println("Hasil pengurangan : " + perkalian);
        System.out.println("Hasil pengurangan : " + pembagian);
        System.out.println("Hasil Modulus : " + modulus);

        // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
        System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

        // Latihan 2: Jelajahi berbagai jenis pembagian
        // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
        int nom1 = 17;
        int nom2 = 5;
        int pmbgn = nom1 / nom2;

        // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
        double nmr1 = 17.0;
        int nmr2 = 5;
        double bagi = nmr1 / nmr2;

        // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
        int nor1 = 17;
        int nor2 = 5;
        double hasil = (double) nor1 / nor2;

        // - Print ketiga hasil pembagian dan amati perbedaannya
        System.out.println("pembagian integer : " + pmbgn);
        System.out.println("pembagian floating-point : " + bagi);
        System.out.println("Konversi int ke double : " + hasil);

        // ===== KALKULASI PRAKTIS =====
        System.out.println("\\n=== KALKULASI PRAKTIS ===");

        // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
        double panjang = 12.5;
        double lebar = 8.3;

        // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
        double persegiPanjang = panjang * lebar;

        // - Hitung keliling persegi panjang yang sama
        double keliling = 2 * (panjang + lebar);

        // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
        double barang1 = 15.99;
        double barang2 = 15.99;
        double barang3 = 15.99;
        double totalBarang = barang1 + barang2 + barang3;
        double totalPajak = 0.08 * totalBarang;
        double hasilHarga = totalPajak + totalBarang;

        // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
        // Gunakan Celsius = 25
        int celcius = 25;
        double farenheit = (celcius * 9/5) + 32;
        double hasilFarenheit = farenheit;

        // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
        int minggu = 7;
        int total = 50 / minggu;
        int sisa = total / minggu;

        // - Print semua kalkulasi dengan label dan format yang sesuai
        System.out.println("LUAS DAN KELILING PERSEGI PANJANG : ");
        System.out.println("Luas Persegi Panjang + " + persegiPanjang);
        System.out.println("Keliling Persegi Panjang + " + keliling);
        System.out.println("PAJAK HARGA BARANG : ");
        System.out.println(hasilHarga + "$");
        System.out.println("CELSIUS KE FARENHEIT : ");
        System.out.println("Celcius : " + celcius);
        System.out.println("Farenheit : " + hasilFarenheit);
        System.out.println("MINGGU DALAM 50 HARI DAN SISA HARINYA : ");
        System.out.println("minggu total dalam 50 hari : " + total);
        System.out.println("Hari sisa : " + sisa);

        // ===== KALKULASI KOMPLEKS =====
        System.out.println("\\n=== KALKULASI KOMPLEKS ===");

        // Latihan 4: Berlatih ekspresi matematika yang kompleks
        // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
        // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
        double kecepatan = 65.5;
        double waktu = 2.75;
        double jarak = kecepatan * waktu;
        System.out.println("Jarak yang di tempuh : " + jarak + " KM ");

        // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
        // Gunakan Math.pow() untuk perpangkatan
        // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
        int pokok = 1000;
        double sukuBunga = 0.05;
        int Waktu = 3;
        Math.pow(pokok * (1 + sukuBunga) ^ waktu);



        // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88

        // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
    }
}
