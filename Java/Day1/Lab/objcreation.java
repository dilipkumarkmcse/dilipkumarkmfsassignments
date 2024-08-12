package corejava;
class objcreate {
    int id;
    String name;
    
    void displayInfo() {
        System.out.println(id + "\n" + name);
    }
}

public class objcreation {
    public static void main(String[] args) {
        objcreate o = new objcreate();
        o.id = 7;
        o.name = "DK";
        o.displayInfo();
    }
}
