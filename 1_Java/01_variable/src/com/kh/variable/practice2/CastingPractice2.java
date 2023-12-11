package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void ex2() {
		/*
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
			이 때 총점과 평균은 정수형으로 처리하세요.
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double input2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double input3 = sc.nextDouble();
		
		System.out.printf("총점 : %d\n", (int)(input1 + input2 + input3));
		System.out.printf("평균 : %d\n", (int)(input1 + input2 + input3)/3);
		
	}
}
