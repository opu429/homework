package gogogo;

import java.util.Scanner;

public class Gogogo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
		  
		  Scanner sc = new Scanner(System.in);
          /*int[] array = new int[5];
		  //array[0],array[1],array[2],array[3],array[4]
		  
          array[0] = sc.nextInt();
          array[1] = sc.nextInt();
          sc.nextInt();*/
          
          int[] b = new int[5];
		  b[0] = sc.nextInt();
		  b[1] = sc.nextInt();
		  b[2] = sc.nextInt();
		  b[3] = sc.nextInt();
		  b[4] = sc.nextInt();
		  
		  for(int i=0; i<5; i++)
		  {
			  b[i]= sc.nextInt();
			  System.out.println(b[i]);
		  }
		  
		 
         char[] ch = new char[3];		  
		 
         
         ch[0]='A';
         ch[1]='B';
         ch[2]='C';
         char data = 'A';
         
         for(int i=0; i<3; i++)
         {
        	 ch[i] = data++;
             ch[i] = data;
             data++;
             System.out.println(ch[i]);
         
         
         }
 	  
	 

	}

}
