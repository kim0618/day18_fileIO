package file;

import java.io.Serializable;

public class Test05 implements Serializable{	// 객체를 직렬화, 바이트화 할때 무조건 implements Serializable
	private String name;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public void print() {
		System.out.println("name : "+name);
	}
	
	
	
}
