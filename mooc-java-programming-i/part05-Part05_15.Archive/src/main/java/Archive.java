public class Archive {
    String identifier;
    String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }


    public boolean equals(Object compared){
        if( this == compared){
            return true;
        } else if (!(compared instanceof Archive)){
            return false;
        }
        Archive comparedArchive = (Archive) compared;
        return this.identifier.equals(comparedArchive.identifier);
    }
}
