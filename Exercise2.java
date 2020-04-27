import java.util.Scanner;

class Exercise2{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int result = 0;

        System.out.print("Please enter first number: ");
        number1 = input.nextInt();

        System.out.print("Please enter second number: ");
        number2 = input.nextInt();

        result=number1+number2;
        System.out.println(number1 + " + " + number2 +" = "+ result);

        result=number1-number2;
        System.out.println(number1 + " - " + number2 +" = "+ result);

        result=number1*number2;
        System.out.println(number1 + " * " + number2 + " = " +result);
    }
}