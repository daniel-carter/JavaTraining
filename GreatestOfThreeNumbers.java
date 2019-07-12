public class GreatestOfThreeNumbers {
public static void main(String[] args){

int num1=200;
int num2=200;
int num3=300;

if(num1 >num2 && num1 >num3){
		System.out.println("Number 1 is the largest number");
}
else if(num2 >num1 && num2 >num3) {
		System.out.println("Number 2 is the largest number");
}
else if(num3 >num1 && num3 >num2) {
		System.out.println("Number 3 is the largest number");
	}
else if(num1 ==num2 && num2 ==num3) {
	System.out.println("All numbers are equal");
	}
else if(num1==num2 && num2 >num3) {
	System.out.println("Numbers 1 and 2 are equal and are greater than Number 3");
}
else if(num2==num3 && num2 >num1) {
	System.out.println("Numbers 2 and 3 are equal and are greater than Number 1");
}
else if(num1==num3 && num1 >num2) {
	System.out.println("Numbers 1 and 3 are equal and are greater than Number 2");
}
else if(num1==num3 && num1 >num2) {
	System.out.println("Numbers 1 and 3 are equal and are greater than Number 2");
}
}
}
