import java.util.Scanner;
class Days{

public static void main(String[]args){
Scanner scn = new Scanner(System.in);
System.out.print("Welcome!\nEnter the number(1 to 4)\n1:Veg\n2:Non-Veg\n3:Staters\n4:Desserts\n:");
int Menu = scn.nextInt();

switch(Menu){
case 1:
	System.out.print("1:Noodles\n2:Fried Rice\n3:Dosa\n4:Meals");
	break;
case 2:
	System.out.print("1:Chicken Noodles\n2:Chicken Fried Rice\n3:Chicken Biryani\n4:Chicken  Tikka");
	break;
case 3:
	System.out.print("1:Gobi\n2:Paneer\n3:Mushroom\n4:Babycorn\n");
	break;
case 4:
	System.out.print("1:Juices\n2:Sweets\n3:IceCreams\n4:Etc\n");
	break;
default:
	System.out.print("Invalid");
}}}