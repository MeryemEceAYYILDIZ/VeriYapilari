package diziuygulamalari;

public class Dizi {
    int dizi[];
    int es;
    
    public Dizi(int boyut){
       dizi = new int[boyut];
       es=0;
    } 
    
    public void ekle(int a){
        if(es>=dizi.length){
            System.out.println("Dizi dolu!");
        }else{
            dizi[es]=a;
            es++;
        }
    }
    
    public void siraliEkle(int a){
        if(es>=dizi.length){
            System.out.println("Dizi dolu!");
        }else{
            int i=0;
            for(i=(es-1); i>=0 && dizi[i]>a; i--){
                dizi[i+1]=dizi[i];
            }
            dizi[i+1]=a;
            es++;
        }
    }
    
    public int arama(int a){
        for(int i=0; i<es; i++){
            if(dizi[i]==a){
                return i;
            }
        }
        return -1;
    }
    
    public void guncelle(int eski, int yeni){
        int indis = this.arama(eski);
        if(indis==-1){
            System.out.println("Aranan deger bulunamadi!");
        }else{
            dizi[indis]=yeni;
        }
    }
    
    public void sil(int a){
        int indis = this.arama(a);
        if(indis==-1){
            System.out.println("Aranan deger bulunamadi!");
        }else{
            for(int i=indis; i<=es-2; i++){
                dizi[i]=dizi[i+1];
            }
            dizi[--es]=0;
        }
    }
    
    public void diziyiBosalt(){
        for(int j=0; j<dizi.length; j++){
            for(int i=0; i<=es-2; i++){
                dizi[i]=dizi[i+1];
            }
            dizi[--es]=0;
        }
    }
    
    public void yazdir(){
        System.out.print("[");
        for(int i=0; i<dizi.length; i++){
            System.out.print(dizi[i] + ",");
        }
        System.out.println("]");
    }
}
