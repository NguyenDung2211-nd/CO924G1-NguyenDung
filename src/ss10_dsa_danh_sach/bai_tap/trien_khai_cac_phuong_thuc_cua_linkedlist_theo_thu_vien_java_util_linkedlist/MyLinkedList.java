package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien_java_util_linkedlist;

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(Object data) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        Node current = head;
        System.out.print("Các phần tử trong danh sách: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}