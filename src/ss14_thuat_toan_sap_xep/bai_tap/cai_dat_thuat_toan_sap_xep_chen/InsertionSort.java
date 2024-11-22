package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    public void sort(int[] array){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
}
