package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02FileReaderBufferedReader {

	public static void main(String[] args) {
		String path = "/home/ad-linux/Área de trabalho/in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path); // basico
			br = new BufferedReader(fr); // abstração maior

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {

			try {
				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		}

	}

}
