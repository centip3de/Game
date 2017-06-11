package com.foo.game;

import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;

public class Ground extends Entity
{
    public Ground()
    {
        super();
    }
    public Ground(String name, float startingX, float startingY)
    {
        super(name, startingX, startingY);
    }

    public Ground(String name, Tuple<Float, Float> startingPos, Texture texture)
    {
        super(name, startingPos, texture);
    }
}
