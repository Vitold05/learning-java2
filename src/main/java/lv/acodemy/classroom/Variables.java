package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {
        // One line comment

        // Category: Integral
        //byte:
        byte smallNumber = 120;

        //RGB (RED GREEN BLUE)
        byte red = 120;
        byte green = 45;
        byte blue = 127;
        System.out.println(blue);

        // int (Integer)
        // Employee ID:
        int employeeId = 123456;

        // Population count;
        int populationOfLatvia = 1811956;
        System.out.println(populationOfLatvia);

        //short
        // Game Score:
        short playerScore = 15000;
        //Year of birth;
        short yearOfBirth = 1990;

        //char ( character)
        // Grade;
        char grade = 'A';

        //Initials;
        char firstInitial = 'N';
        char lastInitial = 'S';

        // Long
        //Bank Account Balance;
        long accountBalance = 1000000000;

        //Java 7;
        // improves readability
        long population = 1_000_000_000L; //1 billion;

        //Avoiding mistake
        int creditCardNumber = 1444_4242;

        // double
        //PI
        double piValue = Math.PI;
        System.out.println(piValue);
        //Another way
        double pi = 3.14_15_92;
        System.out.println(pi);

        //Floating numbers:
        //Float
        //Price
        float price = 1_2424_4242.44F;
        System.out.println(price);

        //Double
        //Financial Debt;
        double financeDebt = 24_242_444_424.42222;

        //Distance
        double distanceToSun = 123_244_242_4; // in km;

        //Boolean
        //has or is prefix;

        boolean isSummer = false;
        System.out.println(isSummer);

        boolean hasBMW = true;

        // String
        String firstName = "James";
        String lastName = "Price";

        // var
        var myCurrentAge = 24;
        var myFullName = "James Price";

        // Operators;
        //* - multiplication (8*8)
        // / - division (8 / 2)
        // + -Addition (5+5)
        // - - Subtraction (10 - 4)

        boolean evenNumber = 4 % 2 == 0;// true
        boolean addNumber = 4 % 3 == 0; // false

        int remainderResult = 5 % 5;
        System.out.println(remainderResult);

        int remainderResult2 = 10 % 4;
        System.out.println(remainderResult2);

    }
}
