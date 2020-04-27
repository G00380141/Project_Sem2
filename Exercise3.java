import java.util.Scanner;

public class Exercise3{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int x = 0;
            System.out.print("Please enter a number: " );
            x = input.nextInt();

            if(x > 22){
            System.out.println("The number you have entered is greater than my age.");
            }
            else if(x < 22){
                System.out.println("The number you have entered is less than my age.");
            }
            else if (x == 22){
                System.out.println("The number you have entered matches my age.");
            }
        }
    }