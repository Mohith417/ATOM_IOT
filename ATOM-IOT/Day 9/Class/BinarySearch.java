package JavaDsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(BinarySearch(arr, 4));
    }

    public static int BinarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left != right) {
            int mid = (left + right) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (num > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}