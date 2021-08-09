package com.sksoft;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a = 234.23;
        double b = 720.34;

        double sum = a + b;
        double diff = a - b;

        double product = a * b;
        double quotient = a / b;

        System.out.println("Simple calculations ! \n");

        System.out.printf("Summe aus %.2f + %.2f = %.2f \n",a,b,sum);
        System.out.printf("Differenz aus %.2f - %.2f = %.2f \n",a,b,diff);

        System.out.printf("Produkt aus %.2f * %.2f = %.2f\n",a,b,product);
        System.out.printf("Quotient aus %.2f / %.2f = %.2f\n",a,b,quotient);
    }
}
