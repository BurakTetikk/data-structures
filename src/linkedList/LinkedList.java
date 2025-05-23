package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // ******* APPEND *******

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.value = value;
            newNode.next = null;
        } else {
            tail.next = newNode;
            this.tail = newNode;
        }

        length++;
    }

    // ******* REMOVE LAST *******

    public Node removeLast() {

        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // ******* PREPEND *******

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    // ******* REMOVE FIRST *******

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    // ******* GET *******
    public Node get(int index) {
        if (index < 0 || length <= index) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // ******* SET *******

    public boolean set(int index, int value) {

        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    // ******* INSERT *******

    public boolean insert(int index, int value) {
        if (index < 0 || length < index) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    // ******* REMOVE *******
    public Node remove(int index) {
        if (index < 0 || length <= index) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    // ******* REVERSE *******
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = temp.next;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }


    }


    public void getHead() {
        System.out.println("Head : " + head.value);
    }


    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }


    public void getLength() {
        System.out.println("Length : " + length);
    }

}
