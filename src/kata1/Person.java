package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birtdate) {
        this.name = name;
        this.birthdate = birtdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirtdate() {
        return birthdate;
    }
    
    public int getAge() {
        return (int)((new Date().getTime() - birthdate.getTime())/ 31536000000L);
    }
}