//IObserverUser değişimden etkilenen observableyi izleyen class.
// sendNotification fonksiyonuna ProductUpdateMessage türünde message parametre olarak verilir

public interface IObserverUser {
    public void sendNotification(ProductUpdateMessage message);
}
