public class ArrayDemo {
    public static void main(String[] args){
        int arr[];
        arr = new int[6];
        System.out.println("Array Length=" + arr.length);
        arr[0] = 15;
        arr[1] = 11;
        arr[2] = 25;
        arr[3] = 27;
        arr[4] = 32;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array Elements are:" + arr[i]);
        }
    }
}
