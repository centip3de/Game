package com.foo.game;

import com.badlogic.gdx.ApplicationAdapter;

public class Game extends ApplicationAdapter
{
	@Override
	public void create ()
    {
        Renderer.create();
	}

	@Override
	public void render ()
    {
        Renderer.render();
	}
	
	@Override
	public void dispose ()
    {
        Renderer.dispose();
	}
}
