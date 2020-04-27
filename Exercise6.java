import java.util.Scanner;

public class Exercise6{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String symbol = "";
        int rows = 1;
        int columns = 1;
        int norows = 0;
        int nocolumns =0;

        System.out.print("Enter symbol: ");
        symbol = input.next();
        System.out.print("Enter number of rows: ");
        norows = input.nextInt();
        System.out.print("Enter number of columns: ");
        nocolumns = input.nextInt();

        for(rows = 1; rows <= norows; rows++)
		{
			for(columns = 1; columns <= nocolumns; columns++)
			{
				System.out.print(" "+symbol); 
			}
        System.out.println();
    }
}
}