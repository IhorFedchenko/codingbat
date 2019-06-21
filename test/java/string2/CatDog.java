package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CatDog {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void cat_dog_v01() {
        assertTrue(solution.catDog("catdog"));
    }

    @Test
    public void cat_dog_v02() {
        assertFalse(solution.catDog("catcat"));
    }

    @Test
    public void cat_dog_v03() {
        assertTrue(solution.catDog("1cat1cadodog"));
    }

    @Test
    public void cat_dog_v04() {
        assertFalse(solution.catDog("catxxdogxxxdog"));
    }

    @Test
    public void cat_dog_v05() {
        assertTrue(solution.catDog("catxdogxdogxcat"));
    }

    @Test
    public void cat_dog_v06() {
        assertFalse(solution.catDog("catxdogxdogxca"));
    }

    @Test
    public void cat_dog_v07() {
        assertFalse(solution.catDog("dogdogcat"));
    }

    @Test
    public void cat_dog_v08() {
        assertTrue(solution.catDog("dogogcat"));
    }

    @Test
    public void cat_dog_v09() {
        assertFalse(solution.catDog("dog"));
    }

    @Test
    public void cat_dog_v10() {
        assertFalse(solution.catDog("cat"));
    }

    @Test
    public void cat_dog_v11() {
        assertTrue(solution.catDog("ca"));
    }

    @Test
    public void cat_dog_v12() {
        assertTrue(solution.catDog("c"));
    }

    @Test
    public void cat_dog_v13() {
        assertTrue(solution.catDog(""));
    }
}
