public class BlueTooth extends DecoratorPhone {

    BlueTooth(Phone phone){
        super(phone);
    }
    @Override
    public void call() {
        super.call();
        System.out.println("Connecting blueTooth");
    }
}
