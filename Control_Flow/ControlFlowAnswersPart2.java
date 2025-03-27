class ControlFlowAnswersPart2 {

    public static void main(String[] args) {
        // Q11: Largest of Three Numbers
        System.out.println("Q11, Input: 10, 5, 8, Ans: " + largestOfThree(10, 5, 8));
        System.out.println("Q11, Input: 3, 15, 2, Ans: " + largestOfThree(3, 15, 2));

        // Q12: Quadratic Roots
        quadraticRoots(1, -3, 2);
        quadraticRoots(1, 0, 1);

        // Q13: Day of Week
        System.out.println("Q13, Input: 1, Ans: " + dayOfWeek(1));
        System.out.println("Q13, Input: 7, Ans: " + dayOfWeek(7));

        // Q14: Month Name
        System.out.println("Q14, Input: 1, Ans: " + monthName(1));
        System.out.println("Q14, Input: 12, Ans: " + monthName(12));

        // Q15: Triangle Type
        System.out.println("Q15, Input: 3, 3, 3, Ans: " + triangleType(3, 3, 3));
        System.out.println("Q15, Input: 3, 4, 3, Ans: " + triangleType(3, 4, 3));
        System.out.println("Q15, Input: 3, 4, 5, Ans: " + triangleType(3, 4, 5));

        // Q16: Range Check
        System.out.println("Q16, Input: 15, Ans: " + rangeCheck(15));
        System.out.println("Q16, Input: 5, Ans: " + rangeCheck(5));

        // Q17: Simple ATM
        simpleATM(1000, 'W', 500);
        simpleATM(1000, 'D', 200);
        simpleATM(1000, 'B', 0);

        // Q18: Password Strength
        System.out.println("Q18, Input: 'StrongPass123!', Ans: " + passwordStrength("StrongPass123!"));
        System.out.println("Q18, Input: 'weak', Ans: " + passwordStrength("weak"));

        // Q19: Shipping Cost
        System.out.println("Q19, Input: 5, 'US', Ans: " + shippingCost(5, "US"));
        System.out.println("Q19, Input: 10, 'EU', Ans: " + shippingCost(10, "EU"));

        // Q20: Discount Calculation
        System.out.println("Q20, Input: 150, Ans: " + discountCalculation(150));
        System.out.println("Q20, Input: 50, Ans: " + discountCalculation(50));
    }

    static int largestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static void quadraticRoots(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Q12, Input: " + a + "," + b + "," + c + ", Ans: " + root1 + " " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Q12, Input: " + a + "," + b + "," + c + ", Ans: " + root);
        } else {
            System.out.println("Q12, Input: " + a + "," + b + "," + c + ", Ans: Complex Roots");
        }
    }

    static String dayOfWeek(int day) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            return days[day - 1];
        } else {
            return "Invalid Day";
        }
    }

    static String monthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        } else {
            return "Invalid Month";
        }
    }

    static String triangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    static String rangeCheck(int num) {
        if (num >= 10 && num <= 20) {
            return "In Range";
        } else {
            return "Out of Range";
        }
    }

    static void simpleATM(double balance, char operation, double amount) {
        if (operation == 'W') {
            if (balance >= amount) {
                System.out.println("Q17, Input: " + balance + "," + operation + "," + amount + ", Ans: " + (balance - amount));
            } else {
                System.out.println("Q17, Input: " + balance + "," + operation + "," + amount + ", Ans: Insufficient Funds");
            }
        } else if (operation == 'D') {
            System.out.println("Q17, Input: " + balance + "," + operation + "," + amount + ", Ans: " + (balance + amount));
        } else if (operation == 'B') {
            System.out.println("Q17, Input: " + balance + "," + operation + "," + amount + ", Ans: " + balance);
        }
    }

    static String passwordStrength(String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()].*")) {
            return "Strong";
        } else {
            return "Weak";
        }
    }

    static double shippingCost(double weight, String destination) {
        double cost = 0;
        if (destination.equals("US")) {
            cost = weight * 2.5;
        } else if (destination.equals("EU")) {
            cost = weight * 3.0;
        }
        return cost;
    }

    static double discountCalculation(double purchaseAmount) {
        double discount = 0;
        if (purchaseAmount >= 100) {
            discount = purchaseAmount * 0.1;
        }
        return purchaseAmount - discount;
    }
}