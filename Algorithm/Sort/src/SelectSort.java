import java.util.LinkedList;
import java.util.List;

public class SelectSort {
    /*
    * 选择排序
    * O(n2)
    * */
    public List<Integer> selectSort(List<Integer> list) {
        int p;
        int f;
        int fmin;
        int fmax;
        int fminPos=0;
        int fmaxPos=0;
        for(p=0;p<list.size()/2;p++){
            fmin=Integer.MAX_VALUE;
            fmax=Integer.MIN_VALUE;
            for(f=p;f<list.size()-p;f++){
                if(fmin>list.get(f)){
                    fmin=list.get(f);
                    fminPos=f;
                }
                if(fmax<list.get(f)){
                    fmax=list.get(f);
                    fmaxPos=f;
                }
            }
            list.set(fminPos,list.get(p));
            list.set(fmaxPos,list.get(list.size()-p-1));
            list.set(p,fmin);
            list.set(list.size()-p-1,fmax);

        }
        return list;
    }

}
