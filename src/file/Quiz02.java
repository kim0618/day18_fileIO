package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class Baking implements Serializable{
	private String bread,price;	
	public String getBread() {	return bread;}
	public void setBread(String bread) {	this.bread = bread;}
	public String getPrice() {	return price;}
	public void setPrice(String price) {	this.price = price;}
}

class Files{
	public void out(Baking ba) throws Exception{
		File dit = new File("C:\\Users\\user\\Desktop\\클라우드\\test");
		File ff = new File(dit, ba.getBread()+".txt");
		FileOutputStream fos = new FileOutputStream(ff);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(ba);
		oos.close();
	}
	
	public File[] read() throws Exception {
		Baking ba = null;
		File dit = new File("C:\\Users\\user\\Desktop\\클라우드\\test");
		File[] ff = dit.listFiles();
		//	File ff = new File(dit, bread+".txt");
		
		return ff;
	}
	
	public  boolean create(String bread) throws Exception {
		File dit = new File("C:\\Users\\user\\Desktop\\클라우드\\test");
		File ff = new File(dit, bread+".txt");
		if(ff.createNewFile()) { return false; }
		return true;
	}
}

public class Quiz02 {
	public static void main(String[] args) throws Exception {
		
	ArrayList<Baking> arr = new ArrayList<Baking>();
	Scanner input = new Scanner(System.in);
	int num;
	String bread=null,price=null;
	
	while(true) {
		Files out = new Files();
		Baking ba = new Baking();
		System.out.println("1.빵 등록");
		System.out.println("2.빵 목록보기");
		System.out.println("3.종료");
		System.out.println(">>> ");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("등록할 빵 이름 : ");
			bread = input.next();
			System.out.println("가격 등록 : ");
			price = input.next();
			ba.setBread(bread);
			ba.setPrice(price);
			arr.add(ba);
			out.create(bread);
			out.out(ba);
			System.out.println("등록 완료");
			break;
		case 2:
			File[] fa = out.read();
			if(fa.length == 0) {
				System.out.println("빵 없음");
			}
			for(int i=0; i<fa.length;i++) {
				File a = fa[i];
				FileInputStream f1 = new FileInputStream(a);
				BufferedInputStream f2 = new BufferedInputStream(f1);
				ObjectInputStream f3 = new ObjectInputStream(f2);
				Baking s = (Baking)f3.readObject();
				System.out.println(s.getBread()+"-"+s.getPrice());
			}	
		//	int i=0;
			
		//	System.out.println("찾을 빵 : ");
		//	bread = input.next();
		//	out.read(bread);
		//	if(out.read(bread) != null) {
				/*for( i = 0; i<arr.size();i++) {
					System.out.print(arr.get(i).getBread()+" - ");
					System.out.println(arr.get(i).getPrice());
					System.out.println("--------");
					
				}*/
			//	Baking a = out.read(bread);
							
		//		System.out.println(a.getBread());
		//	}else {
		//		System.out.println("등록된 빵이 없습니다.");
		//	}
			
			/*	if(i != arr.size()){
			for( i = 0; i<arr.size();i++) {
				System.out.print(arr.get(i).getBread()+" - ");
				System.out.println(arr.get(i).getPrice());
				System.out.println("--------");
			//	out.read(bread);
			}
			}
			else {
				System.out.println("등록된 빵이 없습니다.");
			}*/
			break;
		case 3:
			System.out.println("종료합니다.");
			return;
		}
	}
}
}
