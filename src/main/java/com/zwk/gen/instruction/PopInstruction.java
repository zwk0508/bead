package com.zwk.gen.instruction;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:26
 */

public class PopInstruction implements Instruction{
    @Override
    public int execute(InstructionContext context) {
        context.popStack(1);
        return 1;
    }
}
