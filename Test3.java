package tuozhan;

import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		//demo();
		
		System.out.println(get());
	}
	
	private static void demo() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/zhengziniu/zzn.txt");
			//如果不存在，帮我创建；如果存在，先清空，再去写
			fw.write("蔡依林");
			fw.write("周杰伦");
			fw.write("林俊杰");
			fw.write("邓紫棋");
		}catch(Exception e) {
			System.out.println("出异常");
			e.printStackTrace();
		}finally {
			//只要系统不退出，finally就一定会走，只释放资源和收尾
			try {
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static int get() {
		try {
			return 520;
		}finally {
			System.out.println("除了虚拟机和try，谁都阻挡不了我运行");
		}
	}
}
