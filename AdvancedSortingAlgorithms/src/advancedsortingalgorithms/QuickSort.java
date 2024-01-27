package advancedsortingalgorithms;

public class QuickSort{
    public void quickSort(int[] d, int l, int r){
        if(l<r){
            int p=partition(d, l, r);
            quickSort(d, l, p-1);
            quickSort(d, p+1, r);
        }
    }
    
    public int partition(int[] d, int l, int r){
        int pi=r;
        int i=l;
        int j=r-1;
        do{
            while(d[i]<d[pi] && i<r){
                i++;
            }
            while(d[j]>d[pi] && j>0){
                j--;
            }
            if(i<j){
                swap(d,i,j);
            }
        }while(i<j);
        swap(d,i,pi);
        return i;
    }
    
    public void swap(int[] d, int i, int j){
        int temp=d[i];
        d[i]=d[j];
        d[j]=temp;
    }
}
