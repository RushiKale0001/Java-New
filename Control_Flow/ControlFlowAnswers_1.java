class ControlFlowAnswers_1 {

    public static void main(String[] args) {
        // Q1: Even or Odd
        System.out.println("Q1, Input: 5, Ans: " + evenOrOdd(5));
        System.out.println("Q1, Input: 8, Ans: " + evenOrOdd(8));

        // Q2: Positive, Negative, or Zero
        System.out.println("Q2, Input: -3, Ans: " + positiveNegativeZero(-3));
        System.out.println("Q2, Input: 0, Ans: " + positiveNegativeZero(0));
        System.out.println("Q2, Input: 7, Ans: " + positiveNegativeZero(7));

        // Q3: Largest of Two Numbers
        System.out.println("Q3, Input: 10, 5, Ans: " + largestOfTwo(10, 5));
        System.out.println("Q3, Input: 3, 8, Ans: " + largestOfTwo(3, 8));

        // Q4: Vowel or Consonant
        System.out.println("Q4, Input: 'a', Ans: " + vowelOrConsonant('a'));
        System.out.println("Q4, Input: 'b', Ans: " + vowelOrConsonant('b'));

        // Q5: Leap Year
        System.out.println("Q5, Input: 2024, Ans: " + leapYear(2024));
        System.out.println("Q5, Input: 2023, Ans: " + leapYear(2023));

        // Q6: Grade Calculator
        System.out.println("Q6, Input: 85, Ans: " + gradeCalculator(85));
        System.out.println("Q6, Input: 55, Ans: " + gradeCalculator(55));

        // Q7: Absolute Value
        System.out.println("Q7, Input: -10, Ans: " + absoluteValue(-10));
        System.out.println("Q7, Input: 10, Ans: " + absoluteValue(10));

        // Q8: Divisibility
        System.out.println("Q8, Input: 10, 2, Ans: " + divisibility(10, 2));
        System.out.println("Q8, Input: 10, 3, Ans: " + divisibility(10, 3));

        // Q9: Triangle Validity
        System.out.println("Q9, Input: 3, 4, 5, Ans: " + triangleValidity(3, 4, 5));
        System.out.println("Q9, Input: 1, 1, 3, Ans: " + triangleValidity(1, 1, 3));

        // Q10: Simple Calculator
        System.out.println("Q10, Input: 10, 5, '+', Ans: " + simpleCalculator(10, 5, '+'));
        System.out.println("Q10, Input: 10, 5, '-', Ans: " + simpleCalculator(10, 5, '-'));
        System.out.println("Q10, Input: 10, 5, '*', Ans: " + simpleCalculator(10, 5, '*'));
        System.out.println("Q10, Input: 10, 5, '/', Ans: " + simpleCalculator(10, 5, '/'));
    }

    static String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    static String positiveNegativeZero(int num) {
        if (num < 0) {
            return "Negative";
        } else if (num > 0) {
            return "Positive";
        } else {
            return "Zero";
        }
    }

    static int largestOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    static String vowelOrConsonant(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }

    static String leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "Leap Year";
        } else {
            return "Not Leap Year";
        }
    }

    static String gradeCalculator(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    static int absoluteValue(int num) {
        return (num < 0) ? -num : num;
    }

    static String divisibility(int a, int b) {
        return (a % b == 0) ? "Divisible" : "Not Divisible";
    }

    static String triangleValidity(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            return "Valid Triangle";
        } else {
            return "Invalid Triangle";
        }
    }

    static double simpleCalculator(double a, double b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return a / b;
        } else {
            return Double.NaN;
        }
    }
}