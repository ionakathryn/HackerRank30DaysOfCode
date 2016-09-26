 public static  Node insert(Node head,int data) {
        //Complete this method
        //checks to  see if node already exists
        if (head == null){
            head = new Node(data);
        }
        // if not creates new node
        else {
            Node n = new Node(data);
            Node t = head;
            while (t.next != null){
                t = t.next;
            }
            t.next = n;
            }
        return head;
        }
