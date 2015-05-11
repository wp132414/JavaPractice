package org.dimigo.basic;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer1 = scanner.nextLine();
		String answer2 = scanner.nextLine();
		String answer3 = scanner.nextLine();
		
		System.out.println("가장 좋아하는 가수는?");
		System.out.println(answer1);
		if(answer1.equals("빅뱅")) {
			System.out.println("정답입니다 ^^");
		} else if(answer1.equals("apink")){
			System.out.println("정답입니다 ^^");
		} else if(answer1.equals("AOA")) {
			System.out.println("정답입니다 ^^");
		} else {
			System.out.println("틀렸습니다 TT");
		}
		
		System.out.println("");
		
		System.out.println("가장 좋아하는 배우는?");
		System.out.println(answer2);
		if(answer2.equals("구혜선")) {
			System.out.println("정답입니다 ^^");
		} else if(answer2.equals("수지")){
			System.out.println("정답입니다 ^^");
		} else if(answer2.equals("김태희")) {
			System.out.println("정답입니다 ^^");
		} else {
			System.out.println("틀렸습니다 TT");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 과목은?");
		System.out.println(answer3);
		if(answer3.equals("자바")) {
			System.out.println("정답입니다 ^^");
		} else if(answer3.equals("체육")){
			System.out.println("정답입니다 ^^");
		} else if(answer3.equals("미적분")) {
			System.out.println("정답입니다 ^^");
		} else {
			System.out.println("틀렸습니다 TT");
		}
	}

}
