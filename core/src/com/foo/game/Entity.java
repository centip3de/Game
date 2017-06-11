package com.foo.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.foo.game.dataclass.Tuple;

import java.util.Optional;
import java.util.UUID;

public class Entity
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

    public void destroy()
    {
        texture.get().dispose();
    }

    public void handleInput()
    {
        if(Gdx.input.isKeyPressed(Input.Keys.W))
        {
            Tuple<Float, Float> currentPos = position;
            setPosition(new Tuple<Float, Float>(currentPos.getX(), currentPos.getY() + 1));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S))
        {
            Tuple<Float, Float> currentPos = position;
            setPosition(new Tuple<Float, Float>(currentPos.getX(), currentPos.getY() - 1));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.A))
        {
            Tuple<Float, Float> currentPos = position;
            setPosition(new Tuple<Float, Float>(currentPos.getX() - 1, currentPos.getY()));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D))
        {
            Tuple<Float, Float> currentPos = position;
            setPosition(new Tuple<Float, Float>(currentPos.getX() + 1, currentPos.getY()));
        }
    }
}
