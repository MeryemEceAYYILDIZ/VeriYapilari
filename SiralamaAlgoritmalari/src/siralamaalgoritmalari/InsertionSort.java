package siralamaalgoritmalari;

import java.util.Arrays;

public class InsertionSort {
    int dizi[];
    
    public InsertionSort(int dizi[]){
        this.dizi = dizi;
    }
    
    public void insertionSort(){
        int temp, j, i;
        for(i=0; i<dizi.length; i++){
            temp=dizi[i];
            for(j=i; j>0 && dizi[j-1]>temp; j--){
                
                    dizi[j]=dizi[j-1];
                
            }
            dizi[j]=temp;
        }
    }
    
    public void yazdir(){
        System.out.println(Arrays.toString(dizi));
    }
}
