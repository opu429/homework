package gogogo;

public class Gogogo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 byte arr[]= new byte[5];
		  arr[0] = 1;
		  arr[1] = 2;
		  arr[2] = 3;
		  arr[3] = 4;
		  arr[4] = 5;
		  System.out.println(arr);
		  
		  System.out.println("배열의 크기 :" + arr.length);
		for(int i = 0; i< arr.length; i++)
		{
			if(arr.length-1 == i)
		    System.out.printf("arr[%d]:%d",i,arr[i]);
			else 
			System.out.printf("arr[%d]:%d",i,arr[i]);
		}
		
		char let[] = new char[5];
		let[0]=1;
		let[1]=2;
		let[2]=3;
        let[3]=4;
        let[4]=5;
        
        
	}

}
