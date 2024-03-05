public class InsertionSort {
    /*
    * 插入排序
    * T:O(N2)
    * */
    public int[] insertionSort(int[] list){
        int p=0;
        int f=0;
        for(;p<list.length-1;p++){
            for(f=p+1;f>0;f--){
                while(list[f]>list[f-1]&&f>1){
                    f--;
                }
                    int temp=list[f];
                    list[f]=list[f-1];
                    list[f-1]=temp;

            }
        }
        return list;
    }
}
