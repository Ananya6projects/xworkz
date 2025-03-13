class Food {
    public static int getPrice(String foodItem) {
        System.out.println("Food item: " + foodItem);
        if (foodItem=="biryani")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="pulav")
			{
            int price = 120;
            return price;
        }
		if (foodItem=="dosa")
			{
            int price = 130;
            return price;
        }
		if (foodItem=="idli")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="chicken")
			{
            int price = 190;
            return price;
        }
		if (foodItem=="chitrana")
			{
            int price = 19;
            return price;
        }
		if (foodItem=="rice")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="vada")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="jamoon")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="meals")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="cake")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="sweet")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="champakali")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="rasmalai")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="puliogare")
			{
            int price = 100;
            return price;
        }
		if (foodItem=="rice bath")
			{
            int price = 100;
            return price;
        }
        else return 0; 
    }
    public static void main(String[] args) {
        String foodItem = "biryani"; 
        int ref = Food.getPrice(foodItem); 
        System.out.println("Price: " + ref);
    }
}







