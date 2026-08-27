// Q1
Shape item1 = new Circle();
System.out.println("Output 1: " + item1.getType());
// Output 1: Circle


// Q2
Shape item2 = new Circle();
System.out.println("Output 2: " + item2.name);
// Output 2: ShapeVar


// Q3
Shape item3 = new Circle();
System.out.println("Output 3: " + item3.toString());
// Output 3: Circle Shape details


// Q4
Integer countA = 100;
Integer countB = 100;
Integer totalA = 200;
Integer totalB = 200;
System.out.println("Output 4: " + (countA == countB) + " " + (totalA == totalB));
// Output 4: true false


// Q5
Shape shapeRef = new Circle();
Circle circleRef = (Circle) shapeRef;

try {
    Shape plainShape = new Square();
    Circle failedCircle = (Circle) plainShape;
    System.out.println("Output 5: " + circleRef.getSpecificRadius() + " & Success");
} catch (ClassCastException e) {
    System.out.println("Output 5: " + circleRef.getSpecificRadius() + " & ClassCastException");
}
// Output 5: Radius: 5 & ClassCastException