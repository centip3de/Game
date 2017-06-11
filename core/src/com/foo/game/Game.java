package com.foo.game;

import com.badlogic.gdx.ApplicationAdapter;

public class Game extends ApplicationAdapter
{
    World world;
	@Override
	public void create ()
    {
        // Handle world setup
        world = new World();
        world.addLevel(new Level1());
        world.start();

        // Handle renderer creation
        Renderer.create(world);
	}

	@Override
	public void render ()
    {
        // Update loop
        world.update();

        // Render loop
        Renderer.render();
	}
	
	@Override
	public void dispose ()
    {
        Renderer.dispose();
	}
}
