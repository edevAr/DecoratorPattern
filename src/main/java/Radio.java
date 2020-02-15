public class Radio extends DecoratorPhone {
    Radio(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Connecting radio");
    }
}
