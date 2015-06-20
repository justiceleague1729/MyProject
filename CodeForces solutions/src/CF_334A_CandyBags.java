import java.util.Scanner;
public class CF_334A_CandyBags {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=1, j=n*n;
		while(j>i){
			System.out.println(i +" " +j +" " +(i+j));
			++i;
			--j;
		}
	}
}
