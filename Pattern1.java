package PatternPrinting.SQUARE;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows : ");
        int m = sc.nextInt();
        System.out.print("Enter How Much In Rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++ ){              // Control The Number Of Rows
            for (int j = 1; j <= n;j++){              // Controls How Much In Each Line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
