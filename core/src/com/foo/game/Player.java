package com.foo.game;

import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;

public class Player extends Entity
{
    public Player()
    {
        super();
    }
    public Player(String name, float startingX, float startingY)
    {
        super(name, startingX, startingY);
    }

    public Player(String name, Tuple<Float, Float> startingPos, Texture texture)
    {
        super(name, startingPos, texture);
    }

    public void test()
    {
       System.out.println(this.name);
    }

}
