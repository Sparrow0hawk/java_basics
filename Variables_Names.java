public class Variables_Names
{
    public static void main( String[] args)
    {
        int cars, drivers, passengers;
        double space_in_car, spare_cars, avg_passengers;

        cars = 100;
        drivers = 30;
        passengers = 70;
        space_in_car = 4;
        spare_cars = cars - drivers;
        avg_passengers = passengers / (cars - spare_cars) ;

        System.out.println( "There are "+ cars + " cars available." );
        System.out.println( "There are "+ drivers+" drivers available.");
        System.out.println( "There are "+ spare_cars+" unused cars.");
        System.out.println( " We need to put "+ avg_passengers + " passengers in each car.");
    }
}