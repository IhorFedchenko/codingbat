package string2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CatDog {

    @Test
    public void cat_dog_v01(){
        Solution solution = new Solution();
        assertTrue(solution.catDog("catdog"));
    }

    @Test
    public void cat_dog_v02(){
        Solution solution = new Solution();
        assertFalse(solution.catDog("catcat"));
    }

    @Test
    public void cat_dog_v03(){
        Solution solution = new Solution();
        assertTrue(solution.catDog("1cat1cadodog"));
    }

    @Test
    public void cat_dog_v04(){
        Solution solution = new Solution();
        assertFalse(solution.catDog("catxxdogxxxdog"));
    }

    @Test
    public void cat_dog_v05(){
        Solution solution = new Solution();
        assertTrue(solution.catDog("catxdogxdogxcat"));
    }

    @Test
    public void cat_dog_v06(){
        Solution solution = new Solution();
        assertFalse(solution.catDog("catxdogxdogxca"));
    }

    @Test
    public void cat_dog_v07(){
        Solution solution = new Solution();
        assertFalse(solution.catDog("dogdogcat"));
    }

    @Test
    public void cat_dog_v08(){
        Solution solution = new Solution();
        assertTrue(solution.catDog("dogogcat"));
    }

    @Test
    public void cat_dog_v09(){
        Solution solution = new Solution();
        assertFalse(solution.catDog("dog"));
    }

    @Test
    public void cat_dog_v10(){
        Solution solution = new Solution();
        assertFalse(solution.catDog("cat"));
    }

    @Test
    public void cat_dog_v11(){
        Solution solution = new Solution();
        assertTrue(solution.catDog("ca"));
    }

    @Test
    public void cat_dog_v12(){
        Solution solution = new Solution();
        assertTrue(solution.catDog("c"));
    }

    @Test
    public void cat_dog_v13(){
        Solution solution = new Solution();
        assertTrue(solution.catDog(""));
    }
}
