package array1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FrontPiece {

    @Test
    public void front_piece_v01() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(solution.frontPiece(new int[]{1, 2, 3})));
    }

    @Test
    public void front_piece_v02() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(solution.frontPiece(new int[]{1, 2})));
    }

    @Test
    public void front_piece_v03() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(solution.frontPiece(new int[]{1})));
    }

    @Test
    public void front_piece_v04() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(solution.frontPiece(new int[]{})));
    }

    @Test
    public void front_piece_v05() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{6, 5}), Arrays.toString(solution.frontPiece(new int[]{6, 5, 0})));
    }

    @Test
    public void front_piece_v06() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{6, 5}), Arrays.toString(solution.frontPiece(new int[]{6, 5})));
    }

    @Test
    public void front_piece_v07() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{3, 1}), Arrays.toString(solution.frontPiece(new int[]{3, 1})));
    }

    @Test
    public void front_piece_v08() {
        Solution solution = new Solution();
        assertEquals(Arrays.toString(new int[]{6}), Arrays.toString(solution.frontPiece(new int[]{6})));
    }


}
