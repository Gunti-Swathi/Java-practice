public class Doublyll {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
        newNode.next=head;
        // now new node is the new head
        head.prev=newNode;
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

        // now new node is the new head
    // tails next is newnode
        tail.next=newNode;
        newNode.prev=tail;
        // now new node is the new til
        tail=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;

        
        size--;
        return val;
        
    }
    public void reverse(){
        // O(N) T.C
        Node prev=null;
        Node curr=tail=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            curr.prev=nextNode;
            prev=curr;
            curr=nextNode;

        }
        head=prev;
       
       
        
        
    }

    public void print(){
        if(head==null){
            System.out.println("linkedlist is empty");


        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Doublyll ll1=new Doublyll();
        ll1.addFirst(4);
        ll1.addFirst(4);

        ll1.addFirst(4);

        ll1.addFirst(4);
        ll1.addLast(6);
        ll1.print();
        System.out.println(ll1.size);
        // ll1.removeFirst();
        // ll1.print();

        // ll1.removeLast();
        // ll1.print();
        ll1.reverse();
        ll1.print();






    }
    
}
