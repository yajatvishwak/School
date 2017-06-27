

	class prime{
		 int s ;
		 int c ;
		prime(){
		s= 7;
		c=0;
		}
		    public  int chk(int s , int a){
		    if(a<=s){
		   
		    
		        if(s%a==0)
		        {
		    c++;
		}  
		  return  chk(s,a+1);
		}
		  else { return c;}
		}
		public static void main(String agrs[]){
		    prime ob = new prime();
		    int c=ob.chk(ob.s,1);
		if (c == 2){
		    System.out.println("The no. is prime");
		}else{
		 System.out.println("number is not prime");
		}


		}

		}
