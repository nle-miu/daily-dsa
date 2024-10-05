package technique.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] a){
        for(int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i - 1;
            while(j > -1 && temp < a[j]){
                a[j+1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,6,5,1,3};
        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
