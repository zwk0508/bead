package com.zwk.gen;

import com.zwk.gen.object.Bead;
import com.zwk.gen.object.None;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/17 15:38
 */

public class Env {
    public Env parent;
    public String[] varNames;
    private Map<String, Bead> map = new HashMap<>();

    public Bead getProp(String name) {
        Bead localProp = getLocalProp(name);
        if (localProp != None.NONE) {
            return localProp;
        }
        if (parent != null) {
            return parent.getProp(name);
        }
        return None.NONE;
    }

    public Bead getLocalProp(String name) {
        Bead bead = map.get(name);
        if (bead != null) {
            return bead;
        }
        return None.NONE;
    }
    public void setLocalProp(String name,Bead value) {
        map.put(name, value);
    }
}
