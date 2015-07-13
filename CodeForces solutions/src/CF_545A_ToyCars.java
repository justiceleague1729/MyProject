import java.util.*;
public class CF_545A_ToyCars {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=0, i, j, flag=1;
		String s="";
		int [][] cars=new int[n][n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				cars[i][j]=input.nextInt();
			}
		}
		for(i=0;i<n;i++){
			flag=1;
			for(j=0;j<n;j++){
				if(cars[i][j]==1 || cars[i][j]==3){
					flag=0;
					break;
				}
			}
			if(flag==1){
				++count;
				s+=(i+1)+" ";
			}
		}
		System.out.println(count);
		System.out.println(s);
	}
}
