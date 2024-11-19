package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        String input = "Hello anh Hải hello Anh hải";

        String[] words = input.toLowerCase().split(" ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        demSoTu(words, treeMap);
    }

    public static void demSoTu(String[] words, TreeMap<String, Integer> treeMap) {
        for(String word : words){
            if(treeMap.containsKey(word)){
                treeMap.put(word, treeMap.get(word) + 1);
            }else{
                treeMap.put(word, 1);
            }
        }
        System.out.println("TreeMap : " + treeMap);
    }
}
