package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist_theo_thu_vien_java_util_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Size: " + list.size());

        System.out.println("Remove 20: " + list.remove(20));
        System.out.println("Size: " + list.size());

        System.out.println("Remove 40: " + list.remove(40));
        System.out.println("Size: " + list.size());
    }
}
