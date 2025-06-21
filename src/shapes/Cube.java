package shapes;

public class Cube extends ThreeDShape{
    private double side;

    Cube(double side, double density){ // Constructor of Cube
        super(density);
        checkValidation(side);
        this.side=side;
    }

    double getSide(){ // gets side of Cube
        return side;
    }

    @Override
    double getVolume(){ // Calculates volume of 
        return Math.pow(side, 3);
    }

    @Override
    double getSurfaceArea(){
        return 6*Math.pow(side, 2);
    }

    // getMass method won't be overriden because it doesn't need any modifications
}