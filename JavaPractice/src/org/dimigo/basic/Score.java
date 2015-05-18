package org.dimigo.basic;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score1,score2,score3;
		System.out.println("국어점수 입력 =>");
		score1=scan.nextInt();
		System.out.println("수학점수 입력=>");
		score2=scan.nextInt();
		System.out.println("영어점수 입력=>");
		score3=scan.nextInt();
		
		int sum = score1+score2+score3;
		double pyung = (double)sum/3;
		
		System.out.println("<< 점수 출력 >>");
		System.out.println("국어 점수 : "+score1);
		System.out.println("수학 점수 : "+score2);
		System.out.println("영어 점수 : "+score3);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+ String.format("%.1f",pyung));

	}

}
