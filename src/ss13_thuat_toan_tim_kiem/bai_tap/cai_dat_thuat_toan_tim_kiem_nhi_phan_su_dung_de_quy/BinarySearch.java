package ss13_thuat_toan_tim_kiem.bai_tap.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == value) {
            return mid;
        }

        if (value > array[mid]) {
            return binarySearch(array, mid + 1, right, value);
        }

        return binarySearch(array, left, mid - 1, value);
    }
}
