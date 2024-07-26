package tuozhan;

public class SelectTitle {

	public static void main(String[] args) {
		try {
			select('E');
		}catch(NiYouBingException e) {
			e.printStackTrace();
			System.out.println("挖掉虫子给老王");
		}
	}
	
	public static void select(char item) throws NiYouBingException{
		if(item == 'A') {
			System.out.println("你回答正确");
		}else if(item == 'B' || item == 'C' || item == 'D') {
			System.out.println("恭喜你答错了");
		}else {
			throw new NiYouBingException("我有药");
		}
	}
	public static void get() {
		get();
	}
}

class NiYouBingException extends Exception{
	public NiYouBingException(String name) {
		super(name);
	}
}
