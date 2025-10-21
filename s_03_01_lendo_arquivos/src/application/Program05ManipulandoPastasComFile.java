package application;

import java.io.File;
import java.util.Scanner;


public class Program05ManipulandoPastasComFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strpath = sc.nextLine();

		File path = new File(strpath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strpath + "//subdir").mkdir();
		System.out.println("DIrectory created sucess!! " + success);

		sc.close();
	}

}
