package advancedsortingalgorithms;

public class ShellSort {
    
    public void shellSort(int[] d){
        int i, j, temp, gap;
        for(gap=d.length; gap>0; gap/=2){
            for(i=gap; i<d.length; i+=gap){
                temp=d[i];
                for(j=i; j>0 && d[j-gap]>temp; j-=gap){
                    d[j]=d[j-gap];
                }
                d[j]=temp;
            }
        }
    }
}
