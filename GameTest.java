import game.BST;
import game.GameOfLife;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class GameTest {

    LinkedList<String> presets = new LinkedList<>(Arrays.asList("Gosper Glider Gun", "R-Pentomino (Explosive)", "Basic Life", "Gliders", "Acorn (Explosive)", "Spider (Glider)", "Copperhead (Glider)", "Tanner P46", "Simkin Glider Gun", "Snark", "Two Engine Cordership (Glider)"));

    @Test
    public void testInsertionSort() {
        LinkedList<String> out = new GameOfLife().insertionSort(presets);
        LinkedList<String> correct = new LinkedList<>(Arrays.asList("Acorn (Explosive)", "Basic Life", "Copperhead (Glider)", "Gliders", "Gosper Glider Gun", "R-Pentomino (Explosive)", "Simkin Glider Gun", "Snark", "Spider (Glider)", "Tanner P46", "Two Engine Cordership (Glider)"));
        Assert.assertArrayEquals(out.toArray(), correct.toArray());
    }

    @Test
    public void testSearch() {
        GameOfLife g = new GameOfLife();
        BST<String> bst = new BST<>();
        for (String str : presets) {
            bst.insert(str);
        }

        Assert.assertEquals(2, g.search(bst, "explosive").size());
        Assert.assertEquals(6, g.search(bst, "glider").size());
        Assert.assertEquals(9, g.search(bst, "l").size());
    }
}
