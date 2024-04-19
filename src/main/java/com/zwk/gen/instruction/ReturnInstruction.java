package com.zwk.gen.instruction;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:27
 */

public class ReturnInstruction implements Instruction{
    @Override
    public int execute(InstructionContext context) {
        context.ret = context.popStack(1).get(0);
        return 1;
    }
}
