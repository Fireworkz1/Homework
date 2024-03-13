import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Long tStart;
        Long tEnd;
//        int[] list_original=new int[]{3,1,2};

//        int[] list_original = new int[]{36, 3, 15, 25, 18, 38, 10, 22, 8, 30, 19, 28, 7, 50, 12, 16, 6,
//                34, 47, 20, 44, 11, 32, 27, 45, 23, 49, 43, 37, 4, 39, 9, 42, 24, 35, 1, 5, 46, 29, 33, 14,
//                21, 48, 2, 40, 26, 13, 31, 17, 41};
        int[] list_original = generateRandomArray(10,100);
        int[] list = Arrays.stream(list_original).toArray();
        System.out.println(Arrays.toString(list));

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

        list = Arrays.stream(list_original).toArray();
        tStart = System.currentTimeMillis();
        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(list,5);
        tEnd = System.currentTimeMillis();
        System.out.println("希尔排序" + Arrays.toString(list) + "t:" + (tEnd - tStart));

        list = Arrays.stream(list_original).toArray();
        tStart = System.currentTimeMillis();
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(list);
        tEnd = System.currentTimeMillis();
        System.out.println("  堆排序" + Arrays.toString(list) + "t:" + (tEnd - tStart));

    }

    public static int[] generateRandomArray(int size,int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }
}