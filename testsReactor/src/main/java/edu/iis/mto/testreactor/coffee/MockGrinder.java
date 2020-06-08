package edu.iis.mto.testreactor.coffee;

public class MockGrinder implements Grinder {

    @Override public boolean canGrindFor(CoffeeSize size) {
        return true;
    }

    @Override public double grind(CoffeeSize size) {
        switch (size)
        {
            case STANDARD: return 10d;
            case SMALL: return 5d;
            case DOUBLE: return 20d;
            default: return 0;
        }
    }
}
