import java.util.Scanner;
class Sum{
public static void main(String [] args){
Scanner scn = new Scanner(System.in);
System.out.print("Enter a number:");
int n = scn.nextInt();

for(int i =1 ; i<=n ; i++){
if(i == 3){continue;}
System.out.println(i);

}
}
}