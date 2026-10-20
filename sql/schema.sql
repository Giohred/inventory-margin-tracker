-- Creazione tabella per il tracciamento inventario e margini
CREATE TABLE IF NOT EXISTS inventory_items (
                                               id INTEGER PRIMARY KEY AUTOINCREMENT,
                                               sku VARCHAR(50) NOT NULL UNIQUE,
    name VARCHAR(150) NOT NULL,
    category VARCHAR(50) NOT NULL,
    purchase_price DECIMAL(10, 2) NOT NULL,
    selling_price DECIMAL(10, 2) NOT NULL,
    quantity INTEGER NOT NULL DEFAULT 0,
    days_in_stock INTEGER NOT NULL DEFAULT 0,
    status VARCHAR(20) NOT NULL DEFAULT 'IN_STOCK'
    );

-- Inserimento dati di test realistici
INSERT INTO inventory_items (sku, name, category, purchase_price, selling_price, quantity, days_in_stock, status) VALUES
                                                                                                                      ('TECH-001', 'Cavo USB-C Intrecciato 2m', 'Elettronica', 3.50, 9.99, 45, 12, 'IN_STOCK'),
                                                                                                                      ('TECH-002', 'Caricatore Rapido 30W GaN', 'Elettronica', 8.20, 19.90, 20, 25, 'IN_STOCK'),
                                                                                                                      ('ABBIG-101', 'Felpa Con Cappuccio Nera M', 'Abbigliamento', 14.00, 34.50, 10, 65, 'IN_STOCK'),
                                                                                                                      ('ABBIG-102', 'Pantaloni Cargo Slim Fit L', 'Abbigliamento', 18.50, 42.00, 5, 95, 'STALE'),
                                                                                                                      ('CASA-201', 'Set Tazze Ceramica 4pz', 'Casa', 6.00, 15.00, 12, 40, 'IN_STOCK');