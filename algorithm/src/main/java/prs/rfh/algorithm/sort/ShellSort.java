package prs.rfh.algorithm.sort;

/**
 * @author Swift
 * @version $Algorithm: ShellSort, v 0.1 2017/2/9 16:41 Swift Exp $$
 */
public class ShellSort {

    public static int[] shellSort(int[] array) {
        sort(array,(array.length+1)/2);
        return array;
    }
    //5 2 4 1 3

    private static void sort(int[] array,int gap) {

        for (int i = 0; i < array.length-gap; i++) {
            if (array[i]>array[i+gap]){
                int temp = array[i];
                array[i] = array[i+gap];
                array[i+gap] = temp;
            }
        }
        if (gap>1){
            sort(array,(gap+1)/2);
        }
    }
}