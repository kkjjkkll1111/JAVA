package week2;

public class ProductPrice {
	public static void main(String[] args) {
		int amount = 7;
		int totalPrice = 5700;
		double avgPrice = (double)totalPrice / (double)amount; 
		
		System.out.printf("구매 수량 : %d개\n", amount);
		System.out.printf("총 구매 금액 : %d원\n", totalPrice);
		System.out.printf("상품 단가 : %.1f원\n", avgPrice);
	}
}
