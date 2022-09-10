package seminar3.heapSort;

public class heapSort {

    static void heapSort(int[] array) {
        int length = array.length;

        for(int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }



    }

    static void heapify(int[] array, int length, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int rigth = 2 * i + 2;

        if(left < length && array[left] > array[largest]) {
            largest = left;
        }

        if(rigth < length && array[rigth] > array[largest]) {
            largest = rigth;
        }

        if(largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;


            heapify(array, length, largest);
        }
    }

        static void printArray ( int[] arr){
            for (int item : arr) {
                System.out.print(item + " ");
            }
        }

        static boolean checkArray ( int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }

        public static void main (String[]args){
            int[] array = new int[]{7, 3, 86, 0, 43, 2, 76, 9, 54, 2, 5, 90, 5, 34};

            heapSort(array);

            printArray(array);
            System.out.println(checkArray(array));
        }
    }
