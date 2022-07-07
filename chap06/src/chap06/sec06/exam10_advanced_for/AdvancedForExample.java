package chap06.sec06.exam10_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { //배열 처음부터 끝까지 for문 반복
			sum = sum + score;
		}
		System.out.println("점수 총합" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg );
	}

}
