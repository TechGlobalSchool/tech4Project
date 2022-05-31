package homeworks;

import java.util.Arrays;

public class Homework18 {

    public static void main(String[] args) {
        int[] nums = {-1, -4, 7, 4, 11, 23, 17}; // --> 4
        System.out.println(countPrimes(nums));

        int[] nums2 = {10, 11, 12, 13, 14, 15};
        System.out.println(Arrays.toString(no3or5(nums2)));

        String s = "Tech Global";
        System.out.println(replaceFirstLast(s));
    }

    public static int countPrimes(int[] arr){
        int primes = 0;
        for (int num : arr) {
            // if it is less than 2 skip that number
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num /2; i++) {
                if (num % i == 0) isPrime = false;
            }
            if (isPrime) primes++;
        }
        return primes;
    }

    public static int[] no3or5(int[] a){
        int[] newArr = new int[a.length];
        int index = 0;
        for (int element : a){
            if (element % 15 == 0) newArr[index++] = 101;
            else if (element % 5 == 0) newArr[index++] = 99;
            else if (element % 3 == 0) newArr[index++] = 100;
            else newArr[index++] = element;
        }
        return newArr;
    }

    public static String replaceFirstLast(String s){
        return (s.length() > 2)
                ? s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0)
                : "";
    }

//    public static String replaceFirstLast(String str){
//        if(str.trim().length() < 2 ){
//            return "";
//        }
//        return str.substring(str.length()-1) + str.substring(1,str.length()-1) + str.substring(0,1);
//    }

}

