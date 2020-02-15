public class InternetConnection extends DecoratorPhone {

    InternetConnection(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Connecting internet");
    }
}
