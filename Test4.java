package tuozhan;

import java.io.*;

public class Test4 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/Users/zhengziniu/a.txt");
		Exception1 e1 = new Exception1();
		Exception1 e2 = new Exception1("你完蛋了");
		
		System.out.println(e2.getMessage());
		fw.write(e2.getMessage());
		fw.close();
	}
}

class Throwable1{
	private String message;
	
	public Throwable1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Throwable1(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}

class Exception1 extends Throwable1{

	public Exception1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exception1(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
