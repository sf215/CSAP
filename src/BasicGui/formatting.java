package BasicGui;

import java.util.regex.Pattern;
class Formatting {
	
	public static String format(String s) {
	//	System.out.println(s);
		
		
			s=s.replaceAll("\n", "");
			s=s.replaceAll("   ", "");
		
		//	System.out.println(s);
			
		String s1=".h>";
		
		String s3="{";
		String s4="}";
	
				
			if(s.contains(s1)) {				
				s=s.replaceAll(s1, s1+"\n");				
         	}
			
			 s=removeForSemicolon(s);
		//	 s=st2;
						
			if(s.contains(s3)) {
				s=s.replaceAll(Pattern.quote(s3), s3+"\n");
			}

			if(s.contains(s4)) {
				s=s.replaceAll(Pattern.quote(s4), s4+"\n");
			}
		
			s=spacing(s,s3);
		
	//		System.out.println(s);
			return s;
	   }
	
 static String spacing(String s,String s3) {
			String st=s;
	
			int NoOfOpenBrackets=0;
			while(st.contains(s3)) {
				NoOfOpenBrackets++;
				st=st.replaceFirst("\\{", " ");
			}
		    st=s;
		    
			int NoOfLoop=0;
			StringBuilder x=new StringBuilder(s);
			StringBuilder sb=new StringBuilder(s);			
            int[] start=new int[NoOfOpenBrackets];
            int[] end =new int[NoOfOpenBrackets];
			int NoOfOpenBrackets2=NoOfOpenBrackets;
			
			while(st.contains(s3) && NoOfOpenBrackets>0 && NoOfLoop<NoOfOpenBrackets2) {	
			
				
				int lines=0;
				int temp=0;
				int indexOfEndBracket = 0;
				int indexOfStartBracket=0;
				int indexOfNewLine=0;
				int v=0;
				
						
			    indexOfStartBracket=st.indexOf("{");
			    lines=indexOfStartBracket;
				st=st.substring(indexOfStartBracket);
				st=st.replaceFirst("\\{", " ");
				indexOfStartBracket=st.indexOf("{");            
				indexOfEndBracket=st.indexOf("}");
				while(indexOfStartBracket<indexOfEndBracket && indexOfStartBracket>=0) {
					st=st.replaceFirst("\\{", " ");
					st=st.replaceFirst("\\}", " ");
					 indexOfStartBracket=st.indexOf("{");
					 indexOfEndBracket=st.indexOf("}");				
				}
				
				st=st.substring(0,indexOfEndBracket+1);
			
			    indexOfNewLine=st.indexOf("\n");			
				while(st.contains("\n") ) {		
					sb.insert(indexOfNewLine+lines+temp+1, "   ");
			    	temp=temp+3;
			        st=st.replaceFirst(Pattern.quote("\n"), " ");
			        indexOfNewLine=st.indexOf("\n");
			    }  
				
				x=new StringBuilder(sb);
			    v=indexOfEndBracket+lines+temp;		   	
			   	start[NoOfLoop]=v;
			   	end[NoOfLoop]=lines;
			   	
			   	int u=NoOfLoop;
			   	while(u>=0) {
			   	x.setCharAt(start[u],' ');
			   	x.setCharAt(end[u],' ');
			   	u--;
		    	}	
			st=x.toString();
	
			NoOfLoop++;
			NoOfOpenBrackets--;
				
			}
		    s=sb.toString();
		//    System.out.println(s);
			return s;
			
			
			
			}
	
	
	
 static String removeForSemicolon(String s) {
			String s2=";";
			String s4="for";
			int count =0;
			//count no. of for loops
			String st2 = s;
			while(st2.contains(s4)) {
				st2=st2.replaceFirst(s4, "");
				count++;
		    	}
					
			//store all loops in a string array and remove from original string
			st2=s;
			int i=0;
			String[] ignore = new String[count];
			while(count>0) {
						 
				 String e=st2.substring(st2.indexOf("for"));
	  			int index=e.indexOf(")");
				e=e.substring(0,index+1);
				st2=st2.replaceFirst(Pattern.quote(e),"");				
				ignore[i]=e;
				i++;
				count--;				
			}
				
			//for loop k ";" k alawa saare ";" k baad new line
			st2=st2.replaceAll(s2, s2+"\n");
				
			//ab foor loop komphir se append karwana hai to convert into string builder
			StringBuilder w = new StringBuilder(st2);
			String sb=s;
			//x aaray will store new position at which each for loop will insert at the string after new line
			int x[]=new int[ignore.length];
			for(int k=0;k<ignore.length;k++) {
				int q=0;  //to count number of new lines before each loop
				sb=s.substring(0,s.indexOf(ignore[k]));
				while(sb.contains(";")) {
					sb=sb.replaceFirst(";", "");					
					q++;
				}
				q=q-2*k; //remove the ";" of previous for loop bcoz unme new line nhi hai
				//new position=old position-length of each for loop-q
				 x[k]=s.indexOf(ignore[k])+q;
				 int y=k-1;
				 if(k>0) {
					 while(y<=k && y>=0) {
	      				 x[k]=x[k]-ignore[y].length();
						 y--;
					 }
					}
				}
			for(int k=0;k<ignore.length;k++) {
			//	System.out.println("old pos = "+x[k]);
				//after each insertion new position will shift length of previous loops times
				int y=k-1;
				if(k>0) {
					while(y<=k && y>=0) {
					x[k]=x[k]+ignore[y].length();
					y--;
					}
				}
			//	System.out.println("new pos "+x[k]);
				w.insert(x[k], ignore[k]);
				}
				
	  	     st2=w.toString();		     
			return st2;	
					
				}

}
