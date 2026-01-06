package String;


//Input an email from the user. You have to create a username from the email
//by deleting the part that comes after '@'. Display that username to the user.
//
//Example :
//
//email = "apnaCollegeJava@gmail.com" ; username = "apnaCollegeJava"
//
//email ="helloWorld123@gmail.com"; username = "helloWorld123"


import java.util.*;
public class SB_GMAILone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == '@')
				break;
			else
				sb.append(str.charAt(i));
		}
		
		System.out.print(sb.toString());

	}

}
