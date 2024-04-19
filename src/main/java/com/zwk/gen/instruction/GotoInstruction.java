package com.zwk.gen.instruction;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:26
 */

public class GotoInstruction implements Instruction{
    int offset;
    @Override
    public int execute(InstructionContext context) {
        return offset;
    }
}
