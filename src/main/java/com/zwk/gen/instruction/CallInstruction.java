package com.zwk.gen.instruction;

import com.zwk.gen.object.Bead;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:21
 */

public class CallInstruction implements Instruction {
    public int funcNameIndex;
    public int paramCount;

    @Override
    public int execute(InstructionContext context) {
        String varName = context.unit.env.varNames[funcNameIndex];
        List<Bead> params = context.popStack(paramCount);
        List<Bead> list = context.popStack(1);
        Bead bead = list.get(0);
        Bead ret = bead.invoke(varName, params);
        context.addStack(ret);
        return 1;
    }
}
