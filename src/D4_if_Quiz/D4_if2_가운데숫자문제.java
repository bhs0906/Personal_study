package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */

public class D4_if2_가운데숫자문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(101) + 150;	// (0~100까지 랜덤출력) + (150부터 출력) = 150부터 100개까지 출력(총 250)
		System.out.println("문제 = " + num);
		
		int senter = num % 100 / 10;
		
		System.out.print("가운데 숫자를 입력하세요.");
		int senter1 = scan.nextInt();
		
		if(senter == senter1) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}
}