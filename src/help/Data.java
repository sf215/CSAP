package help;

class Data {
	
	static String stdio = ("---------\n"
				 +"STDIO.H\n"
				 +"---------\n"
				 +"Functions\n"
				 +"---------\n"
				 +"clearerr    fclose      fcloseall\n"
				 +"fdopen      feof        ferror\n"
				 +"fflush      fgetc       fgetchar\n"
				 +"fgetpos     fgets       fileno\n"
				 +"flushall    fopen       fprintf\n"
				 +"fputc       fputchar    fputs\n"
				 +"fread       freopen     fscanf\n"
				 +"fseek       fsetpos     ftell\n"
				 +"fwrite      getc        getchar\n"
				 +"gets        getw        perror\n"
				 +"printf      putc        putchar\n"
				 +"puts        putw        remove\n"
				 +"rename      rewind      rmtmp\n"
				 +"scanf       setbuf      setvbuf\n"
				 +"sprintf     sscanf      strerror\n"
				 +"_strerror   tempnam     tmpfile\n"
				 +"tmpnam      ungetc      unlink\n"
				 +"vfprintf    vfscanf     vprintf\n"
				 +"vscanf      vsprintf    vsscanf\n"
	
				 +"Constants, data types, and global variables\n"
				 +"-------------------------------------------\n"
				 +"buffering modes     BUFSIZ\n"
				 +"EOF                 _F_BIN\n"
				 +"_F_BUF              _F_EOF\n"
				 +"_F_ERR              _F_IN\n"
				 +"_F_LBUF             _F_OUT\n"
				 +"_F_RDWR             _F_READ\n"
				 +"_F_TERM             _F_WRIT\n"
				 +"FILE\n"
	
				 +"FOPEN_MAX\n"
	
				 +"fpos_t              fseek/lseek modes\n"
				 +"_IOFBF              _IOLBF\n"
				 +"_IONBF              L_ctermid\n"
				 +"L_tmpnam            NULL\n"
				 +"SEEK_CUR            SEEK_END\n"
				 +"SEEK_SET            size_t\n"
				 +"stdaux              stderr\n"
				 +"stdin               stdout\n"
				 +"stdprn              SYS_OPEN\n"
				 +"TMP_MAX\n"
	
				);
	
	static String string=("----------\n"
				 +"STRING.H\n"
				 +"----------\n"
				 +"Functions\n"
				 +"----------\n"
				 +"_fmemccpy    _fmemchr     _fmemcmp\n"
				 +"_fmemcpy     _fmemicmp    _fmemset\n"
				 +"_fstrcat     _fstrchr     _fstrcmp\n"
				 +"_fstrcpy     _fstrcspn    _fstrdup\n"
				 +"_fstricmp    _fstrlen     _fstrlwr\n"
				 +"_fstrncat    _fstrncmp    _fstrnicmp\n"
				 +"_fstrncpy    _fstrnset    _fstrpbrk\n"
				 +"_fstrrchr    _fstrrev     _fstrset\n"
				 +"_fstrspn     _fstrstr     _fstrtok\n"
				 +"_fstrupr     memccpy      memchr\n"
				 +"memcmp       memcpy       memicmp\n"
				 +"memmove      memset       movedata\n"
				 +"movmem       setmem       stpcpy\n"
				 +"strcat       strchr       strcmp\n"
				 +"strcmpi      strcpy       strcspn\n"
				 +"strdup       _strerror    strerror\n"
				 +"stricmp      strlen       strlwr\n"
				 +"strncat      strncmp      strncmpi\n"
				 +"strncpy      strnicmp     strnset\n"
				 +"strpbrk      strrchr      strrev\n"
				 +"strset       strspn       strstr\n"
				 +"strtok       strxfrm      strupr\n"
				
				+"Constants, data types, and global variables\n"
				+"-------------------------------------------\n"
				+"size_t");
			
	static String math=("--------\n"
				 +" MATH.H\n"
				 +"---------\n"
				 +"Functions\n"
				 +"---------\n"
				 +"abs                    acos,    acosl\n"
				 +"asin,    asinl         atan,    atanl\n"
				 +"atan2,   atan2l        atof,    _atold\n"
				 +"cabs,    cabsl         ceil,    ceill\n"
				 +"cos,     cosl          cosh,    coshl\n"
				 +"exp,     expl          fabs,    fabsl\n"
				 +"floor,   floorl        fmod,    fmodl\n"
				 +"frexp,   frexpl        hypot,   hypotl\n"
				 +"labs                   ldexp,   ldexpl\n"
				 +"log,     logl          log10,   log101\n"
				 +"matherr, _matherrl     modf,    modfl\n"
				 +"poly,    polyl         pow,     powl\n"
				 +"pow10,   pow10l        sin,     sinl\n"
				 +"sinh,    sinhl         sqrt,    sqrtl\n"
				 +"tan,     tanl          tanh,    tanhl\n"
				 
				+"Constants, data types, and global variables\n"
				+"-------------------------------------------\n"
				 +"complex (struct)       _complexl (struct)\n"
				 +"EDOM                   ERANGE\n"
				 +"exception (struct)     _exceptionl (struct)\n"
				 +"HUGE_VAL               M_E\n"
				 +"M_LOG2E                M_LOG10E\n"
				 +"M_LN2                  M_LN10\n"
				 +"M_PI                   M_PI_2\n"
				 +"M_PI_4                 M_1_PI\n"
				 +"M_2_PI                 M_1_SQRTPI\n"
				 +"M_2_SQRTPI             M_SQRT2\n"
				 +"M_SQRT_2               _mexcep");
	
	static String time=(" ----------\n"
				 +"TIME.H\n"
				 +"--------\n"
				 +"Functions\n"
				 +"--------\n"
				 +"asctime     clock       ctime\n"
				 +"difftime    gmtime      localtime\n"
				 +"mktime      stime       strftime\n"
				 +"_strdate    _strtime    time\n"
				 +"tzset\n"
				
				+"Constants, data types, and global variables\n"
				+"--------------------------------------------\n"
				+"CLK_TCK     clock_t     daylight\n"
				+"size_t      time_t      timezone\n"
				+"tm          tzname");
	
	static String stdlib=(" ----------\n"
						 +"STDLIB.H\n"
						 +"----------\n"
						 +"Functions\n"
						 +"----------\n"
						 +"abort          abs            atexit\n"
						 +"atof           atoi           atol\n"
						 +"bsearch        calloc         div\n"
						 +"ecvt           exit           _exit\n"
						 +"fcvt           free           _fullpath\n"
						 +"gcvt           getenv         itoa\n"
						 +"labs           ldiv           lfind\n"
						 +"_lrotl         _lrotr         lsearch\n"
						 +"ltoa           _makepath      malloc\n"
						 +"max            mblen          mbtowc\n"
						 +"mbstowcs       min            putenv\n"
						 +"qsort          rand           random\n"
						 +"randomize      realloc        _rotl\n"
						 +"_rotr          _searchenv     _splitpath\n"
						 +"srand          strtod         strtol\n"
						 +"_strtold       strtoul        swab\n"
						 +"system         time           ultoa\n"
						 +"wctomb         wcstombs\n"
						
						+"Constants, data types, and global variables\n"
						+"--------------------------------------------\n"
						+"div_t          _doserrno      environ\n"
						+"errno          EXIT_FAILURE   EXIT_SUCCESS\n"
						+"_fmode         ldiv_t         NULL\n"
						+"_osmajor       _osminor       _psp\n"
						+"RAND_MAX       size_t         sys_errlist\n"
						+"sys_nerr       _version       wchar_t");
	
	static String conio=("  CONIO.H\n"
						+"---------\n"
						+"Functions\n"
						+"---------\n"
						+"cgets            clreol\n"
						+"clrscr           cprintf\n"
						+"cputs            cscanf\n"
						+"delline          getch\n"
						+"getche           getpass\n"
						+"gettext          gettextinfo\n"
						+"gotoxy           highvideo\n"
						+"insline          inp\n"
						+"inport           inportb\n"
						+"inpw             kbhit\n"
						+"lowvideo         movetext\n"
						+"normvideo        outp\n"
						+"outport          outportb\n"
						+"outpw            putch\n"
						+"puttext          _setcursortype\n"
						+"textattr         textbackground\n"
						+"textcolor        textmode\n"
						+"ungetch          wherex\n"
						+"wherey           window\n"
						
						+"Constants, data types, and global variables\n"
						+"-------------------------------------------\n"
						+"BLINK           COLORS\n"
						+"directvideo     _NOCURSOR\n"
						+"_NORMALCURSOR   _SOLIDCURSOR\n"
						+"text_info       text_modes\n"
						+"_wscroll");
	
	
	static String kauto=("  auto (keyword)\n"
					 +"--------------------\n"
					 +"Defines a local variable as having a local lifetime.\n"
					
					 +"Syntax:  [auto] <data definition> ;\n"
					
					+"This is the default for local variables and\n"
					+"therefore is rarely used.\n"
					
					 +"Example:\n"
					  +"int main(int argc, char **argv)\n"
					  +"{\n"
					    +"auto int i;\n"
					
					    +"i = 5;\n"
					    +"return i};");
	
	
	static String kbreak=("  break (keyword)\n"
						 +"---------------\n"
						 +"Passes control\n"
						
						 +"Syntax:  break ;\n"
						
						+"The break statement causes control to pass to\n"
						+"the statement following the innermost\n"
						+"enclosing while, do, for, or switch statement.");
	
	
	
