public class Mergesort {
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
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        // find mid
        Node mid=findMid(head);
        // Sort two halves
        Node Righthead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(Righthead);
        // merge them into single ll;
        return merge(newLeft,newRight);

    }
    public Node merge(Node head1, Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;


            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;

        }
        return mergeLL.next;
    }
    public static void main(String[] args) {
    Mergesort ll=new Mergesort();
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.addFirst(2);
        ll.print();

        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();


    }
}
