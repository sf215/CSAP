package BasicGui;

class Data {
	
	static String panel2Info ="Some basic rule for C program :\n"
+"\n"			
+"> C is a case sensitive language so all C instructions must be written in lower case letter.\n"
+"> Keywords are preserved words that have special meaning in C language.\n" 
+"> Thus, keywords cannot be used as variable names because that would try to change the existing meaning of the keyword, which is not allowed.(Go to help package to know about all keywords)\n"
+"> In C language identifiers are the names given to variables, constants, functions and user-define data. These identifier are defined against a set of rules.\n"
+"  Rules for an Identifier -\n"
+"     1.An Identifier can only have alphanumeric characters(a-z , A-Z , 0-9) and underscore(_).\n"
+"     2.The first character of an identifier can only contain alphabet(a-z , A-Z) or underscore (_).\n"
+"     3.Identifiers are also case sensitive in C. For example name and Name are two different identifiers in C.\n"
+"     4.Keywords are not allowed to be used as Identifiers.\n"
+"     5.No special characters, such as semicolon, period, whitespaces, slash or comma are permitted to be used in or as Identifier.\n"
+"> In C language, when we want to use some data value in our program, we can store it in a memory space and name the memory space so that it becomes easier to access it.The naming of an address is known as variable.\n"
+"   Rules to name a Variable -\n"
+"     1.Variable name must not start with a digit.\n"
+"     2.Variable name can consist of alphabets, digits and special symbols like underscore _.\n"
+"     3.Blank or spaces are not allowed in variable name.\n"
+"     4.Keywords are not allowed as variable name.\n"
+"     5.Upper and lower case names are treated as different, as C is case-sensitive, so it is suggested to keep the variable names in lower case.\n"
+"> Declaring, Defining and Initializing a variable -\n"
+"   Declaring - Declaration of variables must be done before they are used in the program. Declaration does the following things.\n"
+"     1.It tells the compiler what the variable name is.\n"
+"     2.It specifies what type of data the variable will hold\n"
+"	 3.Declaration is more like informing the compiler that there exist a variable with following datatype which is used in the program.\n"
+"  Defining - Defining a variable means the compiler has to now assign a storage to the variable because it will be used in the program.\n"
+"   Initializing - Initializing a variable means to provide it with a value.\n"
+"> The standard input-output header file, named stdio.h contains the definition of the functions printf() and scanf(), which are used to display output on screen and to take input from user respectively.(Go to help package to know more)\n"
+"> Rules for using 'if' statement -\n"
+" 1.In if statement, a single statement can be included without enclosing it into curly braces { ... }.\n"
+" 2.== must be used for comparison in the expression of if condition, if you use = the expression will always return true, because it performs assignment not comparison.\n"
+" 3.Other than 0(zero), all other values are considered as true.";

	
	static String panel3Info = "Guidelines to use our software :\n"
+"\n"
+"1.TOOLBAR( from left to right ) -\n"
+" > Create - Create a new file .The file created will have a '.c' extension ,no other type of files are allowed.\n"
+" > Open - Open the existing file.The uploaded file can or cannot be the one you created using this software but it must be a '.c' file.\n"
+" > Run - Compile and run the program.\n"
+" > Undo - Undo the changes made in files.\n"
+" > Close - Close the current file.\n"
+" > Back - Go back to Panel 2 from Panel 3.\n"
+" > Console - Show output and take input of the program.\n"
+" > Help - Have everything you need to know about C language.\n" 
+" \n"
+"2.Panel 1 -\n"
+"  > Current Code - Show the latest line added to your program.\n"
+"  > Full Code - Show full code of the program.\n"
+"  > Warning - Show warning in red if any step of user is not according to guidelines of this software or C language.Every successful step is shown in green.\n"
+"  > Status - Show total number of variables,total number of arrays,totals number of functions,in the current file and current function in which you are working.\n"  
+"  > Outline - Show hierarchy of the program.\n"
+"  \n"
+"3.Panel 3 -\n"
+"  > Add Preprocessors - To add pre processors in the file.Function of each preprocessor is given in help package.\n"
+"  > Declare - To Declare new variables,arrays,functions and select their datatypes.\n"
+"  > Initialize - To Initialize value of variables and arrays.\n"
+"  > Conditon - To apply conditions (if,else if,else).Without 'if' condition ,'else if' and 'else' cannot be applied,the buttons will remain disable.\n"
+"  > Select Function - To select the function in which you want to work.\n"
+"  > Loop - To apply loops (for,while,do while).\n"
+"            Guideline to use 'for' loop -\n"
+"			  1.There are 3 parameters in 'for' loop init,condition and increament/decrement.\n"
+"			  2.Select the operation for each parameter(Select variable,Select operation,Enter Constant).\n"
+"			  3.'init' button will apply the operation in 'init' and show in init box.\n"
+"			  4.'condition' button will apply the operation in 'condition' and show in condition box.\n"
+"			  5.'Inc/Dec' button will apply the operation in 'increament/decrement' and show in increament/decrement box.\n"
+"			  6.'view' button will show the syntax in text area.\n"
+"			  7.'save for loop' will add the code to your file.\n"
+"			Guidelines to use 'while'/'do while' loop -\n"
+"			  1.'while' and 'do while' conditions will have one parameter.\n"
+"			  2. Select operation to perform using(Select variable,Select operation,Enter Constant).\n"
+"			  3.'view' button will show the syntax in text area.\n"
+"			  4.'save while loop'./save do while loop' will add the code to your file.\n"
+"	\n"		  
+"  > Operation - To apply operations (Addition,subtraction,multiplication etc).\n"
+"                1.First combobox is to select the variable in which you want to assign the result of the operations(eg= a=b+c,here a is the assigned variable).\n"
+"				   Select button will select it.If you dont want to assign operation in any variable,dont select anything on combo and don't press the 'select' button.\n"
+"                2.Second combobox is to select the variable on which you want to perform operation.\n"
+"                3.Third combobox is to select the operation.\n"
+"                4.Text field is to enter any constant value.(eg a=b+8;)\n"
+"                5.It is not compulsory to select every combobox or fill value in constant field,do it according to you algorithm.\n"
+"                6.'ok' button will show the syntax of your operation in the text area.\n"
+"                7.'Submit' button will add the operation to your code.\n"	
+"\n"
+"  > End loop or if - it will add a closing bracket('}'),after work in that block is finished.\n"
+"  > Insert Function - There are 2 pars here-1.user defined,2.pre defined.\n"
+"                1.User defined - call all the user defined functions.\n"
+"                2.pre defined - there are 4 parts,\n"
+"                     1.Input/Output - printf() - to print anything(including the variables declared in the program) in the output.\n"
+"                                    - scanf() - to take user input after runing the program.\n"
+"                                    - view - show syntax in text area.\n"
+"                    2.No parameters - call pre defined function with no parameters.\n"
+"                     3.One parameter - call pre defined function with one parameters.\n"
+"                     4.Two parameters - call pre defined function with two parameters.\n"
+"					 \n"
+"  > Keywords - Add keywords in the program,to know about all keywords go to help package.";
}