	static String kcase=("  switch, case, and default (keywords)\n"
						 +"-----------------------------------\n"
						 +"Branches control\n"
						
						+"Syntax:\n"
						+"þ switch ( <expression> ) <statement>\n"
						+"þ case <constant expression> :\n"
						+"þ default :\n"
						
						+"switch\n"
						+"------\n"
						+"Causes control to branch to one of a list of\n"
						+"possible statements in the block defined by\n"
						+"<statement>.\n"
						
						+"The branched-to statement is determined by\n"
						+"evaluating <expression>, which must return an\n"
						+"integral type.\n"
						
						
						+"case\n"
						+"----\n"
						+"The list of possible branch points within\n"
						+"<statement> is determined by preceding\n"
						+"substatements with\n"
						
						+"case <constant expression> :\n"
						
						+"where <constant expression> must be an int and\n"
						+"must be unique.\n"
						
						+"Once a value is computed for <expression>, the\n"
						+"list of possible <constant expression> values\n"
						+"determined from all case statements is\n"
						+"searched for a match.\n"
						
						+"If a match is found, execution continues after\n"
						+"the matching case statement and continues\n"
						+"until a break statement is encountered or the\n"
						+"end of <statement> is reached.\n"
						
						
						+"default\n"
						+"-------\n"
						+"If a match is not found and the default :\n"
								+"statement prefix is found within <statement>,\n"
								+"execution continues at this point.\n"
						
						+"Otherwise, <statement> is skipped entirely.\n"
						
						+"Example:\n"
						+"switch (operand) {\n"
						+"case MULTIPLY:   x *= y; break;\n"
						+"case DIVIDE:     x /= y; break;\n"
						+"case ADD:        x += y; break;\n"
						+"case SUBTRACT:   x -= y; break;\n"
						+"case INCREMENT2: x++;\n"
						+"case INCREMENT1: x++;    break;\n"
						+"case EXPONENT:\n"
						+"case ROOT:\n"
						+"case MOD:        printf(Not done\n); break;\n"
						+"default:         printf(Bug!\n);\n"
						
						+"exit(1);\n"
						+"}");
	
	
	static String kchar=(" char (keyword)\n"
						 +"-------------------\n"
						 +"Character data type\n"
			
						+"Variables of type char are 1 byte in length.\n"
			
						+"They can be signed (default) or unsigned.");
		
	
	static String kconst =("  const (keyword)\n"
						 +"------------------------\n"
						 +"Makes variable value unmodifiable\n"
						
						+"Syntax:\n"
						+"þ const <variable name> [ = <value> ] ;\n"
						+"þ <function name> ( const <type>*<variable name> ;)\n"
						
						+"In the first version, the const modifier\n"
						+"enables you to assign an initial value to a\n"
						+"variable that cannot later be changed by the\n"
						+"program. For example,\n"
						
						+"const my_age = 39;");
								
							
	static String kcontinue=(  "continue (keyword)\n"
								+"--------------------\n"
								+"Passes control\n"
						
						+"Syntax:  continue ;\n"
						
						+"Causes control to pass to the end of the\n"
						+"innermost enclosing while, do, or for\n"
						+"statement, at which point the loop\n"
						+"continuation condition is re-evaluated.\n"
						
						+"Example:\n"
						+"for (i = 0; i < 20; i++) {\n"
						+"if (array[i] == 0)\n"
						+"continue;\n"
						+"array[i] = 1/array[i];\n"
						+"}\n"
						
						
						
						
						+"Any assignments to my_age will result in a\n"
						+"compiler error.\n"
						
						+"þ NOTE: C++ extends const to include classes\n"
						+"and member functions.\n"
						
						+"þ WARNING: A const variable can be indirectly\n"
						+"modified by a pointer, as in the following:\n"
						
						+"*(int *)&my_age = 35;\n"
						
						+"When the const modifier is used with a pointer\n"
						+"parameter in a function's parameter list, the\n"
						+"function cannot modify the variable that the\n"
						+"pointer points to. For example,\n"
						
						+"int printf (const char *format, ...);\n"
						
						+"Here the printf function is prevented from\n"
						+"modifying the format string.");
		
	
	static String kdefault=("  switch, case, and default (keywords)\n"
						 +"---------------------------------\n"
						 +"Branches control\n"
						
						+"Syntax:\n"
						+"þ switch ( <expression> ) <statement>\n"
						+"þ case <constant expression> :\n"
						+"þ default :\n"
						
						+"switch\n"
						+"------\n"
						+"Causes control to branch to one of a list of\n"
						+"possible statements in the block defined by\n"
						+"<statement>.\n"
						
						+"The branched-to statement is determined by\n"
						+"evaluating <expression>, which must return an\n"
						+"integral type.\n"
						
						
						+"case\n"
						+"-----\n"
						+"The list of possible branch points within\n"
						+"<statement> is determined by preceding\n"
						+"substatements with\n"
						
						+"case <constant expression> :\n"
						
						+"where <constant expression> must be an int and\n"
						+"must be unique.\n"
						
						+"Once a value is computed for <expression>, the\n"
						+"list of possible <constant expression> values\n"
						+"vdetermined from all case statements is\n"
						+"searched for a match.\n"
						
						+"If a match is found, execution continues after\n"
						+"the matching case statement and continues\n"
						+"until a break statement is encountered or the\n"
						+"end of <statement> is reached.\n"
						
						
						+"default\n"
						+"-------\n"
						+"If a match is not found and the 'default :'\n"
								+"statement prefix is found within <statement>,\n"
								+"execution continues at this point.\n"
						
						+"Otherwise, <statement> is skipped entirely.\n"
						
						+"Example:\n"
						+"switch (operand) {\n"
						+"case MULTIPLY:   x *= y; break;\n"
						+"case DIVIDE:     x /= y; break;\n"
						+"case ADD:        x += y; break;\n"
						+"case SUBTRACT:   x -= y; break;\n"
						+"case INCREMENT2: x++;\n"
						+"case INCREMENT1: x++;    break;\n"
						+"case EXPONENT:\n"
						+"case ROOT:\n"
						+"case MOD:        printf(Not done\n); break;\n"
						+"default:         printf(Bug!\n);\n"
						
						+"exit(1);\n"
						+"}");
  		


	static String kdo=("    do ... while loop\n"
						 +"-------------------\n"
						 +"Do ... while loop\n"
						
						+"Syntax:  do <statement> while ( <expression> );\n"
						
						+"<statement> is executed repeatedly as long as\n"
						+"the value of <expression> remains non-zero.\n"
						
						+"The test takes place AFTER each execution of\n"
						+"the <statement>.\n"
						
						+"Example:\n"
						+"i = 1; n = 1;\n"
						+"do {\n"
						+"n *= i;\n"
						+"i++;\n"
						+"} while (i <= factorial);\n"
						
						+"See Alos:\n"
						+"while){\n"
								
						+"}");
	static String kdouble=(  " float, double and long double (keywords)\n"
								+"---------------------------------------\n"
								+" Real number data types\n"
						
						+"Type          ³ Length  ³ Range\n"
						+"-------------------------------------------------------------------\n"
						+"float         ³ 32 bits ³   3.4 * (10**-38) to 3.4 * (10**+38)\n"
						+"double        ³ 64 bits ³  1.7 * (10**-308) to 1.7 * (10**+308)\n"
						+"long double   ³ 80 bits ³ 3.4 * (10**-4932) to 1.1 * (10**+4932)\n"
						
						+"Use of double or float requires linking in the\n"
						+"floating-point math package.\n"
						
						+"Turbo C++ will do this automatically if you\n"
						+"use floating point in your program.");
		
	
	static String kelse=("  if (keyword)\n"
						 +"--------------\n"
						 +"Conditional\n"
						
						+"Syntax:\n"
						+"þ if ( <expression> )  <statement1>;\n"
						+"þ if ( <expression> )  <statement1>;\n"
						+"else  <statement2>;\n"
						
						+"If <expression> is non-zero when evaluated,\n"
						+"<statement1> is executed.\n"
						
						+"In the second case, <statement2> is executed\n"
						+"if the expression is 0.\n"
						
						+"An optional else can follow an if statement,\n"
						+"but no statements can come between an if\n"
						+"statement and an else.\n"
						
						+"Examples:\n"
						+"if (count < 50) count++;\n"
						
						+"if (x < y)\n"
						+"z = x;\n"
						+"else\n"
						+"z = y;\n"
						
						+"The #if and #else preprocessor statements\n"
						+"(directives) look similar to the if and else\n"
						+"statements, but have very different effects.\n"
						
						+"They control which source file lines are\n"
						+"compiled and which are ignored.");
		
	

