package com.zwk.gen.instruction;

import com.zwk.gen.Env;
import com.zwk.gen.object.Bead;
import com.zwk.gen.object.Unit;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:01
 */

public class GetVariable implements Instruction{

    int varNameIndex;

    @Override
    public int execute(InstructionContext context) {
        Env env = context.unit.env;
        String var = env.varNames[varNameIndex];
        Bead prop = env.getProp(var);
        context.addStack(prop);
        return 1;
    }
}
