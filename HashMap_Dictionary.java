/**
 * 
 * @author Ferdinand K. Yeke
 *
 */
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import java.util.ArrayList;
public class HashMap_Dictionary {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HashMap<String, String> ArchWords = new HashMap<String, String>();
		FileReader wordFile = new FileReader("C:\\Users\\ferdi\\eclipse_workspace_23-24\\Assignment 5.1_HashMap_FKY\\src\\DictionaryWordValuePairs.txt");
		
		Scanner wordScanner = new Scanner(wordFile);
		
		System.out.println(wordFile.read());
		
		while(wordScanner.hasNextLine())
		{
			
			
			String data = wordScanner.nextLine();
			/*
			String data2 = "";
			data2 = data.trim();
			*/
			//data2 = data.strip();
			String data2 = data.trim();
			
			ArchWords.put(data, data2.trim());

		}
		wordScanner.close();
		
		for(String i : ArchWords.keySet())
		{
			System.out.println(i);
		}
		
		/*
		System.out.println(ArchWords.get("timbrel"));
		*/
		System.out.println(ArchWords.size());
		System.out.println("test");
		
		for(String i : ArchWords.keySet())
		{
			System.out.println("Key: "+i+" \nValue: "+ArchWords.get(i));
			System.out.println("");
		}
		
		System.out.println("Searching for five words: ");
		String word1 = ArchWords.get("gallant	a dashing gentleman");
		String word2 = ArchWords.get("wherewith	with or by which");
		String word3 = ArchWords.get("behoof	benefit or advantage");
		String word4 = ArchWords.get("moil	drudgery");
		String word5 = ArchWords.get("coz	cousin");
		
		System.out.println(word1);
		System.out.println(word1.hashCode());
		System.out.println("");
		
		System.out.println(word2);
		System.out.println(word2.hashCode());
		System.out.println("");
		
		System.out.println(word3);
		System.out.println(word3.hashCode());
		System.out.println("");
		
		System.out.println(word4);
		System.out.println(word4.hashCode());
		System.out.println("");
		
		System.out.println(word5);
		System.out.println(word5.hashCode());
		System.out.println("");
		
	}
}
