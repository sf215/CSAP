package help;



class MapClass {

	static String getOutPut(String input)
	{
		if(input.equals("#include<stdio.h>")){
				
			return Data.stdio;
		}
		
		if(input.equals("#include<string.h>")){
			
			return Data.string;
		}
		
		if(input.equals("#include<math.h>")){
			
			return Data.math;
		}
		
		if(input.equals("#include<time.h>")){
			
			return Data.time;
		}
		
		if(input.equals("#include<stdlib.h>")){
			
			return Data.stdlib;	
		}
		
		if(input.equals("#include<conio.h>")){
			
			return Data.conio;
		}
		
		// keywords keliye
		if(input.equals("auto")){
			
			return Data.kauto;
		}		

		if(input.equals("break")){
			
			return Data.kbreak;
		}	
		
		if(input.equals("case")){
			
			return Data.kcase;
		}
		
		if(input.equals("char")){
			
			return Data.kchar;
		}
		
		if(input.equals("const")){
			
			return Data.kconst;
		}
		
		if(input.equals("continue")){
			
			return Data.kcontinue;
		}
		
		if(input.equals("default")){
			
			return Data.kdefault;
		}
		
		if(input.equals("do")){
			
			return Data.kdo;
		}
		
		if(input.equals("double")){
			
			return Data.kdouble;
		}
		
		if(input.equals("esle")){
			
			return Data.kelse;
		}	
		
		if(input.equals("enum")){
			
			return Data.kenum;
		}
		
		if(input.equals("extern")){
			
			return Data.kextern;
		}	
		
		if(input.equals("float")){
			
			return Data.kfloat;
		}
		
		if(input.equals("for")){
			
			return Data.kfor;
		}	
		
		if(input.equals("goto")){
			
			return Data.kgoto;
		}	
		
		if(input.equals("if")){
			
			return Data.kif;
		}
		
		if(input.equals("int")){
			
			return Data.kint;
		}	
		
		if(input.equals("long")){
			
			return Data.klong;
		}	
		
		if(input.equals("registor")){
			
			return Data.kregistor;
		}	
		
		if(input.equals("return")){
			
			return Data.kreturn;
		}	
		
		if(input.equals("short")){
			
			return Data.kshort;
		}	
		
		if(input.equals("signed")){
			
			return Data.ksigned;
		}	
		
		if(input.equals("sizeof")){
			
			return Data.ksizeof;
		}	
		
		if(input.equals("static")){
			
			return Data.kstatic;
		}	
		
		if(input.equals("struct")){
			
			return Data.kstruct;
		}	
		
		if(input.equals("switch")){
			
			return Data.kswitch;
		}	
		
		if(input.equals("typedef")){
			
			return Data.ktypedef;
		}	
		
		if(input.equals("unio")){
			
			return Data.kunion;
		}	
		
		if(input.equals("unsigned")){
			
			return Data.kunsigned;
		}
		if(input.equals("void")){
			
			return Data.kvoid;
		}	
		
		if(input.equals("volatile")){
			
			return Data.kvolatile;
		}	
		
		if(input.equals("while")){
			
			return Data.kwhile;
		}	
		
		//functions 
		
		if(input.equals("getchar()")){
			
			return Data.fgetchar;
		}	
		if(input.equals("putchar()")){
			
			return Data.fputchar;
		}
		
		if(input.equals("printf()")){
			
			return Data.fprintf;
		}
		
		if(input.equals("scanf()")){
			
			return Data.fscanf;
		}
		
		if(input.equals("strcat()")){
			
			return Data.fstrcat;
		}
		
		if(input.equals("strcmp()")){
			
			return Data.fstrcmp;
		}
		
		if(input.equals("strcpy()")){
			
			return Data.fstrcpy;
		}
		
		if(input.equals("isdigit()")){
			
			return Data.fisdigit;
		}
		
		if(input.equals("isalpha()")){
			
			return Data.fisalpha;
		}
		
		if(input.equals("isnum()")){
			
			return Data.fisnum;
		}
		
		if(input.equals("isupper()")){
			
			return Data.fisupper;
		}
		
		if(input.equals("islower()")){
			
			return Data.fislower;
		}
		
		if(input.equals("acos()")){
			
			return Data.facos;
		}
		
		if(input.equals("asin()")){
			
			return Data.fasin;
		}
		
		if(input.equals("atan()")){
			
			return Data.fatan;
		}
		
		if(input.equals("cos()")){
			
			return Data.fcos;
		}
		
		if(input.equals("exp()")){
			
			return Data.fexp;
		}
		
		if(input.equals("fabs()")){
			
			return Data.ffabs;
		}
		
		if(input.equals("time()")){
			
			return Data.ftime;
		}
		
		if(input.equals("clock()")){
			
			return Data.fclock;
		}
		
		if(input.equals("malloc()")){
			
			return Data.fmalloc;
		}
		
		if(input.equals("rand()")){
			
			return Data.frand;
		}
		
		if(input.equals("srand()")){
			
			return Data.fsrand;
		}
		
		if(input.equals("getch()")){
			
			return Data.fgetch;
		}
		else{
			return("Did not found");
		}
	}

		

	
	
	
}
