package week_07.assignments;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] random = new int[100000];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100000 + 1);
        }
        int key = (int) (Math.random() * 100000 + 1);
        selectionSort(random);


        System.out.println("Execution time of invoking the linearSearch in milliseconds:  " + linearSearch(random, key));

        System.out.println("Execution time of invoking the binarySearch in milliseconds:  " + binarySearch(random, key));
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }

    public static long linearSearch(int[] array, int key) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    public static long binarySearch(int[] array, int key) {
        long secondStartTime = System.currentTimeMillis();
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (key < array[mid]) {
                high = mid - 1;
            } else if (array[mid] == key) {
                return mid;
            } else {
                low = mid + 1;

            }
        }
        long secondEndTime = System.currentTimeMillis();
        return secondEndTime - secondStartTime;
    }
}

