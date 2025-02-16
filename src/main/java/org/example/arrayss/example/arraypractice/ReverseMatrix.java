package org.example.arrayss.example.arraypractice;

/**
 * @author Bibash Bogati
 * @created 2025-02-13
 */
public class ReverseMatrix {


    public static void main(String[] args) {
        int [][] data = {{1,2,3}, {4,5,6} , {7,8,9}};

        int [][] transpose = transpose(data);
        int [][] reverse = reverse(transpose);
        for (int i = 0; i < reverse.length; i++) {
           for (int j = 0; j < reverse[i].length; j++) {
               System.out.print(reverse[i][j] + " ");
           }
        }
    }

    private static int[][] reverse(int[][] data) {

        for (int i = 0; i < data.length; i++) {
            int left = 0;
            int right = data.length -1 ;
            while (left < right) {
                int temp = data [i][left];
                data[i][left] = data [i][right];
                data[i][right] = temp;
                left++;
                right--;
            }
        }
        return data;
    }

    private static int[][] transpose(int[][] data) {

        // to transpose
        // change row into column and vice versa
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int temp = data[i][j];
                data[j][i] = data [i] [j];
                data[i] [j] = temp;
            }

        }

        return data;
    }
}
