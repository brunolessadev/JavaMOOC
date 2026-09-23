import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int small = array[0];

        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array){
        int indexSmall = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[indexSmall] > array[i]){
                indexSmall = i;
            }
        }
        return indexSmall;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){

        int indexSmallID = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if(table[indexSmallID] > table[i]){
                indexSmallID = i;
            }
        }
        return indexSmallID;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];

        array[index1] = array[index2];

        array[index2] = temp;
    }

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);

            swap(array, i , smallestIndex);

            System.out.println(Arrays.toString(array));
        }

    }

    public static void main(String[] args) {

        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        int[] numbers1 = {55,99,72,1,105,299};
        System.out.println("Smallest2: " + MainProgram.smallest(numbers1));

        System.out.println("============================");

        int[] numbers2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers2));

        System.out.println("============================");

        int[] numbers3 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers3, 2));

        System.out.println("============================");

        int[] numbers4 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers4));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers4));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers4));

        System.out.println("============================");

        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers5);

    }
}
