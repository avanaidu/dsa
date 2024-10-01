package datastructures;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{11,2,13,24,15};

        for (int i =0; i< a.length; i++){//a.lenth-1 as no point in comapring same element
            int temp = i;
            for (int j=i; j< a.length; j++){//j=i+1 will be good idea as no point in comparing same element

                if(a[j] < a[temp]){
                    temp = j;
                    //identifying the smallest index
                }


            }
            int arrayTemp = a[temp];//smallest number
            a[temp] = a[i];
            a[i] = arrayTemp;//swapping such that smallest number will be placed at starting position and so on

        }

        for (int x = 0; x< a.length; x++){
            System.out.println(a[x]);
        }
    }
}
