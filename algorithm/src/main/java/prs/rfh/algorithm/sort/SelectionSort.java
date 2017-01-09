package prs.rfh.algorithm.sort;

/**
 * @author Swift
 * @version $Algorithm: SelectionSort, v 0.1 2017/1/9 10:29 Swift Exp $$
 */
public class SelectionSort {

    public static int[] SelectionSort(int [] array){
        if (array==null || array.length == 0)throw new IllegalArgumentException("参数非法");
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

}
