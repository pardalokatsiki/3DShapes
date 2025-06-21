package shapes;

public class Cylinder extends ThreeDShape{
    private double height, radius;

    Cylinder(double height, double radius, double density){ // Constructor of Cylinder
        super(density);
        checkValidation(height);
        checkValidation(radius);
        this.height=height;
        this.radius=radius;
    }

    double getHeight(){ // gets height
        return height;
    }

    double getRadius(){ // gets radius
        return radius;
    }

    @Override
    double getSurfaceArea(){ // Calculates surface area
        return (2*Math.PI*radius*height)+(2*Math.PI+Math.pow(radius, 2));
    }

    @Override
    double getVolume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
}