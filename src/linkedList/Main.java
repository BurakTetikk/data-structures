package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);


//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();


        //System.out.println("--------------------------------");

        myLinkedList.append(5);
        myLinkedList.printList();

//        myLinkedList.printList();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("--------------------------------");
//
//        myLinkedList.prepend(3);
//        myLinkedList.printList();
//
//        System.out.println("--------------------------------");
//
//        System.out.println(myLinkedList.removeLast().value);
//        myLinkedList.printList();
//
//        System.out.println(myLinkedList.get(0).value);

        System.out.println("--------------------------------");

        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
