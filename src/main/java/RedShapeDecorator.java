public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }
    public void draw(){
        decoratorShape.draw();
        setBorder(decoratorShape);
    }
    private void setBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
