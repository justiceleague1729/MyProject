import java.util.Scanner;
public class CF_534A_Exam {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	String s="";
	int i,j;
	if(n==1 || n==2){
		System.out.println(1);
		System.out.println(1);
	}
	else if(n==3){
		System.out.println(2);
		System.out.println("1 3");
	}
	else if(n==4){
		System.out.println(4);
		System.out.println("3 1 4 2");
	}
	else {
	for(i=1;i<=n;i+=2){
		s+=i +" ";
	}
	for(j=2;j<=n;j+=2){
		s+=j +" ";
	}
	System.out.println(n);
	System.out.println(s);
}
}
}
