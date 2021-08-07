

//프로그래머스 시저암호
public class CaesarCipher {
	
	public String solution(String s, int n) {
        String answer = "";
        
        String[] input = new String[s.length()];
        
        for(int i = 0; i < s.length(); i++ ) {
        	String refresh = "";
        	refresh += s.charAt(i);
        	input[i] = refresh;
        	
        	//System.out.println("input의 "+i+"번째 값 : "+input[i]);
        }
        
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String capital[] = a.split("");
        String lower[] = a.toLowerCase().split("");
        
        for(int i = 0 ; i < input.length; i++ ) {
        	
        	for(int j = 0 ; j < capital.length; j++) {
        		
        		if(capital[j].equals(input[i])) {
        			
        			if( j+n < capital.length) {
        				answer += capital[j+n];
        			}else {
        				answer += capital[j+n-capital.length];
        			}

            	} else if(lower[j].equals(input[i])) {
            		
            		if( j+n < capital.length) {
        				answer += lower[j+n];
        			}else {
        				answer += lower[j+n-capital.length];
        			}
            		
            	} 
        			
        	}
        	
        	if(input[i].equals(" ")) {
        		
        		answer += input[i];
        		
        	}
  		
        }     
        
        /*
        왜 char배열은 아래가 붉은줄인지 궁금
        char[] sarray = s.toCharArray();
        char firstS = sarray[0];

        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        char[] capital = a.toCharArray();
        char[] lowcase = a.toLowerCase().toCharArray();

        for(int i = 0; i < 25; i++) {
        	
        	
        	if(capital.equals(sarray[i])) {          		
            	i +=n+1;        		
            	answer += sarray[i];
            }
                	       	
        }
        */

       return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaesarCipher cc = new CaesarCipher();
		
		System.out.println("솔루션 함수 결과 : "+cc.solution("a B z",4));

	}

}
