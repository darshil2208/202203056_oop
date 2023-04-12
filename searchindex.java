class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    public void add(int x)
    {
   Node a=new Node();
   a.data=x;
   a.next=null;
   if(head==null)
   {
    head=a;
   }
   else{
    Node t=head;
    while(t.next!=null)
    {
        t=t.next;
    }
    t.next=a;
   }
   }
   public void show(){
    Node t=head;
    while(t!=null)
    {System.out.print(t.data+" ");
        t=t.next;
    }System.out.println();
   }
   public int serind(int x)
   {
    Node t=head;int i=0;
    while(t.next!=null)
    {i++;
        if(t.data==x)
        {
         return i;
        }t=t.next;
    }
   return 0;}
}
public class searchindex {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.add(3);
        ll.add(8);
        ll.add(2);
        ll.add(3);
ll.show();
int t=ll.serind(7);
System.out.println("7 is at index "+t);


    }
}
