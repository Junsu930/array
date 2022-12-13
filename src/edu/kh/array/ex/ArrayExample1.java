package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {

	/* 배열(Array)
	 * -같은 자료형의 변수를 하나의 묶음으로 다루는 것(자료구조)
	 * -묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 * (index는 0부터 시작하는 정수)
	 * 
	 */
	public void ex1 () { 
		//번수 vs 배열
		
		// 1-1. 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공가넹 uum이라는 이름을 부여.
		
		// 1-2. 변수 대입
		num = 10;
		// 생성된 num이라는 변수 공간에 10을 대입
		
		// 1-3. 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//-------------------------------------------
		
		// 2-1. 배열 선언
		int[] arr;
		// stack 영역에 int[](int 배열) 자료형 공간을 4byte 할당하고
		// 그 공간에 arr이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소 값(4byte)만을 저장할 수 있음
		
		
		// 2-2. 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타냄 
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성(할당)
		// ** 생성된 int[]에는 시작주소가 지정된다! **
		
		// 2-3. 배열 요소 값 대임
		// arr은 int[]참조형 변수이지만
		// arr[0]~[2] int 자료형 변수이기 때문에 정수 값을 대입할 수 있다. 
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		// 2-4. 배열 요소 값 읽어오기
		System.out.println(arr);
		
	}
	
	public void ex2() {
		// 배열 선언 및 할당
		
		int[]arr = new int[4];
		// 1) stack 영역에 int[] 자료형 참조형 변수 arr 선언 
		// 2) heap 영역에 int 자료형 4개 묶음으로 다루는 int[]할당
		// 3) 생셩된 int[]의 주소를 arr에 대입하여 참조하는 형태를 만듦
		
		// 배열 길이(몇 칸인가): 배열명.lenght
		System.out.println("배열 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
	
		
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값: %d\n", i, arr[i]);
		}
	}
	
	public void ex3() {
		
		// 5명의 키(cm)를 입력받고 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		
		double h[] = new double[5]; 
		double sum = 0;
		
		for(int i = 0; i < h.length; i++) {
			System.out.printf("%d번 키 입력 : ", i+1);
			h[i] = sc.nextDouble();
			// 각 인덱스에 입력받은 값을 대입 (초기화)
			sum += h[i];;
			
		}
		System.out.print("입력받은 키 : ");
		
		for(int i = 0; i < h.length; i++) {
		System.out.print( h[i] + " ");
		}
		System.out.println();
		System.out.printf("평균 : %.2f\n", sum/5 );
	}	
	
	public void ex4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int score[] = new int[sc.nextInt()];
		int sum = 0;
		
		for(int i = 0; i<score.length; i++) {
			System.out.printf("%d번 점수 입력 : ", i+1);
			score[i]=sc.nextInt();
			sum += score[i];
			
		}
		
		double avg = sum / score.length;
		
		
		//최고 / 최저점 구하기
		int max = score[0];
		int min = score[0];
		
		for(int j = 0; j<score.length; j++) {
			if(max<=score[j]) {
				max = score[j];
			}else if(min>=score[j]) {
				min = score[j];
			}
		}
		
		System.out.println("합계 :" + sum);
		System.out.printf("평균 : %.1f\n", avg );
		System.out.println("최고점 :" + max);
		System.out.println("최저점 :" + min);
	}

	public void ex5() {
		// 배열 선언과 동시에 초기화 
		char[] arr = new char[5];
		
		// char[] arr 이 참조하는 배열 요소에 A, B, C, D, E 대입하기
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (char)('A'+i);
		}
		System.out.println(Arrays.toString(arr));
		
		// ** Arrays 클래스
		// -> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		// Arrays.toString(배열명)
		
		int[] arr2 = new int[4];
		
		char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		
		//char[] 참조변수 arr3를 선언하고
		//heap 영역에 char 5칸까지 char[]을 생성하고
		//각각 'A', 'B', 'C', 'D', 'E'로 초기화 후 주소를 arr3에 대입
		
		System.out.println(Arrays.toString(arr3));
	}
	
	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인 
		// 만약 있다면 몇 번 인덱스에 존재하는지 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		// flag == false: 일치하는 값이 존재하지 않음
		// flag == true : 일치하는 값이 존재 
		
		boolean flag = false; //검사 전에는 없다고 가정
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i]==input) {
				System.out.println(i + "번 째 인덱스에 존재");
				flag = true;
			}
		}
		//flag 상태를 검사
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex7() {
		// 입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		// 없으면 "존재하지 않음"
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		boolean flag = false;
		
		for(int i =1; i<arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i + "번 째 인덱스에 존재합니다.");
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("값이 존재하지 않습니다.");
		}
	}

	public void ex8() {
		// 1. 문자열을 입력받아 한 글짜씩 잘라내어 char 배열에 순서대로 저장
		
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇 개 존재하는지 확인
		
		// 3. 단 일치하는 문자가 없을 경우 "존재하지 않습니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");
		String st1 = sc.nextLine();
				
		char[] ch1 = new char[st1.length()];
		
		// 문자열을 입력받아 한 글자씩 char 배열에 저장함
		for(int i = 0; i < st1.length(); i++) {
			ch1 [i] = st1.charAt(i);
		}
		
		// 중간 확인
		// System.out.println(Arrays.toString(ch1));
		
		//boolean flag = false;
		
		System.out.print("찾을 문자를 입력하시오 : ");
		char ch2 = sc.nextLine().charAt(0);
	
		int count= 0;
		
		for(int j = 0; j < ch1.length; j++ ) {
			if(ch1[j] == ch2){
				count ++;
	
				//flag = true;
			}
			
		}
		/*if(!flag) {
			System.out.printf("일치하는 값이 존재하지 않습니다");
		} else {
			System.out.printf("일치하는 문자의 수는 : %d 입니다.\n", count);
		}
		*/
		if(count > 0 ) {
			System.out.printf("일치하는 문자의 수는 : %d 입니다.\n", count);
		} else {
			System.out.printf("일치하는 값이 존재하지 않습니다");
		}
	}
}


