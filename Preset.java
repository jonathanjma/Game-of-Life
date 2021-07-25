import java.util.ArrayList;

public class Preset {

    private static int x, y, rotateCode;
    private static ArrayList<int[]> cells;

    // 0 deg = 0, 90 deg = 1, 180 deg = 2, 270 deg = 3
    public static ArrayList<int[]> gosperGliderGun(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY;
        Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0,0);
        addCell(0,1);
        addCell(1,0);
        addCell(0,-1);

        addCell(8,0);
        addCell(1,0);
        addCell(0,1);
        addCell(-2,0);
        addCell(0,1);
        addCell(1,0);

        addCell(7,0);
        addCell(1,0);
        addCell(1,1);
        addCell(-2,0);
        addCell(0,1);

        addCell(6,-4);
        addCell(0,-1);
        addCell(1,1);
        addCell(1,-1);
        addCell(0,-1);
        addCell(-1,0);

        addCell(1,12);
        addCell(0,1);
        addCell(1,1);
        addCell(0,-2);
        addCell(1,0);

        addCell(8,-11);
        addCell(0,-1);
        addCell(1,0);
        addCell(0,1);

        addCell(0,6);
        addCell(0,1);
        addCell(0,1);
        addCell(1,-2);
        addCell(1,1);
        return cells;
    }

    @SuppressWarnings("SuspiciousNameCombination")
    private static void addCell(int deltaX, int deltaY) {
        if (rotateCode == 0) {
            y += deltaY;
            x += deltaX;
        } else if (rotateCode == 1) {
            y -= deltaX;
            x += deltaY;
        } else if (rotateCode == 2) {
            y -= deltaY;
            x -= deltaX;
        } else if (rotateCode == 3) {
            y += deltaX;
            x -= deltaY;
        } else {throw new IllegalArgumentException("rotate code invalid");}
        cells.add(new int[]{y, x});
    }
}
