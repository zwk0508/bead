package com.zwk.gen.instruction;

import com.zwk.gen.object.Bead;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:20
 */

public class StoreInstruction implements Instruction {
    int tableIndex;

    @Override
    public int execute(InstructionContext context) {
        List<Bead> list = context.popStack(1);
        context.setVariableTable(list.get(0), tableIndex);
        return 1;
    }
}
