public class Ex_gugudan {
	public static void main(String[] args) {
		//가로 출력
		for(int i=2; i<=9; i++) {
			for(int j= 1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}//for j
				System.out.println();
		}//for i
		
		System.out.println();
	
		//한 자리수를 두 자리 수로 바꾸기 (if else 사용)
		for(int i=2; i<=9; i++) {
			for(int j= 1; j<=9; j++) {
				if(i*j<10) {
					System.out.print(i+"*"+j+"=0"+(i*j)+"\t");
				}else {System.out.print(i+"*"+j+"="+(i*j)+"\t");
				}//if		
	}//for j
		System.out.println();
}//for i

		System.out.println();
		
		
		//세로 출력
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(i*j<10) {
					System.out.print(j+"*"+i+"=0"+(j*i)+"\t");
				}else {
					System.out.print(j+"*"+i+"="+(j*i)+"\t");
				}//if				
			}//for j
			System.out.println();
		}// for i
		
		
		
		
		
	}//main()
	
} //class
