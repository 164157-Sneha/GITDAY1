package com.sneha.jav;

public class Hello {
 
	public void greeting(Greet greet)
	{
		greet.perform();
	}
	
	public static void main(String[] args) {
		Hello hello = new Hello();
        
		Greet HiGreeting = new HiGreeting();
	    Greet myFunction = ()-> System.out.println("Hello Capgemini");
	    
	    Greet innerClassGreet = new Greet()
	    {
	    	public void perform()
	    	{
	    		System.out.println("Hello");
	    	}
	    };
	    
       hello.greeting(myFunction); 
       hello.greeting(innerClassGreet);
       
	}
}

/*interface MyLambda
	{
		void foo();

	}*/
