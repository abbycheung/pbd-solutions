class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAdresses {
    public static void main(String[] args) throws Exception {

        Address disneyLand = new Address();
        disneyLand.street = "1313 Disneyland Dr";
        disneyLand.city   = "Anaheim";
        disneyLand.state  = "California";
        disneyLand.zip    = 92802;
        
        Address disneyWorld = new Address(); 
        disneyWorld.street = "Walt Disney World Resort";
        disneyWorld.city = "Orlando";
        disneyWorld.state = "Florida";
        disneyWorld.zip= 32830;
        
        Address americanHome = new Address();
        americanHome.street = "123 America Rd";
        americanHome.city = "Hilo";
        americanHome.state = "Hawaii";
        americanHome.zip = 12345;

        System.out.println(disneyLand.street + ", " + disneyLand.city + ", " + disneyLand.state + "  " + disneyLand.zip);
        System.out.println(disneyWorld.street + ", " + disneyWorld.city + ", " + disneyWorld.state + "  " + disneyWorld.zip);
        System.out.println(americanHome.street + ", " + americanHome.city + ", " + americanHome.state + "  " + americanHome.zip);
    }
}

