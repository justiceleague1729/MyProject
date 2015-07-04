import java.util.Scanner;	
import java.util.*;
public class CF_FaceDetection {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	String s="";
	int count=0;
	char[] c=new char[4];
	int n=input.nextInt();
	int m=input.nextInt();
	char[][] image=new char[n][m];
	for(int i=0;i<n;i++){
		 s=input.next();
		for(int j=0;j<m;j++){
			image[i][j]=s.charAt(j);
			//System.out.println(image[i][j]);
		}
	}
	for(int i=0;i<n-1;i++){
		for(int j=0;j<m-1;j++){
			c[0]=image[i][j];
			c[1]=image[i+1][j];
			c[2]=image[i+1][j+1];
			c[3]=image[i][j+1];
			Arrays.sort(c);
			String s1=new String(c);
			if(s1.equals("acef")){
				++count;
			}
		}
	}
	System.out.println(count);
	}
}
