package class14;

public class Task4 {

	public static void main(String[] args) {
/*1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?

2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

3. Find out how many alpha characters present in a string?

4.How to find out the part of the string from a string? What is substring? Find number of words in string?

5. Write a java program to reverse String? Reverse a string word by word?

6. Write a Java Program to find whether a String is palindrome or not?

7. Write a java program to check whether a given number is prime or not?

8. Write a Java Program to print first 10 numbers of Fibonacci series.*/
		
		int x,y;
		
		x=30; y=40;
		
		x = x + y; 
        y = x - y; 
        x = x - y;
        
        System.out.println("x= "+x+" y= "+y);
        
        System.out.println("--------------------");
        
        String str,str1;
        
        str="Ahmet"; str1="Mehmet";
        
        String strnew=str+str1;
        System.out.println(strnew);
        
        System.out.println("str is= "+strnew.substring(str.length(),strnew.length())+
        					" str1 is= "+strnew.substring(0,str.length()));
        
        

	}

}
