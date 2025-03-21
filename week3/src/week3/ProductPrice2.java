package week3;

public class ProductPrice2 {

	public static void main(String[] args) {
		int milkPrice = 4500;
		int milkAmmount = 1;
		
		int carrotPrice = 1000;
		int carrotAmmount = 3;
		
		int snackPrice = 1500;
		int snackAmmount = 2;
		
		double rate = 25;
		
		int total = milkPrice * milkAmmount;
		total += carrotPrice * carrotAmmount;
		total += snackPrice * snackAmmount;
		System.out.println("할인전 상품의 가격 : " + total + "원");
		
		double sale = (total - carrotPrice * carrotAmmount) * (rate / 100);
		System.out.println("할인 금액 : " + sale + "원");
		System.out.println("최종 결제 금액 : " + (total - sale) + "원");

	}

}
