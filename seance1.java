/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
YourName YourSurname*/

public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello\nVanessa Huhn");
    }
}

/*2. Write a Java program to print the sum of six numbers. Go to the editor
Test Data:
74 + 36 +5 +10+15+10
Expected Output :
150*/

public class Hello {
    public static void main(String args[]) {
        System.out.println(74 + 36 + 5 + 10 + 15 + 10);
    }
}

/*3. Write a Java program to divide two numbers and print on the screen .
Test Data :
50/3
Expected Output :
16.6666667*/

public class Hello {
    public static void main(String args[]) {
        System.out.println(50.0/3.0);
    }
}

/*4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/

public class Hello {
    public static void main(String args[]) {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
}

/*5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner user_input = new Scanner(System.in);

        int first_number;
        System.out.print("Input first number: ");
        first_number = user_input.nextInt();

        int second_number;
        System.out.print("Input second number: ");
        second_number = user_input.nextInt();

        int result;
        result = first_number * second_number;
        System.out.println(first_number + " x " + second_number + " = " + result);
    }
}

/*6. Write a Java program to print the sum (addition) of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149*/

import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner user_input = new Scanner(System.in);

        int first_number;
        System.out.print("Input first number: ");
        first_number = user_input.nextInt();

        int second_number;
        System.out.print("Input second number: ");
        second_number = user_input.nextInt();

        int result;
        result = first_number + second_number;
        System.out.println(first_number + " + " + second_number + " = " + result);
    }
}

/*7. Write a Java program to divide two numbers and print the results (without the digits after the comma).
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 / 24 = 5*/

import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner user_input = new Scanner(System.in);

        int first_number;
        System.out.print("Input first number: ");
        first_number = user_input.nextInt();

        int second_number;
        System.out.print("Input second number: ");
        second_number = user_input.nextInt();

        int result;
        result = first_number / second_number;
        System.out.println(first_number + " / " + second_number + " = " + result);
    }
}

/*8.Write a Java program to calculate the remainder of division of two numbers and print the results.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 mod 24 = 5*/

import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner user_input = new Scanner(System.in);

        int first_number;
        System.out.print("Input first number: ");
        first_number = user_input.nextInt();

        int second_number;
        System.out.print("Input second number: ");
        second_number = user_input.nextInt();

        int result;
        result = first_number % second_number;
        System.out.println(first_number + " mod " + second_number + " = " + result);
    }
}

/*9. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner user_input = new Scanner(System.in);

        int number;
        System.out.print("Input first number: ");
        number = user_input.nextInt();


        int multiplicator;
        int end_multiplicator = 11;

        for (multiplicator = 1; multiplicator != end_multiplicator; multiplicator++) {

            int result;
            result = number * multiplicator;
            System.out.println(number + " x " + multiplicator + " = " + result);
        }
    }
}

/*10. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889*/

public class Hello {
    public static void main(String args[]) {

        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
}

/*11. Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765*/

public class Hello {
    public static void main(String args[]) {

        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
}

/*12. Write a Java program that calculates the average of  three predefined numbers.*/

public class Hello {
    public static void main(String args[]) {

        double nb1;
        double nb2;
        double nb3;
        int total;

        nb1 = 5;
        nb2 = 10;
        nb3 = 15;
        total = 3;


        System.out.println((nb1 + nb2 + nb3) / total);
    }
}

/*13. Write a Java program to swap two variables.*/

public class Hello {
    public static void main(String args[]) {

        int x, y, temp;

      x = 5;
      y = 4;

      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);

      temp = x;
      x = y;
      y = temp;

      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
    }
}

/*14. Write a Java program to input and display your password.
Expected Output

Input your Password:                                                    
Your password was: abc@123*/

import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner user_input = new Scanner(System.in);

        String password;
        System.out.print("Input your password: ");
        password = user_input.next();

        System.out.println("Your password was: " + password);
    }
}
