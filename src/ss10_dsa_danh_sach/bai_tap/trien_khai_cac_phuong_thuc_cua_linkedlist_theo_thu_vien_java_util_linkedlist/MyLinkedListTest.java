package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien_java_util_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();
        System.out.println("Size: " + list.size());

        list.remove(20);
        list.printList();
        System.out.println("Size: " + list.size());

        list.remove(40);
        list.printList();
        System.out.println("Size: " + list.size());
    }
}
