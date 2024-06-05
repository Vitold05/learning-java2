package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {

        // if ( if - else) / if -else-if

        /*

        if(condition)
        // code to be executed

         */

        //Exercise: if a > 5 => System.out.println ("This is true!");

        int a = 10;
        if (a > 5) {
            System.out.println("This is true!");

        }

        // Exercise 2: Write program that  will check if variable y is even

        int y = 8;
        if (y % 2 == 0) {
            System.out.println("y is even number");
        }

        //Exercise 3: Write program that will check is equal to 50;
        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }

        // >, <, <=, =>, ==, != ( comparison operators )

        if (b != y) {
            System.out.println("b is not equal to y");
        }
        // Boolean -> is or has (prefix)

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("It's time to go on vacation");
        }

        // =============================== IF-ELSE ==================================

        /*

        if(condition) {

        will execute code if statement is true;

        } else {
        will execute code if statement is false;
        }
         */

        // Exercise 4: Write program that will check if number is positive;

        int z = -10;
        if (z > +0) {
            System.out.println("Z is positive number!");
        } else {
            System.out.println("Z is negative number!");
        }

        //Exercise 5; If name equal to John, then print out - We found john;

        String name = "Marija";
        if (name.equals("John")) {
            System.out.println("We found John");
        } else {
            System.out.println("Variable contains name: " + name);
        }


        // ===================================== IF - ELSE - IF - ELSE ==============================

        /*

        if(condition) {
        if condition is true => this code block will be executed
        } else if (condition) {
        if condition2 is true => this code block will be executed
        } else {
        if no condition is met => this code block will be executed
        }

         */

        // Exercise 6: Write program that will check if variables > 10, check if variable  = 10, and all other is less then 10;


        int e = 1;
        if (e > 10) {
            System.out.println("Variable is more than 10");
        } else if (e == 10) {
            System.out.println("Variable is equal to 10");
        } else {
            System.out.println("Variable is less than 10");
        }

        // Exercise 7: Create array with numbers, iterate through it and check if number is positive, negative or equal to = 0;

        int[] numbers = {10, -5, 0, 25, -30, 15, -10, 5, -20};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number > 0) {
                System.out.printf("Number: %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is  negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
            }
        }

        // Exercise 8: Excellent (90-100 ) / GOOD (75-89) / OK (50-74) / NOK (0-49)

        int[] grades = {95, 82, 74, 56, 48, 91, 87, 66, 77, 45};

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("Grade: %d is Excellent \n", grade);
            } else if (grade >= 75 && grade < 90) {
                System.out.printf("Grade %d is Good \n", grade);
            } else if (grade >= 50 && grade < 75) {
                System.out.printf("Grade %d is OK \n", grade);
            } else if (grade >= 0 && grade < 50) {
                System.out.printf("Grade %d is NOK \n", grade);
            }
        }

        // Exercise 9: Create temperature classifier
        // ( Temperature < -10 (cold) / from 8 to 10 ( prohladno ) / from 10 to 20 (Teplo) / From 20 to 30 (Zharko) / >30 - ochenj zharko


        int[] frosts = {-5, 7, 15, 25, 31};

        for (int frost : frosts) {
            if (frost >= -10 && frost <= -5) {
                System.out.printf("Temperature is cold \n", frost);
            }
        }


    }
}
