public class Test_gugudan {
	public static void main(String[] args) {
		//반복문(for, while, do_while)을 이용하여 구구단을 출력하는 프로그램
		//하나의 *.java파일(워크시트)을 분할 : Ctrl+Shift+{
		
		
		int i=0, j=0;   //반복변수  i와 j를 초기화
		
		//①-1 :for 가로 출력
		System.out.println("for 가로 출력");
		for(i=2; i<=9;i++) {
			for(j=1; j<=9;  j++) {
				if(i*j<10) {
					System.out.print(i+"*"+j+"=0"+(i*j)+"\t");
				}else {	
					System.out.print(i+"*"+j+"="+(i*j)+"\t");
				}//if
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}//for j
			System.out.println();
		}//for i
		System.out.println();
				
		//①-2 :for 세로 출력
		System.out.println("for 세로 출력");
		for(i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				if(i*j<10) {
					System.out.print(j+"*"+i+"=0"+(i*j)+"\t");
				}else {
					System.out.print(j+"*"+i+"="+(i*j)+"\t");
				}//if				
			}//for j
			System.out.println();
		}// for i
		System.out.println();
		
		//②-1 :while 가로 출력
		System.out.println("while 가로 출력");
		i=2;
		while(i<=9) {
			j=1;
			while(j<=9) {
				if(i*j<10) {
					System.out.print(i + "*" + j + "=0" + (i * j) + "\t");
				}else {
					System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}//if								
				j++;	
			}//while j
			System.out.println();
			i++;
			}//while i
			System.out.println();		
		
		
		//②-2 :while 세로 출력
			System.out.println("while 세로 출력");
			i = 1;
			while(i <= 9) {
				j = 2;
				while(j <= 9) {
					if(i * j < 10) {
						System.out.print(j + "*" + i + "=0" + (i * j) + "\t");
					}else {
						System.out.print(j + "*" + i + "=" + (i * j) + "\t");	
					}//if
					j++;
				}//while j
				System.out.println();
				i++;
			}//while i
			System.out.println();		
	
		//③-1 : do_while 가로 출력
			System.out.println("do_while 가로 출력");
			i = 2;
			do {
				j = 1;
				do {
					if(i * j < 10) {
						System.out.print(i + "*" + j + "=0" + (i * j) + "\t");
					}else {
						System.out.print(i + "*" + j + "=" + (i * j) + "\t");
					}//if
					j++;
				}while(j <= 9);
				System.out.println();
				i++;
			}while(i <= 9);		
			System.out.println();		
			
			
		//③-2 :do_while 세로 출력
		
			
			//③-2 : do_while 세로 출력
			System.out.println("do_while 세로 출력");
			i = 1;
			do {
				j = 2;
				do {
					if(i * j < 10) {
						System.out.print(j + "*" + i + "=0" + (i * j) + "\t");
					}else {
						System.out.print(j + "*" + i + "=" + (i * j) + "\t");	
					}//if
					j++;
				}while(j <= 9);
				System.out.println();
				i++;
			}while(i <= 9);
} //main()	

} //class
