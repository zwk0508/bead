package com.zwk.gen;

import com.zwk.gen.object.Unit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 14:41
 */

public class Context {
    public Env globalEnv;

    public Map<String, Unit> registry = new HashMap<>();

}
