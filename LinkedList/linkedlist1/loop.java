package LinkedList.linkedlist1;

public class loop {
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


    public static boolean cycle(node head){
        node slow = head;
        node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
             if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removecycle(node head){
        // detect cycle
        node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return;
            }
        }
        // now slow is head again 
        slow = head;
        node prev = null;
        while(slow!=fast){
            prev= fast;
            slow = slow.next;
            fast = fast.next;
        }

        // now prev is last node
        prev.next = null;
    }

  
    public static void main(String[] args) {
        
    }



}
