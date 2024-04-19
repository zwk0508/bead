package com.zwk.gen.object;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 14:57
 */

public class IntValue implements Bead {
    int value;
    private static final List<String> supportMethodNames = Arrays.asList("toBinary", "toOct", "toHex");

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public Bead copy() {
        return new IntValue(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public Kind kind() {
        return Kind.INTEGER;
    }

    @Override
    public Bead plus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value + ((IntValue) right).value);
            case DOUBLE:
                return new DoubleValue(value + ((DoubleValue) right).value);
            case STRING:
                return new StringValue(value + ((StringValue) right).value);
        }
        return Bead.super.plus(right);
    }

    @Override
    public Bead minus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value - ((IntValue) right).value);
            case DOUBLE:
                return new DoubleValue(value - ((DoubleValue) right).value);
        }
        return Bead.super.minus(right);
    }

    @Override
    public Bead times(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value * ((IntValue) right).value);
            case DOUBLE:
                return new DoubleValue(value * ((DoubleValue) right).value);
        }
        return Bead.super.times(right);
    }

    @Override
    public Bead div(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value / ((IntValue) right).value);
            case DOUBLE:
                return new DoubleValue(value / ((DoubleValue) right).value);
        }
        return Bead.super.div(right);
    }

    @Override
    public Bead rem(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value % ((IntValue) right).value);
            case DOUBLE:
                return new DoubleValue(value % ((DoubleValue) right).value);
        }
        return Bead.super.rem(right);
    }

    @Override
    public Bead and(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value & ((IntValue) right).value);
        }
        return Bead.super.and(right);
    }

    @Override
    public Bead or(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value | ((IntValue) right).value);
        }
        return Bead.super.or(right);
    }

    @Override
    public Bead xor(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value ^ ((IntValue) right).value);
        }
        return Bead.super.xor(right);
    }

    @Override
    public Bead shl(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value << ((IntValue) right).value);
        }
        return Bead.super.shl(right);
    }

    @Override
    public Bead shr(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new IntValue(value >> ((IntValue) right).value);
        }
        return Bead.super.shr(right);
    }

    @Override
    public boolean supportMethod(String methodName) {
        return supportMethodNames.contains(methodName);
    }

    @Override
    public Bead dispatch(String name, List<Bead> params) {
        switch (name) {
            case "toBinary":
                return new StringValue(Integer.toBinaryString(value));
            case "toOct":
                return new StringValue(Integer.toOctalString(value));
            case "toHex":
                return new StringValue(Integer.toHexString(value));
        }
        return Bead.super.invoke(name, params);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntValue intValue = (IntValue) o;
        return value == intValue.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Bead gt(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new BooleanValue(value > ((IntValue) right).value);
            case DOUBLE:
                return new BooleanValue(value > ((DoubleValue) right).value);
        }
        return Bead.super.gt(right);
    }

    @Override
    public Bead ge(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new BooleanValue(value >= ((IntValue) right).value);
            case DOUBLE:
                return new BooleanValue(value >= ((DoubleValue) right).value);
        }
        return Bead.super.ge(right);
    }

    @Override
    public Bead lt(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new BooleanValue(value < ((IntValue) right).value);
            case DOUBLE:
                return new BooleanValue(value < ((DoubleValue) right).value);
        }
        return Bead.super.lt(right);
    }

    @Override
    public Bead le(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new BooleanValue(value <= ((IntValue) right).value);
            case DOUBLE:
                return new BooleanValue(value <= ((DoubleValue) right).value);
        }
        return Bead.super.le(right);
    }

    @Override
    public boolean toBoolean() {
        return value == 0;
    }
}
