class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class linkedlist{
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } 
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        
    }
}
void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



public class linkedlist2 {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Print the linked list
        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null"); 
        
    }

}
   