	static String kenum=("  enum (keyword)\n"
								+"----------------\n"
								+"Defines a set of constants of type int.\n"
					
					+"Syntax:  enum [<type_tag>] {<constant_name> [= <value>], ...} [var_list];\n"
					
					+"<type_tag> is an optional type tag that names\n"
					+"the set.\n"
					
					+"<constant_name> is the name of a constant that\n"
					+"can optionally be assigned the value of\n"
					+"<value>.\n"
					
					+"þ NOTE: <value> must be an integer. If <value>\n"
					+"is missing, it is assumed to be\n"
					
					+"<prev> + 1\n"
					
					+"where <prev> is the value of the previous\n"
					+"integer constant in the list. For the first\n"
					+"integer constant in the list, the default\n"
					+"value is 0.\n"
					
					+"<var_list> is an optional variable list that\n"
					+"can follow the type declaration. It assigns\n"
					+"variables to the enum type.\n"
					
					+"Example:\n"
					+"enum modes { LASTMODE = -1, BW40 = 0, C40, BW80, C80, MONO = 7 };\n"
					+"/*\n"
					+"'modes' is the type tag.\n"
							+" 'LASTMODE', 'BW40', 'C40', etc. are the constant names.\n"
					     +"The value of C40 is 1 (BW40 + 1); BW80 = 2 (C40 + 1), etc.");
	
	
	static String kextern=("  extern (keyword)\n"
						 +"---------------------\n"
						 +"Indicates that the actual storage and initial\n"
						 +"value of a variable, or body of a function, is\n"
						 +"defined elsewhere, usually in a separate\n"
						 +"source code module.\n"
						
						+"Syntax:\n"
						+"þ extern <data definition> ;\n"
						+"þ extern <function prototype> ;\n"
						
						+"The keyword extern is optional for a function\n"
						+"prototype.\n"
						
						+"Example:\n"
						+"extern int _fmode;\n"
						+"extern void Factorial(int n);\n"
						
						+"See Also:\n"
						+"Error message:  Unknown language, must be C or C++\n"
						+"Error message:  extern variable cannot be initialized\n"
						+"Error message:  Only one of a set of overloaded functions can be 'C'\n"
								+"Error message:  Function defined inline after use as extern\n"
								+"Error message:  Linkage specification not allowed\n"
								+"Error message:  Undefined symbol 'symbol' in module 'module'");	
		
	
	static String kfloat=("  float, double and long double (keywords)\n"
								+"---------------------------------------\n"
								+" Real number data types\n"
						
						+"Type          ³ Length  ³ Range\n"
						+"-------------------------------------------------------------------\n"
						+"float         ³ 32 bits ³   3.4 * (10**-38) to 3.4 * (10**+38)\n"
						+"double        ³ 64 bits ³  1.7 * (10**-308) to 1.7 * (10**+308)\n"
						+"long double   ³ 80 bits ³ 3.4 * (10**-4932) to 1.1 * (10**+4932)\n"
						
						+"Use of double or float requires linking in the\n"
						+"floating-point math package.\n"
						
						+"Turbo C++ will do this automatically if you\n"
						+"use floating point in your program.");
		
	
	static String kfor=("  for (keyword)\n"
					+"-----------\n"
					+"For loop\n"
					
					+"Syntax:  for ( [<expr1>] ; [<expr2>] ; [<expr3>] )  <statement>\n"
					
					+"<statement> is executed repeatedly UNTIL the\n"
					+"value of <expr2> is 0.\n"
					
					+"BEFORE the first iteration, <expr1> is\n"
					+"evaluated. This is usually used to initialize\n"
					+"variables for the loop.\n"
					
					+"AFTER each iteration of the loop, <expr3> is\n"
					+"valuated. This is usually used to increment a\n"
							+"loop counter.\n"
					
					+"In C++, <expr1> can be an expression or a\n"
					+"declaration.\n"
					
					+"The scope of any declared identifier extends\n"
					+"to the end of the control statement only.\n"
					
					+"All the expressions are optional. If <expr2>\n"
					+"is left out, it is assumed to be 1.\n"
					
					+"Examples:\n"
					+"for (i=0; i<100; i++)\n"
					+"sum += x[i];\n"
					
					+"for (i=0, t=string; i < 40 && *t; i++, t++)\n"
					+"putch(*t);\n"
					+"putch('\n');");
		
	
	static String kgoto=("  goto (keyword)\n"
					 +"-----------------\n"
					 +"Transfers control\n"
					
					+"Syntax:  goto <identifier> ;\n"
					
					+"Control is unconditionally transferred to the\n"
					+"location of a local label specified by\n"
					+"<identifier>.\n"
					
					+"Example:\n"
					+"Again:\n"
					+";\n"
					+".\n"
					+".\n"
					+".\n"
					+"goto Again;\n"
					
					+"þ NOTE: Labels must be followed by a statement\n"
					+"(;).");
		
	
	static String kif=("  if (keyword)\n"
					 +"-------------\n"
					 +"Conditional\n"
					
					+"Syntax:\n"
					+"þ if ( <expression> )  <statement1>;\n"
					+"þ if ( <expression> )  <statement1>;\n"
					+"  else  <statement2>;\n"
					
					+"If <expression> is non-zero when evaluated,\n"
					+"<statement1> is executed.\n"
					
					+"In the second case, <statement2> is executed\n"
					+"if the expression is 0.\n"
					
					+"An optional else can follow an if statement,\n"
					+"but no statements can come between an if\n"
					+"statement and an else.\n"
					
					+"Examples:\n"
					+"if (count < 50) count++;\n"
					
					+"if (x < y)\n"
					+"  z = x;\n"
					+"else\n"
					+"  z = y;\n"
					
					+"The #if and #else preprocessor statements\n"
					+"(directives) look similar to the if and else\n"
					+"statements, but have very different effects.\n"
					
					+"They control which source file lines are\n"
					+"compiled and which are ignored.");
		
	
	static String kint=("  int (keyword)\n"
					 +"-----------------\n"
					 +"Integer data type\n"
					
					+"Variables of type int are one word in length.\n"
					
					+"They can be signed (default) or unsigned.");
		
	
	static String klong=("signed, unsigned, short, and long\n"
					  +"(type modifiers)\n"
					  +"-------------------------------\n"
					  +"A type modifier alters the meaning of the base\n"
					  +"data type to yield a new type.\n"
					
					+"Each of these type modifiers can be applied to\n"
					+"the base type int.\n"
					
					+"The modifiers signed and unsigned can also be\n"
					+"applied to the base type char.\n"
					
					+"In addition, long can be applied to double.\n"
					
					+"When the base type is omitted from a\n"
					+"declaration, int is assumed.\n"
					
					+"Examples:\n"
					+"long               x;    /* int is implied     */\n"
					+"unsigned char      ch;\n"
					+"signed   int       i;    /* signed is default  */");
		
	
	static String kregistor=("  register (keyword)\n"
					+"------------------------\n"
					+"Store the variable being declared in a CPU register\n"
					
					+"Syntax:  register <data definition> ;\n"
					
					+"The register type modifier tells the compiler\n"
					+"to store the variable being declared in a CPU\n"
					+"register (if possible), to optimize access.\n"
					
					+"Example:\n"
					+"register int i;");
		
	
	static String kreturn=("  return (keyword)\n"
									+"---------------------\n"
						+"Exits immediately from the currently executing\n"
						+"function to the calling routine, optionally\n"
						+"returning a value.\n"
						
						 +"Syntax:  return [ <expression> ] ;\n"
						
						 +"Example:\n"
						  +"double sqr(double x)\n"
						  +"{\n"
						    +"return (x*x);\n"
						    +"}");
		
	
	static String kshort=("signed, unsigned, short, and long\n"
			  +"(type modifiers)\n"
			  +"-------------------------------\n"
			  +"A type modifier alters the meaning of the base\n"
			  +"data type to yield a new type.\n"
			
			+"Each of these type modifiers can be applied to\n"
			+"the base type int.\n"
			
			+"The modifiers signed and unsigned can also be\n"
			+"applied to the base type char.\n"
			
			+"In addition, long can be applied to double.\n"
			
			+"When the base type is omitted from a\n"
			+"declaration, int is assumed.\n"
			
			+"Examples:\n"
			+"long               x;    /* int is implied     */\n"
			+"unsigned char      ch;\n"
			+"signed   int       i;    /* signed is default  */");
		
	
	static String ksigned=("signed, unsigned, short, and long\n"
					  +"(type modifiers)\n"
					  +"-------------------------------\n"
					  +"A type modifier alters the meaning of the base\n"
					  +"data type to yield a new type.\n"
					
					+"Each of these type modifiers can be applied to\n"
					+"the base type int.\n"
					
					+"The modifiers signed and unsigned can also be\n"
					+"applied to the base type char.\n"
					
					+"In addition, long can be applied to double.\n"
					
					+"When the base type is omitted from a\n"
					+"declaration, int is assumed.\n"
					
					+"Examples:\n"
					+"long               x;    /* int is implied     */\n"
					+"unsigned char      ch;\n"
					+"signed   int       i;    /* signed is default  */");
		
	
	static String ksizeof=("   sizeof (keyword)\n"
						+"--------------------\n"
						+"Returns the size, in bytes, of the given\n"
						+"expression or type (as type size_t).\n"
						
						+"Syntax:\n"
						+"þ sizeof <expression>\n"
						+"þ sizeof ( <type> )\n"
						
						+"Example:\n"
						+"memset(buff, 0, sizeof(buff));\n"
						+"nitems = sizeof(table) / sizeof(table[0]);\n"
						
						+"See Also:\n"
						+"Operator Precedence");
		
	
	static String kstatic=("    static (keyword)\n"
									+"--------------------\n"
									+"Preserves variable value\n"
						
						+"Syntax:\n"
						+"þ static <data definition> ;\n"
						+"þ static <function definition> ;\n"
						
						+"A function or data element is only known\n"
						+"within the scope of the current compile.\n"
						
						+"If you use the 'static' keyword with a\n"
								+"variable that is local to a function, it\n"
								+"allows the last value of the variable to be\n"
								+"preserved between successive calls to that\n"
								+"function.\n"
						
						+"Examples:\n"
						+"static int i;\n"
						+"static void printnewline(void) {}");
		
	
	static String kstruct=("    struct (keyword)\n"
										+"-------------------\n"
										+"Groups variables into a single record\n"
							
							+"Syntax:\n"
							+"struct [<struct type name>] {\n"
							+"[<type> <variable-name[, variable-name, ...]>] ;\n"
							+"[<type> <variable-name[, variable-name, ...]>] ;\n"
							+"...\n"
							+"} [<structure variables>] ;\n"
							
							+"A struct, like a union, groups variables into\n"
							+"a single record.\n"
							
							+"                        ³\n"
							+"----------------------------------------------------------------\n"
							  +"<struct type name>    ³ An optional tag name that refers to thev\n"
									 +"               ³ structure type\n"
							  +"<structure variables> ³ The data definitions, also optional.\n"
							
							+"Though both <struct type name> and <structure\n"
							+"variables> are optional, one of the two must\n"
							+"appear.\n"
							
							+"Elements in the record are defined by naming a\n"
							+"<type>, followed by one or more\n"
							+"<variable-name> (separated by commas).\n"
							
							+"Different variable types can be separated by a\n"
							+"semicolon.");
		
	
	static String kswitch=("  switch, case, and default (keywords)\n"
			 +"---------------------------------\n"
			 +"Branches control\n"
			
			+"Syntax:\n"
			+"þ switch ( <expression> ) <statement>\n"
			+"þ case <constant expression> :\n"
			+"þ default :\n"
			
			+"switch\n"
			+"------\n"
			+"Causes control to branch to one of a list of\n"
			+"possible statements in the block defined by\n"
			+"<statement>.\n"
			
			+"The branched-to statement is determined by\n"
			+"evaluating <expression>, which must return an\n"
			+"integral type.\n"
			
			
			+"case\n"
			+"-----\n"
			+"The list of possible branch points within\n"
			+"<statement> is determined by preceding\n"
			+"substatements with\n"
			
			+"case <constant expression> :\n"
			
			+"where <constant expression> must be an int and\n"
			+"must be unique.\n"
			
			+"Once a value is computed for <expression>, the\n"
			+"list of possible <constant expression> values\n"
			+"vdetermined from all case statements is\n"
			+"searched for a match.\n"
			
			+"If a match is found, execution continues after\n"
			+"the matching case statement and continues\n"
			+"until a break statement is encountered or the\n"
			+"end of <statement> is reached.\n"
			
			
			+"default\n"
			+"-------\n"
			+"If a match is not found and the 'default :'\n"
					+"statement prefix is found within <statement>,\n"
					+"execution continues at this point.\n"
			
			+"Otherwise, <statement> is skipped entirely.\n"
			
			+"Example:\n"
			+"switch (operand) {\n"
			+"case MULTIPLY:   x *= y; break;\n"
			+"case DIVIDE:     x /= y; break;\n"
			+"case ADD:        x += y; break;\n"
			+"case SUBTRACT:   x -= y; break;\n"
			+"case INCREMENT2: x++;\n"
			+"case INCREMENT1: x++;    break;\n"
			+"case EXPONENT:\n"
			+"case ROOT:\n"
			+"case MOD:        printf(Not done\n); break;\n"
			+"default:         printf(Bug!\n);\n"
			
			+"exit(1);\n"
			+"}");
		
	
	static String ktypedef=(" typedef (keyword)\n"
						 +"------------------------\n"
						 +"Assigns the symbol name <identifier> to the\n"
						 +"data type definition <type definition>.\n"
						
						+"Syntax:  typedef <type definition> <identifier> ;\n"
						
						+"Examples:\n"
						+"þ typedef unsigned char byte;\n"
						+"þ typedef char str40[41];\n"
						+"þ typedef struct {\n"
						+"double re, im;\n"
						+"} complex;");
		
	
	static String kunion=("      union (keyword)\n"
						 +"--------------------\n"
						 +"A union is similar to a struct, except it\n"
						+"allows you to define variables that share\n"
						+"storage space.\n"
						
						 +"Syntax:\n"
						  +"union [<union type name>] {\n"
						    +"<type> <variable names> ;\n"
						    +"...\n"
						    +"} [<union variables>] ;\n"
						
						+"For example,\n"
						
						  +"union int_or_long {\n"
						    +"int     i;\n"
						    +"long    l;\n"
						    +"} a_number;\n"
						
						+"Turbo C++ will allocate enough storage in\n"
						+"a_number to accommodate the largest element in\n"
						+"the union.\n"
						
						+"Unlike a struct, the variables a_number.i and\n"
						+"a_number.l occupy the same location in memory.\n"
						+"Thus, writing into one will overwrite the\n"
						+"other.\n"
						
						+"Elements of a union are accessed in the same\n"
						+"manner as a struct.\n"
						
						 +"See Also:\n"
						  +"bit fields   class        public\n"
						  +"struct");
		
	
	static String kunsigned=("signed, unsigned, short, and long\n"
			  +"(type modifiers)\n"
			  +"-------------------------------\n"
			  +"A type modifier alters the meaning of the base\n"
			  +"data type to yield a new type.\n"
			
			+"Each of these type modifiers can be applied to\n"
			+"the base type int.\n"
			
			+"The modifiers signed and unsigned can also be\n"
			+"applied to the base type char.\n"
			
			+"In addition, long can be applied to double.\n"
			
			+"When the base type is omitted from a\n"
			+"declaration, int is assumed.\n"
			
			+"Examples:\n"
			+"long               x;    /* int is implied     */\n"
			+"unsigned char      ch;\n"
			+"signed   int       i;    /* signed is default  */");
		
	
	static String kvoid=("  void (type)\n"
						 +"-----------------\n"
						 +"Empty data type\n"
						
						+"When used as a function return type, void\n"
						+"means that the function does not return a\n"
						+"value.\n"
						
						+"void hello(char *name)\n"
						+"{\n"
						+" printf(Hello, %s.,name);\n"
								+"}\n"
						
						+"When found in a function heading, void means\n"
						+"the function does not take any parameters.\n"
						
						+"int init(void)\n"
								  +"{\n"
								  +"return 1;\n"
								  +"}\n"
						
						+"Void pointers\n"
						+"--------------\n"
						+"Pointers can also be declared as void.\n"
						
						+"Void pointers can't be dereferenced without\n"
						+"explicit casting. This is because the compiler\n"
						+"can't determine the size of the object the\n"
						+"pointer points to.\n"
						
						+"Example:\n"
						+"int x;\n"
						+"float r;\n"
						+"void *p = &x;          /* p points to x */\n"
						+"int main (void)\n"
								  +"{\n"
								  +"*(int *) p = 2;\n"
								  +"p = &r;              /* p points to r */\n"
								  +"*(float *)p = 1.1;\n"
								  +"}\n"
								  +"unsigned long int  l;    /* int OK, not needed */");
		
	
	static String kvolatile=("    volatile (keyword)\n"
							 +"--------------------------\n"
							 +"Indicates that a variable can be changed by a\n"
							 +"background routine.\n"
							
							+"Syntax:  volatile <data definition> ;\n"
							
							+"Every reference to the variable will reload\n"
							+"the contents from memory rather than take\n"
							+"advantage of situations where a copy can be in\n"
							+"a register.\n"
							
							+"þ NOTE: C++ extends volatile to include\n"
							+"classes and member functions.");
		
	
	static String kwhile=("while (keyword)\n"
						 +"-------------------\n"
						 +"Repeats execution\n"
						
						+"Syntax:  while ( <expression> ) <statement>\n"
						
						+"<statement> is executed repeatedly as long as\n"
						+"the value of <expression> remains non-zero.\n"
						
						+"The test takes place before each execution of\n"
						+"the <statement>.\n"
						
						+"Example:\n"
						+"while (*p == ' ') p++;");
								
	
	//functions data
	
