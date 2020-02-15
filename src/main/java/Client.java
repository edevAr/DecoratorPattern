public class Client {
    public static void main(String[]args){
        System.out.println("Without decorators");
        Phone cellPhone = new CellPhone();
        cellPhone.call();
        System.out.println("With decorators");
        Phone decoratorPhone = new BlueTooth(new InternetConnection(new Radio(new CellPhone())));
        decoratorPhone.call();
    }
}
