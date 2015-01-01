class Armadillo extends Animal {
    public int armorRating;

    /**
      * Constructor
      */
    public Armadillo(int armorRating)
    {
        super(4, false); // 4 legs, no feathers
        this.armorRating = armorRating;
    }
}