		static String fgetchar = ("---------------------\n"
							 +"Ýgetchar, putcharÞ                 <STDIO.H>\n"
							 +"--------------------\n"
							 +"þ getchar is a macro that gets a character from stdin\n"
							 +"þ putchar is a macro that outputs a character on stdout\n"
							
							 +"Declaration:\n"
							  +"þ int getchar(void);\n"
							  +"þ int putchar(int c);\n"
							
							+"Remarks:\n"
							+"getchar is a macro defined as getc(stdin)\n"
							+"getchar returns the next character on the\n"
							+"input stream stdin.");
		
		static String fputchar = ("---------------------\n"
							 +"Ýgetchar, putcharÞ                 <STDIO.H>\n"
							 +"--------------------\n"
							 +"þ getchar is a macro that gets a character from stdin\n"
							 +"þ putchar is a macro that outputs a character on stdout\n"
							
							 +"Declaration:\n"
							  +"þ int getchar(void);\n"
							  +"þ int putchar(int c);\n"
							
							+"Remarks:\n"
							+"getchar is a macro defined as getc(stdin)\n"
							+"getchar returns the next character on the\n"
							+"input stream stdin.");
		
		static String fprintf = (" ----------------------\n"
								 +"Ý...printf functionsÞ     <CONIO.H, STDIO.H>\n"
								 +"--------------------\n"
								
								+"þ cprintf  sends formatted output to the text window on the screen\n"
								+"þ fprintf  sends formatted output to a stream\n"
								+"þ printf   sends formatted output to stdin\n"
								+"þ sprintf  sends formatted output to a string\n"
								+"þ vfprintf sends formatted output to a stream, using an argument list\n"
								+"þ vprintf  sends formatted output to stdin, using an argument list\n"
								+"þ vsprintf sends formatted output to a string, using an argument list\n"
								
								+"Declaration:\n"
								+"þ int cprintf (              const char *format [, argument, ...]);\n"
								+"þ int fprintf (FILE *stream, const char *format [, argument, ...]);\n"
								+"þ int printf  (              const char *format [, argument, ...]);\n"
								+"þ int sprintf (char *buffer, const char *format [, argument, ...]);\n"
								+"þ int vfprintf(FILE *stream, const char *format, va_list arglist);\n"
								+"þ int vprintf (              const char *format, va_list arglist);\n"
								+"þ int vsprintf(char *buffer, const char *format, va_list arglist);\n"
								
								+"Remarks:\n"
								+"All these functions are declared in STDIO.H,\n"
								+"except cprintf, which is declared in CONIO.H.\n"
								
								+"The ...printf functions do the following:\n"
								+"þ Accept a series of arguments\n"
								+"þ Apply to each argument a format specifier\n"
								+"contained in the format string *format\n"
								+"þ Output the formatted data (to the screen,\n"
								+"  a stream, stdin, or a string)");
		
