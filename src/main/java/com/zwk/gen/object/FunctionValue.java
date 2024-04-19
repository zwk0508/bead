package com.zwk.gen.object;

import com.zwk.gen.instruction.Instruction;
import com.zwk.gen.instruction.InstructionContext;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 16:39
 */

public class FunctionValue implements Bead {
    public Unit unit;
    public int paramCount;
    public int stackSize;
    public int variableTableSize;
    public Instruction[] instructions;


    public FunctionValue() {

    }

    @Override
    public Kind kind() {
        return Kind.FUNCTION;
    }

    @Override
    public Bead call(List<Bead> params) {
        Bead[] stack = new Bead[stackSize];
        Bead[] variableTable = new Bead[variableTableSize];
        InstructionContext context = new InstructionContext();
        context.unit = unit;
        context.stack = stack;
        context.variableTable = variableTable;
        int length = instructions.length;
        for (int i = 0; i < paramCount; i++) {
            if (i >= params.size()) {
                variableTable[i] = None.NONE;
            } else {
                variableTable[i] = params.get(i);
            }
        }
        for (int i = 0; i < length; ) {
            Instruction instruction = instructions[i];
            int execute = instruction.execute(context);
            i += execute;
        }
        Bead ret = context.ret;
        if (ret == null) {
            return None.NONE;
        }
        return ret;

    }

    @Override
    public boolean toBoolean() {
        return true;
    }
}
