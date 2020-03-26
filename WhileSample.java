import java.util.Scanner;

public class WhileSample{
	public static void main(String[] args){
		int count=0;
		int sum=0;

		Scanner scanner=new Scanner(System.in);
		System.out.println("input number and last input -1");

		int n=scanner.nextInt();
		while(n != -1){
			sum+=n;
			count++;
			n=scanner.nextInt();
		}

		if(count==0)
			System.out.println("no input");
		else{
			System.out.print("number count"+count+",");
			System.out.println("avg"+(double)sum/count);
		}
		scanner.close();
	}
}

