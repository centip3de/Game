package com.foo.game.interfaces;

import com.foo.game.Entity;

import java.util.ArrayList;

public interface ILevel
{
    void create();
    void destroy();
    ArrayList<Entity> getEntities();
}
