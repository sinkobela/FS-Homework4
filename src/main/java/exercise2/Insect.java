package exercise2;

non-sealed interface Insect extends Animal {

    String color();
    boolean isAnnoying();
}


class Fly implements Insect {
    private final String name;
    private final int eyes;

    public Fly(String name, int eyes) {
        this.name = name;
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public int getEyes() {
        return eyes;
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public boolean isAnnoying() {
        return true;
    }

    @Override
    public String sayMyName() {
        return "I'm a " + getName();
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isCute() {
        return false;
    }
}


record Ladybug(String name, int legs) implements Insect {

    @Override
    public String sayMyName() {
        return "I'm a " + name();
    }

    @Override
    public int numberOfLegs() {
        return legs();
    }

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public String color() {
        return "RED and BLACK";
    }

    @Override
    public boolean isAnnoying() {
        return true;
    }
}
