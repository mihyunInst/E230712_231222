package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {
	
	// 실습문제 1
	// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
	// 인원 수와 사탕 개수를 키보드로 입력 받고
	// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	/*
	[실행화면]
	인원 수 : 29
	사탕 개수 : 100

	1인당 사탕 개수 : 3
	남는 사탕 개수 : 13
	 */
    
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", input2/input1);
		System.out.printf("남은 개수 : %d\n", input2%input1);
		
	}
	
	
	
	// 실습문제 2
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();

		System.out.print("반 : ");
		int group = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, group, number, name, gender, score);
		
		
	}
	
	// 실습문제 3
	// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
	// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
	// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 
	// 아니라면 불합격을 출력하세요.
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
	    int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		
		/*System.out.printf("합계 : %d ", input1+input2+input3);
		System.out.printf("평균 : %.2f ",(input1+input2+input3)/3.0);
		(input1+input2+input3)/3.0>=60 ? "합격" : "불합격";*/
		
		int sum = kor + eng + math; // 합계
		double avg = sum / 3.0; // 평균
		
		System.out.println("합계: " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		boolean result = (kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60);
		
		System.out.println(  result ? "합격" : "불합격"  );
	}
	
	
	
	
	
	
	
	
	
}
