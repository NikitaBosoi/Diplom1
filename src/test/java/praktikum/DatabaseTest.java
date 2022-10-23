package praktikum;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DatabaseTest extends TestCase {

    Database database = new Database();
    List<Bun> buns = database.availableBuns();
    List<Ingredient> ingredients = database.availableIngredients();

    @Test
    public void testAvailableBuns() {
        Assert.assertEquals(3, buns.size());
    }

    @Test
    public void testAvailableIngredients() {
        Assert.assertEquals(6, ingredients.size());
    }
}
