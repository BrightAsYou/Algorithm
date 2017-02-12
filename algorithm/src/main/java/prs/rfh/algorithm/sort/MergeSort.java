package prs.rfh.algorithm.sort;

/**
 * @author Swift
 * @version $Algorithm: MergeSort, v 0.1 2017/2/9 10:13 Swift Exp $$
 * @function MergeSort
 */
public class MergeSort {

    public static int[] mergeSort(int[] array){
        if(array == null || array.length <1)throw new IllegalArgumentException();
        mergeSort0(0,array.length-1,array);
        return array;
    }

    private static void mergeSort0(int begin,int end ,int [] array){
        if (array==null || array.length <1
                || begin <0 || begin>array.length-1
                || end<0 || end > array.length-1)throw new IllegalArgumentException();
        int mid = (begin+end)/2;
        if (begin<end) {
            mergeSort0(begin, mid, array);
            mergeSort0(mid+1, end, array);
            merge(begin, mid, end, array);
        }

    }

    private static void merge(int begin,int mid,int end ,int [] array){
        int [] tempArray = new int[end-begin+1];
        int index = 0;
        int i = 0 , j= 0 ;
        while( begin+i <=mid && mid+1+j <=end){//两个子数组都没有越界的情况下
            if (array[begin+i]<=array[mid+1+j]){
                tempArray[index++] = array[begin+i];
                i++;
            }else{
                tempArray[index++] = array[mid+1+j];
                j++;
            }
        }
        while(begin+i <=mid){
            tempArray[index++] = array[begin+i];
            i++;
        }
        while(mid+1+j <=end){
            tempArray[index++] = array[mid+1+j];
            j++;
        }

        for (int k = 0; k <tempArray.length ; k++) {
            array[begin+k] = tempArray[k];
        }
    }

}
