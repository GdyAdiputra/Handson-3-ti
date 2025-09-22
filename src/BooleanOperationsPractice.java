public class BooleanOperationsPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Operasi Boolean
         */

        // ===== OPERATOR BOOLEAN DASAR =====
        System.out.println("=== OPERATOR BOOLEAN DASAR ===");

        // Latihan 1: AND (&&)
        boolean isLoggedIn = true, hasPermission = false;
        boolean canAccessAdmin = isLoggedIn && hasPermission;
        System.out.println("User bisa akses admin panel? " + canAccessAdmin);

        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        // Latihan 2: OR (||)
        boolean isWeekend = false, isHoliday = true;
        boolean isDayOff = isWeekend || isHoliday;
        System.out.println("Hari libur? " + isDayOff);

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // Latihan 3: NOT (!)
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        System.out.println("isRaining = " + isRaining);
        System.out.println("isSunny = " + isSunny);
        System.out.println("!!isRaining = " + (!!isRaining));
        System.out.println("!(5 > 3) = " + (!(5 > 3))); // 5 > 3 true, lalu dibalik jadi false

        // ===== EKSPRESI BOOLEAN GABUNGAN =====
        System.out.println("\n=== EKSPRESI BOOLEAN GABUNGAN ===");

        boolean attendanceGood = true, gradesHigh = false, behaviorGood = true;
        boolean isOutstanding = attendanceGood && gradesHigh && behaviorGood;
        boolean isSatisfactory = attendanceGood && (gradesHigh || behaviorGood);
        boolean needsImprovement = !attendanceGood || !behaviorGood;

        System.out.println("Siswa outstanding? " + isOutstanding);
        System.out.println("Siswa memuaskan? " + isSatisfactory);
        System.out.println("Siswa perlu perbaikan? " + needsImprovement);

        // ===== APLIKASI PRAKTIS =====
        System.out.println("\n=== APLIKASI PRAKTIS ===");

        // Latihan 5: Sistem kontrol akses
        boolean hasKeyCard = true, knowsPassword = false, isAuthorizedTime = true, isEmergency = false;
        boolean normalAccess = hasKeyCard && knowsPassword && isAuthorizedTime;
        boolean emergencyAccess = isEmergency || (hasKeyCard && isAuthorizedTime);
        boolean accessDenied = !(normalAccess || emergencyAccess);

        System.out.println("Akses normal? " + normalAccess);
        System.out.println("Akses darurat? " + emergencyAccess);
        System.out.println("Akses ditolak? " + accessDenied);

        // Latihan 6: Pengambilan keputusan berdasarkan cuaca
        isRaining = false;
        boolean isSnowing = true;
        int temperature = -5;
        boolean isCloudy = true;

        boolean goodWeather = !isRaining && !isSnowing && temperature > 0;
        boolean needUmbrella = isRaining || (isCloudy && temperature > 20);
        boolean dangerousRoads = isSnowing || (isRaining && temperature < 5);

        System.out.println("Cuaca bagus untuk outdoor? " + goodWeather);
        System.out.println("Butuh payung? " + needUmbrella);
        System.out.println("Jalan berbahaya? " + dangerousRoads);

        // ===== EVALUASI SHORT-CIRCUIT =====
        System.out.println("\n=== EVALUASI SHORT-CIRCUIT ===");

        int a = 5, b = 0;

        // Short-circuit AND
        boolean safeCheck1 = (b != 0) && (a / b > 2);
        System.out.println("(b != 0) && (a / b > 2) aman dievaluasi? " + safeCheck1);

        // Short-circuit OR
        boolean safeCheck2 = (b == 0) || (a / b > 2);
        System.out.println("(b == 0) || (a / b > 2) aman dievaluasi? " + safeCheck2);

        // Komentar: Evaluasi short-circuit menghentikan perhitungan
        // jika hasil akhir sudah bisa ditentukan:
        // - Pada AND: jika kondisi pertama false, kondisi kedua tidak dievaluasi.
        // - Pada OR: jika kondisi pertama true, kondisi kedua tidak dievaluasi.
        // Itulah kenapa tidak terjadi division by zero.

        // Latihan 8: Short-circuit dengan simulasi
        boolean expensiveCheck1 = false, expensiveCheck2 = true;

        boolean andResult = expensiveCheck1 && expensiveCheck2;
        System.out.println("expensiveCheck1 && expensiveCheck2 = " + andResult);
        // Catatan: Karena expensiveCheck1 = false, ekspresi langsung false
        // sehingga "method" expensiveCheck2 tidak akan dipanggil.

        boolean orResult = expensiveCheck2 || expensiveCheck1;
        System.out.println("expensiveCheck2 || expensiveCheck1 = " + orResult);
        // Catatan: Karena expensiveCheck2 = true, ekspresi langsung true
        // sehingga "method" expensiveCheck1 tidak akan dipanggil.
    }
}

