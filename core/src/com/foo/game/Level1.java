package com.foo.game;

import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;
import com.foo.game.interfaces.ILevel;

import java.util.ArrayList;

public class Level1 implements ILevel
{
    private Player player;
    private ArrayList<Entity> entities;

    public void create()
    {
        // Set up entities
        player = new Player("Player", new Tuple<Float, Float>(64f, 64f), new Texture("Player.png"));

        // Set up level entities list
        entities = new ArrayList<Entity>();
        entities.add(player);
    }

    public void destroy()
    {
       //TODO: Do things.
    }

    public ArrayList<Entity> getEntities()
    {
        return entities;
    }
}
