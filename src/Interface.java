//import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;
//import java.io.FileReader;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			File fileobj = new File("Questions.txt");
			FileReader fr=new FileReader(fileobj);   //reads the file  
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			
			
			Questionnaire questionnaire = new Questionnaire();
			questionnaire.setQues1(br.readLine());
			questionnaire.setQues2(br.readLine());
			questionnaire.setQues3(br.readLine());
			questionnaire.setQues4(br.readLine());
			questionnaire.setQues5(br.readLine());
			
			User user = new User();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name = sc.nextLine();
			user.setName(name);
			System.out.println("Hi, "+user.getName());
			
			System.out.println("For self-assessment, enter Y/N as your response for each question and press enter.");
			System.out.println(questionnaire.getQues1());
			String response1 = sc.nextLine().toLowerCase();
			System.out.println(questionnaire.getQues2());
			String response2 = sc.nextLine().toLowerCase();
			System.out.println(questionnaire.getQues3());
			String response3 = sc.nextLine().toLowerCase();
			System.out.println(questionnaire.getQues4());
			String response4 = sc.nextLine().toLowerCase();
			System.out.println(questionnaire.getQues5());
			String response5 = sc.nextLine().toLowerCase();
			
			if(response1.equals("y") || response2.equals("y")) {
				if(response3.equals("y") || response4.equals("y") || response5.equals("y")) {
					user.setSelfAssessmentResult("Take a COVID test");
				}
				else {
					user.setSelfAssessmentResult("Your problem is not very serious!");
				}
			}
			else {
				user.setSelfAssessmentResult("You are healthy now, but be careful!");
			}
			
			System.out.println(user.getSelfAssessmentResult());
			
			
		}
		catch(IOException io){
			io.printStackTrace();
			
		}
		
		

	}

}
