import java.util.Scanner;
public class CF_VanyaAndBooks {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		long req=0;
		int digits=findDigits(n);
//		System.out.println(digits);
		req+=(((9*(digits-1)-1)*Math.pow(10, digits-1)+1)/9);
//		System.out.println("req="+req);
		req+=(digits*(n+1-Math.pow(10,digits-1))); 
		System.out.println(req);
	}
	public static int findDigits(int n){
		int digits=0;
		while(n!=0){
			n/=10;
			++digits;
		}
		return digits;
	}
}
