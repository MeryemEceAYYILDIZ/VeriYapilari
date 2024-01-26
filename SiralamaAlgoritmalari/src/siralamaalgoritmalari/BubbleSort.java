package siralamaalgoritmalari;

import java.util.Arrays;

public class BubbleSort {
    int dizi[];
    
    public BubbleSort(int dizi[]){
        this.dizi = dizi;
    }
    
    public void bubbleSort(){
        int temp;
        for(int i=0; i<dizi.length; i++){
            for(int j=0; j<dizi.length-i-1; j++){
                if(dizi[j+1]<dizi[j]){
                    temp=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=temp;
                }
            }
        }
    }
    
    public void yazdir(){
        System.out.println(Arrays.toString(dizi));
    }
}
