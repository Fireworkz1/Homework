import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUtils {
    public static List<Integer> intArrayToList(int[] array){
        return Arrays
                //to IntStream
                .stream(array)
                //to Stream<Integer>
                .boxed()
                //to List<Integer>
                .collect(Collectors.toList());
    }

    public static int[] integerListToArray(List<Integer> list){
        return list
                //to Stream<Integer>
                .stream()
                //to IntStream
                .mapToInt(Integer::intValue)
                //to int[]
                .toArray();
    }
}
