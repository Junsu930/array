package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {

	// 얕은 복사 (shallow : 얕은)
	// -> 주소를 복사하여 서로 다른 두 변수가 (주소값만 참고!)
	// 하나의 배열(또는 객체)를 참조하는 상태를 만드는 복사 방법
	
	public void shallowCopy() {
		
		int arr[] = {1, 2, 3, 4, 5};
		
		//얕은 복사 진행
		int[] copyarr = arr;
		
		System.out.println("주소 확인");
		System.out.println("arr : " + arr);
		System.out.println("copyarr : " + copyarr);
		
		// 배열 값 변경
		System.out.println("변경 전");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copyarr));
		
		// 얕은 복사한 배열의 값을 변경해봄
		copyarr[2] = 999;
		
		// 배열 값 변경 확인
		System.out.println("주소 확인");
		System.out.println("arr : " + arr);
		System.out.println("copyarr : " + copyarr);
		
		// 배열 값 변경
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr : " + Arrays.toString(copyarr));
	}

	public void deepCopy() {
		
		// 깊은 복사 (deep)
		// -> 같은 자료형의 새로운 배열을 만들어서
		// 기존 배열의 데이터를 모두 복사하는 방법
	
		int[] arr = {1, 2, 3, 4, 5}; //원복
		
		// 1. for문을 이용한 깊은 복사
		int[] copyarr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			copyarr1[i] = arr[i];
		}
		
		// 2. System.arraycopy { 원본배열, 원본 복사 시작 인덱스, 복사 배열, 복사 배열의 삽입 시작 인덱스, 복사 길이)
		
		int copyarr2[] = new int[arr.length];
		System.arraycopy(arr, 0 , copyarr2, 0, arr.length);
		
		// 3. Arrays.copyOf(원복 배열, 복사할 길이); 
		
		int copyarr3[] = Arrays.copyOf(arr, arr.length);

		// 값 변경 후 확인
		
		copyarr1[4] = 0;
		copyarr2[4] = 100;
		copyarr3[4] = 1000;
		
		System.out.println("arr : " + Arrays.toString(arr) );
		System.out.println("copyarr1 : " + Arrays.toString(copyarr1));
		System.out.println("copyarr2 : " + Arrays.toString(copyarr2));
		System.out.println("copyarr3 : " + Arrays.toString(copyarr3));
		
		System.out.println(arr);
		System.out.println(copyarr1);
		System.out.println(copyarr2);
		System.out.println(copyarr3);
		
	}
		
	public void createLottoNumber() {
		// 로또 번호 생성기 
		
		// 1. 1 ~ 45 중복되지 않는 난수 6개 생성  => math.random()
		// 2. 생성된 난수가 오름차순으로 정렬 => Arrays.sort()
		
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 2} 생성된 배열을 처음부터 끝까지 순차 접근하는 for 문 작성

		for(int i = 0; i < lotto.length; i++) {
			
			//3 ) 1 ~ 45 사이의 난수 생성
			int random = (int)(Math.random() * 45 + 1);
			
			// 생성된 난수를 순서대로 배열 요소에 대입
			lotto[i] = random;
			
			
			// 5) 중복 검사를 위한 for문 작성
			for(int x = 0; x < i; x++) {
				
				// 6) 현재 생성된 난수와 같은 수가
				// 앞쪽 요소에 있는지 검사
				if (random == lotto[x]) {
					i--;
					// i가 1씩 증가할 때마다 난수 하나 생성
					// -> 중복값이 있으므로 난수를 하나 더 생성
					break;
				}
			}
		} // for문 끝
		 
		// 7) 오름차순 정렬
		// -> 선택, 삽입, 버블, 퀵 등등 
		// -> 자바가 정렬 방법을 미리 만들어서 제공하고 있음
		// Arrays.sort(배열명) : 배열 내 값들이 오름차순으로 정렬됨
		// 시간 복잡도, 효율 공부 
		
		Arrays.sort(lotto);
		
		//결과 출력
		System.out.println(Arrays.toString(lotto));
	}
}

