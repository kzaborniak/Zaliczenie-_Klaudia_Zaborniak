class Main {
   public static void main(String[] args)   
	{ 
		String input = "5,5";           
		try 
		{ 
			Integer.parseInt(input); 
			System.out.println(input + " jest liczbą całkowitą"); 
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println(input + " nie jest liczbą całkowitą"); 
		} 
	} 
} 