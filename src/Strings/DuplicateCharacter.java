package Strings;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =  "java hello";
		System.out.println(s.indexOf('p', 0));//if the particular character is not found then it returns -1.
		StringBuilder sb  = new StringBuilder();
		
		for(int i =0; i< s.length();i++) {
			char ch = s.charAt(i);
			int index = s.indexOf(ch, i+1); // indexOf is used to find the index value of the given character in a string
					if(index==-1) {			//if the particular character is not found then it returns -1.
				sb.append(ch);	
			}		
		}	
		System.out.println(sb);
		
		//Another way for finding duplicate character
		
		StringBuilder sb2  = new StringBuilder();
		char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			boolean repeat = true;
			for(int j=i+1; j<s.length();j++) {
				if(ch[i]==ch[j]) {
					repeat = false;
					break;
				}
			}
			if(repeat) {
				sb2.append(ch[i]);
			}
		}
		System.out.println(sb2);
		
		
		// pgm to find frequency of elemnet in an array
		//Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        System.out.println(arr.getClass().getName());
        
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }
            }
                    if(fr[i] != visited)  
                        fr[i] = count;  
                 
            }
          
                //Displays the frequency of each element present in array  
                System.out.println("---------------------------------------");  
                System.out.println(" Element | Frequency");  
                System.out.println("---------------------------------------");  
                for(int k = 0; k < fr.length; k++){  
                    if(fr[k] >=2)  
                        System.out.println("    " + arr[k] + "    |    " + fr[k]);  
                }  
                System.out.println("----------------------------------------");  

		
	}
	
}


