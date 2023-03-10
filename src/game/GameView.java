package game;

import city.cs.engine.UserView;
import city.cs.engine.World;

import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    Player player;

    public GameView(World w, int width, int height, Player player) {
        super(w, width, height);
        this.player = player;
    }

    private final Image background = new ImageIcon("level/forest_background.png").getImage();
    public GameView(GameWorld world, int width, int height,Player player) {

        super(world, width, height);
    }
    protected void paintForeground(Graphics2D fg){
        fg.setColor(Color.white);
        fg.drawString("Score: "+ Player.getScore(),800,50);

    }
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background,0,0,1080,600,this);
    }
}