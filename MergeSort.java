package datastructures;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{11, 2, 13, 24, 5, 17};

        a = mergeSort(a);
        for(int z:a) {
            System.out.print(z+" ");
        }
    }

    private static int[] mergeSort(int[] a) {

        if (a.length == 1){
            return a;
        }
        int mid = a.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length+right.length];
        int i=0; int j=0; int k=0;

        while(i< left.length && j< right.length){
            if(left[i] < right[j]){
                mergedArray[k++] = left[i++];
            }
            else {
                mergedArray[k++] = right[j++];
            }
        }
        while(i< left.length){
            mergedArray[k++] = left[i++];
        }
        while(j< right.length){
            mergedArray[k++] = right[j++];
        }

        return mergedArray;
    }


}
