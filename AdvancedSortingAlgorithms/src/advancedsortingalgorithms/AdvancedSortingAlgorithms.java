package advancedsortingalgorithms;

import java.util.Arrays;
import java.util.Random;

public class AdvancedSortingAlgorithms {

    public static void main(String[] args) {
        int[] d = new int[10];
        Random r = new Random();
        ShellSort s = new ShellSort();
        MergeSort m = new MergeSort();
        QuickSort q = new QuickSort();
        RadixSort ra = new RadixSort();
        
        for(int i=0; i<10; i++){
            d[i]=r.nextInt(999);
        }
        
        System.out.println(Arrays.toString(d));
        //s.shellSort(d);
        //m.mergeSort(d, 0, d.length-1);
        //q.quickSort(d, 0, d.length-1);
        ra.radixSort(d);
        System.out.println(Arrays.toString(d));
    }
}
