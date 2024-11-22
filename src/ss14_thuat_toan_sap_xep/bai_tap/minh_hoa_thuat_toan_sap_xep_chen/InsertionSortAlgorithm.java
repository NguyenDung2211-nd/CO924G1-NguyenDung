package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

public class InsertionSortAlgorithm {
    public void sort(int[] array){
        System.out.println();
        System.out.println("Bắt đầu quá trình sắp xếp.");
        System.out.println();

        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            System.out.println("bước "+ i+ " : ");
            System.out.println("Mảng trước khi chèn : ");
            printArray(array);

            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;

            System.out.println("Mảng sau khi chèn phầnt tử "+ key +" : ");
            printArray(array);
            System.out.println();
        }
        System.out.println("Hoàn thành sắp xếp.");
    }

    public void printArray(int[] array){
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
