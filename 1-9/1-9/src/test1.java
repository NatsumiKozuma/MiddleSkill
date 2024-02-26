public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int num1 = 5;
		int num2 = 9;
		int sum = num1 + num2;
		System.out.println(sum);
				
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long num64 = 1111111111L;
        long doubledNum = num64 * 2;
        System.out.println(doubledNum);
        
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。	
        boolean flag = true;
        if ("invalid".equals(flag)) {
            System.out.println("3. true");
        } else {
            System.out.println("false");
        }
	}
}

