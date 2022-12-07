package goods;

public class GoodsInfoMain {
 public static void main(String[] args) {
	GoodsInfo g1=new GoodsInfo("운동화","아디다스","AD01",70000);
	GoodsInfo g2=new GoodsInfo("모자","나이키","NK01",30000);

	System.out.println("제조사 \t 상품코드 \t 상품명 \t 표준단가 \t 할인율 \t 판매가");
	g1.discountChange(0);
	display(g1);
	g2.discountChange(30);
	display(g2);
}//main() 
 
 static void display(GoodsInfo goods){
	 System.out.printf(goods.company + "\t");
	 System.out.printf(goods.code + "\t");
	 System.out.printf(goods.name + "\t");
	 System.out.printf(goods.standard + "\t");
	 System.out.printf(goods.discount + "\t");
	 System.out.printf(goods.sale() + "\t");
	 System.out.println();
 }
 
}//class

/* 선생님이 하신 코드 
GoodsInfo[] goods= new GoodsInfo[2];
goods[0]=new GoodsInfo("운동화","아디다스","AD01",70000);
goods[1]=new GoodsInfo("모자","나이키","NK01",30000);

static void display(GoodsInfo[] goods){
System.out.println("제조사 \t 상품코드 \t 상품명 \t 표준단가 \t 할인율 \t 판매가");
System.out.printf (" %s %s %d %d %d \n"
					,goods.company, goods.code, goods.name, goods.standard, goods.discount, goods.sale());




*/