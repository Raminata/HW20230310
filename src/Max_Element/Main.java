package Max_Element;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 5, 8, 9, 7};
        System.out.println("Array length is: " + ints.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        MaxElementArray maxElementArray = new MaxElementArray(ints);
        System.out.println();
        System.out.println("Max element of Array is: " + maxElementArray.getMax(ints));
    }
}