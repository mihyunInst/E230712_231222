package com.kh.variable.run;

import com.kh.variable.practice2.CastingPractice1;
import com.kh.variable.practice2.CastingPractice2;

public class PracticeRun {
	// 실행클래스
	public static void main(String[] args) {
		
		CastingPractice1 cp = new CastingPractice1();
		//cp.ex1();
		
		CastingPractice2 cp2 = new CastingPractice2();
		//cp2.ex2();
		
		
		int rows = 5;
		char alphabet = 'A';
		for (int i = 1; i <= rows; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print(alphabet + " ");
		        alphabet++;
		    }
		    System.out.println();
		}
		
	}
}
