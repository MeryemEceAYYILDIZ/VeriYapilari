package queueandstack;

import java.util.Arrays;

public class Queue {
    int dizi[];
    int es;
    
    public Queue(int boyut){
        dizi = new int[boyut];
        es=0;
    }
    
    public void push(int a){
        if(dizi.length==es){
            System.out.println("Kuyruk dolu!");
        }else{
            dizi[es]=a;
            es++;
        }
    }
    
    public int pop(){
        int r = dizi[0];
        for(int i=0; i<es-1; i++){
            dizi[i]=dizi[i+1];
        }
        dizi[--es]=0;
        return r;
    }
    
    public void yazdir(){
        System.out.println(Arrays.toString(dizi));
    }
}
