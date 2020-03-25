package junit;

public class SearchFirst2Chars {
	public String removeA(String string) {
		int c=0;
		String result="";
		if(string.length()>=2) {
		    for(int i=0;i<2;i++) {
		        if(string.charAt(i)=='A') {
			         c=c+1;
		        }
		    }
		result=string.substring(c);		
	   }
		else if(string.length()==1) {
			if(string.charAt(0)=='A') {
		         c=c+1;
	        }
			result=string.substring(c);
		}
		else {
			result=string;
		}
	return result;	
	}

}
