//ProductUpdateMessage bildirilecek olan nesnelere parametre olarak giden mesaj
public class ProductUpdateMessage {
    public String productName;
    public String message;

    public String toString(){
        return String.format("%s  updated. Message:%s", productName, message);
    }
}
