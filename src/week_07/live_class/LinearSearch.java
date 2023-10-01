package week_07.live_class;

public class LinearSearch {
    public static void main (String[] args){
        int [] array = {1,2,3,4,12,3456,78};
        int indexOfNumberTwo =linearSearch(array,2);
        System.out.println(indexOfNumberTwo);
    }
    public static int linearSearch(int [] list, int key){
        for (int i=0; i<list.length;i++){
            if(key== list[i]){
                return i;
            }
        }
        return -1;
    }
}
