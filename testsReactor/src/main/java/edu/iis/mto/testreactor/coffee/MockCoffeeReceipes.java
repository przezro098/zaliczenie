package edu.iis.mto.testreactor.coffee;

import java.util.Optional;

public class MockCoffeeReceipes implements CoffeeReceipes {

    @Override public Optional<CoffeeReceipe> getReceipe(CoffeType type) {
        return null;
        //switch (type)
        //{
            //case ESPRESSO: return CoffeeReceipe.builder().withMilkAmount(0).withWaterAmounts(CoffeType.ESPRESSO)
        //}
    }
}
