public class test1 {
	public static void main(String[] args) {
		// ���s
		System.out.println("��P");
		// ���1:���L�̏����𖞂����悤��if����3�l�X�g���ď��������쐬���Ă��������B
		//
		// �ϐ�x,y,z�͐��̐����ł���Ή��̏����ɑ����B����ȊO�́h���̐����FNG�h�ƕ\������
		// x�̒l��10�̔{���ł���Ή��̏����ɑ����B����ȊO�́h10�̔{���FNG�h�ƕ\������
		// x + y + z = 100�ł���΁h�v���X100�FOK�h����ȊO�́h�v���X100�FNG�h�ƕ\������

		int x = 10;
		int y = 80;
		int z = 15;

		if (x > 0 && y > 0 && z > 0) {
			if (x % 10 == 0) {
				if (x + y + z == 100) {
					System.out.println("�v���X100�FOK");
				} else {
					System.out.println("�v���X100�FNG");
				}
			} else {
				System.out.println("10�̔{���FNG");
			}
		} else {
			System.out.println("���̐����FNG");
		}

		// ���s
		System.out.println("��Q");
		// ���2:��1�Ɠ������e�ŎO�����Z�q�ŏ��������쐬���Ȃ����B�Ō�ɕϐ�a���o�͂���B
		String a = (x > 0 && y > 0 && z > 0)
				? (x % 10 == 0) ? (x + y + z == 100) ? "�v���X100�FOK" : "�v���X100�FNG" : "10�̔{���FNG"
				: "���̐����FNG";
		System.out.println(a);
	}
}
