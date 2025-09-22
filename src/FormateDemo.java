public class FormateDemo {
    public static void main(String args[]) {
        int arr[][] = {{5, 3, 9}, {8, 7, 6}, {1, 3, 7}};
        System.out.println("Array Length=" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " +arr[i][j]);
            }
            System.out.println();
        }
    }
}

