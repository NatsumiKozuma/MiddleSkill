import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test1 {
	public static void main(String[] args) {
		//���s
		System.out.println("��P");
		//���1:�z��"numa"�̗v�f��S�v�f���o�͂��Ȃ����B��i++�ȂǗ��p���Ȃ�for���ŋL�q���邱��
		int[] numa = {1, 2, 3, 4, 5};
		for (int num : numa) {
			System.out.println(num);
		}
		
		
		//���s
		System.out.println("��Q");
		
		//���2:�z��"numb"�̗v�f���t���ɏo�͂��Ă��������B
		int[] numb = {1, 2, 3, 4, 5};
		for (int i = numb.length - 1; i >= 0; i--) {
            System.out.println(numb[i]);
        }
        
		//���s
		System.out.println("��R");
		
		//���3:�z��"numc"�̒��ŋ����̗v�f���������v�����l���o�͂��Ă��������B
		int[] numc = {1, 2, 3, 4, 5};
		int sumEven = 0;
        for (int num : numc) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }
        System.out.println(sumEven);
		//���s
		System.out.println("��S");
		
		//���4:���̔z��"numd"���R�s�[�����z��"new_numd"�����"new_numd"�̒��g���o�͂��Ă��������B
		int[] numd = {1, 3, 5, 7, 9};
		 int[] new_numd = Arrays.copyOf(numd, numd.length);
		 System.out.println(Arrays.toString(new_numd));
	        
		//���s
		System.out.println("��T");
		
		//���5:���̔z��"nume"�������ɕ��ёւ��ďo�͂��Ȃ����B
		int[] nume = {6, 2, 8, 1, 9};
		Arrays.sort(nume);
		System.out.println(Arrays.toString(nume));
        
		//���s
		System.out.println("��U");
		
		//���6:�z��"numf"�ɗv�f��1��(10)�ǉ������z��"new_numf"���쐬���o�͂��Ȃ����B
		int[] numf = {1, 3, 5, 7, 9};
		int[] new_numf = Arrays.copyOf(numf, numf.length + 1);
        new_numf[new_numf.length - 1] = 10;
        System.out.println(Arrays.toString(new_numf));
        
		//���s
		System.out.println("��V");
		
		//���7:Map"car"�Ɂu�L�[�F"honda"�@�o�����["�z���_",�L�[�F"toyota"�@�o�����[�F"�g���^",�L�[�F"subaru"�@�o�����[�F"�X�o��"�v�̗v�f��ǉ����Ă�������
		Map<String, String> car = new HashMap<>();
        car.put("honda", "�z���_");
        car.put("toyota", "�g���^");
        car.put("subaru", "�X�o��");

		//���s
		System.out.println("��W");
		
		//���8:Map"car"�́u�L�[�F"toyota"�v�̃o�����[���o�͂��Ă��������B
		System.out.println(car.get("toyota"));
		//���s
		System.out.println("��X");
		
		//���9:Map"car"�̃L�[�ƃo�����[��S�ďo�͂��Ă��������B��for���ōs������
		 for (Map.Entry<String, String> entry : car.entrySet()) {
	            System.out.println( entry.getKey() + ":" + entry.getValue());
	        }
		//���s
		System.out.println("��P�O");
		
		//���10:Map"car"�̃L�[�ƃo�����[��S�ďo�͂��Ă��������B��forEach���ōs������
		car.forEach((key, value) -> System.out.println( key + ":" + value));
	}
}

