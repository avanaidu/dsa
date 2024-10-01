package datastructures;

public class LinearSearch {
    public static int linearSearch(int[] a, int x){

        for (int i = 0; i<a.length; i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5};
        System.out.println(linearSearch(a, 0));
    }
}
