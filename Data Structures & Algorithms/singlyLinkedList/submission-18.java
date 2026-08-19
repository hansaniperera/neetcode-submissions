class LinkedList {

    private static class Node {
    Integer value;
    Node next;

    Node (int value) {
        this.value = value;
        this.next = null;
    }
    }

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public int get(int index) {
        Integer value = -1;
        Node currentNode = this.head;
        int i = 0;
        while (currentNode != null && i <=index){
            // System.out.println(currentNode.value);
            if (i == index) {
                 value = currentNode.value;
                 break;
            }
            currentNode = currentNode.next;
            i++;
        }

        return value;
    }

    public void insertHead(int val) {
        if(this.head == null) {
            Node newNode = new Node(val);
            this.head = newNode;
        } else {
            Node newNode = new Node(val);
            Node oldHead = this.head;
            this.head = newNode;
            this.head.next = oldHead;
        }
        // System.out.println("head");
        // System.out.println(this.head.value);
        
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (this.head != null) {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        } else {
            this.head = newNode;
        }
        // System.out.println("tail");
        // System.out.println(this.head.value);
    }

    public boolean remove(int index) {
        boolean isRemoved = false;
        int i = 0;
        Node currentNode = this.head;
        Node previousNode = this.head;
        // System.out.println(this.head);
        // System.out.println(currentNode.next);
        // System.out.println(currentNode.value);
        while (currentNode != null && i <= index) {
            if (i == index && currentNode.next == null) {
                previousNode.next = null;
                isRemoved = true;
                if (index == 0) {
                    this.head = null;
                }               
            } else if (i == index && currentNode.next != null) {
                previousNode.next =  currentNode.next;
                isRemoved = true;
                if (index == 0) {
                    this.head = currentNode.next;
                }
                // System.out.println(head.value);
                // System.out.println(currentNode.value);
                // System.out.println(currentNode.next.value);
            } 
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }

        return isRemoved;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList();
        int i = 0;
        Node currentNode = this.head;
        while(currentNode != null) {
            // System.out.println(currentNode.value);
            arr.add(currentNode.value);
            currentNode = currentNode.next;
            i++;
        }

        return arr;
    }
}
