package shapes;

abstract class ThreeDShape{

    private double density; // Can only be used by its subclasses

    ThreeDShape(double density){ // Constructor of ThreeDShape
        checkValidation(density);
        this.density=density;
    }

    abstract double getSurfaceArea();
    abstract double getVolume();

    double getMass(){ // Method that finds mass
        return getVolume()*density;
    }

    double getDensity(){ // Method that gives density 
        return density;
    }

    void checkValidation(double value){ // Checks if number is valid
        if(value<=0)
            throw new IllegalArgumentException("Value must be positive!");
}
}