import java.util.Scanner;
public class CF_158B_Taxi {
	public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        int n,i;
	        int count1=0, count2=0, count3=0, count4=0;
	        int num_taxis=0,filled=0;
	        n=input.nextInt();
	        int[] array = new int[n];
	        for(i=0;i<n;i++){
	            array[i]=input.nextInt();
	            switch(array[i]){
	            case 1:
	                ++count1;
	                break;
	            case 2:
	                ++count2;
	                break;
	            case 3:
	                ++count3;
	                break;
	            case 4:
	                ++count4;
	                break;
	            }
	        }
	       // System.out.println("Num_taxis 1,2,3,4: " +count1 +count2 +count3 +count4);

	        num_taxis+=count4;
	        //System.out.println("Num_taxis after considering 4: " +num_taxis);
	        num_taxis+=count3;
	        //System.out.println("Num_taxis after considering 3: " +num_taxis);

	        if(count2%2==0)
	            num_taxis+=count2/2;
	        else {
	            num_taxis+=(count2/2)+1;
	            if(count1>=2)
	            	count1-=2;
	            else if(count1>=1)
	            	--count1;
	        }
	        while(count1>0 && filled<count3){
	            --count1;
	            ++filled;
	        }
	        if(count1%4==0){
	            num_taxis+=count1/4;
	            //System.out.println("Num_taxis after considering 1 mod 4 is 0: " +num_taxis);

	        }
	        else{
	            num_taxis+=((count1/4)+1);
	            //System.out.println("Num_taxis after considering 1 mod 4 not 0 " +num_taxis);

	        }
	        System.out.println(num_taxis);
	            }
	}

