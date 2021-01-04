package Sokoban;

public interface GameGrid {

    public void init(String string);

    public void run(GameOutput output);

    public Integer doCommand(String command);

    GridProvider getGridProvider();

    public String getTextFor(Object object);

    public String getImageFor(Object object);

    public Integer gridElementInput(int x, int y);

    public Integer directionInput(int dx, int dy);
}
