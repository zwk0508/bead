package com.zwk.gen.object;

import java.util.Objects;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 16:09
 */

public class BooleanValue implements Bead {
    public boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public Bead copy() {
        return new BooleanValue(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooleanValue that = (BooleanValue) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean toBoolean() {
        return value;
    }
}
