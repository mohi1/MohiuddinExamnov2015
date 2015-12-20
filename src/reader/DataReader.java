package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class DataReader {

	public static void main(String[] args)throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */
		String thisLine = null;
				try{
					FileReader fr = new FileReader("C:\\Users\\Anwara Begum\\North-Pole\\src\\data\\becoming-a-developer");

		//String textFile = System.getProperty("C:/Users/Anwara Begum/git/North-Pole/src/data/becoming-a-developer.txt");
		//FileReader fr = new FileReader(textFile);
		BufferedReader br = new BufferedReader(fr);
		while((thisLine = br.readLine())!=null){
			System.out.println(thisLine);}
		
	
	}catch(Exception e){
		e.printStackTrace();
	}

	


	}
}

