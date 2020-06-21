package game;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapUtils {

    public GameMap createMap(File mapFile) {
        GameMap map = new GameMap();
        List<String> lines = new ArrayList<>();
        try {
            lines = FileUtils.readLines(mapFile, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int row = Integer.parseInt(lines.get(0));
        int col = Integer.parseInt(lines.get(1));

        map.setRow(row);
        map.setCol(col);
        Room[][] rooms = new Room[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rooms[i][j] = new Room(getDoor(lines.get(j+2).charAt(j)));
            }
        }
        map.setRooms(rooms);
        return map;
    }

    boolean[] getDoor(char hex) {
        boolean[] connected = {false, false, false, false};
        switch (hex) {
            case '1': // 0001
                connected[3] = true;
                break;
            case '2': // 0010
                connected[2] = true;
                break;
            case '3': // 0011
                connected[2] = true;
                connected[3] = true;
                break;
            case '4': // 0100
                connected[1] = true;
                break;
            case '5': // 0101
                connected[1] = true;
                connected[3] = true;
                break;
            case '6': // 0110
                connected[1] = true;
                connected[2] = true;
                break;
            case '7': // 0111
                connected[1] = true;
                connected[2] = true;
                connected[3] = true;
                break;
            case '8': // 1000
                connected[0] = true;
                break;
            case '9': // 1001
                connected[0] = true;
                connected[3] = true;
                break;
            case 'A': // 1010
                connected[0] = true;
                connected[2] = true;
                break;
            case 'B': // 1011
                connected[0] = true;
                connected[2] = true;
                connected[3] = true;
                break;
            case 'C': // 1100
                connected[0] = true;
                connected[1] = true;
                break;
            case 'D': // 1101
                connected[0] = true;
                connected[1] = true;
                connected[3] = true;
                break;
            case 'E': // 1110
                connected[0] = true;
                connected[1] = true;
                connected[2] = true;
                break;
            case 'F':
                connected[0] = true;
                connected[1] = true;
                connected[2] = true;
                connected[3] = true;
                break;
        }
        return connected;
    }

    public static void main(String[] args) {
        File path = new File("/home/max/ooc-2019-t3/zork/src/main/resources/map1.txt");
//        boolean[] door = {false, false, false, false};
//        door = new MapUtils().getDoor('9');
//        System.out.println(Arrays.toString(door));
//        MapUtils mapUtils = new MapUtils();
//        GameMap forest = mapUtils.createMap(path);
//        System.out.println(Arrays.toString(forest.getRooms()[0][0].getConnected()));
    }
}
