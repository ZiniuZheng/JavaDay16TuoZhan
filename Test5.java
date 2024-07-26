package tuozhan;

public class Test5 {

	public static void main(String[] args) {
		// 1.一对兔子
		// 2.一个月后
		// 3.生一对兔子
		// 4.生一对大兔子
		
		int littleRabbit = 1; //第一个月的情况
		int bigRabbit = 0;
		int oldRabbit = 0;
		
		for(int i=0;i<19;i++) {
			oldRabbit += bigRabbit;
			bigRabbit = littleRabbit;
			littleRabbit = oldRabbit;
		}
		
		System.out.println(littleRabbit + bigRabbit + oldRabbit);
		
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2;i<arr.length;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[arr.length-1]);
	}
}
