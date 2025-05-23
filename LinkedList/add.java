

public class add {
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
        Node temp=head;
        int i=0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        int val=temp.next.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
        
    }
    public int removeMid(int idx){
        if(size-idx-1==0){
            return removeFirst();
        }
        int i=0;
        Node prev=head;
        while(i<size-idx-1){
            prev=prev.next;
            i++;

        }
        Node curr=prev.next;
        Node nextnode=curr.next;
        prev.next=nextnode;
        return curr.data;
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

    public static void main(String[] args) {
        add ll=new add();
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
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.removeMid(1);
        ll.print();






        
    }

    
}
