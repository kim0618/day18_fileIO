package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		File filePath = new File("C:\\Users\\user\\Desktop\\클라우드\\test\\aaa.txt"); //입출력 경로
		FileOutputStream fos = new FileOutputStream(filePath, true); // 경로 안에 출력하기
															// true를 넣으면 새로운 내용 이어서 출력
		fos.write(97);
		fos.write('A');
		
		String name = "하이";
		
		fos.write(name.getBytes());
	
	
	
	}
}
