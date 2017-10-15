package dataStructures.graph;

import java.util.Scanner;

public class AdjacancyMatrixRep {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [][] matrix =new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=s.nextInt();
            }
        }

       /* for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }*/
       isConnected(matrix,0,2); //not connected
       isConnected(matrix,4,1); // connected
        isConnected(matrix,3,3); //not connected
        isConnected(matrix,2,1);    //connected


    }
    public static boolean isConnected (int [][]matrix,int a, int b){
        if(matrix[a][b]==1){
            System.out.println("Node "+a+"and "+b+"are connected");
            return true;
        }else {
            System.out.println("Node "+a+"and "+b+"are not connected");
            return false;
        }



    }
}
