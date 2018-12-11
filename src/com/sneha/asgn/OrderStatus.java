package com.sneha.jav;

public class OrderStatus {

	public static void main(String[] args) {
		
		Order price = (amount)-> {
			if(amount>10000)
			{
				System.out.println("Order accepted and being processed" + "\n" + amount);
			}
			else
			{
				System.out.println("Order Rejected");
			}
			
		};
		
		 price.status(50000);

	}

	interface Order
	{
		void status(int amount);
	}
}
