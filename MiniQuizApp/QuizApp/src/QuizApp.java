
import java.util.Scanner;
public class QuizApp {
	Scanner sc=new Scanner(System.in);
	

}
class PreProgramming extends QuizApp 
{

	//static block
	static
	{
		System.out.println("Before solving the quiz questions, remember the following four rules regarding Java increment and decrement operators,\r\n"
				+ "\r\n"
				+ "Post Increment (i++) : Current value of ‘i’ is used and then it is incremented by 1.\r\n"
				+ "Pre Increment (++i) : First ‘i’ is incremented by 1 and then it’s value is used.\r\n"
				+ "Post Decrement (i-- ) : Current value of ‘i’ is used and then it is decremented by 1.\r\n"
				+ "Pre Decrement (--i) : First ‘i’ is decremented by 1 and then it’s value is used.");
	}
	//non static quiz method

	public static void quiz()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1: What will be the output of the following program?\r\n"
				+ "\r\n"
				+ "");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int i = 11;\r\n"
				+ "         \r\n"
				+ "        i = i++ + ++i;\r\n"
				+ "         \r\n"
				+ "        System.out.println(i);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.20"
				+"\n 2:40"
				+"\n 3:24"
				+"\n 4:56"
				);
		int ans=sc.nextInt();
		if(ans==3)
		{
			System.out.println("correct ans");
		}
		else
		{
			System.out.println("wrong ans  to see ans press 0  or to move to next question press 1");
			int recheck=sc.nextInt();
			if(recheck==0)
			{

				System.out.println("Initially, i=11,\r\n"
						+ "i = i++ + ++i\r\n"
						+ "i = (i is used before increment) + (i is used after increment)\r\n"
						+ "i = 11(i=12) + 13(i=13)\r\n"
						+ "i = 11 + 13 = 24");
			}
			else if(recheck==1)
			{
				System.out.println("here is the next question");
			}
		}
		System.out.println("=============================================================================================================================================");



		System.out.println("2) Guess the output of the following program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int a=11, b=22, c;\r\n"
				+ "         \r\n"
				+ "        c = a + b + a++ + b++ + ++a + ++b;\r\n"
				+ "         \r\n"
				+ "        System.out.println(\"a=\"+a);\r\n"
				+ "        System.out.println(\"b=\"+b);\r\n"
				+ "        System.out.println(\"c=\"+c);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.a:11 b:23 c:121"
				+"\n 2: a:13 b:24 c:103 "
				+"\n 3: a:11 b:25 c:100"
				+"\n 4: a:12 b:26 c:99"
				);
		int ans2=sc.nextInt();
		if(ans2==2)
		{
			System.out.println("correct ans");
		}
		else
		{
			System.out.println("Wrong ans to see Explanation press 0");
			int recheck2=sc.nextInt();
			if(recheck2==0)
			{
				System.out.println("Given, a=11, b=22\r\n"
						+ "c = a + b + a++ + b++ + ++a + ++b\r\n"
						+ "c = 11 + 22 + (a is used before increment) + (b is used before increment) + (a is used after increment) + (b is used after increment)\r\n"
						+ "c = 11 + 22 + 11(a=12, b=22) + 22(a=12, b=23) + 13(a=13, b=23) + 24(a=13, b=24)\r\n"
						+ "c = 11 + 22 + 11 + 22 + 13 + 24 = 103 and a=13, b=24");
			}
			else if (recheck2==1)
			{
				System.out.println("here is the next question");

			}
		}
		System.out.println("=========================================================================================================================");

		System.out.println("3) What will be the output of the below program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "	public static void main(String[] args) \r\n"
				+ "	{\r\n"
				+ "		int i=0;\r\n"
				+ "		\r\n"
				+ "		i = i++ - --i + ++i - i--;\r\n"
				+ "		\r\n"
				+ "		System.out.println(i);\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.0"
				+"\n 2:1"
				+"\n 3:4"
				+"\n 4:2"
				);
		int ans3=sc.nextInt();
		if(ans3==1)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck3=sc.nextInt();
			if(recheck3==0)
				System.out.println("initially, i=0\r\n"
						+ "i = i++ – –i + ++i – i–\r\n"
						+ "i = (i is used before increment) – (i is used after decrement) + (i is used after increment) – (i is used before decrement)\r\n"
						+ "i = 0(i=1) – 0(i=0) + 1(i=1) – 1(i=0)\r\n"
						+ "i = 0 – 0 + 1 – 1 = 0");
			else if (recheck3==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("===================================================================================================================");
		//copy paste Structure
		/*System.out.println();
			System.out.println();
			System.out.println("options are as follow"
					+ "\n 1.0"
					+"\n 2:1"
					+"\n 3:4"
					+"\n 4:2"
				);
			int ans3=sc.nextInt();
			if(ans3==1)
			{
				System.out.println("correct ans");

			}
			else
			{
				System.out.println("wrong ans to see explation press 0");
			int recheck3=sc.nextInt();
              if(recheck3==0)
            	  System.out.println();
              else if (recheck3==1)
              {
            	  System.out.println("here is the next Question");
              }
			}*/
		System.out.println("===================================================================================================================");

		System.out.println("4) Is the below program written correctly?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "	public static void main(String[] args) \r\n"
				+ "	{\r\n"
				+ "		boolean b = true;\r\n"
				+ "		\r\n"
				+ "		b++;\r\n"
				+ "		\r\n"
				+ "		System.out.println(b);\r\n"
				+ "	}\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1. No. ++ or — can’t be applied to boolean types."
				+"\n 2:True"
				+"\n 3:False"
				+"\n 4:none of the above"
				);
		int ans4=sc.nextInt();
		if(ans4==1)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck4=sc.nextInt();
			if(recheck4==0)
				System.out.println("we dont have any explanation for this program");
			else if (recheck4==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("==================================================================================================================");
		System.out.println("5) What will be the output of the below program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "	public static void main(String[] args) \r\n"
				+ "	{\r\n"
				+ "		int i=1, j=2, k=3;\r\n"
				+ "		\r\n"
				+ "		int m = i-- - j-- - k--;\r\n"
				+ "		\r\n"
				+ "		System.out.println(\"i=\"+i);\r\n"
				+ "		System.out.println(\"j=\"+j);\r\n"
				+ "		System.out.println(\"k=\"+k);\r\n"
				+ "		System.out.println(\"m=\"+m);\r\n"
				+ "	}\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.m = -4 and i=0, j=1, k=2"
				+"\n 2: m =-2 and i=1, j=2, k=3"
				+"\n 3: m=-1 and i=2, j=3, k=3"
				+"\n 4:m=-5 and i=3, j=2, k=5"
				);
		int ans5=sc.nextInt();
		if(ans5==1)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck5=sc.nextInt();
			if(recheck5==0)
			{
				System.out.println("\r\n"
						+ "Given, i=1, j=2, k=3\r\n"
						+ "m = i– – j– – k–\r\n"
						+ "m = (i is used before decrement) – (j is used before decrement) – (k is used before decrement)\r\n"
						+ "m = 1(i=0) – 2(j=1) – 3(k=2)\r\n"
						+ "m = 1 – 2 – 3\r\n"
						+ "m = -4 and i=0, j=1, k=2");
			}
			else if (recheck5==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=========================================================================================================");
		System.out.println("6) What will be the output of the following program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int a=1, b=2;\r\n"
				+ "         \r\n"
				+ "        System.out.println(--b - ++a + ++b - --a);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.1"
				+"\n 2:0"
				+"\n 3:4"
				+"\n 4:2"
				);
		int ans6=sc.nextInt();
		if(ans6==2)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck6=sc.nextInt();
			if(recheck6==0)
			{
				System.out.println("Given, a=1 and b=2,\r\n"
						+ "–b – ++a + ++b – –a\r\n"
						+ "= (b is used after decrement) – (a is used after increment) + (b is used after increment) – (a is used after decrement)\r\n"
						+ "= 1(a=1, b=1) – 2(a=2, b=1) + 2(a=2, b=2) – 1(a=1, b=2)\r\n"
						+ "= 1 – 2 + 2 – 1 = 0");
			}
			else if (recheck6==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=============================================================================================================");
		System.out.println("7) What will be the value of i, j and k in the below program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int i=19, j=29, k;\r\n"
				+ "         \r\n"
				+ "        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;\r\n"
				+ "         \r\n"
				+ "        System.out.println(\"i=\"+i);\r\n"
				+ "        System.out.println(\"j=\"+j);\r\n"
				+ "        System.out.println(\"k=\"+k);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.k = -10 and i=19, j=29"
				+"\n 2:k = -20 and i=18, j=20"
				+"\n 3:k = -20 and i=19, j=29"
				+"\n 4:k = -20 and i=19, j=28"
				);
		int ans7=sc.nextInt();
		if(ans7==3)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck7=sc.nextInt();
			if(recheck7==0)
				System.out.println("Given, i=19 and j=29,\r\n"
						+ "k = i– – i++ + –j – ++j + –i – j– + ++i – j++\r\n"
						+ "k = (i is used before decrement) – (i is used before increment) + (j is used after decrement) – (j is used after increment) + (i is used after decrement) – (j is used before decrement) + (i is used after increment) – (j is used before increment)\r\n"
						+ "k = 19(i=18, j=29) – 18(i=19, j=29) + 28(i=19, j=28) – 29(i=19, j=29) + 18(i=18, j=29) – 29(i=18, j=28) + 19(i=19, j=28) – 28(i=19, j=29)\r\n"
						+ "k = 19 – 18 + 28 – 29 + 18 – 29 + 19 – 28\r\n"
						+ "k = -20 and i=19, j=29");
			else if (recheck7==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("==================================================================================================================");

		System.out.println("8) What is wrong with the below program? Why it is showing compilation error?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int i = 11;\r\n"
				+ "         \r\n"
				+ "        int j = --(i++);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1. Because, -+ or — can’t be nested [ –(i++) ]."
				+"\n 2: Because, ++ or — can’t be nested [ –(i++) ]."
				+"\n 3: Because, -- or — can’t be nested [ –(i++) ]."
				+"\n 4: Because, ++ or — can’t be nested [ –(i--) ]."
				);
		int ans8=sc.nextInt();
		if(ans8==2)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck8=sc.nextInt();
			if(recheck8==0)
				System.out.println("No explantion for this quiz");
			else if (recheck8==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=========================================================================");

		System.out.println("9) Guess the value of p in the below program?\r\n"
				+ "\r\n"
				+ "");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int m = 0, n = 0;\r\n"
				+ "         \r\n"
				+ "        int p = --m * --n * n-- * m--;\r\n"
				+ "         \r\n"
				+ "        System.out.println(p);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.0"
				+"\n 2:1"
				+"\n 3:4"
				+"\n 4:2"
				);
		int ans9=sc.nextInt();
		if(ans3==2)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck9=sc.nextInt();
			if(recheck9==0)
				System.out.println("Given, m=0 and n=0\r\n"
						+ "p = –m * –n * n– * m–\r\n"
						+ "p = (m is used after decrement) * (n is used after decrement) * (n is used before decrement) * (m is used before decrement)\r\n"
						+ "p = -1(m=-1, n=0) * -1(m=-1, n=-1) * -1(m=-1, n=-2) * -1(m=-2, n=-2)\r\n"
						+ "p = -1 * -1 * -1 * -1 = 1");
			else if (recheck9==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=========================================================================================================");
		System.out.println("10) What will be the output of the following program?\r\n"
				+ "\r\n"
				+ "");

		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int a=1;\r\n"
				+ "         \r\n"
				+ "        a = a++ + ++a * --a - a--;\r\n"
				+ "         \r\n"
				+ "        System.out.println(a);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.0"
				+"\n 2:1"
				+"\n 3:5"
				+"\n 4:2"
				);
		int ans10=sc.nextInt();
		if(ans10==3)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck10=sc.nextInt();
			if(recheck10==0)
				System.out.println("Given a=1,\r\n"
						+ "a = a++ + ++a * –a – a–\r\n"
						+ "a = (a is used before increment) + (a is used after increment) * (a is used after decrement) – (a is used before decrement)\r\n"
						+ "a = 1(a=2) + 3(a = 3) * 2(a=2) – 2(a=1)\r\n"
						+ "a = 1 + 3 * 2 – 2\r\n"
						+ "a = 1 + 6 – 2 = 5");
			else if (recheck10==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("============================================================================================================");
		System.out.println("11) What will be the outcome of the below program?\r\n"
				+ "\r\n"
				+ "");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int a = 11++;\r\n"
				+ "         \r\n"
				+ "        System.out.println(a);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.Compile time error : ++ or — can’t be applied to constants."
				+"\n 2:1"
				+"\n 3:4"
				+"\n 4:2"
				);
		int ans11=sc.nextInt();
		if(ans11==1)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck11=sc.nextInt();
			if(recheck11==0)
				System.out.println();
			else if (recheck11==1)
			{
				System.out.println("here is the next Question");
			}
		}

		System.out.println("================================================================================================================");
		System.out.println("12) What will be the output of the following program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int m=1010, n=1010;\r\n"
				+ "         \r\n"
				+ "        System.out.println(m++ / ++n * n-- / --m); \r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.4"
				+"\n 2:1"
				+"\n 3:0"
				+"\n 4:2"
				);
		int ans12=sc.nextInt();
		if(ans12==3)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck12=sc.nextInt();
			if(recheck12==0)
				System.out.println("m=1010 and n=1010\r\n"
						+ "m++ / ++n * n– / –m\r\n"
						+ "= (m is used before increment) / (n is used after increment) * (n is used before decrement) / (m is used after decrement)\r\n"
						+ "= 1010(m=1011, n=1010) / 1011(m=1011, n=1011) * 1011(m=1011, n=1010) / 1010(m=1010, n=1010)\r\n"
						+ "= 1010 / 1011 * 1011 / 1010 = 0");
			else if (recheck12==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=====================================================================================================");


		System.out.println("13) What will be the output of the following program?");
		System.out.println("public class IncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int x = 001, y=010, z=100;\r\n"
				+ "         \r\n"
				+ "        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;\r\n"
				+ "         \r\n"
				+ "        System.out.println(\"x=\"+x);\r\n"
				+ "        System.out.println(\"y=\"+y);\r\n"
				+ "        System.out.println(\"z=\"+z);\r\n"
				+ "        System.out.println(\"i=\"+i);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.i = -167 and x=-2, y=10, z=98"
				+"\n 2:i = -167 and x=-1, y=11, z=98"
				+"\n 3:i = -167 and x=-3, y=11, z=98"
				+"\n 4:i = -167 and x=-2, y=11, z=98"
				);
		int ans13=sc.nextInt();
		if(ans13==4)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck13=sc.nextInt();
			if(recheck13==0)
				System.out.println();
			else if (recheck13==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("===========================================================================================");
		System.out.println("14) What will be the output of the following program?");
		System.out.println("public class JavaIncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        int ch = 'A';\r\n"
				+ "         \r\n"
				+ "        System.out.println(ch++);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.20"
				+"\n 2:65"
				+"\n 3:40"
				+"\n 4:23"
				);
		int ans14=sc.nextInt();
		if(ans14==2)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck14=sc.nextInt();
			if(recheck14==0)
			{
				System.out.println("No explanation for this quiz");
			}
			else if (recheck14==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=====================================================================================================");

		System.out.println("15) What will be the outcome of the below program?");
		System.out.println("public class JavaIncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        char ch = 'A';\r\n"
				+ "         \r\n"
				+ "        System.out.println(++ch);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.A"
				+"\n 2:B"
				+"\n 3:C"
				+"\n 4:D"
				);
		int ans15=sc.nextInt();
		if(ans15==2)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck15=sc.nextInt();
			if(recheck15==0)
				System.out.println("");
			else if (recheck15==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("========================================================================================");




		System.out.println("16) What will be the output of the following program?");
		System.out.println("public class JavaIncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        char ch = \"123\".charAt(1);\r\n"
				+ "         \r\n"

                      					+ "        System.out.println(ch++ + ++ch);\r\n"
                      					+ "    }\r\n"
                      					+ "}");
		System.out.println("options are as follow"
				+ "\n 1.102"
				+"\n 2:10"
				+"\n 3:49"
				+"\n 4:25"
				);
		int ans16=sc.nextInt();
		if(ans16==1)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck16=sc.nextInt();
			if(recheck16==0)
				System.out.println("");
			else if (recheck16==1)
			{
				System.out.println("here is the next Question");
			}
		}
		System.out.println("=================================================================================================");

		System.out.println("17) What will be the output of the following program?\r\n"
				+ "\r\n"
				+ "");
		System.out.println("public class JavaIncrementDecrementQuiz \r\n"
				+ "{\r\n"
				+ "    public static void main(String[] args) \r\n"
				+ "    {\r\n"
				+ "        char ch = '0';\r\n"
				+ "         \r\n"
				+ "        System.out.println(ch-- + --ch);\r\n"
				+ "    }\r\n"
				+ "}");
		System.out.println("options are as follow"
				+ "\n 1.80"
				+"\n 2:90"
				+"\n 3:95"
				+"\n 4:94"
				);
		int ans17=sc.nextInt();
		if(ans17==4)
		{
			System.out.println("correct ans");

		}
		else
		{
			System.out.println("wrong ans to see explation press 0");
			int recheck17=sc.nextInt();
			if(recheck17==0)
				System.out.println("No explanation");
			else if (recheck17==1)
			{
				System.out.println("quiz for Preprogramming ends here");
			}
		}

		System.out.println("===========================================================================================================");

	}

}

class CoreJava extends QuizApp
{

}
class AdvanceJava extends QuizApp
{

}


