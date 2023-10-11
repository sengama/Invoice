public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String model, String description, int quantity, double pricePerItem) {
        this.model = model;
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Model 1", "Electrocasnic", 6, 150);
        System.out.println("Modelul: " + invoice.getModel());
        System.out.println("Descrierea: " + invoice.getDescription());
        System.out.println("Cantitatea: " + invoice.getQuantity());
        System.out.println("Prețul pe unitate: " + invoice.getPricePerItem());
        System.out.println("Valoarea facturii: " + invoice.getAmount());

        // Modificam valorile cantitatii si pretului pe unitate definiti in constructor
        invoice.setQuantity(-5);
        invoice.setPricePerItem(-50);
        System.out.println("Modelul: " + invoice.getModel());
        System.out.println("Descrierea: " + invoice.getDescription());
        System.out.println("Cantitatea: " + invoice.getQuantity());
        System.out.println("Prețul pe unitate: " + invoice.getPricePerItem());
        System.out.println("Valoarea facturii: " + invoice.getAmount());
    }
}
