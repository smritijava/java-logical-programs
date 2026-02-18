import java.util.Scanner;

class MergeSortedArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] A = new int[m];
        System.out.println("Enter " + m + " sorted elements (no duplicates) for array A:");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Enter " + n + " sorted elements (no duplicates) for array B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge arrays A and B into C
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else if (B[j] < A[i]) {
                C[k++] = B[j++];
            } else {
                C[k++] = A[i++];
                j++; // skip duplicate
            }
        }

        while (i < m) {
            C[k++] = A[i++];
        }

        while (j < n) {
            C[k++] = B[j++];
        }

        // Display merged sorted array
        System.out.println("Merged Sorted Array without duplicates:");
        for (int x = 0; x < k; x++) {
            System.out.print(C[x] + " ");
        }
    }
}
