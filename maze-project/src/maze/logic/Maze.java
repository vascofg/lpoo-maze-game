package maze.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class defines a maze that have a map and its objects
 */
public class Maze implements Serializable {
    // the dimension of the maze: default is 10

    public int mazeDim = 10;
    // the maze array of chars: default is this
    public char[][] mazeMap = {
        {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
        {'X', 'H', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
        {'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X', ' ', 'X'},
        {'X', 'D', 'X', 'X', ' ', 'X', ' ', 'X', ' ', 'X'},
        {'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X', ' ', 'X'},
        {'X', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', 'S'},
        {'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X', ' ', 'X'},
        {'X', ' ', 'X', 'X', ' ', 'X', ' ', 'X', ' ', 'X'},
        {'X', 'E', 'X', 'X', ' ', ' ', ' ', ' ', ' ', 'X'},
        {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};
    // the list of dragons
    public ArrayList<DragonObject> dragons = new ArrayList<DragonObject>(Arrays.asList(new DragonObject('D', 1, 3)));
    // an hero
    public heroObject hero = new heroObject('H', 1, 1);
    // an exit
    public GameObject exit = new GameObject('S', 9, 5);
    // a sword
    public GameObject sword = new GameObject('E', 1, 8);
    public char moveChars[] = {'W', 'A', 'S', 'D'};
    // The number of dragons
    public int nDragons = 1;
    // The option about the dragon type
    public int dragonOption;
    public boolean dragonsCanSleep = false;
    public boolean dragonsCanMove = false;

    // call every dragon to move
    public void moveDragons() {
        for (int i = 0; i < dragons.size(); i++) {
            dragons.get(i).move();
        }
    }

    public void setHero(heroObject h) {
        hero = h;
    }

    public void setExit(GameObject e) {
        exit = e;
    }

    public void setSword(GameObject s) {
        sword = s;
    }

    public void setDragons(ArrayList<DragonObject> d) {
        dragons = d;
    }

    public void setMazeMap(char[][] mazeM) {
        mazeMap = mazeM;
    }

    public void setDim(int dim) {
        mazeDim = dim;
    }
}
