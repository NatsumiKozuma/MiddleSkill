public class test1 {
	public static void main(String[] args) {
		//���s
		System.out.println("��P");
		//���1:�ϐ�"numa"�ɃC���N�������g���Z�q�𗘗p��1�}�C�i�X�������̂�\�����Ă��������B
		
		int numa = 5;
		 numa--;
	        System.out.println(numa);
	        
		//���s
		System.out.println("��Q");
		//���2:�ϐ�"numb"�̒l�����̏ꍇ��"positive"�A���̏ꍇ��"negative"�A0�̏ꍇ��"zero"�Əo�͂���v���O�������O�����Z�q��p���č쐬���Ă��������B
		//(String result�ϐ���p���Ă����ɒl���i�[��������o�͂���`���ł��肢�������܂�)
		
		int numb = 5;
		String result = (numb > 0) ? "positive" : (numb < 0) ? "negative" : "zero";
        System.out.println(result);
//���s
	System.out.println("��R");
//���3:"numc","numd"2�̕ϐ��̑傫�����̒l���o�͂���v���O�������O�����Z�q��p���č쐬���Ă��������B
//(int intResult�ϐ���p���Ă����ɒl���i�[��������o�͂���`���ł��肢�������܂�)
	//�����K���S�p�^�[�����퓮�삷�邱�Ƃ��R���\�[���Ŋm�F���ĉ������B
	
int numc = 1;
int numd = 2;
int intResult = (numc > numd) ? numc : numd;
System.out.println(intResult);
//���s
	System.out.println("��S");
//���4:"nume"��"numf"�̕ϐ��������̐��̏ꍇ��"both positive"�A�ǂ��炩�̒l�����̏ꍇ��"one positive"�A
//�����̒l�����̏ꍇ��"both negative"�A����ȊO��"etc"�Əo�͂���v���O�������O�����Z�q��p���č쐬���Ă��������B
//(String results�ϐ���p���Ă����ɒl���i�[��������o�͂���`���ł��肢�������܂�)
//�����K���S�p�^�[�����퓮�삷�邱�Ƃ��R���\�[���Ŋm�F���ĉ������B
int nume = 4;
int numf = -3;
String results = (nume > 0 && numf > 0) ? "both positive" : (nume > 0 || numf > 0) ? "one positive" : (nume < 0 && numf < 0) ? "both negative" : "etc";
System.out.println(results);
	}
}
