public class ArrayUtility {

    public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        String avg = String.valueOf((sum * 1.0 )/array.length).substring(0,3);

        average = Double.parseDouble(avg);
        return average;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount ++;
            }
        }
        return evenCount;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedOne = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedOne[i] = array[array.length - 1 - i];;
        }
        return reversedOne;
    }

    public static void reverseTwo(int[] array) {
        int i = 0;
        int o = array.length - 1;
        while (i != o) {
            int temp;
            temp = array[i];
            array[i] = array[o];
            array[o] = temp;
            i ++;
            o --;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
       for (int i = 0; i < array.length; i++) {
           if (array[i] == num) {
               return true;
           }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
       String nums = String.valueOf(0);
       for (int i = 0; i < array.length; i++) {
        nums = nums + " , " + String.valueOf(nums[i])
       }
        return nums;
    }

    public static boolean twoSum(int[] array, int num) {
        return false;
    }

    public static void shiftRight(int[] array) {

    }

    public static void shiftLeft(int[] array) {

    }

    public static void shiftRightNTimes(int[] array, int n) {

    }

    public static void shiftLeftNTimes(int[] array, int n) {

    }


}
