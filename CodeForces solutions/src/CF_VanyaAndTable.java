import java.util.Scanner;
public class CF_VanyaAndTable {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[][] table=new int[100][100];
		int i,j,sum=0;
		int x1, x2, y1, y2;
		for(i=0;i<100;i++){
			for(j=0;j<100;j++){
				table[i][j]=0;
			}
		}
			for(int k=1;k<=n;k++){
				x1=input.nextInt();
				y1=input.nextInt();
				x2=input.nextInt();
				y2=input.nextInt();
//				System.out.println("x1, y1, x2, y2=" +x1 +" " +y1 +" "+x2 +" "+y2);
				for(i=x1-1;i<x2;i++){
					for(j=y1-1;j<y2;j++){
						++table[i][j];
//						System.out.println("col,row "+i +" "+j);
					}
				}
			}
			for(i=0;i<100;i++){
				for(j=0;j<100;j++){
					sum+=table[i][j];
				}
			}
			System.out.println(sum);
		}
	}
