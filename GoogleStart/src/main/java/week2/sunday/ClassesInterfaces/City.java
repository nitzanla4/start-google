package week2.sunday.ClassesInterfaces.Figure;

public class City {

    private final String cityName;
    private final String countryName;
    private int population;


    private static City tlv;

    public City(String cityName, String countryName, int population) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
    }


    public City createTLV(int population)
    {
        if (tlv== null)
            return new City("Tel Aviv","Israel",population);
        return tlv;
    }

    public String getCityName() { return cityName;}

    public String getCountryName() {return countryName;}

    public int getPopulation() {return population;}

    public void setPopulation(int population) {this.population = population;}
}
