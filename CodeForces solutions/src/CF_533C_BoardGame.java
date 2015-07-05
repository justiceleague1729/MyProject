import java.util.Scanner;
public class CF_533C_BoardGame {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int xp=input.nextInt();
		int yp=input.nextInt();
		int xv=input.nextInt();
		int yv=input.nextInt();
		int psteps=0, vsteps=0;
		int dummy_xv=xv;
		int dummy_yv=yv;
		psteps=xp+yp;
		//System.out.println("psteps=" +psteps); 
		vsteps=Math.max(xv,yv);
		//System.out.println("vsteps=" +vsteps);
		if((xv>=xp && yv>=yp) || vsteps>=psteps)
			System.out.println("Polycarp");
		else
			System.out.println("Vasiliy");
	}
}
