class ControlFlowAnswersPart3 {

    public static void main(String[] args) {
        // Q21: Print Numbers
        printNumbers(1, 10);

        // Q22: Sum of Numbers
        System.out.println("Q22, Input: 10, Ans: " + sumOfNumbers(10));

        // Q23: Factorial
        System.out.println("Q23, Input: 5, Ans: " + factorial(5));

        // Q24: Multiplication Table
        multiplicationTable(7);

        // Q25: Reverse Number
        System.out.println("Q25, Input: 12345, Ans: " + reverseNumber(12345));

        // Q26: Palindrome Check
        System.out.println("Q26, Input: 121, Ans: " + palindromeCheck(121));
        System.out.println("Q26, Input: 'madam', Ans: " + palindromeCheck("madam"));
        System.out.println("Q26, Input: 123, Ans: " + palindromeCheck(123));
        System.out.println("Q26, Input: 'hello', Ans: " + palindromeCheck("hello"));

        // Q27: Fibonacci Sequence
        fibonacciSequence(10);

        // Q28: Prime Number Check
        System.out.println("Q28, Input: 17, Ans: " + primeCheck(17));
        System.out.println("Q28, Input: 10, Ans: " + primeCheck(10));

        // Q29: Prime Numbers in Range
        primeNumbersInRange(10, 30);

        // Q30: Armstrong Number
        System.out.println("Q30, Input: 153, Ans: " + armstrongNumber(153));
        System.out.println("Q30, Input: 120, Ans: " + armstrongNumber(120));
    }

    static void printNumbers(int start, int end) {
        System.out.print("Q21, Input: " + start + "," + end + ", Ans: ");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static void multiplicationTable(int n) {
        System.out.print("Q24, Input: " + n + ", Ans: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    static boolean palindromeCheck(Object input) {
        if (input instanceof Integer) {
            int num = (int) input;
            return num == reverseNumber(num);
        } else if (input instanceof String) {
            String str = (String) input;
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        } else {
            return false;
        }
    }

    static void fibonacciSequence(int n) {
        System.out.print("Q27, Input: " + n + ", Ans: ");
        int a = 0, b = 1;
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    static boolean primeCheck(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeNumbersInRange(int start, int end) {
        System.out.print("Q29, Input: " + start + "," + end + ", Ans: ");
        for (int i = start; i <= end; i++) {
            if (primeCheck(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean armstrongNumber(int n) {
        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }
}