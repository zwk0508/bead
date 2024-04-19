package com.zwk.gen.instruction;

import com.zwk.gen.object.Bead;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:24
 */

public class If0Instruction implements Instruction{
    int offset;
    @Override
    public int execute(InstructionContext context) {
        List<Bead> list = context.popStack(0);
        Bead bead = list.get(0);
        if (bead.toBoolean()) {
            return 1;
        }
        return offset;
    }
}
