import java.util.Scanner;

public class Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int row = sc.nextInt() ;
        int col = sc.nextInt() ;
        int [][] matrix = new int[row][col] ;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j] = sc.nextInt() ;
            }
        }
        sc.close() ;
        boolean [] rowM = new boolean[row] ;
        boolean [] colM = new boolean[col] ;
        
        for (int i = 0; i < rowM.length; i++) {
            for (int j = 0; j < colM.length; j++) {
                if(matrix[i][j] == 1)
                {
                    rowM[i] = true ; 
                    colM[j] = true ;
                }
            }
        }
        for (int i = 0; i < rowM.length; i++) {
            for (int j = 0; j < colM.length; j++) {
                if(rowM[i] || colM[j])
                {
                    matrix[i][j] = 1 ; 
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }   
    }
}