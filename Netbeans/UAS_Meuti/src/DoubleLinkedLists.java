/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aikacchii
 */
public class DoubleLinkedLists {

    Node head;
    Node sorted;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String ttl, int cd, String pb, int st) {
        if (isEmpty()) {
            head = new Node(null, ttl, cd, pb, st, head);
        } else {
            Node newNode = new Node(null, ttl, cd, pb, st, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void add(String ttl, int cd, String pb, int st) throws Exception {
        if (isEmpty()) {
            addFirst(ttl, cd, pb, st);
        
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
                current.next = new Node(current, ttl, cd, pb, st, null);
        }
        size++;
    }

    public void available(String ttl) {
        Node curr = head;
        Book_Meuti bm = new Book_Meuti();
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(ttl)) {
                bm.availability(curr);
            }
            curr = curr.next;
        }
    }

    public void addBroken(int br, int index) throws Exception {
        if (isEmpty()) {
            head.addBroken(br);
        } else if (index < 1 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 1;
            while (i <= index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                current.addBroken(br);
            } else {
                Node prev = head;
                Node cur = head.next;
                for (int j = 1; j < index; j++) {
                    prev.addBroken(br);
                }
            }
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index value out of range");
        }
        if (isEmpty()) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                tmp.print();
                System.out.println("+--------------------------------------------------+");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }

    public boolean valid(String ttl) {
        int i = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(ttl)) {
                if (curr.stock == 0) {
                    return false;
                } else {
                    return true;
                }
            }
            curr = curr.next;
            i++;
        }
        return false;
    }

    public void searchByKeyBorrow(int idx) throws Exception {
        if (isEmpty()) {
            throw new Exception("Library is empty");
        }
        int i = 1;
        Node curr = head;
        while (i <= idx) {
            curr = curr.next;
            i++;
        }
        if (valid(curr.title)) {
            curr.stock--;
            System.out.println("Loaning Success");
        } else {
            System.out.println("Out of Stock");
        }
    }

    public void searchBook(String ttl) throws Exception {
        if (isEmpty()) {
            throw new Exception("Library is empty");
        }
        Node curr = head;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(ttl)) {
                curr.print();
                break;
            }
            curr = curr.next;
        }
    }
    public void search(String ttl, String pb) throws Exception {
        if (isEmpty()) {
            throw new Exception("Library is empty");
        }
        Node curr = head;
        int i =0;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(ttl) && curr.publisher.equalsIgnoreCase(pb)) {
                curr.print();
                i++;
                break;
            }
            curr = curr.next;
        }
        if(i == 0){
            System.out.println("Book unavailable");
        }
    }

    void insertionSort() {
        sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
        print();
    }

    void sortedInsert(Node newnode) {
        if (sorted == null || sorted.title.charAt(0) >= newnode.title.charAt(0)) {
            newnode.next = sorted;
            sorted = newnode;
        } else {
            Node current = sorted;

            while (current.next != null && current.next.title.charAt(0) < newnode.title.charAt(0)) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

}
