package linkedlist;

public class BagliListe {
    Node head;
    int es;
    
    public BagliListe(){
        head=null;
        es=0;
    }
    
    public void basaEkle(Node n){
        if(head==null){
            head=n;
        }else{
            n.next=head;
            head=n;
        }
    }
    
    public void sonaEkle(Node n){
        if(head==null){
            head=n;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    
    public void siraliEkle(Node n){
        if(head==null){
            head=n;
        }else if(head.data>n.data){
            n.next=head;
            head=n;
        }else{
            Node temp = head;
            while(temp.next!=null && temp.next.data<n.data){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    
    public void silme(int d){
        if(head==null){
            System.out.println("Liste bos!");
        }else if(head.data==d){ //baştan silme
            head=head.next;
        }else{
            Node temp = head;
            while(temp.next!=null){
                if(temp.next.data==d){
                    if(temp.next.next==null){
                        temp.next=null;
                        break;
                    }else{
                        temp.next=temp.next.next;
                        break;
                    }
                }
                temp=temp.next;
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
