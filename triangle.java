import java.util.Scanner;

public class triangle {
    public static void drawTriangle(int n){
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter height of triangle: ");
        int num = scn.nextInt();
        triangle(num);
        scn.close();
    }
}
