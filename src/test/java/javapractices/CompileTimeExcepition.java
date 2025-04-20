package javapractices;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;


public class CompileTimeExcepition {

	
	
	public static void main(String[] args) throws IOException, NullPointerException,IndexOutOfBoundsException  {
		
File file = new File("d:/test.txt");

file.createNewFile();

FileInputStream fileInputStream = new FileInputStream(file); 
CompileTimeException compileTimeException = new CompileTimeException();
//System.out.println(compileTimeException.div(10,2));//



String s="12345";	
int Num = Integer.parseInt(s);

System.out.println(Num);

// String ss = null;
String ss = "welcome to codemind";
ss.length();
String sss = "welcome to codemind";
System.out.println(sss.charAt(16));
int[] array = { 10,20,30,59 };
 System.out.println(array[2]);
 
	System.out.println("after getting exception");
	}

	public float div(int a,int b) {
		return a/b;
	}
}