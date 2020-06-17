package help;

class AllArraysHelp {
	
	static String[] getPreProcessor()
	{
		String[] preprocessor={"#include<stdio.h>","#include<string.h>",
				"#include<math.h>","#include<time.h>","#include<stdlib.h>",
				"#include<conio.h>"};
		return preprocessor;
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
	
	static String[] getFunctions()
	{
		String[]functions= {"getchar()","putchar()","printf()","scanf()",
				"strcat()","strcmp()","strcpy()","isdigit()","isalpha()",
				"isnum()","isupper()","islower()","acos()","asin()","atan()","cos()",
				"exp()","fabs()","time()","clock()","malloc()","rand()","srand()","getch()"};
		return functions;
	}
}
