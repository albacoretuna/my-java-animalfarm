package fourth;

public class CD {
    
    private String title;
    private String artist;
    private int year;

    public CD() {
    }
    
    public CD(String t, String a, int y)  {
        title = t;
        artist = a;
        year = y;
    }

    public void setTitle(String t)  {
        title = t;
    }
    
    public String getTitle( ) {
        return title;
    }

    public void setArtist(String a)  {
        artist = a;
    }
    
    public String getArtist( ) {
        return artist;
    }

    public void setYear(int y)  {
        year = y;
    }
    
    public int getYear( ) {
        return year;
    }

    public String toString()  {
        String m;
        m = "Artist: " + artist;
        m += "\n" + "Title of CD: " + title;
        m += "\n" + "Published:" + year + "\n";
        return m;
    }

    public static void main(String[ ] args) {
        CD a, b, c, d, e;
        a = new CD("Foxtrot", "Genesis", 1972);
        b = new CD("Tarkus", "ELP", 1971);
        c = new CD("Drama", "Yes", 1981);
        d = new CD();
        e = new CD();
        b.setArtist("Emerson, Lake & Palmer");
        c.setYear(1980);
        d.setTitle("no title");
        e.setYear(a.getYear());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    
}

