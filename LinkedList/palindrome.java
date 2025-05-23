public class palindrome {
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
    public void reverse(Node mid){
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
    public Node findMid(Node head){
        Node slow= head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // Calculate mid
        Node mid=findMid(head);
        // Reverse right half;
        Node prev=null;
        Node curr=mid;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;

        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data==right.data){
                left=left.next;
                right=right.next;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
    palindrome ll=new palindrome();
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.addLast(2);
        ll.print();

        ll.addLast(2);
        ll.print();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.print();
        System.out.println(ll.checkPalindrome());
       


        
    }
}

    
