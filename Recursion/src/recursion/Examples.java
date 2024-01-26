package recursion;

public class Examples {
    
    public void increment(int sayi){
        System.out.print(sayi + " ");
        if(sayi<10){
            increment(sayi+1);
        }
    }
    
    public int fibonacci(int sayi){
        if(sayi==1){
            return 0;
        }
        if(sayi<4){
            return 1;
        }
        return fibonacci(sayi-1)+fibonacci(sayi-2);
    }
    
    public int tersFaktoriyel(int sayi){
        if(sayi==1){
            return 1;
        }
        return sayi*tersFaktoriyel(sayi-1);
    }
    
    public int faktoriyel(int t, int sayi){
        if(t==sayi){
            return sayi;
        }
        return t*faktoriyel(t+1,sayi);
    }

}
