public class HeapSort {
    /*
     * 堆排序
     * T:O(nlogn)
     * 堆总是一颗完全二叉树
     * */
    public void heapSort(int[] list) {
        createHeap(list);
        sortHeap(list);
    }

    private void createHeap(int[] list) {
        //将一个数组调整为堆
//        for (int i = 0; i < list.length; i++) {
//            //构造大根堆,第p个数为list[p-1]
//            int p = i;
//            while (p > 0 && list[p] > list[(p - 1) / 2]) {
//                int temp = list[p];
//                list[p] = list[(p - 1) / 2];
//                list[(p - 1) / 2] = temp;
//                p = (p - 1) / 2;
//            }
//        }


    }

    private void sortHeap(int[] list) {
            //删除大根堆的堆顶，将其加到当前堆尾的位置

    }
}
