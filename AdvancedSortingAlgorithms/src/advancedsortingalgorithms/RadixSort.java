package advancedsortingalgorithms;

public class RadixSort {
    
    public void radixSort(int[] d){
        int max=findMax(d);
        for(int e=1; (max/e)>0 ; e*=10){
            countSort(d, e);
        }
    }
    
    public void countSort(int[] d, int e){
        int[] temp= new int[d.length];
        int[] c = new int[10];
        int i;
        for(i=0; i<d.length; i++){
            c[(d[i]/e)%10]++;
        }
        for(i=1; i<d.length; i++){
            c[i]+=c[i-1];
        }
        for(i=d.length-1; i>=0; i--){
            temp[--c[(d[i]/e)%10]]=d[i];
        }
        for(i=0; i<d.length; i++){
            d[i]=temp[i];
        }
    }
    
    public int findMax(int[] d){
        int max=d[0];
        for(int i=1; i<d.length; i++){
            if(d[i]>max){
                max=d[i];
            }
        }
        return max;
    }
}
