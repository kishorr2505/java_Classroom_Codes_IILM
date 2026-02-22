// package LinkedList;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LL {
    // Node head = null;
    public Node insertNodeAtEnd(Node head,int data){
        Node newNode = new Node(data);
        
        if(head ==null){
            head = newNode;
            return head;
        }

        Node currNode = head;
        while(currNode.next !=null){
            currNode = currNode.next;

        }
        currNode.next = newNode;
        
        return head; 
    }

    public Node insertAtStart(Node head,int data){
        Node newNode = new Node(data);

        newNode.next = head;
        return newNode;
    }

    public Node insertAtPosition(Node head,int data, int position){
        Node currNode = head;
        Node newNode = new Node(data);
        int count =1;

        if(position ==1){
            newNode.next = head;
            head = newNode;
            return head;
        }

        while(count<position-1 && currNode!=null){
            currNode = currNode.next;
            count++;
        }

        if(currNode ==null){
            System.out.println("Position "+position+" is out of bound");
        }else{
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        
        return head;
    }

    public void printList(Node head){
        if(head==null){
            System.out.println("Empty List");
        }else{
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.println("null");
        }
    }

    public void findMiddleOftheList(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node: "+slow.data);

    }

    public Node deleteFirst(Node head){
        if(head==null){
            System.out.println("Empty List, No element to delete");
            return null;
        }
        return head.next;
    }

    public int deleteLast(Node head){
        Node currNode = head;
        
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        int data = currNode.next.data;
        currNode.next = null;
        return data;
        
    }
    public static void main(String[] args) {
        LL list = new LL();
        Node head = null;
        head = list.insertNodeAtEnd(head,10);
        head = list.insertNodeAtEnd(head,20);
        head = list.insertNodeAtEnd(head,30);
        head = list.insertNodeAtEnd(head,40);

        // list.printList(head);
        head = list.insertAtStart(head, 1);
        head = list.insertAtPosition(head, 20, 2);

        // list.printList(head);
        head = list.insertAtPosition(head, 50, 6);

        // list.printList(head);
        // head = list.deleteFirst(head);
        list.printList(head);
        int data= list.deleteLast(head);
        System.out.println(data);
        list.printList(head);
        // list.findMiddleOftheList(head);
    }
}
