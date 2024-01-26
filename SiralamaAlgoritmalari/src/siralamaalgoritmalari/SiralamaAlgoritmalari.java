package siralamaalgoritmalari;

import java.util.Random;

public class SiralamaAlgoritmalari {

    public static void main(String[] args) {
        int[] dizi = new int[10];
        Random r = new Random();
        for(int i=0; i<dizi.length; i++){
            dizi[i]=r.nextInt(100);
        }
        
        BubbleSort b = new BubbleSort(dizi);
        SelectionSort s = new SelectionSort(dizi);
        InsertionSort i = new InsertionSort(dizi);
        
        /*b.yazdir();
        b.bubbleSort();
        b.yazdir();*/
        
        /*s.yazdir();
        s.selectionSort();
        s.yazdir();*/
        
        i.yazdir();
        i.insertionSort();
        i.yazdir();
        
    }
    
}
