package LinkedList;

public class linkedlist {
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

        public void printt(){
            if(head==null){
                System.out.println("linkedlist is empty");
            }
            else{
                node temp = head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
            }
        }

        public void addmiddle(int data,int idx){
            node newnode = new node(data);
            node temp = head;
            int i = 0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            
        }
       public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.addfirst(1);
            ll.addfirst(2);
            ll.addfirst(3);
            ll.addfirst(4);
            ll.addfirst(5);

            ll.addmiddle(6, 2);
            
            ll.printt();
            
       }
}
