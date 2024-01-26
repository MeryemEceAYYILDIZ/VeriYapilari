package DoublyLinkedList;

public class DoublyLinkedList {
    
    public static void main(String[] args) {
        CiftYonluBagliListe bl = new CiftYonluBagliListe();
        Node n1 = new Node(5);
        Node n2 = new Node(8);
        Node n3 = new Node(12);
        Node n4 = new Node(40);
        Node n5 = new Node(30);
        bl.basaEkle(n1);
        bl.yazdir();
        bl.basaEkle(n2);
        bl.yazdir();
        bl.sonaEkle(n3);
        bl.yazdir();
        bl.sonaEkle(n4);
        bl.yazdir();
        bl.basaEkle(n5);
        bl.yazdir();
        bl.bastanSil();
        bl.yazdir();
        bl.sondanSil();
        bl.yazdir();
    }
}
