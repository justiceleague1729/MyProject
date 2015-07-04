import java.util.Scanner;
public class CF_556A_OnesAndZeroes {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(), i=0, count=0;
		String s=input.next();
		StringBuilder ss =new StringBuilder(s);
		while(i<n-1){
			if(ss.charAt(i)==0 && ss.charAt(i+1)==1){
				ss.delete(i, i+1);
				++count;
				i=0;
			}
			else if(ss.charAt(i)==1 && ss.charAt(i+1)==0){
				ss.delete(i, i+1);
				++count;
				i=0;
			}
			else
				++i;
		}
		System.out.println(n-count);
	}
}
