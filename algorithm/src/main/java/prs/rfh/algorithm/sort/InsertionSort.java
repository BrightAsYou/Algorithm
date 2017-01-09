package prs.rfh.algorithm.sort;

/**
 * @author Swift
 * @version $Algorithm: InsertionSort, v 0.1 2017/1/8 20:59 Swift Exp $$
 * @description Insertion Sort
 */
public class InsertionSort {

    /**
     * 算法：
     * @param array
     * @return
     */
    public static int [] insertionSort(int [] array){
        int [] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i]<result[j]){
                    shiftArray(result, j, array[i]);
                    break;
                }
                if (i-1==j){
                    result[i]= array[i];
                }
            }
        }
        return result;
    }

    //将指定数组从index位开始后移，并将value放置到index位
    private static void shiftArray(int[] temp,int index, int value){
        if (temp==null || temp.length-1 <index )throw new IllegalArgumentException("参数非法");
        for (int i = temp.length-2; i >= index; i--) {
            temp[i+1] = temp[i];
        }
        temp[index] = value;
    }
}
