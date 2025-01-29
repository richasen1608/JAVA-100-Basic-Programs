class BalanceParenthesis {
    public static void main(String[] args) {
        String exp1 = "((())))";
        if (isBalanced(exp1)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    static boolean isBalanced(String exp) {
        int count = 0; // This will keep track of the balance between opening and closing parentheses

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                count++; // Increase count for each opening parenthesis
            } else if (exp.charAt(i) == ')') {
                count--; // Decrease count for each closing parenthesis
            }

            // If count is negative, it means there are more closing than opening parentheses
            if (count < 0) {
                return false;
            }
        }

        // After the loop, count should be zero if parentheses are balanced
        return count == 0;
    }
}
