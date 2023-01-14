import java.util.Scanner;
class ForLoopDemo2{
	public static void main(String[] args){
		int start;
		int end;
		Scanner sc = new Scanner (System.in);

		System.out.println("enter start value");
		start = sc.nextInt();
		System.out.println("enter the limit");
		end=sc.nextInt();

		while (start<=end){
			if(start%2==0){
			System.out.println("\t"+start);
			}
			start++;
		}
	}
}