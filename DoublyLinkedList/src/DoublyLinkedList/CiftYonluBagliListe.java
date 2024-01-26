package DoublyLinkedList;

public class CiftYonluBagliListe {
    Node head;
    Node tail;
    int es;
    
    public CiftYonluBagliListe(){
        head=null;
        tail=null;
        es=0;
    }
    
    public void basaEkle(Node n){
        if(head==null){
            tail=n;
        }else{
            n.next=head;
            head.prev=n;
        }
        head=n;
    }
    
    public void sonaEkle(Node n){
        if(head==null){
            head=n;
        }else{
            n.prev=tail;
            tail.next=n;
        }
        tail=n;
    }
    
    public void bastanSil(){
        if(head==null){
            System.out.println("Liste bos!");
        }else{
            if(head==tail){
                head=null;
                tail=null;
            }else{
                head=head.next;
                head.prev=null;
            }
        }
    }
    
    public void sondanSil(){
        if(head==null){
            System.out.println("Liste bos!");
        }else{
            if(head==tail){
                head=null;
                tail=null;
            }else{
                tail=tail.prev;
                tail.next=null;
            }
        }
    }
    
    public void yazdir(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
