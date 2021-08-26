package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:\\Users\\user\\Desktop\\클라우드\\abcd1234\\abcd1234.txt"); //입출력 경로
		FileOutputStream fos = new FileOutputStream(filePath, true);
		
		Scanner input = new Scanner(System.in);
		String name,addr,age;
	//	int age;
		System.out.print("이름 : ");
		name = input.next();
		
		System.out.print("나이 : ");
		age = input.next();
		
		System.out.print("주소 : ");
		addr = input.next();
		name+="\n";	//파일에 엔터값넣는법
		age+="\n";
		addr+="\n";
		
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
		
		
	}
}
