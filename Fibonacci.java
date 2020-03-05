package test;

public class Fibonacci {
	public static int of(int num) {
		//采用递归的方法，每次的结果是前两次结果之和
		if((num == 0)||(num == 1))
			return num;
		else
			return of(num - 1) + of(num - 2);
	}
	public static void main(String[] args) {
		for(int i = 1;i <= 200;i++) {
			System.out.printf("Fibonacci.of(%d) == %d\n",i,of(i));
		}
	}
}
