class ControlFlowAnswersPart4 {

    public static void main(String[] args) {
        // Q31: Count Digits
        System.out.println("Q31, Input: 12345, Ans: " + countDigits(12345));

        // Q32: Sum of Digits
        System.out.println("Q32, Input: 12345, Ans: " + sumOfDigits(12345));

        // Q33: Pattern Printing (Simple)
        patternPrinting(5);

        // Q34: Power of a Number
        System.out.println("Q34, Input: 2, 5, Ans: " + powerOfNumber(2, 5));

        // Q35: Greatest Common Divisor (GCD)
        System.out.println("Q35, Input: 48, 18, Ans: " + gcd(48, 18));

        // Q36: Least Common Multiple (LCM)
        System.out.println("Q36, Input: 12, 18, Ans: " + lcm(12, 18));

        // Q37: Average of Numbers
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Q37, Input: {1, 2, 3, 4, 5}, Ans: " + averageOfNumbers(numbers));

        // Q38: Find Maximum
        int[] numbers2 = {5, 2, 9, 1, 5};
        System.out.println("Q38, Input: {5, 2, 9, 1, 5}, Ans: " + findMaximum(numbers2));

        // Q39: Find Minimum
        int[] numbers3 = {5, 2, 9, 1, 5};
        System.out.println("Q39, Input: {5, 2, 9, 1, 5}, Ans: " + findMinimum(numbers3));

        // Q40: Search Element
        int[] numbers4 = {1, 2, 3, 4, 5};
        System.out.println("Q40, Input: {1, 2, 3, 4, 5}, 3, Ans: " + searchElement(numbers4, 3));
        System.out.println("Q40, Input: {1, 2, 3, 4, 5}, 6, Ans: " + searchElement(numbers4, 6));
    }

    static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static void patternPrinting(int rows) {
        System.out.println("Q33, Input: " + rows + ", Ans:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static long powerOfNumber(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static double averageOfNumbers(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int findMinimum(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}