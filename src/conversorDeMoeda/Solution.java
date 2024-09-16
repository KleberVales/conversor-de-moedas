package conversorDeMoeda;

import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    NumberFormat usformat = NumberFormat.getCurrencyInstance(Locale.US);
    String us = usformat.format(payment);

    // currency fo india which not defined

    Locale indialocale = new Locale("en", "IN");
    NumberFormat indiaformatter = NumberFormat.getCurrencyInstance(indialocale);
    String india = indiaformatter.format(payment);


    NumberFormat chinaformatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china = chinaformatter.format(payment);

    NumberFormat franceformatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france = franceformatter.format(payment);


    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}
}