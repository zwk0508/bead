package com.zwk.gen.object;

import java.util.Objects;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 15:01
 */

public class StringValue implements Bead {
    String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public Bead copy() {
        return new StringValue(value);
    }

    @Override
    public Kind kind() {
        return Kind.STRING;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public Bead plus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new StringValue(value + ((IntValue) right).value);
            case DOUBLE:
                return new StringValue(value + ((DoubleValue) right).value);
            case STRING:
                return new StringValue(value + ((StringValue) right).value);
        }
        return Bead.super.plus(right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringValue that = (StringValue) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean toBoolean() {
        return !value.isEmpty();
    }
}
