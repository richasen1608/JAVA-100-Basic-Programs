 public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators:");
        int c = 5;
        System.out.println("c = " + c); // Output: 5
        System.out.println("++c = " + (++c)); // Output: 6 (Pre-increment)
        System.out.println("c++ = " + (c++)); // Output: 6 (Post-increment)
        System.out.println("c = " + c); // Output: 7

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int d = 10;
        d += 5; // Equivalent to d = d + 5
        System.out.println("d += 5 = " + d); // Output: 15
        d -= 3; // Equivalent to d = d - 3
        System.out.println("d -= 3 = " + d); // Output: 12

        // Relational Operators
        System.out.println("\nRelational Operators:");
        int x = 10, y = 20;
        System.out.println("x == y = " + (x == y)); // Output: false
        System.out.println("x != y = " + (x != y)); // Output: true
        System.out.println("x > y = " + (x > y)); // Output: false
        System.out.println("x < y = " + (x < y)); // Output: true
        System.out.println("x >= y = " + (x >= y)); // Output: false
        System.out.println("x <= y = " + (x <= y)); // Output: true

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean p = true, q = false;
        System.out.println("p && q = " + (p && q)); // Output: false
        System.out.println("p || q = " + (p || q)); // Output: true
        System.out.println("!p = " + (!p)); // Output: false

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int m = 0b1010, n = 0b1100; // Binary literals
        System.out.println("m & n = " + (m & n)); // Bitwise AND, Output: 8 (0b1000)
        System.out.println("m | n = " + (m | n)); // Bitwise OR, Output: 14 (0b1110)
        System.out.println("m ^ n = " + (m ^ n)); // Bitwise XOR, Output: 6 (0b0110)
        System.out.println("~m = " + (~m)); // Bitwise Complement, Output: -11 (0b...11110101)

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (x > y) ? x : y;
        System.out.println("Max of x and y = " + max); // Output: 20
    }
}





