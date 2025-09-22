public class ExpressionPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Expression, Statement & Block
         */

        // ===== EXPRESSIONS =====
        System.out.println("=== EXPRESSIONS ===");

        int a = 10;
        int b = 5;

        // Expressions
        int sum = a + b; // arithmetic expression
        int product = a * b; // multiplication expression
        boolean isAGreater = a > b; // boolean expression
        String greeting = "Hello" + " " + "World"; // string concatenation
        double power = Math.pow(2, 3); // method call expression

        // Print results
        System.out.println("Sum (a+b) = " + sum);
        System.out.println("Product (a*b) = " + product);
        System.out.println("Is a > b? " + isAGreater);
        System.out.println("Greeting = " + greeting);
        System.out.println("2^3 = " + power);

        // ===== STATEMENTS =====
        System.out.println("\n=== STATEMENTS ===");

        // Declaration statement
        int score;

        // Assignment statement
        score = 85;

        // Conditional statement
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Loop statement
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // ===== BLOCKS =====
        System.out.println("\n=== BLOCKS ===");

        int x = 15;

        // If block
        if (x > 10) {
            String category = "High";
            System.out.println("x = " + x);
            System.out.println("Category = " + category);
        }

        // For loop block
        for (int i = 1; i <= 3; i++) {
            int iteration = i;
            System.out.println("Iteration number: " + iteration);
        }

        // Scope demo
        int outerVariable = 100;

        {
            int innerVariable = 50;
            System.out.println("Inside block - outerVariable = " + outerVariable);
            System.out.println("Inside block - innerVariable = " + innerVariable);

            // Modify outerVariable inside block
            outerVariable += 25;
        }

        // outerVariable still accessible here
        System.out.println("After block - outerVariable = " + outerVariable);

        // innerVariable is not accessible outside its block
        // System.out.println(innerVariable); // ❌ Error: cannot find symbol
    }
}

