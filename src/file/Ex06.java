package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		
		File filePath = new File("C:\\Users\\user\\Desktop\\클라우드\\test\\aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Test05 t = (Test05)ois.readObject();
		t.print();
		
		
	}
}
