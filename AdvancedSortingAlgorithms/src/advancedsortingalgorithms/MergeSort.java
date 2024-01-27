package advancedsortingalgorithms;

public class MergeSort {
    
    public void mergeSort(int[] d, int l, int r){
        if(l<r){
            int m= l+(r-l)/2;
            mergeSort(d, l, m);
            mergeSort(d, m+1, r);
            merge(d, l, m, r);
        }
    }
    
    public void merge(int[] d, int l, int m, int r){
        int i=l;
        int j=m+1;
        int[] temp= new int[r-l+1];
        int k=0;
        while(i<=m && j<=r){
            if(d[i]<d[j]){
                temp[k]=d[i];
                i++;
            }else{
                temp[k]=d[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            temp[k]=d[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=d[j];
            j++;
            k++;
        }
        for(i=0; i<temp.length; i++){
            d[l]=temp[i];
            l++;
        }
    }
}
