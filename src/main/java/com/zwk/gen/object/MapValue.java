package com.zwk.gen.object;

import java.util.*;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 15:57
 */

public class MapValue implements Bead {
    Map<String, Bead> values = new HashMap<>();

    private static final List<String> supportMethodNames = Arrays.asList("size", "containsKey");


    @Override
    public Kind kind() {
        return Kind.MAP;
    }

    @Override
    public String toString() {
        return values.toString();
    }

    @Override
    public Bead plus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case MAP:
                values.putAll(((MapValue) right).values);
                return None.NONE;
        }
        return Bead.super.plus(right);
    }

    @Override
    public Bead getAt(Bead location) {
        Kind kind = location.kind();
        if (kind != Kind.STRING) {
            throw new RuntimeException("Map index must be `String`");
        }

        Bead bead = values.get(((StringValue) location).value);
        if (bead != null) {
            return bead;
        }

        return None.NONE;
    }

    @Override
    public Bead putAt(Bead location, Bead value) {
        Kind kind = location.kind();
        if (kind != Kind.STRING) {
            throw new RuntimeException("Map index must be `String`");
        }

        String key = ((StringValue) location).value;
        Bead bead = values.put(key, value);
        if (bead != null) {
            return bead;
        }
        return None.NONE;
    }

    @Override
    public boolean supportMethod(String methodName) {
        return supportMethodNames.contains(methodName);
    }

    @Override
    public Bead dispatch(String name, List<Bead> params) {
        boolean emptyParams = params == null || params.isEmpty();
        switch (name) {
            case "size":
                return new IntValue(values.size());
            case "containsKey":
                if (emptyParams || params.get(0).kind() != Kind.STRING) {
                    throw new RuntimeException("Map `containsKey` method need `String` parameter");
                }
                Bead param = params.get(0);
                return new BooleanValue(values.containsKey(((StringValue) param).value));
        }
        return Bead.super.invoke(name, params);
    }

    @Override
    public boolean toBoolean() {
        return !values.isEmpty();
    }
}
