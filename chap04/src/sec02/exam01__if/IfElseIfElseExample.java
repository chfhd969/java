package sec02.exam01__if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		 int score = 100;
		 
		if(score>100) {
			System.out.println("100점만점 기준입니다.");
		}else if(score>=90){
			System.out.println("점수가 100~90입 니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80){
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score>=70){
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}

	}
}
