package GroceryStore;

public class product {

	  private String name;
	    private float price;
	    private int quantityInStock;
	    private String category;
	    private int reorderLevel;

	    public product(String name, float price, int quantityInStock, String category, int reorderLevel) {
	        this.name = name;
	        this.price = price;
	        this.quantityInStock = quantityInStock;
	        this.category = category;
	        this.reorderLevel = reorderLevel;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public float getPrice() {
	        return price;
	    }

	    public void setPrice(float price) {
	        this.price = price;
	    }

	    public int getQuantityInStock() {
	        return quantityInStock;
	    }

	    public void setQuantityInStock(int quantityInStock) {
	        this.quantityInStock = quantityInStock;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public int getReorderLevel() {
	        return reorderLevel;
	    }

	    public void setReorderLevel(int reorderLevel) {
	        this.reorderLevel = reorderLevel;
	    }

}
