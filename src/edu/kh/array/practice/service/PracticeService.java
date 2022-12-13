package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;


public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	
	public void practice1() {
		
		int arr[] = new int [9];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i%2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스의 합 : " + sum);
	}
	
	public void practice1_1() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");

            if (i % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("\n짝수 번째 인덱스 합 : " + sum);
    }
	
	public void practice2() {
		int arr[] = new int [9];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = 9-i;
			System.out.print(arr[i] + " ");
			if(i%2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스의 합 : " + sum);
	}

	public void practice3() {
		
		
		
		System.out.print("배열 크기를 정할 양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
		
	}

	public void practice4() {
		
		int arr[] = new int[5];
		
		System.out.print("입력 0 :");
		arr[0] = sc.nextInt();
		System.out.print("입력 1 :");
		arr[1] = sc.nextInt();
		System.out.print("입력 2 :");
		arr[2] = sc.nextInt();
		System.out.print("입력 3 :");
		arr[3] = sc.nextInt();
		System.out.print("입력 4 :");
		arr[4] = sc.nextInt();
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < arr.length; i++ ) {
			if( search == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		System.out.print("문자열을 입력하시오 : ");
		String st1 = sc.nextLine();
				
		char[] ch1 = new char[st1.length()];
		
		for(int i = 0; i < ch1.length; i++) {
			ch1[i] = st1.charAt(i);
		}
		int count = 0;
		System.out.print("찾을 문자를 입력하시오 : ");
		char find = sc.nextLine().charAt(0);
		String index = "";
		
		for(int i = 0; i < ch1.length; i++) {
			if(find == ch1[i]) {
				count ++;
				index += i;
			} 
		}
		
		System.out.printf("%s에 %s가 존재하는 위치 : %s\n" ,st1, find, index);
		System.out.printf("%s의 개수 : %d", find, count);
		
	}

	public void practice6() {
		
		System.out.print("배열의 길이를 입력하시오 : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번쨰 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		
		for(int i = 0; i< arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("총 합 : " + sum);
		
	}

	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char arr[] = new char[14];
		for(int i=0; i<14; i++) {
			if(i<8) {
			arr[i] = input.charAt(i);
		}else {
			arr[i] = '*';
		}
			System.out.print(arr[i]);
		}
			
	}

	public void practice8() {
		
		System.out.print("3이상의 홀수를 입력하시오 : ");
		int input = sc.nextInt();
		int arr[] = new int [input];
		
		if(input<3 || input%2==0) {
			System.out.println("다시 입력하세요.");
		}else { 
			for(int i = 0; i <= arr.length/2; i++) {
				arr[i] = i+1;
				//중간값까지 정리
			}
			for(int j = arr.length-1; j>arr.length/2; j--) {
					arr[j] = input-j;
			}
		}
		
		for(int i= 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}

	}


	public void practice9() {
		int randomarr[] = new int[10];
		
		for(int i = 0; i < randomarr.length; i++) {
			randomarr[i] = (int)(Math.random()*10+1);
		}
		
		//난수 대입
			
		System.out.print("발생한 난수 : " + Arrays.toString(randomarr));
	}
	
	public void practice10() {
		
		int randomarr[] = new int[10];
		
		for(int i = 0; i < randomarr.length; i++) {
			randomarr[i] = (int)(Math.random()*10+1);
		}
		
		//난수 발생 완료
		
		int max = 0;
		int min = 0;
		// 최대값 최소값 초기화
		
		for(int i = 0; i < 10; i++) {
			if(max<randomarr[i]) {
				max = randomarr[i];
			}
		min = max;
		for(int j = 0; j < 10; j++) {
			if(min>randomarr[j]) {
				min = randomarr[j];
			}
			}
		
		}
		System.out.println("발생한 난수 : " + Arrays.toString(randomarr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice11() {
		
		int randomarr[] = new int[10];
		
		for(int i = 0; i < randomarr.length; i++) {
			randomarr[i] = (int)(Math.random()*10+1); //난수 발생
			for(int j = 0; j<i; j++) {
				if(randomarr[j]==randomarr[i]) {
					i--;
					break; 
					//중복제거
				}
			}
		}
		System.out.println(Arrays.toString(randomarr));
	}
	
	public void practice12() {
		
		int randomarr[] = new int[6];
		
		for(int i = 0; i < randomarr.length; i++) {
			randomarr[i] = (int)(Math.random()*45+1); //난수 발생
			for(int j = 0; j<i; j++) {
				if(randomarr[j]==randomarr[i]) {
					i--;
					break; 
					//중복제거
				}
			}
		}
		Arrays.sort(randomarr);  // 오름차 정렬
		System.out.println(Arrays.toString(randomarr));
	}

	public void practice13() {
		
		
		System.out.print("문자열을 입력하시오 : ");
		String input = sc.nextLine();
		int count = 0 ;
		char chararr[] = new char[input.length()];
		for(int i = 0; i < chararr.length; i++){
			chararr[i] = input.charAt(i);
		}
			
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i<chararr.length; i++) {
			boolean flag = true;
			for(int j = 0; j<i; j++) {
				if(chararr[i]==chararr[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				
				if(i==0) {
					System.out.print(chararr[i]);
				}else {
					System.out.print(", " + chararr[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
	public void practice14() {
		
		System.out.print("배열의 크기를 입력하세요 :");
		int input1 = sc.nextInt();
		String st1[] = new String[input1];
		// 배열 선언과 자리수 지정
		sc.nextLine();
		for(int i = 0; i < input1; i++) {
			System.out.print((i+1) + "번 째 문자열 :");
			st1[i] = sc.nextLine();
			//첫 번째로 입력값대로 배열에 문자열 채우다
		}
		
		//while문으로 break 때까지 반복
		
		while(true) {
		
			System.out.print("더 값을 입력하시겠습니까? (Y/N)");
			char yon = sc.next().charAt(0);
			//반복문 나갈 조건
			if(yon == 'n' || yon =='N') {
				break;
			}else if (yon == 'y' || yon =='Y') {
				System.out.print("더 입력할 개수 : ");
				int more = sc.nextInt();
				String st2[] = new String[st1.length + more];
				
				sc.nextLine();
				for(int i = 0; i < st2.length; i++) {
					// 추가한 만큼 새롭게 배열 만든다
					if(i<st1.length) {
						st2[i] = st1[i]; // 처음 배열만큼은 복사를 해준다.
					
					} else {
						System.out.print((i+1) +"번 쨰 문자열 : ");
						st2[i] = sc.nextLine();
					}
				}
				
				st1 = st2; //st1 첫 배열에 두 번째 배열의 주소값을 준다.
				
			}else {
				System.out.println("값을 잘못 입력하셨습니다.");
			}	
		}
		System.out.println(Arrays.toString(st1));
	}
}

