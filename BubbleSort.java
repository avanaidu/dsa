package datastructures;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{11,2,13,24,15};

        for (int i =0; i< a.length; i++){
            for (int j=1; j< a.length -i; j++){
                int temp;
                if(a[j-1] > a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int x = 0; x< a.length; x++){
            System.out.println(a[x]);
        }
    }
}
