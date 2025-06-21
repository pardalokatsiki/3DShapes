package shapes;

public class RectangularPrism extends ThreeDShape{
    private double height, length, weight;

    RectangularPrism(double height, double length, double weight, double density){
        super(density);
        checkValidation(height);
        checkValidation(length);
        checkValidation(weight);
        this.height=height;
        this.length=length;
        this.weight=weight;
    }

    double getHeight(){
        return height;
    }

    double getLength(){
        return length;
    }

    double getWeight(){
        return weight;
    }

    @Override
    double getSurfaceArea(){
        return 2*(weight*length+height*length+height*weight);
    }

    @Override
    double getVolume(){
        return height*weight*length;
    }
}