package datastructures;

public class BinarySearch {

    public static int binarySearch(int[] a, int x, int low, int high){

        int mid = (high+low)/2;
        if(high >=low){
            if(a[mid] == x){
                return mid;
            }

            if(a[mid] > x){
                return binarySearch(a, x, low, mid-1);
            }

            return binarySearch(a, x, mid+1, high);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(binarySearch(a, 3, 0, a.length -1));
    }

}
