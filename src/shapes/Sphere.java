package shapes;

class Sphere extends ThreeDShape{ // Class of Sphere
    private double radius; // radius 

    Sphere(double radius, double density){ // Constructor of Sphere. Uses constructor of ThreeDShape
        super(density);
        checkValidation(radius);
        this.radius = radius;
    }

    double getRadius(){ // Gets radius of Sphere
        return radius;
    }

    @Override
    double getSurfaceArea(){ // Calculates surface of Sphere
        return 4*Math.PI*Math.pow(radius, 2);
    }

    @Override
    double getVolume(){ // Calculates volume of Sphere
        return (3/4)*Math.PI*Math.pow(radius, 3);
    }

    @Override
    double getMass(){ // Calculates mass of Sphere
        return getVolume()*radius;
    }
}
