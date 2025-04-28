package Practice_java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//New file creation
		File fObj = new File("F:\\Onedrive\\OneDrive - Sify Technologies Limited\\Desktop\\28Apr2025.txt");
//		File fObj = new File("C:\\Users\\019321\\eclipse-workspace\\Practice_java\\String.txt");
		try {
			if(fObj.createNewFile()) {
				System.out.println("File has been created - "+fObj.getName());
				System.out.println("File has been created - "+fObj.getAbsolutePath());
			}
			else {
				System.out.println("File not created");
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		//
		//Write inside the file
		try {
		FileWriter fWriter = new FileWriter("F:\\\\Onedrive\\\\OneDrive - Sify Technologies Limited\\\\Desktop\\\\bbb.txt");
		fWriter.write("File New line....!\n");
		fWriter.write("This is the new file and writing through program. \n\nRegards, \nFileHandle.java");
		fWriter.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//Read the file
		try {
			Scanner sObj = new Scanner(fObj);
			while(sObj.hasNextLine()) {
				String data = sObj.nextLine();
				System.out.println("Data in File - "+data);
				System.out.println("Lenght of the file - "+fObj.length());
			}
			
		}
		catch(IOException ex) {
			System.out.println("Exception - "+ex.getMessage());
			ex.printStackTrace();
		}
//		//Delete a file
//		try {
//			if(fObj.exists()) {
//				System.out.println("File exists!!");
//				boolean status = fObj.delete();
//				System.out.println("File has been deleted - "+status);
//			}
//			
//		}
//		catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		Files fl  = new Files();
		//Delete file 
		Path path = Paths.get("F:\\Onedrive\\OneDrive - Sify Technologies Limited\\Desktop\\aaaa.txt");
		System.out.println("Path of the File - "+path);
        try {
            if (Files.exists(path)) {
                System.out.println("File exists!!");
                Files.delete(path); // this will throw IOException if it fails
                System.out.println("File has been deleted!");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException ex) {
            System.out.println("Failed to delete file:");
            ex.printStackTrace();
        }
        //
	}

}
//canRead - Boolean - Return file whether readable or not