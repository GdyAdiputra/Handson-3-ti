public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Unary Operators
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
         * unary operators, terutama perbedaan antara pre dan post increment/decrement.
         */

        // ===== OPERATOR INCREMENT DAN DECREMENT =====
        System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

        // Latihan 1: Increment dan decrement dasar
        // - Buat variabel 'counter' dengan nilai 5
        int counter = 5;
        System.out.println("Nilai awal counter = " + counter);

        // - Gunakan pre-increment (++counter) dan print hasilnya
        System.out.println("Pre-increment (++counter) = " + (++counter));

        // - Gunakan post-increment (counter++) dan print hasilnya
        System.out.println("Post-increment (counter++) = " + (counter++));
        System.out.println("Nilai counter setelah post-increment = " + counter);

        // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
        counter = 5;
        System.out.println("\nReset counter ke " + counter);
        System.out.println("Pre-decrement (--counter) = " + (--counter));

        // - Gunakan post-decrement (counter--) dan print hasilnya
        System.out.println("Post-decrement (counter--) = " + (counter--));
        System.out.println("Nilai counter setelah post-decrement = " + counter);

        // ===== PERILAKU PRE vs POST INCREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST INCREMENT ===");

        // Latihan 2: Pahami perbedaan antara pre dan post increment
        // - Buat dua variabel: a = 10, b = 10
        int a = 10;
        int b = 10;

        // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
        // - Print kedua 'a' dan 'result1' - amati nilainya
        int result1 = ++a;
        System.out.println("Hasil pre-increment:");
        System.out.println("a = " + a);
        System.out.println("result1 = " + result1);

        // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
        // - Print kedua 'b' dan 'result2' - amati nilainya
        int result2 = b++;
        System.out.println("\nHasil post-increment:");
        System.out.println("b = " + b);         // nilai b baru bertambah setelah dieksekusi
        System.out.println("result2 = " + result2);

        // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya
        //pre-increment variabel a langsung ditambah 1 baru resultnya,
        // sedangkan post-increment dipakai dulu, result baru ditambah 1

        // ===== PERILAKU PRE vs POST DECREMENT =====
        System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

        // Latihan 3: Pahami perbedaan antara pre dan post decrement
        // - Buat dua variabel: x = 8, y = 8
        int x = 8;
        int y = 8;

        // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi
        System.out.println("Hasil pre-decrement:");
        System.out.println("--x = " + (--x));
        System.out.println("x setelah pre-decrement = " + x);

        // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi
        System.out.println("\nHasil post-decrement:");
        System.out.println("y-- = " + (y--));
        System.out.println("y setelah post-decrement = " + y);

        // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus
        // pada pre-decrement variabel x lngsg berkurang 1,
        // pada post-decrement variabel y dipakai dulu

        // ===== UNARY PLUS DAN MINUS =====
        System.out.println("\\n=== UNARY PLUS DAN MINUS ===");

        // Latihan 4: Berlatih operator unary plus dan minus
        // - Buat variabel integer positif 'positive' dengan nilai 42
        int positive = 42;

        // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive
        int negative = -positive;

        // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)
        int backToPositive = -negative;

        // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)
        int plusSign = +positive;

        // - Print ketiga variabel tersebut
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("backToPositive = " + backToPositive);
        System.out.println("plusSign = " + plusSign);

        // ===== OPERATOR BOOLEAN NOT =====
        System.out.println("\n=== OPERATOR BOOLEAN NOT ===");

        // Variabel boolean isReady
        boolean isReady = true;

        // Menggunakan operator NOT (!) pada isReady
        boolean isNotReady = !isReady;

        // Cetak hasil
        System.out.println("isReady = " + isReady);
        System.out.println("isNotReady = " + isNotReady);

        // Ekspresi boolean: cek apakah angka tidak sama dengan nol
        int angka = 5;
        boolean tidakNol = (angka != 0);
        System.out.println("Apakah angka (" + angka + ") tidak nol? " + tidakNol);

        // Rangkaian operator NOT
        boolean doubleNot = !!isReady; // dua kali NOT → kembali ke nilai semula
        System.out.println("!!isReady = " + doubleNot);


        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 6: Simulasi percobaan login (increment)
        int attempts = 0;
        System.out.println("\nSimulasi percobaan login gagal:");
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);
        attempts++;
        System.out.println("Attempt: " + attempts);

        // Simulasi kehilangan nyawa (decrement)
        int lives = 3;
        System.out.println("\nSimulasi kehilangan nyawa dalam game:");
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);
        lives--;
        System.out.println("Lives remaining: " + lives);

        // Latihan 7: Loop counters dengan increment
        System.out.println("\nLoop menggunakan post-increment:");
        int i = 1;
        while (i <= 5) {
            System.out.println("Loop counter: " + i);
            i++; // post-increment
        }

        // Loop countdown dengan post-decrement
        System.out.println("\nLoop countdown menggunakan post-decrement:");
        int countdown = 3;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--; // post-decrement
        }
        // ===== SKENARIO MENANTANG =====
        System.out.println("\n=== SKENARIO MENANTANG ===");

        // Latihan 8: Increment/Decrement kompleks
        int value = 5;

        // Ekspresi: value++ + ++value
        int Result1 = value++ + ++value;
        System.out.println("Ekspresi: value++ + ++value");
        System.out.println("Hasil = " + Result1);
        System.out.println("Nilai akhir value = " + value);

        // Prediksi:
        // value awal = 5
        // value++ (post) -> gunakan 5, lalu value jadi 6
        // ++value (pre) -> value jadi 7, gunakan 7
        // Jadi hasil = 5 + 7 = 12, value akhir = 7

        // Reset value ke 5
        value = 5;

        // Ekspresi: --value + value--
        int Result2 = --value + value--;
        System.out.println("\nEkspresi: --value + value--");
        System.out.println("Hasil = " + Result2);
        System.out.println("Nilai akhir value = " + value);

        // Prediksi:
        // value awal = 5
        // --value (pre) -> value jadi 4, gunakan 4
        // value-- (post) -> gunakan 4, lalu value jadi 3
        // Jadi hasil = 4 + 4 = 8, value akhir = 3

        // Latihan 9: Increment/Decrement dengan pemanggilan method
        int score = 10;

        // Ekspresi: Math.max(++score, 12)
        int max1 = Math.max(++score, 12);
        System.out.println("\nMath.max(++score, 12) = " + max1);
        System.out.println("Nilai score sekarang = " + score);

        // Prediksi:
        // ++score -> score jadi 11
        // Math.max(11, 12) = 12
        // score akhir = 11

        // Reset score ke 10
        score = 10;

        // Ekspresi: Math.max(score++, 12)
        int max2 = Math.max(score++, 12);
        System.out.println("\nMath.max(score++, 12) = " + max2);
        System.out.println("Nilai score sekarang = " + score);

        // Prediksi:
        // score++ -> gunakan 10 dulu, lalu score jadi 11
        // Math.max(10, 12) = 12
        // score akhir = 11

        /*
         * Perbedaan penting:
         * - Pre-increment (++var) menaikkan nilai variabel sebelum dipakai,
         *   sehingga nilai yang masuk ke method sudah bertambah.
         *
         * - Post-increment (var++) menggunakan nilai lama dulu,
         *   baru menaikkan setelahnya, sehingga nilai yang dipakai method
         *   masih nilai lama.
         */
    }
}
