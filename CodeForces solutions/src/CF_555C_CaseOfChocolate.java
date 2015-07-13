import java.util.Scanner;
public class CF_555C_CaseOfChocolate {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int q=input.nextInt();
		int row, col, steps=0,i=0,j=0;
		char dir;
		int[][] bar = new int[n][n];
		for(i=0;i<n;i++)
			for( j=0;j<n;j++)
				bar[i][j]=0;
		for(i=1;i<=q;i++){
			steps=0;
			col=input.nextInt()-1;
			row=input.nextInt()-1;
			dir=input.next().charAt(0);
			if(dir=='U'){
				while(row>=0 && bar[row][col]!=1){
					++steps;
					bar[row][col]=1;
					--row;
				}
			}
			else {
				while(col>=0 && bar[row][col]!=1){
					++steps;
					bar[row][col]=1;
					--col;
				}
			}
			System.out.println(steps);
		}
	}
}
