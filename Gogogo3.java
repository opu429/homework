package gogogo;

public class Gogogo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a = new int[]{1,2,3,4};
	   a[0]=1;
	   a[1]=2;
	   a[2]=3;
	   a[3]=4;
	   System.out.println(a[1]);
	   
	   int[] score = new int[5];//q배열변수 score를 선언함. 메모리 할당도 함. 5개. //score[0]=1,score[1]=2,score[2]=3,score[3]=4,score[4]=5
	   score[0] = 0;//score[0]에 0할당.
	   score[1] = 10;//score[1]에 10할당.
	   score[2] = 20;//score[2]에 20할당.
	   score[3] = 30;//score[3]에 30할당.
	   score[4] = 40;//score[4]에 40할당.
	   System.out.println("[배열 초기화 후]");
	   
	   for(int i=0; i<5; i++)//5번 반복//i=0, 0<5 // i=1, 1<5 //i=2, 2<5 // i=3, 3<5 // i=4, 4<5
	   {
		   System.out.printf("score[%d]: %d%n",i,score[i]);//1,score[0]=0 // 2,score[1]=10 // 3,score[2]=20 //4,score[3]=30 //5,score[4]=40
	   }
	 
	   int[] score1 = new int[5];//배열변수 score를 선언함. 메모리 할당도 함. 5개.//0,score[0]=1//1,score[1]=2//2,score[2]=3//3,score[3]=4 //4,score[4]=5
	   score1[0] = 0;//score[0]에 0할당.
	   score1[1] = 10;//score[1]에 10할당.
	   score1[2] = 20;//score[2]에 20할당.
	   score1[3] = 30;//score[3]에 30할당.
	   score1[4] = 40;//score[4]에 40할당.
	   
	   for(int i=0; i<5; i++)//i=0, 0<5 //i=1, 1<5 //i=2 ,2<5 // i=3,3<5 // i=4, 4<5
	   {
		   System.out.printf("score[%d]:%d%n",i,score1[i]);
	   }
	
	   int[] score2 = new int[5]; //배열변수 score를 선언함. 메모리 할당도 함.5개.//score[0]=1,score[1]=2,score[2]=3,score[3]=4,score[4]=5
	   score2[0] = 0;//score[0]에 0할당
	   score2[1] = 10;//score[1]에 10할당
	   score2[2] = 20;//score[2]에 20할당
	   score2[3] = 30;//score[3]에 30할당
	   score2[4] = 40;//score[4]에 40할당
      	
	   for(int i=0; i<5; i++)//i=0,0<5 //i=1,1<5//i=2,2<5//i=3,3<5 //i=4,4<5
	   {
		  System.out.printf("score[%d]:%d%n",i,score2[i]);
	   }
	   int[] score3 = new int[5];//배열변수 score를 선언함. 메모리 할당도 함.5개.//score[0]=1,score[1]=2,score[2]=3,score[3]=4,score[4]=5
	   score3[0] = 0;//score[0]에 0할당
	   score3[1] = 10;//score[1]에 10할당
	   score3[2] = 20;//score[2]에 20할당
	   score3[3] = 30;//score[3]에 30할당
	   score3[4] = 40;//score[4]에 40할당
	   
	   for(int i=0; i<5; i++)//i=0,0<5 //i=1,1<5//i=2,2<5//i=3,3<5 //i=4,4<5
	   {
		  System.out.printf("score[%d]:%d%n",i,score3[i]);
	   }
	
	   int[] score4 = new int[5];//배열변수 score를 선언함. 메모리 할당도 함.5개.//score[0]=1,score[1]=2,score[2]=3,score[3]=4,score[4]=5
	   score4[0] = 0;//score[0]에 0할당
	   score4[1] = 10;//score[1]에 10할당
	   score4[2] = 20;//score[2]에 20할당
	   score4[3] = 30;//score[3]에 30할당
	   score4[4] = 40;//score[4]에 40할당
	   
	   for(int i=0; i<5; i++)//i=0,0<5 //i=1,1<5//i=2,2<5//i=3,3<5 //i=4,4<5
	   {
		  System.out.printf("score[%d]:%d%n",i,score4[i]);
	   }
	}

 }