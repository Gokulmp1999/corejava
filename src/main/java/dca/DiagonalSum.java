package dca;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter elements");
//        int[][] matrix=new int[3][3];
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                matrix[i][j]=scanner.nextInt();
//            }
//        }
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        int sum=0;
        for (int i=0;i < Math.min(3, 3);i++){

                sum=matrix[i][i]+sum;

        }
        System.out.println("sum"+ sum);

    }
}
