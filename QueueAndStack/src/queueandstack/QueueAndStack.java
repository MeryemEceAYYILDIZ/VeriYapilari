package queueandstack;

public class QueueAndStack {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        Stack s = new Stack(5);
        System.out.println("KUYRUK=");
        q.push(8);
        q.push(3);
        q.push(12);
        q.push(22);
        q.push(1);
        q.yazdir();
        System.out.println(q.pop() + " cikarildi!");
        q.yazdir();
        System.out.println(q.pop() + " cikarildi!");
        q.yazdir();
        System.out.println(q.pop() + " cikarildi!");
        q.yazdir();
        System.out.println("YIGIT=");
        s.push(8);
        s.push(3);
        s.push(12);
        s.push(22);
        s.push(1);
        s.yazdir();
        System.out.println(s.pop() + " cikarildi!");
        s.yazdir();
        System.out.println(s.pop() + " cikarildi!");
        s.yazdir();
        System.out.println(s.pop() + " cikarildi!");
        s.yazdir();
    }
    
}
