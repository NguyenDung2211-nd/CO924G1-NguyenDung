package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist_theo_thu_vien_java_util_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Size: " + list.size());

        System.out.println("Phần tử tại index 1: " + list.get(1));

        list.remove(1);
        System.out.println("Sau khi xóa, size: " + list.size());

        System.out.println("Contains A? " + list.contains("A"));
        System.out.println("Contains B? " + list.contains("B"));

        list.clear();
        System.out.println("Size sau khi clear: " + list.size());
    }
}
