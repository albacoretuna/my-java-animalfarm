package sixth;

import java.io.*;

public class City implements Serializable {

    private String name;
    private int population;

    public City() {
        this("no name", 0);
    }
    
    public City(String n, int p)  {
        this.setName(n);
        this.setPopulation(p);
    }

    public void setName(String n)  {
        name = n;
    }
    
    public String getName( )  {
        return name;
    }

    public void setPopulation(int p)  {
        population = p;
    }
    
    public int getPopulation( )  {
        return population;
    }

}

