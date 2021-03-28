package exercise2;

sealed abstract class Bird implements Animal permits /* Canary, */ Parrot, Chicken {

    @Override
    public String sayMyName() {
        return "I'm a Bird.";
    }

    abstract boolean isFood();
}

//record Canary(String name) extends Bird {
//
//    boolean isFood() {
//        return false;
//    }
//
//}

final class Parrot extends Bird {
    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public boolean isCute() {
        return true;
    }

    @Override
    boolean isFood() {
        return false;
    }
}


non-sealed class Chicken extends Bird {
    @Override
    public int numberOfLegs() {
        return 2;
    }

    @Override
    public boolean isCute() {
        return false;
    }

    @Override
    boolean isFood() {
        return true;
    }
}
