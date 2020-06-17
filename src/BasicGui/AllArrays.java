package BasicGui;

public class AllArrays {
	
	static String[] getPanel2Button()
	{
		String [] s = {"Preprocessors","Declare","Initialize","Condition",
				"Loops","Opertions","Functions","Block End","Keywords","Switch Function"};
		return s;
	}
	
	static String[] getPreProcessor()
	{
		String[] preprocessor={"#include<stdio.h>","#include<string.h>","#include<ctype.h>",
				"#include<math.h>","#include<time.h>","#include<stdlib.h>",
				"#include<conio.h>","#include<asset.h>","#include<locale.h>",
				"#include<setjmp.h>","#include<signal.h>","#include<stdarg.h>"};
		return preprocessor;
	}
	
	static String[] getStorageClass()
	{
		String d[] = {"auto","static","register"};
		return d;
	}
	
	static String[] getReservedkeyword()
	{
		String[] keywords={"auto","break","case","char","const",
				"continue","default","do","double","else",
				"enum","extern","float","for","goto","if","int",
				"long","registor","return","short","signed",
				"sizeof","static","struct","switch","typedef","union",
				"unsigned","void","volatile","while"};
		return keywords;
	}
	
	static String[] getDatatypesWithOutVoid()
	{
		String [] datatypes = {"char","unsigned char","signed char","int","signed int","signed short int","signed long int",
				"unsigned int","unsigned short int","unsigned long int","float","double","long double"};
		return datatypes;
	}
	
	static String[] getDatatypesWithVoid()
	{
		String [] datatypes = {"char","unsigned char","signed char","int","signed int","signed short int","signed long int",
				"unsigned int","unsigned short int","unsigned long int","float","double","long double","void"};
		return datatypes;
	}
	
	static String[] getPanel2DeclareButton()
	{
		String s[] = {"Variable","Function","Pointer","String"};
		return s;
	}
	static String[] getNoParameterPredefinedFunctions()
	{
		String s[] = {"getch","getchar","clock","rand"};
		return s;
	}

	static String[] getOneParameterPredefinedFunctions()
	{
		String s[] = {"isdigit","isnum","isspace","acos","asin"
					,"atan","cos","exp","fabs","time","malloc","free","abs","floor","round","ceil","sin",
					"tan","sinh","cosh","tanh","log","log10","sqrt","trunc"};
		return s;
	}
	
	static String[] getTwoParameterPredefinedFunctions()
	{
		String s[] = {"div","pow"};
		return s;
	}

}