		static String fscanf = ("Ý...scanf functions\n"
								 +"-------------------------\n"
								 +" Function³ Header  ³ Scans and formats input from...\n"
								 +"ÍÍÍÍÍÍÍÍÍØÍÍÍÍÍÍÍÍÍØÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍ\n"
								 +"cscanf  ³ CONIO.H ³ The console\n"
								 +"fscanf  ³ STDIO.H ³ A stream\n"
								 +"scanf   ³ STDIO.H ³ stdin\n"
								 +"sscanf  ³ STDIO.H ³ A string\n"
								 +"vfscanf ³ STDIO.H ³ A stream, using an argument list\n"
								 +"vscanf  ³ STDIO.H ³ stdin, using an argument list\n"
								 +"vsscanf ³ STDIO.H ³ A string, using an argument list\n"
								
								+"Declaration:\n"
								+"þ int cscanf (                          char *format [, address, ...]);\n"
								+"þ int fscanf (FILE *stream,       const char *format [, address, ...]);\n"
								+"þ int scanf  (                    const char *format [, address, ...]);\n"
								+"þ int sscanf (const char *buffer, const char *format [, address, ...]);\n"
								+"þ int vfscanf(FILE *stream,       const char *format, va_list arglist);\n"
								+"þ int vscanf (                    const char *format, va_list arglist);\n"
								+"þ int vsscanf(const char *buffer, const char *format, va_list arglist);\n"
								
								+"Remarks:\n"
								+"The ...scanf functions do the following:\n"
								+"þ Scan a series of input fields one character at a time\n"
								+"þ Format each field according to a corresponding format specifier passed\n"
								+" in the format string *format.\n"
								+"þ Store the formatted input at an address passed as an argument following\n"
								+" *format (cscanf also echoes the input directly to the screen)");
		
		static String fstrcat = ("Ý_fstrcat,\n"
						 +"Ýstrcat   Þ                       <STRING.H>\n"
						 +"--------------\n"
						 +"Appends one string to another\n"
						
						+"Declaration:\n"
						+"þ char *strcat(char *dest, const char *src);\n"
						+"þ char far * far _fstrcat(char far *dest, const char far *src);\n"
						
						+"Remarks:\n"
						+"strcat appends a copy of src to the end of\n"
						+"dest. The length of the resulting string is\n"
						+"strlen(dest) + strlen(src).\n"
						
						+"_fstrcat is the far version.\n"
						
						+"Return Value:\n"
						+"strcat returns a pointer to the concatenated\n"
						+"strings.\n"
						
						+"Portability:\n"
						+"  É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
						+"strcat   º Yes ³  Yes ³   Yes  ³          º\n"
						+"_fstrcat º Yes ³      ³        ³          º");
		
		static String fstrcmp = (" Ý_fstricmp, _fstrcmp,      Þ      <STRING.H>\n"
								 +"Ýstrcmp, strcmpi, stricmp  \n"
								 +"----------------------------\n"
								 +"þ _fstrcmp and strcmp compare two strings\n"
								 +"þ strcmpi (a macro) compares two strings without case sensitivity\n"
								 +"þ _fstricmp and stricmp compare two strings without case sensitivity\n"
								
								+"Declaration:\n"
								+"þ int strcmp(const char *s1, const char*s2);\n"
								+"þ int strcmpi(const char *s1, const char *s2)\n"
								+"þ int stricmp(const char *s1, const char *s2);\n"
								+"þ int far _fstrcmp(const char far *s1, const char far *s2);\n"
								+"þ int far _fstricmp(const char far *s1, const char far *s2);\n"
								
								+"Remarks:\n"
								+"þ strcmp performs an unsigned comparison of s1\n"
								+"to s2. _fstrcmp is the far version.\n"
								
								+"þ strcmpi (implemented as a macro that calls\n"
								+"stricmp) performs an unsigned comparison of s1\n"
								+"to s2, without case sensitivity.\n"
								
								+"þ stricmp performs an unsigned comparison of\n"
								+"s1 to s2, without case sensitivity. _fstricmp\n"
								+"is the far version.\n"
								
								+"The string comparison starts with the first\n"
								+"character in each string and continues with\n"
								+"subsequent characters until the corresponding\n"
								+"characters differ or until the end of the\n"
								+"strings is reached.\n"
								
								+"To use strcmpi, you must include STRING.H.\n"
								+"This macro is provided for compatibility with\n"
								+"other C compilers.\n"
								
								+"Return Value:\n"
								+"These routines return an int value that is\n"
								+"þ <  0  if s1 <  s2\n"
								+"þ == 0  if s1 == s2\n"
								+"þ >  0  if s1 >  s2");
		
		static String fstrcpy = ("Ý_fstrcpy,Þ\n"
												+"Ýstrcpy   Þ                       <STRING.H>\n"
												+"--------------\n"
												+"Copies string src to dest\n"
								
								+"Declaration:\n"
								+"þ char *strcpy(char *dest, const char *src);\n"
								+"þ char far * _fstrcpy(char far *dest, const char far *src);\n"
								
								+"Remarks:\n"
								+"Copies string src to dest, stopping after the\n"
								+"terminating null character has been moved.\n"
								
								+"_fstrcpy is the far version.\n"
								
								+"Return Value:  dest\n"
								
								+"Portability:\n"
								+"	  É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
								+"strcpy   º Yes ³  Yes ³   Yes  ³          º\n"
								+"_fstrcpy º Yes ³      ³        ³          º\n"
								+"  ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍÍ¼\n"
								
								
								
								+"Ýisalnum, isalpha, isascii,Þ\n"
								+"Ýiscntrl, isdigit, isgraph,Þ\n"
								+"Ýislower, isprint, ispunct,Þ <all in CTYPE.H>\n"
								+"Ýisspace, isupper, isxdigitÞ\n"
								+"----------------------------\n"
								+"Character classification macros\n"
								
								+"Declarations:\n"
								+"þ int isalnum(int c);  þ int islower(int c);\n"
								+"þ int isalpha(int c);  þ int isprint(int c);\n"
								+"þ int isascii(int c);  þ int ispunct(int c);\n"
								+"þ int iscntrl(int c);  þ int isspace(int c);\n"
								+"þ int isdigit(int c);  þ int isupper(int c);\n"
								+"þ int isgraph(int c);  þ int isxdigit(int c);\n"
								  
								+"Remarks:\n"
								+"The is... macros classify ASCII coded integer\n"
								+"values by table lookup.\n"
								
								+"Each macro is a predicate that returns a\n"
								+"non-zero value for true and 0 for false.\n"
								
								+"isascii is defined on all integer values. The\n"
								+"other is... macros are defined only when\n"
								+"isascii(c) is true or c is EOF.\n"
								
								+"You can make each macro available as a\n"
								+"function by undefining it (with #undef).\n"
								
								+"Return Value:\n"
								+"The is... macros return a non-zero value on\n"
								+"success. For each macro, success is defined as\n"
								+"follows:");
		
		static String fisdigit = (" Ýisalnum, isalpha, isascii,Þ\n"
									 +"Ýiscntrl, isdigit, isgraph,Þ\n"
									 +"Ýislower, isprint, ispunct,Þ <all in CTYPE.H>\n"
									 +"Ýisspace, isupper, isxdigitÞ\n"
									 +"--------------------------------\n"
									 +"Character classification macros\n"
									
									+"Declarations:\n"
									+"þ int isalnum(int c);  þ int islower(int c);\n"
									+"þ int isalpha(int c);  þ int isprint(int c);\n"
									+"þ int isascii(int c);  þ int ispunct(int c);\n"
									+"þ int iscntrl(int c);  þ int isspace(int c);\n"
									+"þ int isdigit(int c);  þ int isupper(int c);\n"
									+"þ int isgraph(int c);  þ int isxdigit(int c);\n"
									
									+"Remarks:\n"
									+"The is... macros classify ASCII coded integer\n"
									+"values by table lookup.\n"
									
									+"Each macro is a predicate that returns a\n"
									+"non-zero value for true and 0 for false.\n"
									
									+"isascii is defined on all integer values. The\n"
									+"other is... macros are defined only when\n"
									+"isascii(c) is true or c is EOF.\n"
									
									+"You can make each macro available as a\n"
									+"function by undefining it (with #undef).\n"
									
									+"Return Value:\n"
									+"The is... macros return a non-zero value on\n"
									+"success. For each macro, success is defined as\n"
									+"follows:\n"
									
									+"þ isalpha:  c is a letter (A to Z or a to z)\n"
									+"þ isascii:  the low order byte of c is in the range 0 to 127 (0x00--0x7F)\n"
									+"þ iscntrl:  c is a delete character or ordinary control character\n"
									+"            (0x7F or 0x00 to 0x1F)\n"
									+"þ isdigit:  c is a digit (0 to 9)\n"
									+"þ isgraph:  c is a printing character, like isprint, except that a space\n"
									+"            character is excluded\n"
									+"þ islower:  c is a lowercase letter (a to z)\n"
									+"þ isprint:  c is a printing character (0x20 to 0x7E)\n"
									+"þ ispunct:  c is a punctuation character (iscntrl or isspace)\n"
									+"þ isspace:  c is a space, tab, carriage return, new line, vertical tab,\n"
									+"              or formfeed (0x09 to 0x0D, 0x20)\n"
									+"þ isupper:  c is an uppercase letter (A to Z)\n"
									+"þ isxdigit: c is a hexadecimal digit (0 to 9, A to F, a to f)\n"
									
									+"Portability (all is... macros except isascii)\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³   Yes  ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍÍ¼\n"
									
									+" isascii:\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³        ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍ");
		
