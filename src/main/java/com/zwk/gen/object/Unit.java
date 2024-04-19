package com.zwk.gen.object;

import com.zwk.gen.Env;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/17 15:34
 */

public class Unit extends FunctionValue implements Bead {
    public Env env = new Env();

    public Unit() {
        unit = this;
        paramCount = 0;
    }

    @Override
    public Bead dispatch(String name, List<Bead> params) {
        switch (name) {
            case "getProp":
                Bead bead = params.get(0);
                return env.getLocalProp(bead.toString());
        }
        return super.dispatch(name, params);
    }

    @Override
    public Bead call(List<Bead> params) {
        return super.call(params);
    }
}
