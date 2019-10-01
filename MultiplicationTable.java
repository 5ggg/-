import java.util.Scanner;

public class MultiplicationTable {
   public static void main(String[] args) {
    	  
	   System.out.println("Please write in the size you need\n (Recmd: less than 10)");
	   Scanner s = new Scanner(System.in);
	   int t = s.nextInt();
	   
	   
	   for (int i=1;i<=t;i++) {
    		  for (int j=1; j<=i; j++) {
    			  System.out.print(j+"x"+i+"="+i*j+"\t");
    		  }
    		  System.out.println();
    	  }
      }
}