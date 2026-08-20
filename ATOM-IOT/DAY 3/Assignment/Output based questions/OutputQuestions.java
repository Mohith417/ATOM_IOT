int result = 10 + 5 * 2 - 8 / 4;
System.out.println(result);
// Output: 18

int a = 10;
int b = 5;
int c = 2;
System.out.println(a + b * c > 15 && a - b == 5);
// Output: true

int x = 5;
int result2 = ++x * 2 + x++;
System.out.println(result2);
// Output: 18

int a2 = 10;
int b2 = 20;
System.out.println(a2 < b2 && a2 + 10 == b2 || a2 * 2 > b2);
// Output: true

int a3 = 5;
int b3 = 10;
int c3 = 15;
System.out.println(a3 + b3 * c3 > 100 && c3 - b3 * a3 == 50);
// Output: false