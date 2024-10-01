package datastructures;

public class BinarySearchiteration {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(binarySearch(a, 5, 0, a.length -1));
    }

    private static int binarySearch(int[] a, int x, int low, int high) {

        while(high>=low){
            int mid = (low+high)/2;
            if(a[mid] == x){
                return x;
            }
            if(x>mid){
                low = mid+1;
            }
            if(x<mid){
                high = mid-1;
            }
        }


        return -1;
    }
}
