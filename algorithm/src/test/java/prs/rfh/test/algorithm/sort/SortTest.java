package prs.rfh.test.algorithm.sort;

import jdk.nashorn.tools.Shell;
import org.junit.Test;
import prs.rfh.algorithm.sort.*;

/**
 * @author Swift
 * @version $Algorithm: SortTest, v 0.1 2017/1/8 22:23 Swift Exp $$
 */
public class SortTest {

    @Test
    public void testInsertionSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = InsertionSort.insertionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    @Test
    public void testBubbleSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = BubbleSort.BubbleSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void testHeapSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = HeapSort.heapSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void testSelectionSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = SelectionSort.SelectionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void testquickSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = QuickSort.quickSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void testmergeSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = MergeSort.mergeSort(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void testshellSort(){
        int [] array = new int[]{5,4,1,7,9,0,10,9,8,1};
        int [] result = ShellSort.shellSort(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
