package prs.rfh.algorithm.sort;

/**
 * @author Swift
 * @version $Algorithm: QuickSort, v 0.1 2017/1/9 16:54 Swift Exp $$
 */
public class QuickSort {

    /**
     * 选取数组的begin位元素为标志位，并通过与数组的其他元素交换位置来使该元素以前的
     * 元素都不比他本身大，以后的元素都不比他小。然后递归的排序其以前和以后的部分
     * @param array
     * @param begin
     * @param end
     * @return
     */
    private static int[] quickSort(int[] array, int begin, int end) {

        int index = begin;
        int i = end,j=begin;
        //使该元素以前的元素都不比他本身大，以后的元素都不比他小
        while(i>j) {
            for (;i > index; i--) {
                if(array[index]>array[i]){
                    int temp = array[index];
                    array[index] = array[i];
                    array[i] = temp;
                    index = i;
                }
            }
            for (; j < index; j++) {
                if(array[index]<array[j]){
                    int temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                    index = j;
                }
            }
        }
        //分两部分递归调用
        if (index-begin>2) quickSort(array, begin, index-1);
        if (end - index + 1 >2) quickSort(array, index + 1, end);
        return array;
    }

    public static int[] quickSort(int[] array) {
        if (array==null)
            throw new IllegalArgumentException("参数非法");
        return quickSort(array, 0, array.length-1);
    }
}
