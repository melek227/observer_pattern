/*
Ara bağlantıları azaltmaya çalışır
iki class arasında bilgi değişimi olsun
observer olan class(cep telefonu/website vs) observable(bilgi sağlayan) olan classa bağlanıp bilgiyi çeker
clientlerin sunucudaki değişiklikten haberdar olup tetiklenip sunucuya bağlanmaları sağlanır
 */
public class Main {
    public static void main(String[] args) {

        // Güncellemeden etkilenecek olan sınıf örnekleri.
        IObserverUser mehmet = new ObserverUser();
        IObserverUser derya = new ObserverUser();
        IObserverUser sema = new ObserverUser();
        IObserverUser aleyna = new ObserverUser();


        // İzlenecek olan sınıf örneği.
        Samsung samsung = new Samsung();

        // İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
        samsung.addObserver(mehmet);
        samsung.addObserver(derya);
        samsung.addObserver(sema);
        samsung.addObserver(aleyna);

        samsung.changePrice();



        }
    }
