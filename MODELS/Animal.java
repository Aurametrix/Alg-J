class Animal {

    public int legCount;
    public boolean hasFeathers;

    /**
     * Constructor
     */
    public Animal(int legCount, boolean hasFeathers) {
        this.legCount = legCount;
        this.hasFeathers = hasFeathers;
    }

    /**
     * Eat some food
     */
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
