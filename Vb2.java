package vb1_2;

public class Vb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 10;
     int b = 20;
     boolean flag = true;
    
     switch ("a,b") {
      case "a==10": 
    	        System.out.println("a가 10이면 참");
    	        break;
      case "a==b":
    	       	System.out.println("a와 b가 같으면 참");
    	        break;
      case "flag":     
    	        System.out.println("flag값이 trued이면 참");
    	        break;
      default :
             System.out.println("이 문장은 if문과 상관없이 실행");  
             break;
     }
	}

}
