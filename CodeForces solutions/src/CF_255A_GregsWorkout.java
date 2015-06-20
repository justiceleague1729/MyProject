import java.util.Scanner;
public class CF_255A_GregsWorkout {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int reps=0, back=0,chest=0,biceps=0, flag=1;
		for(int i=1;i<=n;i++){
			reps=input.nextInt();
			switch(flag){
			case 1:
				chest+=reps;
				flag=2;
				break;
			case 2:
				biceps+=reps;
				flag=3;
				break;
			case 3:
				back+=reps;
				flag=1;
				break;
			}
		}
		if(chest>biceps){
			if(chest>back)
				System.out.println("chest");
			else
				System.out.println("back");
		}
		else {
			if(biceps>back)
				System.out.println("biceps");
			else
				System.out.println("back");
				
		}
	}
}
