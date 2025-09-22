public class OperatorPrecedencePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operator Precedence
         */

        // ===== PRECEDENCE OPERATOR ARITMATIKA =====
        System.out.println("=== PRECEDENCE OPERATOR ARITMATIKA ===");

        // Latihan 1
        int a = 10, b = 5, c = 2;

        // a + b * c
        System.out.println("-- Ekspresi: a + b * c");
        System.out.println("Prediksi: b * c = 5*2 = 10 -> a + 10 = 20");
        int res1 = a + b * c;
        System.out.println("Hasil aktual = " + res1); // 20

        // (a + b) * c
        System.out.println("\n-- Ekspresi: (a + b) * c");
        System.out.println("Prediksi: (10+5)=15 -> 15*2 = 30");
        int res2 = (a + b) * c;
        System.out.println("Hasil aktual = " + res2); // 30

        // a * b + c / 2
        System.out.println("\n-- Ekspresi: a * b + c / 2");
        System.out.println("Urutan: a*b (10*5=50), c/2 (integer: 2/2=1) -> 50 + 1 = 51");
        int res3 = a * b + c / 2;
        System.out.println("Hasil aktual = " + res3); // 51

        // a / b + c * 2
        System.out.println("\n-- Ekspresi: a / b + c * 2");
        System.out.println("Evaluasi: a/b (10/5=2), c*2 (2*2=4) -> 2 + 4 = 6");
        int res4 = a / b + c * 2;
        System.out.println("Hasil aktual = " + res4); // 6

        // ===== PRECEDENCE PERBANDINGAN DAN ARITMATIKA =====
        System.out.println("\n=== PRECEDENCE PERBANDINGAN DAN ARITMATIKA ===");

        // Latihan 2
        int x = 15, y = 10, z = 20;

        // x + y > z - 5
        System.out.println("\n-- Ekspresi: x + y > z - 5");
        System.out.println("Langkah: x+y=25, z-5=15 -> 25 > 15 -> true");
        boolean r1 = x + y > z - 5;
        System.out.println("Hasil = " + r1);

        // x > y + z / 4
        System.out.println("\n-- Ekspresi: x > y + z / 4");
        System.out.println("z/4 = 20/4 = 5 -> y + 5 = 15 -> x > 15 ? (15 > 15) -> false");
        boolean r2 = x > y + z / 4;
        System.out.println("Hasil = " + r2);

        // (x + y) > (z - 5) && x < z
        System.out.println("\n-- Ekspresi: (x + y) > (z - 5) && x < z");
        System.out.println("Left = (25 > 15) true, Right = (15 < 20) true -> true && true = true");
        boolean r3 = (x + y) > (z - 5) && x < z;
        System.out.println("Hasil = " + r3);

        // x * 2 + y > z && y < x + 5
        System.out.println("\n-- Ekspresi: x * 2 + y > z && y < x + 5");
        System.out.println("x*2=30 + y=40 -> 40>20 true; y < x+5 -> 10 < 20 true -> true && true = true");
        boolean r4 = x * 2 + y > z && y < x + 5;
        System.out.println("Hasil = " + r4);

        // ===== PRECEDENCE OPERATOR LOGIKA =====
        System.out.println("\n=== PRECEDENCE OPERATOR LOGIKA ===");

        // Latihan 3
        boolean p = true, q = false, r = true;

        // p && q || r
        System.out.println("\n-- Ekspresi: p && q || r");
        System.out.println("Precedence: && dievaluasi sebelum ||");
        System.out.println("p && q = true && false = false -> false || r (true) = true");
        boolean lr1 = p && q || r;
        System.out.println("Hasil = " + lr1);

        // p || q && r
        System.out.println("\n-- Ekspresi: p || q && r");
        System.out.println("q && r = false && true = false -> p || false = true");
        boolean lr2 = p || q && r;
        System.out.println("Hasil = " + lr2);

        // !p && q || r
        System.out.println("\n-- Ekspresi: !p && q || r");
        System.out.println("!p = false -> false && q = false -> false || r = true");
        boolean lr3 = !p && q || r;
        System.out.println("Hasil = " + lr3);

        // p && (q || r)
        System.out.println("\n-- Ekspresi: p && (q || r)");
        System.out.println("q || r = false || true = true -> p && true = true");
        boolean lr4 = p && (q || r);
        System.out.println("Hasil = " + lr4);

        // Bandingkan p && q || r dengan p && (q || r)
        System.out.println("Perbandingan: (p && q) || r = " + lr1 + "  vs  p && (q || r) = " + lr4);

        // ===== TIPE OPERATOR CAMPURAN =====
        System.out.println("\n=== TIPE OPERATOR CAMPURAN ===");

        // Latihan 4
        int num1 = 25, num2 = 15, num3 = 30;

        System.out.println("\n-- Ekspresi: num1 > num2 + 5 && num3 / 2 < num1");
        System.out.println("num2+5=20 -> 25>20 true; num3/2=15 -> 15<25 true -> true && true = true");
        boolean mr1 = num1 > num2 + 5 && num3 / 2 < num1;
        System.out.println("Hasil = " + mr1);

        System.out.println("\n-- Ekspresi: num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10");
        System.out.println("Precedence: && sebelum ||");
        System.out.println("Left: num1+num2 = 40 > 30 = true");
        System.out.println("Right: (num3-num1=5 <10)=true && (num2>10)=true -> true && true = true");
        System.out.println("Akhir: true || true = true");
        boolean mr2 = num1 + num2 > 30 || num3 - num1 < 10 && num2 > 10;
        System.out.println("Hasil = " + mr2);

        System.out.println("\n-- Ekspresi dengan tanda kurung: (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10");
        System.out.println("Inner (left || right) = true || true = true -> true && (num2>10 true) = true");
        boolean mr3 = (num1 + num2 > 30 || num3 - num1 < 10) && num2 > 10;
        System.out.println("Hasil = " + mr3);

        // ===== UNARY OPERATORS DAN PRECEDENCE =====
        System.out.println("\n=== UNARY OPERATORS DAN PRECEDENCE ===");

        // Latihan 5
        int value = 8;

        System.out.println("\n-- Ekspresi: ++value * 2");
        System.out.println("++value increments first -> value becomes 9 -> 9*2 = 18");
        int u1 = ++value * 2; // value was 8 -> ++value -> 9 *2 =18
        System.out.println("Hasil = " + u1 + " , value sekarang = " + value);

        // Reset
        value = 8;
        System.out.println("\n-- Ekspresi: value++ * 2");
        System.out.println("value++ uses 8 for multiplication -> 8*2 = 16, then value becomes 9");
        int u2 = value++ * 2;
        System.out.println("Hasil = " + u2 + " , value sekarang = " + value);

        // Reset
        value = 8;
        System.out.println("\n-- Ekspresi: 2 * ++value");
        System.out.println("++value -> 9, 2*9 = 18");
        int u3 = 2 * ++value;
        System.out.println("Hasil = " + u3 + " , value sekarang = " + value);

        // Reset
        value = 8;
        System.out.println("\n-- Ekspresi: -value + 10");
        System.out.println("Unary minus applied first -> -8 + 10 = 2");
        int u4 = -value + 10;
        System.out.println("Hasil = " + u4);

        // ===== PRECEDENCE OPERATOR ASSIGNMENT =====
        System.out.println("\n=== PRECEDENCE OPERATOR ASSIGNMENT ===");

        // Latihan 6
        a = 5; b = 10;
        System.out.println("\n-- Ekspresi: a += b * 2");
        System.out.println("b*2 = 20 -> a += 20 -> a = 25");
        a += b * 2;
        System.out.println("Hasil a = " + a);

        // Reset a
        a = 5;
        System.out.println("\n-- Ekspresi: a *= b + 3");
        System.out.println("b+3 = 13 -> a *= 13 -> a = 65");
        a *= b + 3;
        System.out.println("Hasil a = " + a);

        // Ternary
        System.out.println("\n-- Ekspresi: a = b > 5 ? b * 2 : b / 2");
        // menggunakan b saat ini (10)
        a = (b > 5) ? b * 2 : b / 2;
        System.out.println("Karena b = " + b + " > 5, maka a = b*2 = " + a);

        // ===== TANDA KURUNG DAN OVERRIDE PRECEDENCE =====
        System.out.println("\n=== TANDA KURUNG DAN OVERRIDE PRECEDENCE ===");

        // Latihan 7
        a = 8; b = 4; c = 2; int d = 6;

        System.out.println("\n-- Ekspresi: a + b * c - d");
        System.out.println("Langkah: b*c = 4*2=8 -> a+8=16 -> 16 - d(6) = 10");
        int t1 = a + b * c - d;
        System.out.println("Hasil = " + t1);

        System.out.println("\n-- Ekspresi: (a + b) * (c - d)");
        System.out.println("(a+b)=12, (c-d)= -4 -> 12 * -4 = -48");
        int t2 = (a + b) * (c - d);
        System.out.println("Hasil = " + t2);

        System.out.println("\n-- Ekspresi boolean: a > b && c < d || a == b");
        System.out.println("a>b true, c<d true, a==b false -> (true && true) || false -> true");
        boolean t3 = a > b && c < d || a == b;
        System.out.println("Hasil = " + t3);

        System.out.println("\n-- Ekspresi boolean dengan kurung: a > b && (c < d || a == b)");
        System.out.println("Inner: c<d || a==b -> true || false = true -> a>b && true = true");
        boolean t4 = a > b && (c < d || a == b);
        System.out.println("Hasil = " + t4);

        System.out.println("\n-- Ekspresi nested kompleks: ((a + b) * c) / (d - 2) > (a - b)");
        System.out.println("((8+4)=12 *2=24) / (6-2=4) => 24/4=6  compare to (8-4=4) -> 6 > 4 = true");
        boolean t5 = ((a + b) * c) / (d - 2) > (a - b);
        System.out.println("Hasil = " + t5);

        // ===== RINGKASAN =====
        System.out.println("\n=== RINGKASAN SINGKAT PRECEDENCE ===");
        System.out.println("- Unary (++, --, +, -, !) memiliki precedence sangat tinggi.");
        System.out.println("- Multiplicative (*, /, %) dieksekusi sebelum additive (+, -).");
        System.out.println("- Perbandingan (>, <, >=, <=) dievaluasi setelah operasi aritmatika.");
        System.out.println("- Logical && dieksekusi sebelum ||; ! memiliki precedence lebih tinggi dari keduanya.");
        System.out.println("- Tanda kurung () selalu bisa dipakai untuk mengontrol urutan evaluasi.");
    }
}

