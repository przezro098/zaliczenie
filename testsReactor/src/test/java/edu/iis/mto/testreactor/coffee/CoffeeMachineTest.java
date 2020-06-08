package edu.iis.mto.testreactor.coffee;

import static org.hamcrest.Matchers.equalTo;


import edu.iis.mto.testreactor.coffee.milkprovider.MilkProvider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CoffeeMachineTest {

    @Mock
    private Grinder grinder;
    @Mock
    private MilkProvider milkProvider;
    @Mock
    private CoffeeReceipes receipes;

    private CoffeeMachine coffeeMachine;

    @BeforeEach
    void init() {
        coffeeMachine = new CoffeeMachine(grinder, milkProvider, receipes);
    }

    

    @Test
    public void itCompiles() {
        assertThat(true, equalTo(true));
    }

}
