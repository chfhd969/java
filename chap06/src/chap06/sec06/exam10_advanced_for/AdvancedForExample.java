package chap06.sec06.exam10_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { //�迭 ó������ ������ for�� �ݺ�
			sum = sum + score;
		}
		System.out.println("���� ����" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg );
	}

}
