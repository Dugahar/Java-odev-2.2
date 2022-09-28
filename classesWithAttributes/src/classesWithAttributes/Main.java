package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1,"Laptop", "Monster laptop", 20000, 3, "Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1); 
		product.setDescription("Monster laptop");
		product.setPrice(20000); // :(
		product.setStockAmount(3); 
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
