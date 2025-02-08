package kr.or.ddit.practice01.sec01;

import java.util.Scanner;

public class Practice25020701 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Practice25020701 obj = new Practice25020701();
		obj.process();

	}

	public void process() {
//		method01(); //else if 활용
//		method02();	//if 조건절 안에 논리연산자(&&, ||) 활용	
//		method03();	//02번의 연장선
		method04();	//		
	}
	
	public void method04() {
		// 시, 분을 입력 받고 30분 뒤에 시간을 출력하세요.

		System.out.println("시 : ");
		int hour = sc.nextInt();

		System.out.println("분 : ");
		int min = sc.nextInt();
		
		//12시간 표기법
//		min += 30;
//
//		if (min >= 60) {
//			hour++;
//			min -= 60;
//		}
//
//		if (hour > 12) { // 12시 59분까지는 출력해야하니까 그다음 1시로 넘어가고
//			hour -= 12;
//		}
//		System.out.println(hour + " : " + min);
		
		
		//24시간 표기법
		min += 30;
		
		// 14시 20분 -> 14시 50분
		// 14시 30분 -> 15시 00분
		// 23시 40분 -> 00시 10분
		if(min >= 60) { // 분이 60분 이상이면 시간을 1증가, 분을 60감소
			hour ++;
			min -= 60;
		}
		
		if(hour >= 24) { //24시가 되면 00시로 표기
			hour -= 24;
		}
		
		System.out.println(hour + "시 " + min +"분");
		
	}
	
	
	
	public void method03() {
		// 월을 입력 받아 계절을 출력하시오.
		// 12~2 겨울
		// 3~5 봄
		// 6~8 여름
		// 9~11 가을
		
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		}
		else if(month >= 6 && month <= 8) {
			System.out.println("여름");
		}
		else if(month >= 9 && month <= 11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
		
	}
	
	
	public void method02() {
		// 5과목의 점수를 입력 받고
		// 1과목이라도 40점보다 적다면 불합격
		// 평균이 60점 미만이라면 불합격
				
		System.out.println("소프트웨어 설계 : ");
		int score1 = sc.nextInt();

		System.out.println("소프트웨어 개발 : ");
		int score2 = sc.nextInt();

		System.out.println("데이터베이스 구축 : ");
		int score3 = sc.nextInt();

		System.out.println("프로그래밍언어 활용 : ");
		int score4 = sc.nextInt();

		System.out.println("정보시스템 구축 : ");
		int score5 = sc.nextInt();
		
		double avg = (score1 + score2 + score3 + score4 + score5) / 5;
		
		//if 조건문의 결과가 합격인 경우
//		if(score1 >= 40 && score2 >= 40 && 
//		   score3 >= 40 && score4 >= 40 && 
//		   score5 >=40 && avg >= 60) {
//				System.out.println("합격");
//		}
//		else {
//				System.out.println("불합격");
//		}
		// if 조건문의 결과가 불합격인 경우
		// '||' 하나라도 참이면 참 -> 명령문 실행
		if(score1 < 40 || score2 < 40 || 
		   score3 < 40 || score4 < 40 || 
		   score5 < 40 || avg < 60) {
				System.out.println("불합격");
		}
		else {
				System.out.println("합격");
		}
		
		
		
		
		
		
	}
	
	
	//else if 활용 연습
	public void method01() {
		// 점수를 입력 받고 학점을 출력하시오.
		// 90 이상 A
		// 80 이상 B
		// 70 이상 C
		// 60 이상 D
		// 60 미만 F
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}		
		
	}
	
	
}
