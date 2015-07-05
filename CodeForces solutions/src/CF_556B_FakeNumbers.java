import java.util.Scanner;
public class CF_556B_FakeNumbers {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int active=0, diff=0,flag=0;		
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
			if(arr[i]==i)
				flag++;
		}
		if(flag==n)
			System.out.println("Yes");
		else {
		diff=n-arr[0];
		int curr_diff=0;
		for(int i=1;i<n;i++){
			active=arr[i];
			if(i%2==1){
				if(active > i)
					curr_diff=active-i;
				else 
					curr_diff = n - (i-active);
				if(curr_diff !=diff){
					System.out.println("No");
					return;
				}
			}
			else {
				if (active > i)
					curr_diff=n-(active-i);
				else
					curr_diff = i-active;
				if(curr_diff !=diff){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
		}
	}
}
