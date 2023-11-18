package LinkedList;

public class operation {
    public static class node {
        int data;
        node next;

        public node(int d){
            this.data = d;
            this.next = null;
        }
    }

    
    public static node head;
    public static node tail;


    public void addfirst(int data){
        // create new node 
        node newnode = new node(data);
        // if head points null
        if(head==null){
            head = tail = newnode;
            return;
        }
        // new node next points to head  
        newnode.next = head;
        // new node becomes head
        head = newnode;
    }

    public void addlast(int data){
        // create new node 
        node newnode = new node(data);
        // if tail points null
        if(head==null){
            head = tail = newnode;
            return;
        }
        // tail next points to new node 
        tail.next = newnode;
        // new node becomes head
        tail = newnode;
    }

    public int size(){
        node temp = head;
        int i = 0 ;
        while (temp!=null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public int search(int key){
        node temp = head;
        int i = 0 ;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
           temp = temp.next;
           i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        operation ll = new operation();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        
        System.out.println(ll.search(7));


    }


}
