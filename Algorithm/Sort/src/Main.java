import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Long tStart;
        Long tEnd;
//        int[] list_original=new int[]{6,10,2,5,3,8,7,9,4,1};

//        int[] list_original = new int[]{36, 3, 15, 25, 18, 38, 10, 22, 8, 30, 19, 28, 7, 50, 12, 16, 6,
//                34, 47, 20, 44, 11, 32, 27, 45, 23, 49, 43, 37, 4, 39, 9, 42, 24, 35, 1, 5, 46, 29, 33, 14,
//                21, 48, 2, 40, 26, 13, 31, 17, 41};
        int[] list_original = generateRandomArray(3000);
        int[] list = Arrays.stream(list_original).toArray();

        tStart = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();
        int[] list1 = quickSort.quicksort(list, 0, list.length - 1);
        tEnd = System.currentTimeMillis();
        System.out.println("快速排序" + Arrays.toString(list1) + "t:" + (tEnd - tStart));

        list = Arrays.stream(list_original).toArray();
        tStart = System.currentTimeMillis();
        InsertionSort insertionSort = new InsertionSort();
        int[] list2 = insertionSort.insertionSort(list);
        tEnd = System.currentTimeMillis();
        System.out.println("插入排序" + Arrays.toString(list2) + "t:" + (tEnd - tStart));


        list = Arrays.stream(list_original).toArray();
        tStart = System.currentTimeMillis();
        SelectSort selectSort = new SelectSort();
        int[] list3 = SortUtils.integerListToArray(selectSort.selectSort(SortUtils.intArrayToList(list)));
        tEnd = System.currentTimeMillis();
        System.out.println("选择排序" + Arrays.toString(list3) + "t:" + (tEnd - tStart));
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000);
        }
        return array;
    }
}