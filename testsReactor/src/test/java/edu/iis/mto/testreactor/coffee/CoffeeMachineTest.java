package edu.iis.mto.testreactor.coffee;

import static org.hamcrest.MatcherAssert.assertThat;

import edu.iis.mto.testreactor.coffee.milkprovider.MilkProvider;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class) public class CoffeeMachineTest {

    @Mock private Grinder grinder;
    @Mock private MilkProvider milkProvider;
    @Mock private CoffeeReceipes receipes;

    private CoffeeMachine coffeeMachine;

    @BeforeEach void init() {
        coffeeMachine = new CoffeeMachine(grinder, milkProvider, receipes);
    }

    @Test void StandardExpressoCoffeShouldntBeTheSameAsRandomlyGenerated() {

        CoffeeSize standard = CoffeeSize.STANDARD;
        CoffeType espresso = CoffeType.ESPRESSO;

        CoffeOrder coffeOrder = CoffeOrder.builder().withSize(standard).withType(espresso).build();

        Coffee result = coffeeMachine.make(coffeOrder);

        Coffee expected = new Coffee();
        expected.setMilkAmout(1);
        expected.setCoffeeWeigthGr(1d);
        expected.setWaterAmount(10);

        Assertions.assertNotEquals(result, expected);

    }


    @Test public void itCompiles() {
        assertThat(true, Matchers.equalTo(true));
    }
}
