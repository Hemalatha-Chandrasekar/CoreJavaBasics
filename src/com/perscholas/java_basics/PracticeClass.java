package com.perscholas.java_basics;

import java.sql.SQLOutput;

public class PracticeClass {
    public static void main(String[] args) {
       // Sum s = new Sum();
        //s.calSum();

        /*** Write a program that declares two integer variables,
         * assigns an integer to each, and adds them together.
         * Assign the sum to a variable. Print out the result.*/

        //Question1:
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum if two integer variable: "+sum);

        /***
         *Write a program that declares two double variables,
         * assigns a number to each, and adds them together.
         * Assign the sum to a variable. Print out the result.
         */
        //Question 2:
        double c=5.25;
        double d=7.25;
        double total1=c+d;
        System.out.println("Total sum of two double variables: "+total1);

        /***
         * Write a program that declares an integer variable and a double variable,
         * assigns numbers to each, and adds them together.
         * Assign the sum to a variable. Print out the result. What variable type must the sum be?
         */
        //Question3:
        int e=10;
        double f=20;
        double total2=e+f;
        System.out.println("Total sum of two different variables: "+total2);

        /***
         * Write a program that declares two integer variables,
         * assigns an integer to each, and divides the larger number by the smaller number.
         * Assign the result to a variable.
         * Print out the result. Now change the larger number to a decimal.
         * What happens? What corrections are needed?
         */
        //Question4:
        int num1=10;
        int num2=20;
        int divided=num2/num1;
        System.out.println("Integer division : "+divided);
        double largeDecimal=20.5;
        double dividedDecimal  =largeDecimal/num1;
        System.out.println("Decimal division : "+dividedDecimal);

        /***Write a program that declares two double variables,
         * assigns a number to each,and divides the larger by the smaller number.
         * Assign the result to a variable.Print out the result.
         * Now, cast the result to an integer. Print out the result again.
         * */
        //Question5:
        double g=10.5;
        double h=5.5;
        double total3=g/h;
        System.out.println("Total division of two double variables: "+total3);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign it to q. Print q again

        //Question6:
        int x=5;
        int y=6;
        int q=y/x;
        System.out.println("The value of y/x is: "+q);
        double castq = (double) y / x;
        System.out.println("The value of y cast into double  y/x is: "+castq);

        //Write a program that declares a named constant and uses it in a calculation. Print the result

        //Question7:
        final int LENGTH=10;
        final int WIDTH=20;
        double area=LENGTH*WIDTH;
        System.out.println("The area of Rectangle : "+area);

        //Write a program where you create three variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
        // Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
        // four items of the second product, and two items of the third product.
        // Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.

        //Question 8:
        /***
         * step1:Products=coffee, cappuccino, espresso, green tea-Assign prices
         * step2:Create two more variables called subtotal and totalSale
         * step3:complete an “order” for three items
         *       1.first product,three items
         *       2.second product four items, and two items of the third product
         * step4:Add them all together to calculate the subtotal.
         * step5:Create a constant called SALES_TAX and add sales tax
         * step6:Be sure to format the results to two decimal places.
         */
        double coffee=10.99;
        double cappuccino=12.99;
        double greenTea=5.99;
        double subtotal;
        double totalSale;
        double coffeeOrder=4;
        double cappuccinoOrder=2;
        double greenTeaOrder=4;
        subtotal=(coffee*coffeeOrder)+(cappuccino*cappuccinoOrder)+(greenTea*greenTeaOrder);
        System.out.println("The subtotal of all orders "+subtotal);
        final double SALES_TAX=0.10;  // Declaring constant value
        double tax=subtotal*SALES_TAX; //calculating subtotal
        System.out.println("The tax is "+tax);
        totalSale =subtotal+tax;
        System.out.println("The Profit is "+totalSale);
    }

}

