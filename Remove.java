class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    void add(int x){
     Node fresh=new Node();
     fresh.data=x;
     fresh.next=null;
     if(head==null)
     {
head=fresh;
     }
     
     else{
        Node t=head;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=fresh;
     }
    }

    void show(){
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+".");
            t=t.next;
        }
        System.out.println();
    }
    void del(int m){
        Node x=head;
        Node y=head.next;
        while(y.data!=m)
        {
            x=x.next;
            y=y.next;
        }
        x.next=y.next;
    }
    void remove(int y){
        Node t=head;
        while(t!=null)
        {
            if(t.data>y)
            {
                del(t.data);
             //   return;
            }
            t=t.next;
        }
    }
}
public class Remove {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
      for(int i=0;i<50;i++)
      ll.add(i+1);
      ll.show();
      ll.remove(25);
      ll.show();
    }
}
