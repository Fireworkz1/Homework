public class InsertionSort {
    /*
    * 插入排序
    * T:O(N2)
    * */
    public int[] insertionSort(int[] list){
        int p=0;
        int f=0;
        for(;p<list.length-2;p++){
            for(f=p+1;f>0;f--){
                if(list[f]<list[f-1]){
                    int temp=list[f];
                    list[f]=list[f-1];
                    list[f-1]=temp;
                    f--;
                }else {
                    break;
                }
            }
        }
        return list;
    }
}
