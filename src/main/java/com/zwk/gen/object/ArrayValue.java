package com.zwk.gen.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 15:28
 */

public class ArrayValue implements Bead {
    public List<Bead> values = new ArrayList<>();
    private static final List<String> supportMethodNames = Arrays.asList("add", "addAll", "length","contains");

    public ArrayValue(List<Bead> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return values.toString();
    }

    @Override
    public Bead plus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case ARRAY:
                ArrayList<Bead> beads = new ArrayList<>();
                beads.addAll(values);
                beads.addAll(((ArrayValue) right).values);
                return new ArrayValue(beads);
        }
        return Bead.super.plus(right);
    }

    @Override
    public Bead minus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case ARRAY:
                ArrayList<Bead> beads = new ArrayList<>();
                beads.addAll(values);
                beads.removeAll(((ArrayValue) right).values);
                return new ArrayValue(beads);
        }
        return Bead.super.minus(right);
    }

    @Override
    public Bead putAt(Bead location, Bead value) {
        Kind kind = location.kind();
        if (kind != Kind.INTEGER) {
            throw new RuntimeException("array index must be `Integer`");
        }
        int index = ((IntValue) location).value;

        Bead bead = values.set(index, value);
        if (bead != null) {
            return bead;
        }
        return None.NONE;
    }

    @Override
    public Bead getAt(Bead location) {
        Kind kind = location.kind();
        if (kind != Kind.INTEGER) {
            throw new RuntimeException("Array index must be `Integer`");
        }
        int index = ((IntValue) location).value;
        Bead bead = values.get(index);
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
            case "add":
                if (!emptyParams) {
                    values.add(params.get(0));
                }
                return None.NONE;
            case "addAll":
                if (!emptyParams) {
                    values.addAll(params);
                }
                return None.NONE;
            case "length":
                return new IntValue(values.size());
        }
        return Bead.super.invoke(name, params);
    }

    @Override
    public boolean toBoolean() {
        return !values.isEmpty();
    }
}
