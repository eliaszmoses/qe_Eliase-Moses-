package Soal_Eksplorasi;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        mergeArrays();
        findUniqueNumbers();
        findPairSum();
        ArrayUnique();
        removeDuplicates();
        findMaxSumSubArray();
    }

    public static void mergeArrays() {
        System.out.println("Soal 1");
        String[] arr1 = {"kazuya", "jin", "lee"};
        String[] arr2 = {"kazuya", "feng"};
        String[] arr3 = {"lee", "jin"};
        String[] arr4 = {"kazuya", "panda"};

        ArrayList<String> mergedList1 = new ArrayList<String>(Arrays.asList(arr1));
        for (String name : arr2) {
            if (!mergedList1.contains(name)) {
                mergedList1.add(name);
            }
        }

        ArrayList<String> mergedList2 = new ArrayList<String>(Arrays.asList(arr3));
        for (String name : arr4) {
            if (!mergedList2.contains(name)) {
                mergedList2.add(name);
            }
        }

        String[] mergedArray1 = mergedList1.toArray(new String[mergedList1.size()]);
        System.out.println(Arrays.toString(mergedArray1));

        String[] mergedArray2 = mergedList2.toArray(new String[mergedList2.size()]);
        System.out.println(Arrays.toString(mergedArray2));
    }

    public static void findUniqueNumbers() {
        System.out.println("Soal 2");
        String input1 = "76523752";
        String input2 = "1122";

        ArrayList<Character> uniqueNumbers1 = new ArrayList<>();
        ArrayList<Character> nonUniqueNumbers1 = new ArrayList<>();
        for (int i = 0; i < input1.length(); i++) {
            char num = input1.charAt(i);
            if (uniqueNumbers1.contains(num)) {
                nonUniqueNumbers1.add(num);
            } else {
                uniqueNumbers1.add(num);
            }
        }

        ArrayList<Character> uniqueNumbers2 = new ArrayList<>();
        ArrayList<Character> nonUniqueNumbers2 = new ArrayList<>();
        for (int i = 0; i < input2.length(); i++) {
            char num = input2.charAt(i);
            if (uniqueNumbers2.contains(num)) {
                nonUniqueNumbers2.add(num);
            } else {
                uniqueNumbers2.add(num);
            }
        }

        uniqueNumbers1.removeAll(nonUniqueNumbers1);
        uniqueNumbers2.removeAll(nonUniqueNumbers2);

        System.out.println(uniqueNumbers1);
        System.out.println(uniqueNumbers2);
    }

    public static void findPairSum() {
        System.out.println("Soal 3");
        int[] arr1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] arr2 = {2, 5, 9, 11};
        int target2 = 11;

        // Panggil method findPairSum untuk mencari pasangan angka pada kedua array
        findPairSum(arr1, target1);
        findPairSum(arr2, target2);
    }

    public static void findPairSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                System.out.println("[" + left + ", " + right + "]");
                found = true;
                left++;
                right--;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("Tidak ditemukan pasangan angka dalam array " + Arrays.toString(arr) + " yang jumlahnya sama dengan " + target);
        }
    }

    public static void ArrayUnique() {
        System.out.println("Soal 4");
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 5, 10, 16};

        int[] uniqueArr = getUniqueArray(arr1, arr2);
        System.out.println(Arrays.toString(uniqueArr)); // Output: [2, 4]

        int[] arr3 = {3, 8};
        int[] arr4 = {2, 8};

        uniqueArr = getUniqueArray(arr3, arr4);
        System.out.println(Arrays.toString(uniqueArr)); // Output: [3]
    }

    public static int[] getUniqueArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // tambahkan semua angka dari arr1 ke dalam uniqueList
        for (int num : arr1) {
            uniqueList.add(num);
        }

        // hapus angka yang juga ada di arr2 dari uniqueList
        for (int num : arr2) {
            if (uniqueList.contains(num)) {
                uniqueList.remove(Integer.valueOf(num));
            }
        }

        // konversi uniqueList ke dalam bentuk array
        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = uniqueList.get(i);
        }

        return uniqueArr;
    }

    public static void removeDuplicates() {
        System.out.println("Soal 5");
        int[] nums1 = {2, 3, 3, 3, 6, 9, 9};
        int[] nums2 = {2, 2, 2, 11};

        int length1 = removeDuplicates(nums1);
        int length2 = removeDuplicates(nums2);

        System.out.println("Output 1: " + length1);
        System.out.print("Output Array 1: ");
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.println("Output 2: " + length2);
        System.out.print("Output Array 2: ");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void findMaxSumSubArray() {
        System.out.println("\nSoal 6");
        
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        findMaxSumSubArray(arr1, k1); // Output: Maximum sum of subarray of size 3 is: 9

        int[] arr2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        findMaxSumSubArray(arr2, k2); // Output: Maximum sum of subarray of size 2 is: 7
    }

    public static void findMaxSumSubArray(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;

        // hitung jumlah elemen di awal
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // hitung jumlah maksimum subarray yang berdekatan
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}








