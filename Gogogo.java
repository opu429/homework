package gogogo;

public class Gogogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[] a = new int[3];
		int[] a = new int[] {1,2,3};
		int[] a2 = new int[4];
         a2[0]=a[0];
	     a2[1]=a[1];
	     a2[2]=a[2];
	     a2[3]=4;
	     
	     int[] arr1 = {1,2,3};
	     int[] arr2 = arr1;
	     arr2[0]=arr1[0];
	     arr2[1]=arr1[1];
	     arr2[2]=arr1[2];
	    
	     int i;
	     for(i=0; i<arr2.length; i++)
	     {
	    	System.out.println(arr2[i]);
	     }
	     System.out.println(arr1[1]);
	     System.out.println(arr2[1]);
	     
	     float[]f = new float[3];
	     float[]f2 = f;
	     f[0] = 3.14f;
	     f[1] = 2.34f;
	     f[2] = 9.08f;
	     System.out.println(f[2]);
	     System.out.println(f2[2]);
	
	
	
	} 
	

}
