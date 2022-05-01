package tut9.adapter;


import tut9.adapter.adapter.SquarePegAdapter;
import tut9.adapter.round.RoundHole;
import tut9.adapter.round.RoundPeg;
import tut9.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
    public static void main(String[] args) {
        //TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
        RoundHole roundHole = new RoundHole(3);
        RoundPeg roundPeg = new RoundPeg(3);
        //TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
        if (roundHole.fits(roundPeg)){
            System.out.println("It fits");
        }
        //TO-DO: Create 2 instances of SquarePeg with 2 different widths
        SquarePeg squarePeg1 = new SquarePeg(5);
        SquarePeg squarePeg2 = new SquarePeg(10);
        //Note: You can't make RoundHole instance "fit" with SquarePeg instance
        //Therefore, we need to use Adapter for solving the problem.

        //TO-DO: Create 2 corresponding instances of SquarePegAdapter
        SquarePegAdapter squarePegAdapter1= new SquarePegAdapter(squarePeg1);
        SquarePegAdapter squarePegAdapter2= new SquarePegAdapter(squarePeg2);
        //TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance
        //show a suitable message
        if (roundHole.fits(squarePegAdapter1)){
            System.out.println("It fits");
        }
        //TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance
        //show a suitable message
        if (!roundHole.fits(squarePegAdapter2)){
            System.out.println("It not fits");
        }
    }
}