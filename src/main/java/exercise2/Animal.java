package exercise2;

sealed interface Animal permits Dog, Cat, Bird, Insect {

    String sayMyName();
    int numberOfLegs();
    boolean isCute();

}

final class Dog implements Animal {
    @Override
    public String sayMyName() {
        return "I'm a Dog.";
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }

    @Override
    public boolean isCute() {
        return true;
    }
}


record Cat(String name, int legs) implements Animal {
    @Override
    public String sayMyName() {
        return "I'm a " + name + ".";
    }

    @Override
    public int numberOfLegs() {
        return legs;
    }

    @Override
    public boolean isCute() {
        return true;
    }
}


