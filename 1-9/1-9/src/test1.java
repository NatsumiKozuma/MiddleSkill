public class test1 {
	public static void main(String[] args) {
		
//		1.������5��9�̕ϐ����`���A�������������o�͂��Ȃ����B
		int num1 = 5;
		int num2 = 9;
		int sum = num1 + num2;
		System.out.println(sum);
				
//		2.64�r�b�g�����́u1111111111�v���`��2�{�����l���o�͂��Ȃ����B
		long num64 = 1111111111L;
        long doubledNum = num64 * 2;
        System.out.println(doubledNum);
        
//		3.boolean�^�̕ϐ��̒l�ɕs���ȕ������r������false���o�͂��Ă��������B	
        boolean flag = true;
        if ("invalid".equals(flag)) {
            System.out.println("3. true");
        } else {
            System.out.println("false");
        }
	}
}

