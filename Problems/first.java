package Problems;

public class first {
    public static void main(String[] args) {
        /*
         * int arr[] = { 1, 5, 3, 4, 6 };
         * int max = 6;
         * char matrix[][] = new char[5][max];
         * 
         * for (int i = 0; i < arr.length; i++) {
         * int num = arr[i];
         * for (int j = 0; j < num; j++) {
         * matrix[i][j] = '*';
         * }
         * 
         * }
         * for (int i = 0; i < arr.length; i++) {
         * 
         * for (int j = 0; j < max; j++) {
         * System.out.print(matrix[i][j]);
         * }
         * System.out.println();
         * 
         * }
         * Thread t1 = new Thread("prajjawal");
         * Thread t2 = new Thread("Kumar");
         * t1.start();
         * t2.start();
         * System.out.println(t2);
         * System.out.println(t1);
         * 
         * System.out.println(t2);
         * System.out.println(t1);
         */
        // trangle pattern
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
