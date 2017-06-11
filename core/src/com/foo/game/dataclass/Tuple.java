package com.foo.game.dataclass;

public class Tuple<T, R>
{
    private final T x;
    private final R y;

    public Tuple(T x, R y)
    {
        this.x = x;
        this.y = y;
    }
    public T getX()
    {
        return x;
    }

    public R getY()
    {
        return y;
    }
}
