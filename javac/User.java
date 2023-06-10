import java.util.Date;

public class User {
    private Date birthday;
    private Number size;
    private Photo[] photos;
    private Address address;
    
    public User(Date birthday, Number size, Photo[] photos, Address address) {
        this.birthday = birthday;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }}
