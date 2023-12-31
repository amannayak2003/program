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
    public static int recursive(int key){
        return recursivesearch(head , key);
    }
    

    public static int recursivesearch(node head2, int key) {
        if(head2 == null){
            return -1;
        }

        if(head2.data==key){
            return 0;
        }
        int idx = recursivesearch(head2.next, key);

        if(idx==-1){
            return -1;
        }

        return idx+1;
    }


    public void reverse(){
        node prev = null;
        node curr = tail = head;
        node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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

    public void nthfromlast(int n){
        node temp = head;
        int i = 0 ;
        while (temp!=null) {
            i++;
            temp = temp.next;
        }

        if(n==i){
            head = head.next;
            return ;
        }
        node prev = head;
        int j = 1;
        while(j<i-n){
            prev = prev.next;
            j++;
        }
        prev.next = prev.next.next;
    }


    public node midnode(node head){

        node slow = head;
        node fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean palidrome(){
        // find mid
        node mid = midnode(head);
        // reverse the half list
        node curr = mid;
        node prev = null;
        node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        node right = prev;
        node left = head;

        // check the left list with right
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            right =right.next;
            left = left.next;
        }

        return true;

    }

    public static void main(String[] args) {
        operation ll = new operation();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        ll.addfirst(1);
        

        System.out.println(ll.palidrome());

    }


}
