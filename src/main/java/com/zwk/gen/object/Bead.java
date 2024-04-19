package com.zwk.gen.object;

import java.util.List;
import java.util.Locale;

public interface Bead {
    default Bead plus(Bead right) {
        throw thrUnsupportedOperationException("`+`", right);
    }

    default UnsupportedOperationException thrUnsupportedOperationException(String operator, Bead right) {
        String lowerCase = kind().name().toLowerCase(Locale.ROOT);
        return new UnsupportedOperationException("kind " + lowerCase + " do not support " + operator
                + " kind " + right.kind().name().toLowerCase(Locale.ROOT));
    }

    default UnsupportedOperationException thrUnsupportedOperationException(String operator) {
        String lowerCase = kind().name().toLowerCase(Locale.ROOT);
        return new UnsupportedOperationException("kind " + lowerCase + " do not support " + operator);
    }

    default Bead minus(Bead right) {
        throw thrUnsupportedOperationException("`-`", right);
    }

    default Bead times(Bead right) {
        throw thrUnsupportedOperationException("`*`", right);
    }

    default Bead div(Bead right) {
        throw thrUnsupportedOperationException("`/`", right);
    }

    default Bead rem(Bead right) {
        throw thrUnsupportedOperationException("`%`", right);
    }

    default Bead and(Bead right) {
        throw thrUnsupportedOperationException("`&`", right);
    }

    default Bead or(Bead right) {
        throw thrUnsupportedOperationException("`|`", right);
    }

    default Bead xor(Bead right) {
        throw thrUnsupportedOperationException("`|`", right);
    }

    default Bead shl(Bead right) {
        throw thrUnsupportedOperationException("`<<`", right);
    }

    default Bead shr(Bead right) {
        throw thrUnsupportedOperationException("`>>`", right);
    }

    default Bead putAt(Bead location, Bead value) {
        throw thrUnsupportedOperationException("`[?]`", value);
    }

    default Bead getAt(Bead location) {
        throw thrUnsupportedOperationException("`[?]`");
    }

    default Bead call(List<Bead> params) {
        throw thrUnsupportedOperationException(" call `(?)`");
    }

    default Bead eq(Bead right) {
        return new BooleanValue(this.equals(right));
    }

    default Bead ne(Bead right) {
        return new BooleanValue(!this.equals(right));
    }

    default Bead gt(Bead right) {
        throw thrUnsupportedOperationException("`>`", right);
    }

    default Bead ge(Bead right) {
        throw thrUnsupportedOperationException("`>=`", right);
    }

    default Bead lt(Bead right) {
        throw thrUnsupportedOperationException("`<`", right);
    }

    default Bead le(Bead right) {
        throw thrUnsupportedOperationException("`<=`", right);
    }


    default Bead copy() {
        return this;
    }

    default Kind kind() {
        return Kind.NONE;
    }

    default boolean supportMethod(String methodName) {
        return false;
    }

    default Bead invoke(String name, List<Bead> params) {
        switch (name) {
            case "plus":
                return plus(params.get(0));
            case "minus":
                return minus(params.get(0));
            case "times":
                return times(params.get(0));
            case "div":
                return div(params.get(0));
            case "rem":
                return rem(params.get(0));
            case "and":
                return and(params.get(0));
            case "or":
                return or(params.get(0));
            case "xor":
                return xor(params.get(0));
            case "shl":
                return shl(params.get(0));
            case "shr":
                return shr(params.get(0));
            case "putAt":
                return putAt(params.get(0), params.get(1));
            case "getAt":
                return getAt(params.get(0));
            case "call":
                return call(params);
            case "eq":
                return eq(params.get(0));
            case "ne":
                return ne(params.get(0));
            case "gt":
                return gt(params.get(0));
            case "ge":
                return ge(params.get(0));
            case "lt":
                return lt(params.get(0));
            case "le":
                return le(params.get(0));
        }
        if (supportMethod(name)) {
            return dispatch(name, params);
        }
        throw thrUnsupportedOperationException(" invoke method " + name);
    }

    default Bead dispatch(String name, List<Bead> params) {
        throw thrUnsupportedOperationException(" invoke method " + name);
    }

    default boolean toBoolean() {
        return false;
    }
}
