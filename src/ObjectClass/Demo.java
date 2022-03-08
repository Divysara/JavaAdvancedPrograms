package ObjectClass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] input = new  int[]{14,11,9,7,17,8,5,13,4,3,2,12,100};
        for (int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
        
        
       for (int i=0;i<input.length;i++)
       {
    	   int j;
    	   for( j=i+1;j<input.length;j++)
    	   {
              if(input[i] <=input[j])
            	  break;
            }
              if(j==input.length)
              System.out.print(input[i] + " ");
   
       }
       
      
            
    }
}
       


