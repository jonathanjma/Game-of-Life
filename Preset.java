import java.util.ArrayList;

public class Preset {

    private static int x, y, rotateCode;
    private static ArrayList<int[]> cells;

    // 0 deg = 0, 90 deg = 1, 180 deg = 2, 270 deg = 3
    public static ArrayList<int[]> sample(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        return cells;
    }

    public static ArrayList<int[]> snark(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);

        addCell(-1, 3);
        addCell(0, -1);
        addCell(1, 0);
        addCell(1, 0);
        addCell(1, 0);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(0, -1);
        addCell(0, -1);
        addCell(0, -1);
        addCell(1, 0);
        addCell(1, 1);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 1);

        addCell(1, -1);
        addCell(0, -1);
        addCell(0, -1);
        addCell(1, 0);
        addCell(-1, -1);
        addCell(0, -1);
        addCell(-1, -1);
        addCell(-1, 0);
        addCell(-1, 0);
        addCell(0, -1);
        addCell(-1, 0);
        addCell(-1, 1);
        addCell(0, 1);

        addCell(-1, 8);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);

        addCell(-10, -2);
        addCell(1, 0);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(0, -1);

        addCell(0, 9);
        addCell(-1, 1);
        addCell(2, -1);
        addCell(0, 1);
        addCell(0, 1);

        addCell(8, -3);
        addCell(1, 0);
        addCell(-1, 1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(1, 0);
        addCell(0, 1);

        return cells;
    }

    public static ArrayList<int[]> simkinGliderGun(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);
        addCell(6, -1);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);
        addCell(-4, 2);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);

        addCell(16,6);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 0);
        addCell(1, 0);
        addCell(-1, -3);
        addCell(1, 0);
        addCell(2, 0);
        addCell(1, 0);
        addCell(1, 1);
        addCell(1, 1);
        addCell(-1, 1);
        addCell(-1, 1);
        addCell(5, -2);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);

        addCell(-12, 5);
        addCell(1, 0);
        addCell(-1, 1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(1, 0);
        addCell(0, 1);

        return cells;
    }

    public static ArrayList<int[]> tannerP46(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(1, 0);
        addCell(-1, 1);
        addCell(1, 1);
        addCell(0, 1);
        addCell(-1, 0);

        addCell(0, 6);
        addCell(0, 1);
        addCell(-1, -1);
        addCell(0, 1);
        addCell(-1, 1);
        addCell(1, 1);
        addCell(0, 1);
        addCell(1, -1);
        addCell(0, 1);

        addCell(0, 8);
        addCell(-1, 0);
        addCell(0, 1);
        addCell(1, 0);

        addCell(3, 0);
        addCell(0, 1);
        addCell(1, -1);
        addCell(1, 1);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 0);

        addCell(1, -20);
        addCell(1, 0);
        addCell(-1, 1);
        addCell(1, 1);
        addCell(0, 1);
        addCell(-1, 0);

        addCell(1, 2);
        addCell(0, 1);
        addCell(-1, -1);
        addCell(-1, 1);
        addCell(1, 1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(1, 0);
        addCell(0, 1);

        return cells;
    }

    public static ArrayList<int[]> copperhead(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(1, 0);
        addCell(3, 0);
        addCell(1, 0);
        addCell(-3, 1);
        addCell(1, 0);
        addCell(0, 1);
        addCell(-1, 0);
        addCell(-1, 1);
        addCell(3, 0);

        addCell(-5, 0);
        addCell(0, 1);
        addCell(0, 2);
        addCell(1, 1);
        addCell(1, 0);
        addCell(0, 1);
        addCell(1, 0);

        addCell(0, 2);
        addCell(0, 1);
        addCell(1, 0);
        addCell(0, -1);

        addCell(0, -2);
        addCell(1, 0);
        addCell(0, -1);
        addCell(1, 0);
        addCell(1, -1);
        addCell(0, -2);
        addCell(0, -1);

        return cells;
    }

    public static ArrayList<int[]> spider(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(1, 0);
        addCell(1, 0);
        addCell(-2, 1);

        addCell(1, 2);
        addCell(0, 1);
        addCell(1, 0);
        addCell(0, -1);
        addCell(2, 1);
        addCell(1, 0);
        addCell(0, 1);

        addCell(-2, -6);
        addCell(1, 0);
        addCell(0, 1);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 0);
        addCell(1, -1);
        addCell(0, -1);
        addCell(0, -1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(0, -1);
        addCell(1, -1);
        addCell(1, 1);
        addCell(1, 0);

        addCell(1, 2);
        addCell(0, 1);
        addCell(0, 1);

        return cells;
    }

    public static ArrayList<int[]> acorn(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(1, 0);
        addCell(0, -2);
        addCell(2, 1);
        addCell(1, 1);
        addCell(1, 0);
        addCell(1, 0);

        return cells;
    }

    public static ArrayList<int[]> gliders(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(-1, 0);
        addCell(-1, 0);
        addCell(0, 1);
        addCell(1, 1);

        addCell(0, 15);
        addCell(-3, 0);
        addCell(-1, 1);
        addCell(0, 1);
        addCell(0, 1);
        addCell(1, 0);
        addCell(1, 0);
        addCell(1, 0);
        addCell(1, -1);

        return cells;
    }

    public static ArrayList<int[]> basicLife(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(1, 0);
        addCell(0, 1);
        addCell(-1, 0);

        addCell(5, 7);
        addCell(0, 1);
        addCell(1, -1);
        addCell(1, 0);

        addCell(5, 7);
        addCell(0, 1);
        addCell(0, 1);
        addCell(0, 1);

        addCell(5, 7);
        addCell(1, 1);
        addCell(1, 0);
        addCell(1, 0);

        addCell(5, 10);
        addCell(-1, 1);
        addCell(1, 0);
        addCell(1, 0);

        addCell(5, 10);
        addCell(1, 0);
        addCell(1, -1);
        addCell(-1, 2);

        addCell(20, -50);
        addCell(1, 0);
        addCell(1, 1);
        addCell(-1, 1);
        addCell(-1, -1);

        addCell(0, 10);
        addCell(1, 0);
        addCell(1, 1);
        addCell(-1, 1);
        addCell(-1, 1);
        addCell(-1, -1);
        addCell(0, -1);

        addCell(0, 10);
        addCell(1, 0);
        addCell(-1, 1);
        addCell(2, 0);
        addCell(0, 1);
        addCell(-1, 0);

        return cells;
    }

    public static ArrayList<int[]> rPentomino(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
        cells = new ArrayList<>();

        addCell(0, 0);
        addCell(-1, 0);
        addCell(0, 1);
        addCell(-1, 0);
        addCell(1, 1);
        return cells;
    }

    public static ArrayList<int[]> gosperGliderGun(int stX, int stY, int rotateCode) {
        Preset.x = stX; Preset.y = stY; Preset.rotateCode = rotateCode;
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
        } else if (rotateCode == 5) {
            y += deltaY;
            x -= deltaX;
        } else {
            throw new IllegalArgumentException("rotate code invalid");
        }
        cells.add(new int[]{y, x});
    }
}
