package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:\\Users\\user\\Desktop\\클라우드\\test\\aaa.txt");
		FileInputStream fis = new FileInputStream(filePath);
		while(true) {
			int res = fis.read();	// read는 int형태로 받아오는것
			if(res<0) {			//res는 -1 이다 -1이되면 가져올 값이 없다는 뜻
				break;
			}
			System.out.println((char)res);
		}
		
		
		
		
		
		
		
	}
}
