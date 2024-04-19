package com.zwk.gen.instruction;

import com.zwk.gen.object.Bead;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 16:52
 */

public interface Instruction {
    int execute(InstructionContext context);
}
