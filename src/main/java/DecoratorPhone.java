public abstract class DecoratorPhone implements Phone {

    private Phone phone;
    DecoratorPhone(Phone phone) {
        this.phone = phone;
    }

    public void call() {
        phone.call();
    }
}
