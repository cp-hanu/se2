package tut9.adapter.square;

import lombok.AllArgsConstructor;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
@AllArgsConstructor
public class SquarePeg {
	//TO-DO: Declare an attribute: name = width, type = double
    private double width;
	//TO-DO: Declare the constructor with a parameter
     
	//TO-DO: Implement getWidth() method
    public double getWidth() {
		return width;
    }

    //TO-DO: Implement getSquare() method
    public double getSquare() {
        //TO-DO: result = width^2
        return width * width;
    }
}
