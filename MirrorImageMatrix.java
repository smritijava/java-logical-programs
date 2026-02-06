import java.util.Scanner;

class MirrorImageMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Input 3x3 matrix
        System.out.println("Enter 9 natural numbers for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display mirror image (reverse each row)
        System.out.println("Mirror Image Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
