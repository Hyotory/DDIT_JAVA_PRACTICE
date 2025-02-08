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
//		method04();	//30분 뒤의 시간 출력		
//		method05();	//30분 전의 시간 출력			
//		method06();	//시계만들기
//		method07();	//더 큰 수 출력
//		method08();	//
		method09();	//
		
		
	}
	
	public void method09() {	
		// 점수를 입력하고 학점을 출력하세요.
		// 끝자리가 0~2 : -
		// 		  3~6 : 0
		//		  7~9 : +
		// 70 C 60 D 50 F
		//	88 -> B+
		// 100 -> A+
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		String grade = "";
		
		if(score == 100) {
			grade = "A+";
		}
		else if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else if(score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		if(score < 100) {
			if(score % 10 >= 0 && score % 10 <= 2) {
				grade += "-";
				System.out.println(grade);
			}
			
			else if(score % 10 >= 3 && score % 10 <= 6) {
				grade += "0";
				System.out.println(grade);
			}
			
			else if(score % 10 >= 7 && score % 10 <= 9) {
				grade += "+";
				
			}
		}
		
		System.out.println(grade);
		
		
	}
	public void method08() {
		// 숫자 a, b중 큰 숫자부터 출력하기
		// 빈 병에 옮겨두기
		System.out.println("수를 하나 입력하세요.");
		int a = sc.nextInt();
		System.out.println("수를 하나 더 입력하세요.");
		int b = sc.nextInt();
		
		// a부터 출력할 건데, b가 큰 경우
		// a=3, b=7을 입력한 경우
		if(a < b) {
			
			// 잘못된 SWAP
//			int temp = b;
//			b = a;
//			a = temp;
			
			// 정상적인 SWAP
			// 덮어쓸 값을 먼저 temp에 담기
			int temp = a;
			a = b;
			b = temp;			
				
				System.out.println(a + "이(가) " + b +"보다 큼");
		}
				
		
	}
	
	public void method07() {
		// 숫자 a, b 중 큰 수를 출력하세요.
		
		System.out.println("숫자를 하나 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자를 하나 더 입력하세요.");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + "(이)가 더 큰 수입니다.");
		}
		else {
			System.out.println(num2  + "(이)가 더 큰 수입니다.");
		}
	}
	
	
	public void method06() {
		//시계만들기
		int hour = 0;
		int min  = 0;
		int sec  = 0;
		
		while(true) {
			sec++;
			
			// 반복 속도 조절 (1ms 동안 멈춤)
			try {
				Thread.sleep(1); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
			}
			
			// 분 -> 시간 변환
			if(min == 60) {
				min = 0;
				hour ++;
			}
			// 초 -> 분 변환
			if(sec == 60) {
				sec = 0;
				min ++;
			}
			// 24시간 표기법 유지
			hour %= 24;
			
			System.out.println(hour + ":" + min + ":" + sec);
		}
		
		
		
		
	}
	
	
	public void method05() {
		// 시, 분을 입력 받고 30분 전의 시간을 출력하세요.
		System.out.println("시 : ");
		int hour = sc.nextInt();

		System.out.println("분 : ");
		int min = sc.nextInt();
		
		min -= 30;
		
		/*
		// 12시간 표기법
		// 2시 30분 -> 2시 00분
		// 2시 20분 -> 1시 50분
	  if(min < 30) -> //min이 0 이상일 경우에는 아무것도 하지 않아야 한다.
		if(min < 0) { // 이게 더 명확한 표현임
			hour--;
			min += 60;
		}
		// 1시 20분 -> 12시 50분
		if(hour <= 1) { //이것도 마찬가지. 2시 20분인 경우 13시 50분이 될 수 있음
		if(hour < 0) {
			hour += 12;
		}
			System.out.println(hour + " : " + min);
		*/
		
		// 24시간 표기법
		// 13시 20분 -> 12시 50분 
		
		if(min < 0) {
			hour--;
			min += 60;
		}
//		if(hour > 24) { 25시 20분을 입력하면 24시 50분이 되는 문제 발생
//			hour -= 24;
//		}
		// 모듈러(Modulus, %) 연산자 활용 변수 초기화
		hour %= 24; // 25시를 입력하면 첫번째 if문에서 24시가 되고, 24를 나눈 나머지 0을 hour에 저장
		System.out.println(hour + " : " + min);
		
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
			hour++;
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
