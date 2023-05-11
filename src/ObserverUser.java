//ObserverUser IObserverUser arayüzünü uygulayan değişimi haber veren class
public class ObserverUser implements IObserverUser{

    @Override
    public void sendNotification(ProductUpdateMessage message) {
        System.out.println(message.toString());
    }
}
