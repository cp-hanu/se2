package tut9.adapter.adapter;


import lombok.AllArgsConstructor;
import tut9.adapter.round.RoundPeg;
import tut9.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
@AllArgsConstructor
public class SquarePegAdapter extends RoundPeg {
    //TO-DO: Declare an attribute: name = peg, type = SquarePeg
    private SquarePeg peg;
    //TO-DO: Declare the constructor with a parameter

    //TO-DO: Implement getRadius() method
    @Override
    public double getRadius() {
        double result = 0;
        // Calculate a minimum circle radius, which can fit this peg.
        //TO-DO: result = Square Root [(getWidth() of SquarePeg/2)^2) * 2)]
        result = Math.sqrt((peg.getWidth() / 2) * (peg.getWidth() / 2) * 2);
        return result;
    }
}