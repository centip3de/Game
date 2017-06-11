package com.foo.game;

import com.foo.game.interfaces.ILevel;

import java.util.ArrayList;

public class World
{
   private int currentLevel;
   private ArrayList<ILevel> levels;

   public World()
   {
       levels = new ArrayList<ILevel>();
   }

   public void addLevel(ILevel level)
   {
       levels.add(level);
   }

   public void addLevel(ILevel level, int index)
   {
        levels.add(index, level);
   }

   public void start()
   {
       levels.get(currentLevel).create();
   }

   public void nextLevel()
   {
       levels.get(currentLevel).destroy();
       currentLevel++;
       start();
   }

   public ILevel getCurrentLevel()
   {
       return levels.get(currentLevel);
   }

   public void destroy()
   {
       for(ILevel level : levels)
       {
           level.destroy();
       }
   }

   public void update()
   {
       getCurrentLevel().update();
   }
}
