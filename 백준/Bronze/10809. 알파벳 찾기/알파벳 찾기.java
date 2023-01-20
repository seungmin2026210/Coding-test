import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    int[] alphabet = new int[26];
		    
		    for(int i=0; i<alphabet.length; i++) {
		    	alphabet[i]=-1;
		    }
		    
		    String S = br.readLine();
		    
		    for(int i=0; i<S.length(); i++) {
		    	char ch = S.charAt(i);
		    	if( alphabet[ch-97] == -1) {
		    		alphabet[ch-97]=i ;
		    	}
		    }
		    
		    for(int i=0; i<26; i++) {
		    	System.out.print(alphabet[i]+" ");
		    }
	}
}
