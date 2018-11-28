package com.sneha.jav;

public class OrderStatus {

	public static void main(String[] args) {
		
		Order price = (amount)-> {
			if(amount>10000)
			{
				System.out.println("Order accepted" + amount);
			}
			else
			{
				System.out.println("Order Rejected");
			}
			
		};
		
		 price.status(10000);

	}

	interface Order
	{
		void status(int amount);
	}
}
