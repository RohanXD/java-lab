import java.util.*;
public class matrixmul {
    public static void main(String[] args) {
        int r1, c1, r2, c2, sum=0,i,j,k ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix 1 : ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns of matrix 2 : ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        int[][] mat2 = new int[r2][c2];
        System.out.println("Enter the elements of matrix 1 : ");
        for(i=0; i<r1; i++){
            for(j=0; j<c1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2 : ");
        for(i=0; i<r2; i++){
            for(j=0; j<c2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        if(c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        else{
            int multiply[][]= new int[r1][c2];
            for(i=0; i<r1; i++){
                for(j=0; j<c2; j++){
                    for(k=0; k<c1; k++){
                        sum = sum + mat1[i][k] * mat2[k][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("The product of the two matrices is: ");
            for(i=0; i<r1; i++){
                for(j=0; j<c2; j++){
                    System.out.print(multiply[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
