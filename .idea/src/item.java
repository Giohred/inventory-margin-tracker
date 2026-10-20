public class Item {
    private int id;
    private String sku;
    private String name;
    private String category;
    private double purchasePrice;
    private double sellingPrice;
    private int quantity;
    private int daysInStock;
    private String status;

    public Item(int id, String sku, String name, String category, double purchasePrice, double sellingPrice, int quantity, int daysInStock, String status) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.daysInStock = daysInStock;
        this.status = status;
    }

    // Calcolo del profitto netto unitario
    public double getNetProfit() {
        return this.sellingPrice - this.purchasePrice;
    }

    // Calcolo del margine di profitto percentuale sul prezzo di vendita
    public double getMarginPercentage() {
        if (this.sellingPrice <= 0) return 0.0;
        return ((this.sellingPrice - this.purchasePrice) / this.sellingPrice) * 100.0;
    }

    // Verifica se l'articolo è fermo da troppo tempo in magazzino (oltre 60 giorni)
    public boolean isStaleInventory() {
        return this.daysInStock > 60;
    }

    @Override
    public String toString() {
        return String.format("[%s] %-28s | Categoria: %-12s | Acquisto: €%6.2f | Vendita: €%6.2f | Margine: %5.1f%% | Giacenza: %2d pz (%d gg)",
                sku, name, category, purchasePrice, sellingPrice, getMarginPercentage(), quantity, daysInStock);
    }

    // Getter principali
    public String getSku() { return sku; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPurchasePrice() { return purchasePrice; }
    public double getSellingPrice() { return sellingPrice; }
    public int getQuantity() { return quantity; }
    public int getDaysInStock() { return daysInStock; }
    public String getStatus() { return status; }
}
