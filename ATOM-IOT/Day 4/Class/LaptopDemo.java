import java.util.Scanner;
class Laptop{
String brand;
String model;
int ram;
int storage;
public static void start(){
System.out.println("Laptop Turned ONN!");
}}
class LaptopDemo{
public static void main(String [] args){
Laptop laptop1 = new Laptop();
laptop1.brand = "HP";
System.out.println(laptop1.brand);
laptop1.start();
laptop1.model = "Victus";
System.out.println("Model: " + laptop1.model);
laptop1.ram = 16 ;
System.out.println("Ram: " + laptop1.ram);
laptop1.storage = 2000 ;
System.out.println("Storage: " + laptop1.storage);

Laptop laptop2 = new Laptop();
laptop2.brand = "DELL";
System.out.println(laptop2.brand);
laptop2.start();
laptop2.model = "G5";
System.out.println("Model: " + laptop2.model);
laptop2.ram = 8 ;
System.out.println("Ram: " + laptop2.ram);
laptop2.storage = 1000 ;
System.out.println("Storage: " + laptop2.storage);


}}