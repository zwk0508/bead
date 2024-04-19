package com.zwk.gen.instruction;

import com.zwk.gen.Env;
import com.zwk.gen.object.Unit;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:14
 */

public class SetVariable implements Instruction {

    int varNameIndex;

    @Override
    public int execute(InstructionContext context) {
        Env env = context.unit.env;
        String var = env.varNames[varNameIndex];
        env.setLocalProp(var, context.popStack(1).get(0));
        return 1;
    }
}
