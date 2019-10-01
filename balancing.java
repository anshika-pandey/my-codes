import java.util.*;
public class balancing{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		for (int i=0;i<n ;i++ ) {
			String s1=scan.nextLine();
			boolean ans= areParenthesisBalanced(s1);
			if (ans==true) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}
	static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 

    static boolean areParenthesisBalanced(String str) 
    { 
       Stack<Character> s1=new Stack<Character>(); 

       for(int i=0;i<str.length();i++) 
       { 
       		char ch=str.charAt(i);
          if (ch == '{' || ch == '(' || ch == '[') 
            s1.push(ch); 

          if (ch== '}' || ch== ')' || ch == ']') 
          { 
             if (s1.isEmpty()) 
               { 
                   return false; 
               }  
             else if ( !isMatchingPair(s1.pop(), ch) ) 
               { 
                   return false; 
               } 
          } 
            
       }
       return false;
    }
 }    