public class factoryDesignPattern {
    
}
interface Shape {
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}
class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}