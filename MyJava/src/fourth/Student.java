package fourth;

public class Student {
    
    private String code;
    private String surname;
    private String firstname;
    private int credits;

    public Student() {
    }

    public Student(String code, String surname, String firstname) {
        this.code = code;
        this.surname = surname;
        this.firstname = firstname;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public String getSurname() {
        return surname;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public String getFullname() {
        return firstname + " " + surname;
    }
    
    public void setFullname(String fullname) {
        //  Presumes that delimiter between names is ,
        int d = fullname.indexOf(',');
        firstname = fullname.substring(0, d);
        surname = fullname.substring(d+1);
    }
    
    public void addCredits(int credits) {
        if(credits > 0)
            this.credits += credits;
    }
    
    //  ... to be continued with "toString" and others ...
    
}



