package exercise2;

sealed interface Bird extends Animal permits Canary, Parrot, Chicken {

    boolean isFood();

}

record Canary(String name) implements Bird {
    @Override
    public boolean isFood() {
        return false;
    }

    @Override
    public String sayMyName() {
        return null;
    }

    @Override
    public int numberOfLegs() {
        return 0;
    }

    @Override
    public boolean isCute() {
        return false;
    }
}

final class Parrot implements Bird {
    @Override
    public String sayMyName() {
        return null;
    }

    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    public boolean isFood() {
        return false;
    }
}


non-sealed class Chicken implements Bird {
    @Override
    public String sayMyName() {
        return null;
    }

    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public boolean isCute() {
        return false;
    }

    @Override
    public boolean isFood() {
        return true;
    }
}
