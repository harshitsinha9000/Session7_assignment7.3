/**
 * 
 */
package java_session_7;

import java.util.Scanner;

/**
 * @author sinhaha
 *
 */
public class substring_wo_method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int i,j;
				char ch,ch1;
				String str=null,str_sub=null;
				int match_exist=0,match_i;
				
				System.out.println("Enter the main string");
				str=sc.next();
				
				System.out.println("Enter the substring ");
				str_sub=sc.next();
				
				
				
				for(i=0;i<str.length();i++)
				{
					
					if(match_exist==1)
						break;
					ch=str.charAt(i);
					ch1=str_sub.charAt(0);
					
					
					//to check if the parsing string length is less than substring length
					if((str.length()-i)<str_sub.length())
						{
						match_exist=0;
						break;
						}
					
					if(ch==ch1)
					{
						match_i = i;
						for(j=1;j<str_sub.length();j++)
						{
							match_i++;
							ch=str.charAt(match_i);
							ch1=str_sub.charAt(j);
							if(ch==ch1&&j<(str_sub.length()-1))
								continue;
							else if(ch==ch1&&j==(str_sub.length()-1))
								{
								match_exist=1;
								break ;
								}							
							else 
								//  match_exist=0;
								  break;
								
						}
					}
				}
				
				if(match_exist==1)
				{
					System.out.println("Contains");
				}
				else
				{
					System.out.println("Doesn't Contains");
				}
		
	}

}
