package array1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FrontPiece {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void front_piece_v01() {
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(solution.frontPiece(new int[]{1, 2, 3})));
    }

    @Test
    public void front_piece_v02() {
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(solution.frontPiece(new int[]{1, 2})));
    }

    @Test
    public void front_piece_v03() {
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(solution.frontPiece(new int[]{1})));
    }

    @Test
    public void front_piece_v04() {
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(solution.frontPiece(new int[]{})));
    }

    @Test
    public void front_piece_v05() {
        assertEquals(Arrays.toString(new int[]{6, 5}), Arrays.toString(solution.frontPiece(new int[]{6, 5, 0})));
    }

    @Test
    public void front_piece_v06() {
        assertEquals(Arrays.toString(new int[]{6, 5}), Arrays.toString(solution.frontPiece(new int[]{6, 5})));
    }

    @Test
    public void front_piece_v07() {
        assertEquals(Arrays.toString(new int[]{3, 1}), Arrays.toString(solution.frontPiece(new int[]{3, 1})));
    }

    @Test
    public void front_piece_v08() {
        assertEquals(Arrays.toString(new int[]{6}), Arrays.toString(solution.frontPiece(new int[]{6})));
    }


}
