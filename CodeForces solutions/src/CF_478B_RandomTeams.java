import java.util.Scanner;
public class CF_478B_RandomTeams {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		long n=input.nextInt();
		long m=input.nextInt();
		long quot=n/m;
		long mod=n%m;
		long kmax=0, kmin=0;
		kmin=(mod*(quot+1)*quot/2) + (m-mod)*quot*(quot-1)/2;
		kmax= (n+1-m)*(n-m)/2;
		System.out.println(kmin +" " +kmax);	
	}
}
