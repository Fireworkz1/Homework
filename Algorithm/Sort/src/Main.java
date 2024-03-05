import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] list=new int[]{6,10,2,5,3,8,7,9,4,1};
        int[] list=new int[]{9,10,4,5,3,2,1,6,7,8};



        QuickSort quickSort=new QuickSort();
        int[] list1=quickSort.quicksort(list,0,list.length-1);
        System.out.println("快速排序"+ Arrays.toString(list1));

        InsertionSort insertionSort=new InsertionSort();
        int[] list2=insertionSort.insertionSort(list);
        System.out.println("插入排序"+Arrays.toString(list2));


    }
}