		static String fisalpha = (" Ýisalnum, isalpha, isascii,Þ\n"
									 +"Ýiscntrl, isdigit, isgraph,Þ\n"
									 +"Ýislower, isprint, ispunct,Þ <all in CTYPE.H>\n"
									 +"Ýisspace, isupper, isxdigitÞ\n"
									 +"--------------------------------\n"
									 +"Character classification macros\n"
									
									+"Declarations:\n"
									+"þ int isalnum(int c);  þ int islower(int c);\n"
									+"þ int isalpha(int c);  þ int isprint(int c);\n"
									+"þ int isascii(int c);  þ int ispunct(int c);\n"
									+"þ int iscntrl(int c);  þ int isspace(int c);\n"
									+"þ int isdigit(int c);  þ int isupper(int c);\n"
									+"þ int isgraph(int c);  þ int isxdigit(int c);\n"
									
									+"Remarks:\n"
									+"The is... macros classify ASCII coded integer\n"
									+"values by table lookup.\n"
									
									+"Each macro is a predicate that returns a\n"
									+"non-zero value for true and 0 for false.\n"
									
									+"isascii is defined on all integer values. The\n"
									+"other is... macros are defined only when\n"
									+"isascii(c) is true or c is EOF.\n"
									
									+"You can make each macro available as a\n"
									+"function by undefining it (with #undef).\n"
									
									+"Return Value:\n"
									+"The is... macros return a non-zero value on\n"
									+"success. For each macro, success is defined as\n"
									+"follows:\n"
									
									+"þ isalpha:  c is a letter (A to Z or a to z)\n"
									+"þ isascii:  the low order byte of c is in the range 0 to 127 (0x00--0x7F)\n"
									+"þ iscntrl:  c is a delete character or ordinary control character\n"
									+"            (0x7F or 0x00 to 0x1F)\n"
									+"þ isdigit:  c is a digit (0 to 9)\n"
									+"þ isgraph:  c is a printing character, like isprint, except that a space\n"
									+"            character is excluded\n"
									+"þ islower:  c is a lowercase letter (a to z)\n"
									+"þ isprint:  c is a printing character (0x20 to 0x7E)\n"
									+"þ ispunct:  c is a punctuation character (iscntrl or isspace)\n"
									+"þ isspace:  c is a space, tab, carriage return, new line, vertical tab,\n"
									+"              or formfeed (0x09 to 0x0D, 0x20)\n"
									+"þ isupper:  c is an uppercase letter (A to Z)\n"
									+"þ isxdigit: c is a hexadecimal digit (0 to 9, A to F, a to f)\n"
									
									+"Portability (all is... macros except isascii)\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³   Yes  ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍÍ¼\n"
									
									+" isascii:\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³        ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍ");
		
		static String fisnum = ("Ýisalnum, isalpha, isascii,Þ\n"
									 +"Ýiscntrl, isdigit, isgraph,Þ\n"
									 +"Ýislower, isprint, ispunct,Þ <all in CTYPE.H>\n"
									 +"Ýisspace, isupper, isxdigitÞ\n"
									 +"--------------------------------\n"
									 +"Character classification macros\n"
									
									+"Declarations:\n"
									+"þ int isalnum(int c);  þ int islower(int c);\n"
									+"þ int isalpha(int c);  þ int isprint(int c);\n"
									+"þ int isascii(int c);  þ int ispunct(int c);\n"
									+"þ int iscntrl(int c);  þ int isspace(int c);\n"
									+"þ int isdigit(int c);  þ int isupper(int c);\n"
									+"þ int isgraph(int c);  þ int isxdigit(int c);\n"
									
									+"Remarks:\n"
									+"The is... macros classify ASCII coded integer\n"
									+"values by table lookup.\n"
									
									+"Each macro is a predicate that returns a\n"
									+"non-zero value for true and 0 for false.\n"
									
									+"isascii is defined on all integer values. The\n"
									+"other is... macros are defined only when\n"
									+"isascii(c) is true or c is EOF.\n"
									
									+"You can make each macro available as a\n"
									+"function by undefining it (with #undef).\n"
									
									+"Return Value:\n"
									+"The is... macros return a non-zero value on\n"
									+"success. For each macro, success is defined as\n"
									+"follows:\n"
									
									+"þ isalpha:  c is a letter (A to Z or a to z)\n"
									+"þ isascii:  the low order byte of c is in the range 0 to 127 (0x00--0x7F)\n"
									+"þ iscntrl:  c is a delete character or ordinary control character\n"
									+"            (0x7F or 0x00 to 0x1F)\n"
									+"þ isdigit:  c is a digit (0 to 9)\n"
									+"þ isgraph:  c is a printing character, like isprint, except that a space\n"
									+"            character is excluded\n"
									+"þ islower:  c is a lowercase letter (a to z)\n"
									+"þ isprint:  c is a printing character (0x20 to 0x7E)\n"
									+"þ ispunct:  c is a punctuation character (iscntrl or isspace)\n"
									+"þ isspace:  c is a space, tab, carriage return, new line, vertical tab,\n"
									+"              or formfeed (0x09 to 0x0D, 0x20)\n"
									+"þ isupper:  c is an uppercase letter (A to Z)\n"
									+"þ isxdigit: c is a hexadecimal digit (0 to 9, A to F, a to f)\n"
									
									+"Portability (all is... macros except isascii)\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³   Yes  ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍÍ¼\n"
									
									+" isascii:\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³        ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍ");
		
		static String fisupper = ("Ýisalnum, isalpha, isascii,Þ\n"
									 +"Ýiscntrl, isdigit, isgraph,Þ\n"
									 +"Ýislower, isprint, ispunct,Þ <all in CTYPE.H>\n"
									 +"Ýisspace, isupper, isxdigitÞ\n"
									 +"--------------------------------\n"
									 +"Character classification macros\n"
									
									+"Declarations:\n"
									+"þ int isalnum(int c);  þ int islower(int c);\n"
									+"þ int isalpha(int c);  þ int isprint(int c);\n"
									+"þ int isascii(int c);  þ int ispunct(int c);\n"
									+"þ int iscntrl(int c);  þ int isspace(int c);\n"
									+"þ int isdigit(int c);  þ int isupper(int c);\n"
									+"þ int isgraph(int c);  þ int isxdigit(int c);\n"
									
									+"Remarks:\n"
									+"The is... macros classify ASCII coded integer\n"
									+"values by table lookup.\n"
									
									+"Each macro is a predicate that returns a\n"
									+"non-zero value for true and 0 for false.\n"
									
									+"isascii is defined on all integer values. The\n"
									+"other is... macros are defined only when\n"
									+"isascii(c) is true or c is EOF.\n"
									
									+"You can make each macro available as a\n"
									+"function by undefining it (with #undef).\n"
									
									+"Return Value:\n"
									+"The is... macros return a non-zero value on\n"
									+"success. For each macro, success is defined as\n"
									+"follows:\n"
									
									+"þ isalpha:  c is a letter (A to Z or a to z)\n"
									+"þ isascii:  the low order byte of c is in the range 0 to 127 (0x00--0x7F)\n"
									+"þ iscntrl:  c is a delete character or ordinary control character\n"
									+"            (0x7F or 0x00 to 0x1F)\n"
									+"þ isdigit:  c is a digit (0 to 9)\n"
									+"þ isgraph:  c is a printing character, like isprint, except that a space\n"
									+"            character is excluded\n"
									+"þ islower:  c is a lowercase letter (a to z)\n"
									+"þ isprint:  c is a printing character (0x20 to 0x7E)\n"
									+"þ ispunct:  c is a punctuation character (iscntrl or isspace)\n"
									+"þ isspace:  c is a space, tab, carriage return, new line, vertical tab,\n"
									+"              or formfeed (0x09 to 0x0D, 0x20)\n"
									+"þ isupper:  c is an uppercase letter (A to Z)\n"
									+"þ isxdigit: c is a hexadecimal digit (0 to 9, A to F, a to f)\n"
									
									+"Portability (all is... macros except isascii)\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³   Yes  ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍÍ¼\n"
									
									+" isascii:\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³        ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍ");
		
		static String fislower = ("Ýisalnum, isalpha, isascii,Þ\n"
									 +"Ýiscntrl, isdigit, isgraph,Þ\n"
									 +"Ýislower, isprint, ispunct,Þ <all in CTYPE.H>\n"
									 +"Ýisspace, isupper, isxdigitÞ\n"
									 +"--------------------------------\n"
									 +"Character classification macros\n"
									
									+"Declarations:\n"
									+"þ int isalnum(int c);  þ int islower(int c);\n"
									+"þ int isalpha(int c);  þ int isprint(int c);\n"
									+"þ int isascii(int c);  þ int ispunct(int c);\n"
									+"þ int iscntrl(int c);  þ int isspace(int c);\n"
									+"þ int isdigit(int c);  þ int isupper(int c);\n"
									+"þ int isgraph(int c);  þ int isxdigit(int c);\n"
									
									+"Remarks:\n"
									+"The is... macros classify ASCII coded integer\n"
									+"values by table lookup.\n"
									
									+"Each macro is a predicate that returns a\n"
									+"non-zero value for true and 0 for false.\n"
									
									+"isascii is defined on all integer values. The\n"
									+"other is... macros are defined only when\n"
									+"isascii(c) is true or c is EOF.\n"
									
									+"You can make each macro available as a\n"
									+"function by undefining it (with #undef).\n"
									
									+"Return Value:\n"
									+"The is... macros return a non-zero value on\n"
									+"success. For each macro, success is defined as\n"
									+"follows:\n"
									
									+"þ isalpha:  c is a letter (A to Z or a to z)\n"
									+"þ isascii:  the low order byte of c is in the range 0 to 127 (0x00--0x7F)\n"
									+"þ iscntrl:  c is a delete character or ordinary control character\n"
									+"            (0x7F or 0x00 to 0x1F)\n"
									+"þ isdigit:  c is a digit (0 to 9)\n"
									+"þ isgraph:  c is a printing character, like isprint, except that a space\n"
									+"            character is excluded\n"
									+"þ islower:  c is a lowercase letter (a to z)\n"
									+"þ isprint:  c is a printing character (0x20 to 0x7E)\n"
									+"þ ispunct:  c is a punctuation character (iscntrl or isspace)\n"
									+"þ isspace:  c is a space, tab, carriage return, new line, vertical tab,\n"
									+"              or formfeed (0x09 to 0x0D, 0x20)\n"
									+"þ isupper:  c is an uppercase letter (A to Z)\n"
									+"þ isxdigit: c is a hexadecimal digit (0 to 9, A to F, a to f)\n"
									
									+"Portability (all is... macros except isascii)\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³   Yes  ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍÍ¼\n"
									
									+" isascii:\n"
									+"É DOS Ñ UNIX Ñ ANSI C Ñ C++ Only »\n"
									+"º Yes ³  Yes ³        ³          º\n"
									+"ÈÍÍÍÍÍÏÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÏÍÍÍÍÍÍÍÍÍ");
		
