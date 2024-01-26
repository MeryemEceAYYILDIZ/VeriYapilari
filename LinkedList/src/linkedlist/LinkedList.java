package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        BagliListe bl = new BagliListe();
        Node n1 = new Node(5);
        Node n2 = new Node(8);
        Node n3 = new Node(2);
        Node n4 = new Node(25);
        Node n5 = new Node(44);
        Node n6 = new Node(11);
        Node n7 = new Node(3);
        Node n8 = new Node(17);
        Node n9 = new Node(1);
        Node n10 = new Node(20);
        bl.basaEkle(n1);
        bl.yazdir();
        bl.basaEkle(n2);
        bl.yazdir();
        bl.siraliEkle(n3);
        bl.yazdir();
        bl.sonaEkle(n4);
        bl.yazdir();
        bl.silme(2);
        bl.yazdir();
    }
    
}
