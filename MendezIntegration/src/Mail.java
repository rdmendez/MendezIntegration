// Roger Mendez

public class Mail {

    // private fields
    private String name;
    private String category;
    private double price;
    private String size;
   
    // constructors
    public Mail(String name, double price) {
        // constructor add name, price
        this.name = name;
        this.price = price;
    }

    /**
     * @param name
     * @param category
     * @param price
     */
    public Mail(String name, String category, double price) {
        // overloaded constructor add name, category, price
        this.name = name;
        this.category = category;
        this.price = price;

    }

    /**
     * @param name
     * @param category
     * @param price
     * @param size
     */
    public Mail(String name, String category, double price, String size) {
        // overloaded constructor add name, category, price, and size
        this.name = name;
        this.category = category;
        this.price = price;
        this.size = size;

    }

    // accessors and mutators
    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }
}
