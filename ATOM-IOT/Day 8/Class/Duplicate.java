package Day8.JavaDsa;

public class Duplicate {
    public static void main(String[] args){
        int [] nums = new int[10000];
        int []arr ={1,2,2,3,4};
        findDup(arr);
    }
    public static void findDup(int []arr){
        int check=0;
        int found=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("Checking " + ++check + " Times");
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Found: "+  ++found + " Times");
                    System.out.println(arr[i]);
                    System.out.println(arr[i]);
                }
            }
        }

    }
}