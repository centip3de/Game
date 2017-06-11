package com.foo.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.foo.game.dataclass.Tuple;
import com.foo.game.interfaces.ILevel;

import java.util.ArrayList;

public class Renderer
{
    private static ArrayList<Entity> entities;
    private static SpriteBatch batch;
    private static World world;

    public static void create(World newWorld)
    {
        batch = new SpriteBatch();
        entities = new ArrayList<Entity>();
        world = newWorld;
    }

    public static void render()
    {
		Gdx.gl.glClearColor(0, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		ILevel currentLevel = world.getCurrentLevel();
		for(Entity entity : currentLevel.getEntities())
        {
            Tuple<Float, Float> pos = entity.getPosition();
            batch.draw(entity.getTexture(), pos.getX(), pos.getY());
        }
		batch.end();
    }

    public static void dispose()
    {
        batch.dispose();
        world.destroy();
    }

}
