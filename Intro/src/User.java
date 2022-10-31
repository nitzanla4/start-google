import java.util.HashMap;

public class User {
   private  String name;
    private int id;
    private boolean isActivated;


    public User(String a, int i, boolean b) {
        this.name=a;
        this.id=i;
        this.isActivated=b;
    }

    public String getName() {return name; }

    public int getId() { return id; }

    public boolean isActivated() {return isActivated; }

    @Override
    public String toString() {
        return "User:" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isActivated=" + isActivated;
    }
}




