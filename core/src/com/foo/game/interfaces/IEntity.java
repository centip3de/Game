package com.foo.game.interfaces;

import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;

public interface IEntity
{
    void destroy();
    void create();
    void interact();
    Tuple<Float, Float> getPosition();
    Texture getTexture();
}
