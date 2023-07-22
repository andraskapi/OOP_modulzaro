package person;

public enum Gender {
    MALE("férfi"),
    FEMALE("nő");

    public final String hunName;

    Gender(String hunName) {
        this.hunName = hunName;
    }

    public String getHunName() {
        return hunName;
    }
    public String getName(){
        return this.name().toLowerCase();
    }


}
