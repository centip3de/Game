package com.foo.game;

import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;
import com.foo.game.interfaces.ILevel;

import java.util.ArrayList;

public class Level1 implements ILevel
{
    private ArrayList<Entity> entities;
    private ArrayList<Ground> ground;
    private Player player;

    public void create()
    {
        ground = new ArrayList<Ground>();
        entities = new ArrayList<Entity>();

        // Set up entities
        player = new Player("Player", new Tuple<Float, Float>(64f, 64f), new Texture("Player.png"));
        for(int i = 0; i < 20; i++)
        {
            ground.add(new Ground("Ground", new Tuple<Float, Float>(i*32f, 0f), new Texture("Ground.png")));
        }

        // Set up level entities list
        entities.add(player);
        entities.addAll(ground);
    }

    public void destroy()
    {
        for(Entity entity : entities)
        {
            entity.destroy();
        }
    }

    public ArrayList<Entity> getEntities()
    {
        return entities;
    }

    public void update()
    {
        for(Entity entity : entities)
        {
            entity.handleInput();
        }
    }
}
