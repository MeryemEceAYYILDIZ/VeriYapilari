package queueandstack;

import java.util.Arrays;

public class Stack {
    int dizi[];
    int es;
    
    public Stack(int boyut){
        dizi = new int[boyut];
        es=0;
    }
    
    public void push(int a){
        if(dizi.length==es){
            System.out.println("Yigit dolu!");
        }else{
            dizi[es]=a;
            es++;
        }
    }
    
    public int pop(){
        int r = dizi[es-1];
        dizi[es-1]=0;
        es--;
        return r;
    }
    
    public void yazdir(){
        System.out.println(Arrays.toString(dizi));
    }
}
