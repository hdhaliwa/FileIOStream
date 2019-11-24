package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

class Students{
	
	// declare int , name and address of student
	int id;
	String name;
	String address;
	
	Students() {
		
	}
	
	Students(int i, String name, String address){
		this.id = i;
		this.name = name;
		this.address = address;
		
	}
	
	String toCSV(){
		return "roll " + "," + id + "," + " name " + "," + name + "," + " address " +"," + address;
	}
}

public class FileIO {

	/*void WriteDataInFile(Students sRef){
		try {
		File file = new File("/Users/jagme/OneDrive/Documents/GitHub/Edureka/src/co/edureka/io/students.csv");
		FileOutputStream stream;
		stream = new FileOutputStream(file);
		String data = sRef.toCSV();
		try {
			stream.write(data.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			stream.close();// close will ensure memory is no longer used for stream.
			System.out.println("Data written in file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
	
		void ReadDataFromFile(){
			try{
				//File file = new File("/Users/jagme/OneDrive/Documents/GitHub/Edureka/src/co/edureka/io/students.csv");
	            File file = new File("/Users/jagme/OneDrive/Documents/GitHub/Edureka/src/Bank_Account.java"); // This is Java file
				
				//Read data from file in the form of bytes
				
				/*FileInputStream stream = new FileInputStream(file);
				// store byte in ch
				int ch = 0;
				ch = stream.read();
				//System.out.println((char)ch); //lets convert int into char
				while(ch != -1){ //end of file
					System.out.print((char)ch);
					ch = stream.read();
					
				}
				stream.close();
				*/
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
				
				int ClassCount = 0;
				String data = buffer.readLine();
				//System.out.print(data);
				while(data != null){
					System.out.println(data);
					
					if(!data.startsWith("//") && data.contains("class") ){
						ClassCount++;
					}
					data = buffer.readLine();
				}
				System.out.print("Class Found " +ClassCount);
				buffer.close();
				reader.close();
				
				
			}
				catch(Exception e){
					System.out.println("Some exception" +e);
				}
			}
			
		
	
	public static void main(String[] args) {
		/*
		Students s1 = new Students(1,"John","Carlton Stree");
		Students s2 = new Students(2,"Karry","Mclarren Avenue");
		System.out.println("S1 details "+ s1.toCSV());
		System.out.println("S2 details "+ s2.toCSV());
		*/
		
		FileIO io = new FileIO();
		//io.WriteDataInFile(s1);
		io.ReadDataFromFile();
		
	}

}
