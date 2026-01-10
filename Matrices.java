import java.util.*;
public class Matrices{
    public static void printSpiralMatrix(int arr[][]){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;
        while(startCol<endCol && startCol<endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                System.out.println(arr[startRow][j]+" ");
            }
            // right
            for(int i=startRow;i<=endRow;i++){
                System.out.println(arr[i][endCol]);
            }
            // bottom
            for(int j=endCol;j>=startCol;j--){
                System.out.println(arr[endRow][j]+" ");
            }
            // left
            for(int i=endRow;i>=startRow;i--){
                System.out.println(arr[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }


    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        printSpiralMatrix(arr);
    }
}
//         Scanner in = new Scanner(System.in);
//         // System.out.println("Enter the number of rows and columns:   ");
//         // int n=in.nextInt();
//         // int m=in.nextInt();
//         int Matrix[][]=new int[2][3];
//         int n=Matrix.length , m=Matrix[0].length;
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;i++){
                
//                 Matrix[i][j]=in.nextInt();

//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;i++){
//                 System.out.println(Matrix[i][j]);
//                 // int Matrix[i][j]=in.nextInt();

//             }
//         }
//     }
// }