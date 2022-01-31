import java.util.Scanner;

public class es3 {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert a sequence of numbers:");
		
		// legge il primo
		int num = input.nextInt();
		boolean found = false;
		
		//while(num!=0){
		while(num!=0 && !found){	//variant
			int prec = num;
			num = input.nextInt();
			if (prec>0 && num<0) found = true;
		}
		
		if (found) System.out.println("OK");
		else System.out.println("NO");

	}
}
