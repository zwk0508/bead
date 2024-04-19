package com.zwk.gen.instruction;

import com.zwk.gen.object.Bead;
import com.zwk.gen.object.Unit;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:17
 */

public class LoadInstruction implements Instruction{
   public int tableIndex;
    @Override
    public int execute(InstructionContext context) {
        Bead bead = context.getVariableTable(tableIndex);
        context.addStack(bead);
        return 1;
    }
}
