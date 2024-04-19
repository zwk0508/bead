package com.zwk.gen.object;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 14:50
 */

public class None implements Bead {
    public static final None NONE = new None();

    @Override
    public String toString() {
        return "none";
    }
}
