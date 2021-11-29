package io.github.halo.snowFlake;

/**
 * @author yzm
 * @date 2021/11/27 22:44
 */
public class SnowFlakeUtil {

    private static SnowFlake snowFlake;

    static {
        snowFlake = new SnowFlake(1, 1);
    }

    public static long nextId() {
        return snowFlake.nextId();
    }
}
