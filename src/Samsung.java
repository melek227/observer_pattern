//Samsung observableProduct classından türer.ürün fiyatı değişir(bilgi sağlar).observer örneklerine bildirim gönderilir
public class Samsung extends ObservableProduct {

    // Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
    public void changePrice() {
        // Ürün fiyatlarının güncellenmesi vs.

        this.message.productName = "Samsung";
        this.message.message = "Samsung's price updated.";
        this.notifyObserver();
    }

}
