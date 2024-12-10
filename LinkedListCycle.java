class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListCycle {
    Node head;

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        
        System.out.println("null");
    }

    //create cycle in this linked list
    public void createCycle(int pos){
        int count=1;
        Node temp=head;
        Node cyclenode=null;

        while(temp.next!=null){
            if(count==pos){
                cyclenode=temp;
            }
            temp=temp.next;
            count++;
        }
        if(cyclenode!=null){
            temp.next=cyclenode;
        }
    }
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle lc=new LinkedListCycle();
        lc.insert(1);
        lc.insert(2);
        lc.insert(3);
        lc.insert(4);

        lc.display();

        boolean ans=lc.isCycle();
        System.out.println(ans);

        lc.createCycle(2);
        System.out.println(lc.isCycle());
    }
}
