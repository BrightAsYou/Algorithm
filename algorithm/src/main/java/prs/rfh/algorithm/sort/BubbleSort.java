package prs.rfh.algorithm.sort;

/**
 * @author Swift
 * @version $Algorithm: BubbleSort, v 0.1 2017/1/9 9:48 Swift Exp $$
 */
public class BubbleSort {

    public static int[] BubbleSort(int [] array){
        if (array==null || array.length == 0)throw new IllegalArgumentException("参数非法");
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
