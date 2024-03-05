public class ShellSort {
    /*
    * 希尔排序
    * T:O(n1.3)
    * */

    public void shellSort(int[] list,int gap){
        for(int i=0;i<gap;i++){
            //对每间隔gap的部分使用插排
            int j;
            for(int p=i;p<list.length-gap;p+=gap){
                j=p+gap;
                while(j-gap>=0&&list[j]<list[j-gap]){
                    int temp=list[j-gap];
                    list[j-gap]=list[j];
                    list[j]=temp;
                    j-=gap;
                }
            }
        }
        if(gap!=1){
            shellSort(list,gap/2);
        }
    }
}
