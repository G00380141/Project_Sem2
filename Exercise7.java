public class Exercise7{

public static void main(String[] args){
    int[] x = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int y = 0;

        System.out.println();

        System.out.println("First Value: "+x[0]);
        System.out.println("Last Value: "+x[x.length-1]);

        for(int i = 0; i < x.length; i++){
            for(int j = i+1; j < x.length; j++){
                if(x[i] < x[j]){
                    y = x[i];
                    x[i] = x[j];
                    x [j] = y;
                }
            }
        }
        System.out.println();

        System.out.println("Reorganised array: ");
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i] + " ");
        }
    }
}