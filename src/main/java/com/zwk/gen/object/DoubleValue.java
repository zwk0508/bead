package com.zwk.gen.object;

import java.util.Objects;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 15:01
 */

public class DoubleValue implements Bead {
   public double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    @Override
    public Bead copy() {
        return new DoubleValue(value);
    }

    @Override
    public Kind kind() {
        return Kind.DOUBLE;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public Bead plus(Bead right) {
        Kind kind = right.kind();
        switch (kind) {
            case INTEGER:
                return new DoubleValue(value + ((IntValue) right).value);
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
                return new DoubleValue(value - ((IntValue) right).value);
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
                return new DoubleValue(value * ((IntValue) right).value);
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
                return new DoubleValue(value / ((IntValue) right).value);
            case DOUBLE:
                return new DoubleValue(value / ((DoubleValue) right).value);
        }
        return Bead.super.div(right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleValue that = (DoubleValue) o;
        return Double.compare(value, that.value) == 0;
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
