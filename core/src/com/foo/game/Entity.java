package com.foo.game;

import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;
import com.foo.game.interfaces.IEntity;

import java.util.Optional;
import java.util.UUID;

public class Entity implements IEntity
{
    protected Tuple<Float, Float> position;
    protected String name;
    protected Optional<Texture> texture;

    // Constructors
    public Entity()
    {
        this("Entity " + UUID.randomUUID().toString(), new Tuple(0f, 0f), null);
    }
    public Entity(String name)
    {
        this(name, new Tuple(0f, 0f), null);
    }
    public Entity(String name, float startingX, float startingY)
    {
        this(name, new Tuple(startingX, startingY), null);
    }
    public Entity(String name, Tuple<Float, Float> startingPos, Texture texture)
    {
        this.name = name;
        this.position = startingPos;
        this.texture = Optional.of(texture);
    }

    // Getters
    public String getName()
    {
        return name;
    }
    public Tuple<Float, Float> getPosition()
    {
       return position;
    }
    public Texture getTexture()
    {
        return texture.get();
    }

    // Setters
    public void setTexture(Texture texture)
    {
        this.texture = Optional.of(texture);
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPosition(Tuple<Float, Float> position)
    {
        this.position = position;
    }

    public void create()
    {

    }
    public void destroy() {}
    public void interact() {}
}
