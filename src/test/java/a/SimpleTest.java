package a;

import com.zwk.gen.Env;
import com.zwk.gen.instruction.CallInstruction;
import com.zwk.gen.instruction.Instruction;
import com.zwk.gen.instruction.LoadInstruction;
import com.zwk.gen.instruction.ReturnInstruction;
import com.zwk.gen.object.*;

import java.util.Arrays;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 9:39
 */

public class SimpleTest {
    public static void main(String[] args) {

        Unit unit = new Unit();
        unit.env = new Env();
        unit.env.varNames = new String[]{"shl"};

        FunctionValue fv = new FunctionValue();
        fv.unit = unit;
        fv.paramCount = 2;
        fv.stackSize = 2;
        fv.variableTableSize = 2;
        LoadInstruction loadInstruction = new LoadInstruction();
        loadInstruction.tableIndex = 0;
        LoadInstruction loadInstruction1 = new LoadInstruction();
        loadInstruction1.tableIndex = 1;
        CallInstruction callInstruction = new CallInstruction();
        callInstruction.funcNameIndex = 0;
        callInstruction.paramCount = 1;
        fv.instructions = new Instruction[]{
                loadInstruction,
                loadInstruction1,
                callInstruction,
                new ReturnInstruction()
        };

        Bead call = fv.call(Arrays.asList(new IntValue(1), new IntValue(8)));
        System.out.println("call = " + call);
    }

}
