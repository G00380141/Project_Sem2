public class Exercise5{

public static void main(String[] args){
    int[] array = {20, 30, 40, 50};
    int sum = 0;
    int result = 1;

    for (int i = 0; i < array.length ; i++) {
        sum = sum + array[i];
    }
    for (int product : array){
    result *= product;
    }

    System.out.println("Sum value of array elements is = " + sum);

    double average = (double) sum / array.length;
    System.out.println("Average of array values = " + average);

    System.out.println("Product of array elements is = "+result);
    
    }
}