		static String facos = ("Ýacos, asin, atan, atan2,   Þ         (real) <MATH.H>\n"
								 +"Ýacosl, asinl, atanl, atan2lÞ   (complex) <COMPLEX.H>\n"
								 +"---------------------------------\n"
								 +"Arc cosine, arc sine, and arc tangent functions\n"
								
								+"Declaration:\n"
								+"þ Real:     double acos(double x);\n"
								+"            double asin(double x);\n"
								+"            double atan(double x);\n"
								+"            double atan2(double y, double x);\n"
								
								+"              long double acosl(long double (x));\n"
								+"            long double asinl(long double (x));\n"
								+"            long double atanl(long double (x));\n"
								+"            long double atan2l(long double (y), long double (x));\n"
								
								+"þ Complex:  complex acos(complex z);\n"
								+"           complex asin(complex z);\n"
								+"            complex atan(complex x);\n"
								
								+"Remarks:\n"
								
								+"Real versions\n"
								+"--------------\n"
								+"þ acos and acosl of a real value compute the arc cosine of that value\n"
								+"þ asin and asinl of a real value compute the arc sine of that value\n"
								+"þ atan and atanl calculate the arc tangent of the input value\n"
								+"þ atan2 and atan2l also calculate the arc tangent of the input value\n"
								
								+"Real arguments to acos, acosl, asin, and asinl\n"
								+"must be in the range -1 to 1.\n"
								
								+"Complex versions\n"
								+"ßßßßßßßßßßßßßßßß\n"
								+"þ Complex arc cosine:   acos(z) = -i log(z + i sqrt(1 - z**2))\n"
								+"þ Complex arc sine:     asin(z) = -i * log(i * z +  sqrt(1 - z**2))\n"
								+"þ Complex arc tangent:  atan(z) = -0.5 i log((1 + i*z)/(1 - i*z))\n"
								
								
								+"Return Value:\n"
								+"þ On success,\n"
								+"   þ acos and acosl return the arc cosine of the\n"
								+"     input value (in the range 0 to pi)\n"
								+"   þ asin and asinl return the arc sine of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan and atanl return the arc tangent of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan2 and atan2l return the arc tangent of y/x\n"
								+"     (in the range -pi to pi).\n"
								+"     atan2 and atan2l produce correct results even\n"
								+"     when the resulting angle is near pi/2 or\n"
								+"     -pi/2 (x near 0).\n"
								
								+"  þ On error (if the arguments are not in the range -1 to 1),\n"
								+"  the acos, acosl, asin, and asinl functions return NAN and\n"
								+"  set errno to EDOM (domain error).\n"
								+"þ If both x and y are set to 0, atan2 sets errno to EDOM.\n"
								
								+"Error handling for these routines can be\n"
								+"modified via matherr and _matherrl.");
		
		static String fasin = ("Ýacos, asin, atan, atan2,   Þ         (real) <MATH.H>\n"
								 +"Ýacosl, asinl, atanl, atan2lÞ   (complex) <COMPLEX.H>\n"
								 +"---------------------------------\n"
								 +"Arc cosine, arc sine, and arc tangent functions\n"
								
								+"Declaration:\n"
								+"þ Real:     double acos(double x);\n"
								+"            double asin(double x);\n"
								+"            double atan(double x);\n"
								+"            double atan2(double y, double x);\n"
								
								+"              long double acosl(long double (x));\n"
								+"            long double asinl(long double (x));\n"
								+"            long double atanl(long double (x));\n"
								+"            long double atan2l(long double (y), long double (x));\n"
								
								+"þ Complex:  complex acos(complex z);\n"
								+"           complex asin(complex z);\n"
								+"            complex atan(complex x);\n"
								
								+"Remarks:\n"
								
								+"Real versions\n"
								+"--------------\n"
								+"þ acos and acosl of a real value compute the arc cosine of that value\n"
								+"þ asin and asinl of a real value compute the arc sine of that value\n"
								+"þ atan and atanl calculate the arc tangent of the input value\n"
								+"þ atan2 and atan2l also calculate the arc tangent of the input value\n"
								
								+"Real arguments to acos, acosl, asin, and asinl\n"
								+"must be in the range -1 to 1.\n"
								
								+"Complex versions\n"
								+"ßßßßßßßßßßßßßßßß\n"
								+"þ Complex arc cosine:   acos(z) = -i log(z + i sqrt(1 - z**2))\n"
								+"þ Complex arc sine:     asin(z) = -i * log(i * z +  sqrt(1 - z**2))\n"
								+"þ Complex arc tangent:  atan(z) = -0.5 i log((1 + i*z)/(1 - i*z))\n"
								
								
								+"Return Value:\n"
								+"þ On success,\n"
								+"   þ acos and acosl return the arc cosine of the\n"
								+"     input value (in the range 0 to pi)\n"
								+"   þ asin and asinl return the arc sine of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan and atanl return the arc tangent of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan2 and atan2l return the arc tangent of y/x\n"
								+"     (in the range -pi to pi).\n"
								+"     atan2 and atan2l produce correct results even\n"
								+"     when the resulting angle is near pi/2 or\n"
								+"     -pi/2 (x near 0).\n"
								
								+"  þ On error (if the arguments are not in the range -1 to 1),\n"
								+"  the acos, acosl, asin, and asinl functions return NAN and\n"
								+"  set errno to EDOM (domain error).\n"
								+"þ If both x and y are set to 0, atan2 sets errno to EDOM.\n"
								
								+"Error handling for these routines can be\n"
								+"modified via matherr and _matherrl.");
		
		static String fatan = ("Ýacos, asin, atan, atan2,   Þ         (real) <MATH.H>\n"
								 +"Ýacosl, asinl, atanl, atan2lÞ   (complex) <COMPLEX.H>\n"
								 +"---------------------------------\n"
								 +"Arc cosine, arc sine, and arc tangent functions\n"
								
								+"Declaration:\n"
								+"þ Real:     double acos(double x);\n"
								+"            double asin(double x);\n"
								+"            double atan(double x);\n"
								+"            double atan2(double y, double x);\n"
								
								+"              long double acosl(long double (x));\n"
								+"            long double asinl(long double (x));\n"
								+"            long double atanl(long double (x));\n"
								+"            long double atan2l(long double (y), long double (x));\n"
								
								+"þ Complex:  complex acos(complex z);\n"
								+"           complex asin(complex z);\n"
								+"            complex atan(complex x);\n"
								
								+"Remarks:\n"
								
								+"Real versions\n"
								+"--------------\n"
								+"þ acos and acosl of a real value compute the arc cosine of that value\n"
								+"þ asin and asinl of a real value compute the arc sine of that value\n"
								+"þ atan and atanl calculate the arc tangent of the input value\n"
								+"þ atan2 and atan2l also calculate the arc tangent of the input value\n"
								
								+"Real arguments to acos, acosl, asin, and asinl\n"
								+"must be in the range -1 to 1.\n"
								
								+"Complex versions\n"
								+"ßßßßßßßßßßßßßßßß\n"
								+"þ Complex arc cosine:   acos(z) = -i log(z + i sqrt(1 - z**2))\n"
								+"þ Complex arc sine:     asin(z) = -i * log(i * z +  sqrt(1 - z**2))\n"
								+"þ Complex arc tangent:  atan(z) = -0.5 i log((1 + i*z)/(1 - i*z))\n"
								
								
								+"Return Value:\n"
								+"þ On success,\n"
								+"   þ acos and acosl return the arc cosine of the\n"
								+"     input value (in the range 0 to pi)\n"
								+"   þ asin and asinl return the arc sine of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan and atanl return the arc tangent of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan2 and atan2l return the arc tangent of y/x\n"
								+"     (in the range -pi to pi).\n"
								+"     atan2 and atan2l produce correct results even\n"
								+"     when the resulting angle is near pi/2 or\n"
								+"     -pi/2 (x near 0).\n"
								
								+"  þ On error (if the arguments are not in the range -1 to 1),\n"
								+"  the acos, acosl, asin, and asinl functions return NAN and\n"
								+"  set errno to EDOM (domain error).\n"
								+"þ If both x and y are set to 0, atan2 sets errno to EDOM.\n"
								
								+"Error handling for these routines can be\n"
								+"modified via matherr and _matherrl.");
		
