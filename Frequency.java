
public class Frequency {
       
	public static void main(String[] args) {
	    String text = "Counntry road take me wooome";
	    for(int i = 0; i<text.length();i++){
	    	  if(text.charAt(i) == ' '){
	  	    	continue;
	  	    }
	    System.out.print(count(text,text.charAt(i),0)+ " ");
	    System.out.print(text.charAt(i));
	    System.out.println();
	  
	    }
	}

	public static int count(String line, char c, int pos) {
	    if (pos >= line.length()){
	        return 0;
	    }
	    return compare(line.charAt(pos), c) + count(line, c, pos+1);
	}

	
	public static int compare(char a, char b){
	    if (a == b){
	        return 1;
	    } else {
	        return 0;
	    }
	}
}
