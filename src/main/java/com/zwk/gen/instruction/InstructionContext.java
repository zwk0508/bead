package com.zwk.gen.instruction;

import com.zwk.gen.object.Bead;
import com.zwk.gen.object.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/18 20:07
 */

public class InstructionContext {
    public Bead[] stack;
    private int stackTop;
    public Bead[] variableTable;

    public Bead ret;

    public Unit unit;

    public void addStack(Bead v) {
        stack[stackTop++] = v;
    }

    public List<Bead> popStack(int n) {
        List<Bead> list = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            list.add(stack[stackTop - i]);
        }
        stackTop -= n;
        return list;
    }

    public void setVariableTable(Bead v, int index) {
        variableTable[index] = v;
    }

    public Bead getVariableTable(int index) {
        return variableTable[index];
    }

}
