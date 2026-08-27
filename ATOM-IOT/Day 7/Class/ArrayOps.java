package Day7;

public class ArrayOps {
    public static void main(String [] args){
        int [] arr = {2,3,4,5,6,7};
        int max = arr[0];
        int sMax = arr[0];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }
        System.out.println(max +" " + sMax);
    }
}
