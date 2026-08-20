class SumD {
public static void main(String[] args) {
int n = -56;
n = Math.abs(n);
int sum = 0;
int digit;
while(n!=0) {
digit = n%10;
n = n/10;
sum = sum + digit;
}
System.out.print(sum);

}
}