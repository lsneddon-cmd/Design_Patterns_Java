import Structural.Decorator.DressingDecorator;
import Structural.Decorator.MeatDecorator;
import Structural.Decorator.Sandwich;
import Structural.Decorator.SimpleSandwich;
import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void decorateSandwich() {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        Assert.assertEquals(sandwich.make(), "Bread + pastrami + mustard");
    }
}
