package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor n1 = new ArgsProcessor(args);
        ArgsProcessor n2 = new ArgsProcessor(args);
        double firstNum = n1.nextDouble("Enter first Number: ");
        double secondNum = n2.nextDouble("Enter second Number: ");
        double average = (firstNum + secondNum)/2;
        System.out.println(average);
    }
}
