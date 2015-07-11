import java.util.*;
public class CF_556A_CaseOfZeroesAndOnes {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int c1=0, c0=0;
		String s=input.next();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1')
				++c1;
			else 
				++c0;
		}
		System.out.println(Math.abs(c1-c0));
	}
}
