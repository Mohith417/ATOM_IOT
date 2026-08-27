package Day7;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //names => "mohith" , "Santosh" , "jagan" ;
        String [] names = new String[3];
       // String [] names = {"mohith" , "Santosh" , "jagan"};

        //int [] usn = {66 , 17 , 46};
//        for( int i =0;i<names.length;i++){
//
//        }
        for(int i=0 ; i<names.length;i++){
            System.out.println(Arrays.toString(names));
            System.out.print("Enter the number " + (i+1) + ":");
            names[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(names));




//        System.out.println(Arrays.toString(names));
//        String name = "Jay";
//        System.out.println(name);
//        Arrays.toString(names);
//        names[0] = "mohith";
//        names[1] = "santosh";
//        names[2] = "jagan";
//        System.out.println(names.length);
//        System.out.println(names[1]);
    }
}
