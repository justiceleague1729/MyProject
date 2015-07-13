import java.util.Arrays;
import java.util.Scanner;
public class CF_557B_PashaAndTea {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int w=input.nextInt();
		double x=0.000000;
		int[] capacity=new int[2*n];
		for(int i=0;i<2*n;i++)
			capacity[i]=input.nextInt();
		Arrays.sort(capacity);
		System.out.println(3*n*Math.min(Math.min((double)w/(3*n), capacity[0]),(double)capacity[n]/2));
	}
}
