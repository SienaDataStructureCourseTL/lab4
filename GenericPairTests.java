import java.util.ArrayList;

public class GenericPairTests
{
    public static void main(String args[]) 
    {
        //GenericPair
        // GenericPair<String> couple = new GenericPair<String>("Bob", "Sue");
        // System.out.print("    Test 1 GenericPair:  ");
        // System.out.println(couple.toString().equals("(Bob, Sue)") ? "passed" : "failed");
        // couple.swap();
        // System.out.print("    Test 2 GenericPair:  ");
        // System.out.println(couple.toString().equals("(Sue, Bob)") ? "passed" : "failed");

        // //minMaxPair
        // Integer[] arr = {3, 7, 1, 5, 2, 9};
        // System.out.print("     Test 1 minMaxPair:  ");
        // System.out.println(GenericPairUtility.minMaxPair(arr).toString().equals("(1, 9)") ? "passed" : "failed");

        // Integer[] arr2 = {-14, 0 , 5, -9, 3, 7, -9, 1, 2};
        // System.out.print("     Test 2 minMaxPair:  ");
        // System.out.println(GenericPairUtility.minMaxPair(arr2).toString().equals("(-14, 7)") ? "passed" : "failed");

        // //areCollinear
        // System.out.print("   Test 1 areCollinear:  ");
        // System.out.println(GenericPairUtility.areCollinear(new GenericPair<Double>(1.0, 1.0), 
                // new GenericPair<Double>(2.0, 2.0), 
                // new GenericPair<Double>(3.0, 3.0)) ? "passed" : "failed");

        // System.out.print("   Test 2 areCollinear:  ");
        // System.out.println(!GenericPairUtility.areCollinear(new GenericPair<Double>(0.0, 0.0), 
                // new GenericPair<Double>(0.0, 2.0), 
                // new GenericPair<Double>(2.0, 0.0)) ? "passed" : "failed");

        // //allAreCollinear 
        // ArrayList<GenericPair<Double>> points = new ArrayList<GenericPair<Double>>();
        // points.add(new GenericPair<Double>(1.0, 1.0));
        // points.add(new GenericPair<Double>(0.0, 0.0));
        // points.add(new GenericPair<Double>(-1.0, -1.0));
        // System.out.print("Test 1 allAreCollinear:  ");
        // System.out.println(GenericPairUtility.allAreCollinear(points) ? "passed" : "failed");

        // points = new ArrayList<GenericPair<Double>>();
        // int numPoints = (int) (Math.random() * 1000);
        // int rise = (int) (Math.random() * 10);
        // int run = (int) (Math.random() * 10);
        // double x = rise;
        // double y = run;
        // for(int i = 0; i < numPoints; i++)
        // {
            // points.add(new GenericPair<Double>(x, y));
            // x += rise;
            // y += run;
        // }
        // System.out.print("Test 2 allAreCollinear:  ");
        // System.out.println(GenericPairUtility.allAreCollinear(points) ? "passed" : "failed");

        // points = new ArrayList<GenericPair<Double>>();
        // numPoints = (int) (Math.random() * 1000);
        // rise = (int) (Math.random() * 10);
        // run = (int) (Math.random() * 10);
        // x = rise;
        // y = run;
        // for(int i = 0; i < numPoints; i++)
        // {
            // points.add(new GenericPair<Double>(x, y));
            // x += rise;
            // y += run;
            // rise = (int) (Math.random() * 10);
            // run = (int) (Math.random() * 10);
        // }
        // System.out.print("Test 3 allAreCollinear:  ");
        // System.out.println(!GenericPairUtility.allAreCollinear(points) ? "passed" : "failed");

        // points = new ArrayList<GenericPair<Double>>();
        // points.add(new GenericPair<Double>(1.0, 1.0));
        // points.add(new GenericPair<Double>(2.0, 2.0));
        // points.add(new GenericPair<Double>(3.0, 3.0));
        // points.add(new GenericPair<Double>(4.0, 4.0));
        // points.add(new GenericPair<Double>(5.0, 5.0));
        // points.add(new GenericPair<Double>(6.0, 6.0));
        // points.add(new GenericPair<Double>(7.0, 7.0));
        // System.out.print("Test 4 allAreCollinear:  ");
        // System.out.println(GenericPairUtility.allAreCollinear(points) ? "passed" : "failed");

        // points = new ArrayList<GenericPair<Double>>();
        // points.add(new GenericPair<Double>(0.0, 0.0));
        // points.add(new GenericPair<Double>(2.0, 1.0));
        // points.add(new GenericPair<Double>(4.0, 2.0));
        // points.add(new GenericPair<Double>(6.0, 3.0));
        // System.out.print("Test 5 allAreCollinear:  ");
        // System.out.println(GenericPairUtility.allAreCollinear(points) ? "passed" : "failed");

        // points = new ArrayList<GenericPair<Double>>();
        // points.add(new GenericPair<Double>(5.7, 6.2));
        // points.add(new GenericPair<Double>(3.8, 4.1));
        // System.out.print("Test 6 allAreCollinear:  ");
        // System.out.println(GenericPairUtility.allAreCollinear(points) ? "passed" : "failed");
    }
}
