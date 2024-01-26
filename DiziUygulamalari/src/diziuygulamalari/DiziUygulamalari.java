package diziuygulamalari;

public class DiziUygulamalari {

    public static void main(String[] args) {
        Dizi dizi = new Dizi(10);
        dizi.ekle(8);
        dizi.ekle(3);
        dizi.ekle(5);
        dizi.ekle(25);
        dizi.ekle(12);
        dizi.ekle(10);
        dizi.ekle(2);
        dizi.ekle(13);
        dizi.ekle(27);
        dizi.ekle(1);
        System.out.println("Ekleme islemi yapildi!");
        dizi.yazdir();
        dizi.sil(25);
        System.out.println("25 silindi!");
        dizi.yazdir();
        System.out.println("30 eklendi!");
        dizi.ekle(30);
        dizi.yazdir();
        dizi.diziyiBosalt();
        System.out.println("Dizi bosaltildi!");
        dizi.yazdir();
        dizi.siraliEkle(8);
        dizi.siraliEkle(3);
        dizi.siraliEkle(5);
        dizi.siraliEkle(25);
        dizi.siraliEkle(12);
        dizi.siraliEkle(10);
        dizi.siraliEkle(2);
        dizi.siraliEkle(13);
        dizi.siraliEkle(27);
        dizi.siraliEkle(1);
        System.out.println("Sirali ekleme islemi yapildi!");
        dizi.yazdir();
    }
    
}
