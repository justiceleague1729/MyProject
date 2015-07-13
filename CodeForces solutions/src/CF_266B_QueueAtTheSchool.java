import java.util.*;
public class CF_266B_QueueAtTheSchool {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int t=input.nextInt();
		int i=0,j=0;
		String s=input.next();
		char [] q=s.toCharArray();
		char temp;
//		System.out.println(q);
		for(i=1;i<=t;i++){
			j=0;
			while(j<q.length-1){
				if(q[j]=='B' && q[j+1]=='G'){
					temp=q[j];
					q[j]=q[j+1];
					q[j+1]=temp;
					j+=2;
				}	
				else
					++j;
			}
		}
		for(i=0;i<q.length;i++)
			System.out.print(q[i]);
	}

}
