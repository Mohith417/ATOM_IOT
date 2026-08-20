import java.util.Scanner;
class Prime{
public static void main(String[]args){
Scanner scn = new Scanner(System.in);
System.out.print("Enter a Number:");
int n=scn.nextInt();
int count = 0;
for(int i =1 ; i<=n ; i++){
System.out.print(" Checking\n ");
if(n%i == 0){
System.out.print("found a factor\n");
count = count+1;
}}
if(count == 2){System.out.print("Prime");}
else{System.out.print("Not Prime");}

}
}