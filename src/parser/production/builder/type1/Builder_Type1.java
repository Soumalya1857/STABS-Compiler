package parser.production.builder.type1;

import nonterminal.NonTerminal;
import parser.parserstack.ParserStack;
import parser.parserstack.stacksymbol.nonterminal.NonTerminalStackSymbol;
import parser.parserstack.stacksymbol.terminal.TerminalStackSymbol;
import parser.production.type.type1.Production_Type1;
import terminal.Terminal;

import java.util.HashMap;
import java.util.Map;

public class Builder_Type1 {
    ParserStack stack;
    Map<Integer, Production_Type1> map = new HashMap<Integer, Production_Type1>();

    public Builder_Type1(ParserStack stack) {
        this.stack = stack;
    }

    private void setProduction1() {
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNCTIONS);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.EOF);

            parserStack.push(stackSymbol1, stackSymbol2);
        });

        map.put(1, production);
    }

    private void setProduction2() {
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNCTION);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.FUNCTIONS);

            parserStack.push(stackSymbol1, stackSymbol2);
        });

        map.put(2, production);
    }

    private void setProduction3(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });

        map.put(3, production);
    }

    private void setProduction5(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.PARAMETER);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.OTHER_PARAMS);
            parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(5, production);
    }

    private void setProduction6(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(6, production);
    }
    private void setProduction7(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.COMMA);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.PARAMETER);
            NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.OTHER_PARAMS);
            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(7, production);
    }

    private void setProduction8(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {

        });
        map.put(8, production);
    }

    private void setProduction10(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE_PART1);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.TYPE_PART2);

            parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(10, production);
    }
    private void setProduction11(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.INT);

            parserStack.push(stackSymbol1);
        });
        map.put(11, production);
    }
    private void setProduction12(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.FLOAT);

            parserStack.push(stackSymbol1);
        });
        map.put(12, production);
    }
    private void setProduction13(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.LEFT_SQ);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.INT_VAL);
            TerminalStackSymbol stackSymbol3 = new TerminalStackSymbol(Terminal.RIGHT_SQ);
            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(13, production);
    }
    private void setProduction14(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {

        });
        map.put(14, production);
    }

    private void setProduction16(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.STATEMENT);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.SEMICOLON);
            NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.STATEMENTS);

            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(16, production);
    }

    private void setProduction17(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.COMPOUND_STMT);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.STATEMENTS);

            parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(17, production);
    }
    private void setProduction18(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {

        });
        map.put(18, production);
    }
    private void setProduction19(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.DECLARATION);

            parserStack.push(stackSymbol1);
        });
        map.put(19, production);
    }
    private void setProduction20(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.ASSIGNMENT);

            parserStack.push(stackSymbol1);
        });
        map.put(20, production);
    }
    private void setProduction21(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.INC_DEC_STMT);

            parserStack.push(stackSymbol1);
        });
        map.put(21, production);
    }
    private void setProduction22(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.IO_STMT);

            parserStack.push(stackSymbol1);
        });
        map.put(22, production);
    }
    private void setProduction23(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.RETURN_STMT);

            parserStack.push(stackSymbol1);
        });
        map.put(23, production);
    }
    private void setProduction24(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNCTION_STMT);

            parserStack.push(stackSymbol1);
        });
        map.put(24, production);
    }
    private void setProduction25(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.IF_STMT);

            parserStack.push(stackSymbol1);
        });
        map.put(25, production);
    }
    private void setProduction26(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FOR_STMT);

            parserStack.push(stackSymbol1);
        });
        map.put(26, production);
    }
    private void setProduction27(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.BLOCK);

            parserStack.push(stackSymbol1);
        });
        map.put(27, production);
    }
    private void setProduction28(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.TYPE);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.IDENTIFIERS);
            parserStack.push(stackSymbol1);
        });
        map.put(28, production);
    }
    private void setProduction31(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(31, production);
    }
    private void setProduction32(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.VARIABLE);
            TerminalStackSymbol stackSymbol2 = new TerminalStackSymbol(Terminal.ASSIGN);
            NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.VALUE);
            parserStack.push(stackSymbol1);
        });
        map.put(32, production);
    }
    private void setProduction34(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
            TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.LEFT_SQ);
            NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.NUM_EXPR);
            TerminalStackSymbol stackSymbol3 = new TerminalStackSymbol(Terminal.RIGHT_SQ);

            parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(34, production);
    }
    private void setProduction35(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(35, production);
    }
    private void setProduction36(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.ARRAY);
        parserStack.push(stackSymbol1);
        });
        map.put(36, production);
    }
    private void setProduction37(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.NUM_EXPR);
        parserStack.push(stackSymbol1);
        });
        map.put(37, production);
    }
    private void setProduction38(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.LEFT_CURLY);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.ARRAY_ELEMS);
        TerminalStackSymbol stackSymbol3 = new TerminalStackSymbol(Terminal.RIGHT_CURLY);
        parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(38, production);
    }
    private void setProduction39(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.NUM_EXPR);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.OTHER_ELEMS);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(39, production);
    }
    private void setProduction40(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.COMMA);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.NUM_EXPR);
        NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.OTHER_ELEMS);
        parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(40, production);
    }
    private void setProduction41(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(41, production);
    }
    private void setProduction42(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.INC_DEC_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.VARIABLE);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(42, production);
    }
    private void setProduction43(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.INC_DEC_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.VARIABLE);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(43, production);
    }
    private void setProduction44(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.IO_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.NUM_EXPR);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(44, production);
    }
    private void setProduction45(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.IO_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.VARIABLE);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(45, production);
    }
    private void setProduction46(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.IF_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.BOOL_EXPR);
        NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.BLOCK);
        NonTerminalStackSymbol stackSymbol4 = new NonTerminalStackSymbol(NonTerminal.ELSE_STMT);

        parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3, stackSymbol4);
        });
        map.put(46, production);
    }
    private void setProduction47(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.ELSE_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.BLOCK);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(47, production);
    }
    private void setProduction48(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(48, production);
    }
    private void setProduction49(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FOR_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.BOOL_EXPR);
        NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.BLOCK);
        parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(49, production);
    }
    private void setProduction50(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.RETURN_STMT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.VARIABLE);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(50, production);
    }
    private void setProduction51(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.FUNC_EXPR);
        parserStack.push(stackSymbol1);
        });
        map.put(51, production);
    }
    private void setProduction52(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.LEFT_PARA);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.ARGUMENTS);
        TerminalStackSymbol stackSymbol3 = new TerminalStackSymbol(Terminal.RIGHT_PARA);
        NonTerminalStackSymbol stackSymbol4 = new NonTerminalStackSymbol(NonTerminal.IDENTIFIERS);
        parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3, stackSymbol4);
        });
        map.put(52, production);
    }
    private void setProduction53(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.ARGUMENT);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.OTHER_ARGS);
        parserStack.push(stackSymbol1, stackSymbol2);
        });
        map.put(53, production);
    }
    private void setProduction54(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(54, production);
    }
    private void setProduction55(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        TerminalStackSymbol stackSymbol1 = new TerminalStackSymbol(Terminal.COMMA);
        NonTerminalStackSymbol stackSymbol2 = new NonTerminalStackSymbol(NonTerminal.ARGUMENT);
        NonTerminalStackSymbol stackSymbol3 = new NonTerminalStackSymbol(NonTerminal.OTHER_ARGS);
        parserStack.push(stackSymbol1, stackSymbol2, stackSymbol3);
        });
        map.put(55, production);
    }
    private void setProduction56(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        });
        map.put(56, production);
    }
    private void setProduction57(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.NUM_EXPR);
        parserStack.push(stackSymbol1);
        });
        map.put(57, production);
    }
    private void setProduction58(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.MUL_OP);
        parserStack.push(stackSymbol1);
        });
        map.put(58, production);
    }
    private void setProduction59(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.MUL_OP);
        parserStack.push(stackSymbol1);
        });
        map.put(59, production);
    }
private void setProduction60(){
        Production_Type1 production = new Production_Type1(stack, (parserStack) -> {
        NonTerminalStackSymbol stackSymbol1 = new NonTerminalStackSymbol(NonTerminal.ADD_OP);
        parserStack.push(stackSymbol1);
        });
        map.put(60, production);
    }

}
