package cop2250.spring24.week8.stack;
//Sean Stack SPC ID# 2511132

//import all util needed
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

//start public class for program
public class BabyNamesUtil {

//create method using try-catch 
public static void printTopNames(File file,int num) {
	try {
		//use scanner to read text file
		Scanner sc = new Scanner(file);
		//set delimiter as per instructions
		sc.useDelimiter(",|\\r\\n");
		//created two array lists to organize text file data
		ArrayList<String> girlNames = new ArrayList<>();
		ArrayList<String> boyNames = new ArrayList<>();
		//use while loop in order to continuously read through each line
		while(sc.hasNext()){
			//set parameters for while loop
			String state = sc.next();
			String gender = sc.next();
			int year = sc.nextInt();
			String name = sc.next();
			int rank = sc.nextInt();
			//establish if conditions in order to meet file search requirements
			if(gender.equals("F") && girlNames.size() < num) {
				girlNames.add(name);
			}
			if(gender.equals("M") && boyNames.size() < num) {
				boyNames.add(name);
			}
		}
		//print results with correct formatting as per instructions
		System.out.println("Baby Name Rankings");
		System.out.println("  ");
		System.out.printf("    %-10s%-10s\n","Boys","Girls");
		System.out.printf("    %-10s%-10s\n","----","-----");
		//utilize for loop in order print valid file search parameters
		for(int i = 0; i < num; i ++) {
			System.out.printf("%-4d%-10s%-10s\n",i+1,boyNames.get(i),girlNames.get(i));
		}
	}
	catch(FileNotFoundException E) {
		//print File Not Found as catch parameter
		System.out.println("File Not Found");
		
	}
	
}
//create main argument in order to test and run program accordingly
public static void main(String[]args) {
	File f = new File("babyNames.txt");
	BabyNamesUtil.printTopNames(f,15);
}
}
