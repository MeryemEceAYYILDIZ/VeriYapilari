package siralamaalgoritmalari;

import java.util.Arrays;

public class SelectionSort {
    int dizi[];
    
    public SelectionSort(int dizi[]){
        this.dizi = dizi;
    }
    
    public void selectionSort(){
        int ek;
        int temp;
        for(int i=0; i<dizi.length; i++){
            ek=i;
            for(int j=i+1; j<dizi.length; j++){
                if(dizi[j]<dizi[ek]){
                    ek=j;
                }
            }
            temp=dizi[ek];
            dizi[ek]=dizi[i];
            dizi[i]=temp;
        }
    }
    
    public void yazdir(){
        System.out.println(Arrays.toString(dizi));
    }
}
