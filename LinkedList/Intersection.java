public class Intersection {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        // create new node
        Node newNode= new Node(data);
        size++;
        // Base case when linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        // newnode's next is head
        newNode.next=head;
        // now new node is the new head
        head=newNode;
    }
    public void addLast(int data){
        // create new node
        Node newNode= new Node(data);
        size++;
        // Base case when linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        // tails next is newnode
        tail.next=newNode;
        // now new node is the new til
        tail=newNode;
    }
    public static void main(String[] args) {
        Intersection ll=new Intersection();
        Intersection l1=new Intersection();

        
        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addLast(3);
        ll.print();
        l1.addFirst(4);
        l2.addFirst(6)
    }
}
