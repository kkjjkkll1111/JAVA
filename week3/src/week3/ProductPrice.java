package week3;

public class ProductPrice {

	public static void main(String[] args) {
		int milkPrice = 4500;
		int milkAmmount = 1;
		
		int carrotPrice = 1000;
		int carrotAmmount = 3;
		
		int snackPrice = 1500;
		int snackAmmount = 2;
		
		int total = milkPrice * milkAmmount;
		total += carrotPrice * carrotAmmount;
		total += snackPrice * snackAmmount;
		System.out.println("할인전 상품의 가격 : " + total + "원");
		
		double salePrice = total * 0.1;
		System.out.println("할인 금액 : " + salePrice + "원");
		
		double resultPrice = total - salePrice;
		System.out.println("최종 결제 금액 : " + resultPrice + "원");

	}

}
