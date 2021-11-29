interface Area
{
    float pi = 3.14f;
    float calcArea(float x, float y);
}
class Circle implements Area
{
    public float calcArea(float x, float y)
    {
        float areaOfCircle = pi * x * y;
        return areaOfCircle;
    }
}
class Square implements Area
{
    public float calcArea(float x, float y)
    {
        float areaOfSquare = x * y;
        return areaOfSquare;
    }
}
class InterfaceTest {
    public static void main(String[] args) {
        Area s;
        s = new Circle();
        float circle = s.calcArea(20, 10.5f);
        System.out.println("Area of circle: " + circle);

        s= new Square();
        float square = s.calcArea(20.5f, 10.5f);
        System.out.println("Area of square: " + square);
    }

}
