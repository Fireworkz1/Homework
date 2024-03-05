public class QuickSort {
    /*
    * 快速排序
    * */
    public int[] quicksort(int[] list,int l,int r){
        //底层递归返回
        if(l>=r)return list;
        //记录初始位置
        int flagPos=l;
        int lPos=l;
        int rPos=r;
        while(l<r){
            while(list[r]>list[flagPos]&&l<r){
                r--;
            }
            while(list[l]<=list[flagPos]&&l<r){
                l++;
            }
            //双侧互换
            int temp=list[l];
            list[l]=list[r];
            list[r]=temp;
        }

        //交换flag
        int temp=list[flagPos];
        list[flagPos]=list[l];
        list[l]=temp;
        //递归
        list=quicksort(list,lPos,l-1);
        list=quicksort(list,r+1,rPos);

        return list;
    }


}
