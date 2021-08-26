package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		File filePath = new File("C:\\Users\\user\\Desktop\\클라우드\\test\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);	//fos 의 보조 bos
		
		for(char i='1'; i < '9'; i++) {
			Thread.sleep(2000);
	//		fos.write(i);
			bos.write(i);	// 자기만의 저장소에다가 쌓아놓고
		}
	//	bos.flush();	// bos에 있는걸 지워주세요 라는 뜻 반복문이 끝나면 한번에 나타남 파일에
	//	bos.write('a');	// 다시 write를 쓰면 또 쓸수있다.
	//	bos.flush();
		bos.close();	// 아예 접속을 끊으면서 값을 나타내줌 bos를 다시 사용 불가
		
	}
}
