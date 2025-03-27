import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class ControlFlowAnswersPart5 {

    public static void main(String[] args) {
        // Q41: Sudoku Row/Column Check
        int[][] sudokuRow = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 1, 3, 4, 5, 6, 7, 8, 9}};
        System.out.println("Q41, Input: " + Arrays.toString(sudokuRow[0]) + ", Ans: " + sudokuRowCheck(sudokuRow[0]));
        System.out.println("Q41, Input: " + Arrays.toString(sudokuRow[1]) + ", Ans: " + sudokuRowCheck(sudokuRow[1]));


        // Q42: Equation Solver (Linear)
        linearEquationSolver(2, 3, 7);

        // Q43: Equation Solver (Quadratic)
        quadraticEquationSolver(1, -3, 2);
        quadraticEquationSolver(1, 0, 1);

        // Q44: Time Interval Overlap
        System.out.println("Q44, Input: (10, 12), (11, 13), Ans: " + timeIntervalOverlap(10, 12, 11, 13));
        System.out.println("Q44, Input: (10, 12), (13, 14), Ans: " + timeIntervalOverlap(10, 12, 13, 14));

        // Q45: Polygon Area (Simple Triangle)
        System.out.println("Q45, Input: (3, 4, 5), Ans: " + polygonArea(3, 4, 5));

        // Q46: Traffic Light Simulation
        trafficLightSimulation("red");
        trafficLightSimulation("yellow");
        trafficLightSimulation("green");

        // Q47: Text Parser
        textParser("The quick brown fox jumps over the lazy dog", "fox");

        // Q48: Game State Check
        System.out.println("Q48, Input: 'X', 'O', ' ', Ans: " + gameStateCheck('X', 'O', ' '));
        System.out.println("Q48, Input: 'X', 'X', 'X', Ans: " + gameStateCheck('X', 'X', 'X'));

        // Q49: Simple Regex Match
        System.out.println("Q49, Input: 'hello world', 'world', Ans: " + simpleRegexMatch("hello world", "world"));
        System.out.println("Q49, Input: 'hello world', 'test', Ans: " + simpleRegexMatch("hello world", "test"));

        // Q50: Card Game Logic (Simple High Card)
        System.out.println("Q50, Input: 10, 5, Ans: " + cardGameLogic(10, 5));
        System.out.println("Q50, Input: 5, 10, Ans: " + cardGameLogic(5, 10));
    }

    static boolean sudokuRowCheck(int[] row) {
        Set<Integer> seen = new HashSet<>();
        for (int num : row) {
            if (num < 1 || num > 9 || !seen.add(num)) {
                return false;
            }
        }
        return true;
    }

    static void linearEquationSolver(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Q42, Input: " + a + ", " + b + ", " + c + ", Ans: Invalid equation");
        } else {
            double x = (c - b) / a;
            System.out.println("Q42, Input: " + a + ", " + b + ", " + c + ", Ans: x = " + x);
        }
    }

    static void quadraticEquationSolver(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Q43, Input: " + a + ", " + b + ", " + c + ", Ans: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Q43, Input: " + a + ", " + b + ", " + c + ", Ans: " + root);
        } else {
            System.out.println("Q43, Input: " + a + ", " + b + ", " + c + ", Ans: Complex Roots");
        }
    }

    static boolean timeIntervalOverlap(int start1, int end1, int start2, int end2) {
        return start1 < end2 && start2 < end1;
    }

    static double polygonArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula (triangle)
    }

    static void trafficLightSimulation(String color) {
        switch (color) {
            case "red":
                System.out.println("Q46, Input: red, Ans: Stop");
                break;
            case "yellow":
                System.out.println("Q46, Input: yellow, Ans: Caution");
                break;
            case "green":
                System.out.println("Q46, Input: green, Ans: Go");
                break;
            default:
                System.out.println("Q46, Input: " + color + ", Ans: Invalid color");
        }
    }

    static void textParser(String text, String keyword) {
        if (text.contains(keyword)) {
            System.out.println("Q47, Input: '" + text + "', '" + keyword + "', Ans: Keyword found");
        } else {
            System.out.println("Q47, Input: '" + text + "', '" + keyword + "', Ans: Keyword not found");
        }
    }

    static String gameStateCheck(char a, char b, char c) {
        if (a == b && b == c) {
            return "Win";
        } else if (a != ' ' && b != ' ' && c != ' ') {
            return "Draw";
        } else {
            return "In Progress";
        }
    }

    static boolean simpleRegexMatch(String text, String pattern) {
        return text.contains(pattern);
    }

    static String cardGameLogic(int player1Card, int player2Card) {
        if (player1Card > player2Card) {
            return "Player 1 Wins";
        } else if (player2Card > player1Card) {
            return "Player 2 Wins";
        } else {
            return "Draw";
        }
    }
}