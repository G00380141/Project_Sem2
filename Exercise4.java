import java.util.Scanner;

public class Exercise4{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int number = 0;
    int counter = 0;
    int flag = 1;

    System.out.print("Enter a number from 1 to 10: ");
    number = input.nextInt();
    while(number < 1 || number > 10){
        System.out.println("Invalid number please try again");
            System.out.print("Enter a number from 1 to 10: ");
            number = input.nextInt();
    }
    while(flag <= number){
        System.out.println(flag + ". James");
        flag++;
    }
}
}