import java.util.LinkedList;
import java.util.List;

public class SelectSort {
    /*
    * 选择排序
    * O(n2)
    * */
    public List<Integer> selectSort(List<Integer> list) {
            for (int p = 0; p < list.size() - 1; p++) {
                int minIndex = p;
                for (int f = p + 1; f < list.size(); f++) {
                    if (list.get(f) < list.get(minIndex)) {
                        minIndex = f;
                    }
                }
                if (minIndex != p) {
                    int temp = list.get(p);
                    list.set(p, list.get(minIndex));
                    list.set(minIndex, temp);
                }
            }
            return list;
        }

}
