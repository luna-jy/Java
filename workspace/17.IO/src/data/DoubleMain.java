package data;

import java.io.* ;

public class DoubleMain {
public static void main(String[] args) {
	String filename = "src/data/실습";
	//파일 열고 - 쓰고 - 닫기 
	//1.파일을 연다
	//FileOutputStream out = null; 
	DataOutputStream out = null;
	try {
	
		
		out = new DataOutputStream(new FileOutputStream(filename));
		//쓰기
		double datas[]= {1.23, 0.85, 57.64, 0.7458, 548.762};
		for (double data : datas) {
			out.writeDouble(data);
		}
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}finally {
		//파일 닫기
		try {
			out.close();
			} catch (Exception e) {			
			e.printStackTrace();
			}
	}
	System.out.println("쓰기완료");
	
	//double 타입의 데이터를 읽기 : FileInputStream
	//읽어온 정보를 double 타입으로 변환
	DataInputStream in = null;
	try {
		in = new DataInputStream(new FileInputStream(filename) );
		while (true) {
			double data = in.readDouble();
			//읽어올 정보가 없으면 파일 끝을 만난다. 
		System.out.print(data + "\t");
		}

	
	
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(EOFException e) {
		System.out.println();
	}catch(IOException e) {
		System.out.println(e.getMessage());
	}finally {
		try {
			in.close(); 
		}catch(Exception e) {}
		
	}
	
	
}
}
