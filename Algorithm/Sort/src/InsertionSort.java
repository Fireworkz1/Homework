public class InsertionSort {
    /*
     * 插入排序
     * T:O(n) 有序
     * O(N2) 无序
     * */
    public int[] insertionSort(int[] list) {
        int p = 0;
        int f = 0;
        for (; p < list.length - 1; p++) {
            f = p + 1;
            while (f >= 1 && list[f] < list[f - 1]) {
                int temp = list[f];
                list[f] = list[f - 1];
                list[f - 1] = temp;
                f--;
            }


        }
        return list;
    }
}