		static String fcos = ("Ýacos, asin, atan, atan2,   Þ         (real) <MATH.H>\n"
								 +"Ýacosl, asinl, atanl, atan2lÞ   (complex) <COMPLEX.H>\n"
								 +"---------------------------------\n"
								 +"Arc cosine, arc sine, and arc tangent functions\n"
								
								+"Declaration:\n"
								+"þ Real:     double acos(double x);\n"
								+"            double asin(double x);\n"
								+"            double atan(double x);\n"
								+"            double atan2(double y, double x);\n"
								
								+"              long double acosl(long double (x));\n"
								+"            long double asinl(long double (x));\n"
								+"            long double atanl(long double (x));\n"
								+"            long double atan2l(long double (y), long double (x));\n"
								
								+"þ Complex:  complex acos(complex z);\n"
								+"           complex asin(complex z);\n"
								+"            complex atan(complex x);\n"
								
								+"Remarks:\n"
								
								+"Real versions\n"
								+"--------------\n"
								+"þ acos and acosl of a real value compute the arc cosine of that value\n"
								+"þ asin and asinl of a real value compute the arc sine of that value\n"
								+"þ atan and atanl calculate the arc tangent of the input value\n"
								+"þ atan2 and atan2l also calculate the arc tangent of the input value\n"
								
								+"Real arguments to acos, acosl, asin, and asinl\n"
								+"must be in the range -1 to 1.\n"
								
								+"Complex versions\n"
								+"ßßßßßßßßßßßßßßßß\n"
								+"þ Complex arc cosine:   acos(z) = -i log(z + i sqrt(1 - z**2))\n"
								+"þ Complex arc sine:     asin(z) = -i * log(i * z +  sqrt(1 - z**2))\n"
								+"þ Complex arc tangent:  atan(z) = -0.5 i log((1 + i*z)/(1 - i*z))\n"
								
								
								+"Return Value:\n"
								+"þ On success,\n"
								+"   þ acos and acosl return the arc cosine of the\n"
								+"     input value (in the range 0 to pi)\n"
								+"   þ asin and asinl return the arc sine of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan and atanl return the arc tangent of the\n"
								+"     input value (in the range -pi/2 to pi/2)\n"
								+"   þ atan2 and atan2l return the arc tangent of y/x\n"
								+"     (in the range -pi to pi).\n"
								+"     atan2 and atan2l produce correct results even\n"
								+"     when the resulting angle is near pi/2 or\n"
								+"     -pi/2 (x near 0).\n"
								
								+"  þ On error (if the arguments are not in the range -1 to 1),\n"
								+"  the acos, acosl, asin, and asinl functions return NAN and\n"
								+"  set errno to EDOM (domain error).\n"
								+"þ If both x and y are set to 0, atan2 sets errno to EDOM.\n"
								
								+"Error handling for these routines can be\n"
								+"modified via matherr and _matherrl.");
		
		static String fexp = ("Ýexp, explÞ                  (real) <MATH.H>\n"
							 +"ßßßßßßßßßßß            (complex) <COMPLEX.H>\n"
							 +" þ Real exp calculates e to the xth power\n"
							 +"þ Complex exp calculates e to the zth power (z is a complex number)\n"
							
							+"Declaration:\n"
							+"þ Real:     double exp(double x);\n"
							+"            long double exp(long double (x));\n"
							+"þ Complex:  complex exp(complex z);\n"
							
							+"Remarks:\n"
							+"exp calculates the exponential function e**x.");
		
		static String ffabs = ("ÜÜÜÜÜÜÜÜÜÜÜÜÜÜ\n"
											+"Ýabs,        Þ <MATH.H, STDLIB.H, COMPLEX.H>\n"
											+"Ýcabs, cabsl,Þ                      <MATH.H>\n"
											+"Ýfabs, fabsl,Þ                      <MATH.H>\n"
											+"Ýlabs        Þ            <MATH.H, STDLIB.H>\n"
											+"þ abs (a macro) gets the absolute value of an integer\n"
											+" þ cabs and cabsl (macros) calculate the absolute value of a complex number\n"
											+" þ fabs and fabsl calculate the absolute value of a floating-point number\n"
											+" þ labs calculates the absolute value of a long number\n"
							
							+"Declaration:\n"
							+" þ abs\n"
							+"  real:     int abs(int x);\n"
							+"    complex:  double abs(complex x);\n"
							+" þ double cabs(struct complex z);\n"
							+"þ long double cabsl(struct _complexl (z));\n"
							+"þ double fabs(double x);\n"
							+" þ long double fabsl(long double @E(x));\n"
							+" þ long int labs(long int x);\n"
							
							+"Remarks:\n"
							+"All of these routines return the absolute\n"
							+"value of their argument. abs, cabs, and cabsl\n"
							+"are macros; fabs and labs are functions.\n"
							+"The complex exponential function is defined by\n"
							+"exp(x + iy) = exp(x) * (cos(y) + i sin(y))\n"
							
							+"Return Value:\n"
							+"þ On success, exp returns e**x");
		
		static String ftime= ("  Time is a sortable instance class. The time\n"
										+"data members and functionality of Time comes\n"
										+"from its base class except for the printOn\n"
										+"member.\n"
								
						+"You can override this in derived classes to\n"
						+"cope with international formatting variations.\n"
						
						+" ÚÄÄÄÄÄÄÄÄÄÄ¿   ÛßßßßßßÛ     ÚÄÄÄÄÄÄ¿\n"
						+" ³ BaseTime ÃÄÄÄÛ Time ÛÄÄÄÄÄ´ None ³\n"
						+" ÀÄÄÄÄÄÄÄÄÄÄÙ   ÛÜÜÜÜÜÜÛ     ÀÄÄÄÄÄÄÙ\n"
						
						+" Friend To:\n"
						+" None\n"
						
						+" Has Friends:\n"
						+" None\n"
						
						+"Constructors:\n"
						+" Time()\n"
								 +" Time(const Time& T);\n"
								 +"  Time(unsigned char H, unsigned char M = 0, unsigned char S = 0,\n"
								 +" unsigned char D = 0)\n"
						
						+" Member Functions:\n"
						+" Time::isA      Time::nameOf   Time::printOn\n"
						+" Time::Time");
								
			static String fclock = ("  ÝclockÞ                             <TIME.H>\n"
										+"---------\n"
										+"Returns number of clock ticks since program start\n"
						
						+" Declaration:  clock_t clock(void);\n"
						
						+"Remarks:\n"
						+"clock can be used to determine the time\n"
						+"interval between two events.\n"
						
						+"To determine the time in seconds, divide the\n"
						+"value returned by clock by the value of the\n"
						+"macro CLK_TCK.\n"
						
						+"Return Value:\n"
						+"þ On success, returns the processor time\n"
						+"  elapsed since the beginning of the\n"
						+"program invocation.\n"
						+"þ On failure (the processor time is not\n"
						+"  available, or its value can't be\n"
						+"  represented), returns -1.");
		
		static String fmalloc = ("    ÝmallocÞ                 <ALLOC.H, STDLIB.H>\n"
											+"ßßßßßßßß\n"
											+"Allocates memory\n"
							
							+"Declaration:  void *malloc(size_t size);\n"
							
							+"Remarks:\n"
							+"malloc allocates a block of size bytes from\n"
							+"the memory heap. It allows a program to\n"
							+"allocate memory explicitly as it's needed, and\n"
							+"in the exact amounts needed.\n"
							
							+"The heap is used for dynamic allocation of\n"
							+"variable-sized blocks of memory. Many data\n"
							+"structures, such as trees and lists, naturally\n"
							+"employ heap memory allocation.\n"
							
							+"All the space between the end of the data\n"
							+"segment and the top of the program stack is\n"
							+"available for use in the small data models,\n"
							+"except for a small margin immediately before\n"
							+"the top of the stack.\n"
							
							+"This margin is intended to allow the\n"
							+"application some room to make the stack\n"
							+"larger, in addition to a small amount needed\n"
							+"by DOS.");
		
		static String frand = (" ÝrandÞ                      <STDLIB.H>\n"
											+"ßßßßßß\n"
							 +"Random number generator\n"
							
							 +"Declaration:  int rand(void);\n"
							
							 +"Remarks:\n"
							+"rand uses a multiplicative congruential random\n"
							+"number generator with period 232 to return\n"
							+"successive pseudo-random numbers in the range\n"
							+"0 to RAND_MAX.\n"
							
							 +"Return Value:\n"
							+"rand returns the generated pseudo-random\n"
							+"number.");
		
		static String fsrand = ("ÝsrandÞ                           <STDLIB.H>\n"
											+"ßßßßßßß\n"
											+"Initializes random number generator\n"
							
							+"Declaration:  void srand(unsigned seed);\n"
							
							+" Remarks:\n"
							+"The random number generator is reinitialized\n"
							
							+"The generator can be set to a new starting\n"
							+"point by calling srand with a given seed\n"
							+"number.\n"
							
							+"Return Value:  None");
		
		
		
		
		
		
		
		
		
		static String fgetch = (" Ýgetch and getcheÞ                 <CONIO.H>\n"
											+"ßßßßßßßßßßßßßßßßßß\n"
							  +"þ getch gets a character from console but does not echo to the screen\n"
							 +" þ getche gets a character from console, and echoes to the screen\n"
							
							 +"Declaration:\n"
								 +" þ int getch(void);\n"
							  +"þ int getche(void);\n"
							  
							 +"Remarks:\n"
							+"getch reads a single character directly from\n"
							+"the keyboard, without echoing to the screen.\n"
							
							+"getche reads a single character from the\n"
							+"keyboard and echoes it to the current text\n"
							+"window, using direct video or BIOS.\n"
							
							+" Return Value:\n"
							+"Both functions return the character read from\n"
							+"the keyboard.");


	
}
