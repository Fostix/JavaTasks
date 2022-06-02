package seminar2HomeWork.mergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class mergeSortClass {



    public static void Check(int[] arr) {
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("not sorted");
                break;
            }
        }
        System.out.println("good sorted");
    }

    public static void MergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        MergeSort(left);
        MergeSort(right);
        Merge(array, left, right);
    }


    public static void Merge(int[] targetArray, int[] firstArray, int[] secondArray) {
        int firstArrayMinIndex = 0;
        int secondArrayMinIndex = 0;

        int targetArrayMinIndex = 0;

        while (firstArrayMinIndex < firstArray.length && secondArrayMinIndex < secondArray.length) {
            if (firstArray[firstArrayMinIndex] <= secondArray[secondArrayMinIndex]) {
                targetArray[targetArrayMinIndex] = firstArray[firstArrayMinIndex];
                firstArrayMinIndex++;
            } else {
                targetArray[targetArrayMinIndex] = secondArray[secondArrayMinIndex];
                secondArrayMinIndex++;
            }
            targetArrayMinIndex++;
        }
        while (firstArrayMinIndex < firstArray.length) {
            targetArray[targetArrayMinIndex] = firstArray[firstArrayMinIndex];
            firstArrayMinIndex++;
            targetArrayMinIndex++;
        }
        while (secondArrayMinIndex < firstArray.length) {
            targetArray[targetArrayMinIndex] = firstArray[secondArrayMinIndex];
            secondArrayMinIndex++;
            targetArrayMinIndex++;
        }
    }


    public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){

        int i=0,l=0,r = 0;
        //The while loops check the conditions for merging
        while(l<left_size && r<right_size){

            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<left_size){
            arr[i++] = left_arr[l++];
        }
        while(r<right_size){
            arr[i++] = right_arr[r++];
        }
    }

    public static void mergeSort(int [] arr, int len){
        if (len < 2){return;}

        int mid = len / 2;
        int [] left_arr = new int[mid];
        int [] right_arr = new int[len-mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for(int i = 0;i<len;++i){
            if(i<mid){
                left_arr[i] = arr[i];
            }
            else{
                right_arr[k] = arr[i];
                k = k+1;
            }
        }
        // Recursively calling the function to divide the subarrays further
        mergeSort(left_arr,mid);
        mergeSort(right_arr,len-mid);
        // Calling the merge method on each subdivision
        merge(left_arr,right_arr,arr,mid,len-mid);
    }


    public static void BubbleSort(int[] array) {
        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {

        int[] array = new int[1_000_000];
        //int[] array = random.ints(10, 0, 100).toArray();

        //Arrays.fill(array, new Random().nextInt());
        int length = array.length;
        for (int i = 0; i < length; i++) {
            //array[i] = (int) (Math.random() * 10);
            array[i] = new Random().nextInt(1_000_000);
        }



        long seed = System.currentTimeMillis();
        mergeSort(array, array.length);
        System.out.println(System.currentTimeMillis() - seed);
        Check(array);

//        for (int item : array) {
//            System.out.print(item + " ");
//        }

        // BubbleSort(array);
        //Check(array);

//        for (int item:
//             array) {
//            System.out.print(item + " ");
//        }
    }
}
