public class Reverse {
    public class Node{
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
    public void addMid(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
       Node newNode=new Node(data);
       size++;
       int i=0;
       Node temp=head;
       while(i<idx-1){
        temp=temp.next;
        i++;
       }
       newNode.next=temp.next;
       temp.next=newNode;
       
    }
    public void print(){
        if(head==null){
            System.out.println("linkedlist is empty");


        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        // O(N) T.C
        Node prev=null;
        Node curr=tail=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        }
        head=prev;
       
       
        
        
    }
    public static void main(String[] args) {
    Reverse ll=new Reverse();
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();
        ll.addMid(1, 15);
        ll.print();
        ll.reverse();
        ll.print();

    }
}
