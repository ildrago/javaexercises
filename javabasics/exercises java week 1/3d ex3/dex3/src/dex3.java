import java.util.Scanner;

public class dex3 {
    public static void main(String[] args)  {
       Scanner input = new Scanner(System.in);

       System.out.println(Enter a sequence of numbers: );
       int nr = in.nextInt();
       int prevNum = 0;
       boolean valid = false;

       do{
            int num = input.nextInt()
           valid = (num <0 && num%2==0) || (num>0 && num%3==0);
            if(valid) sum += num;

        while(valid);

        System.out.print("sum is:");
        System.out.printl(sum);

    }
}
