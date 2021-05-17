package lexer.lexerstate;

import lexer.Lexer;
import terminal.Terminal;
import token.ReservedToken;
import token.Token;
import token.valuedtoken.IntToken;

import java.util.HashMap;
import java.util.Map;

public class LexerStateBuilder {
    public LexerState[] state = new LexerState[56];

    private void configureState27() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();

        state[27].setTransitionMap(map);
        state[27].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ADD);
            return token;
        });
    }

    private void configureState37() {
        state[37].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.LEFT_CURLY);
            return token;
        });
    }
    private void configureState38() {
        state[38].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.RIGHT_CURLY);
            return token;
        });
    }
    private void configureState39() {
        state[39].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LEFT_PARA);
            return token;
        });
    }
    private void configureState40() {
        state[40].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.RIGHT_PARA);
            return token;
        });
    }
    private void configureState41() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();

        state[41].setTransitionMap(map);
        state[41].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.ASSIGN);
            return token;
        });
    }

    private void configureState42() {
        state[42].setTokenBuilder((string) -> {
            Token token = new ReservedToken(Terminal.EQUALS);
            return token;
        });
    } 
    private void configureState43() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();
        
        state[43].setTransitionMap(map);
        state[43].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LESSER);
            return token;
        });
    }
    private void configureState44() {
        
        state[44].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.LESSER_EQ);
            return token;
        });
    }
    private void configureState45() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();
        
        state[45].setTransitionMap(map);
        state[45].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.GREATER);
            return token;
        });
    }
    private void configureState46() {
        state[46].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.GREATER_EQ);
            return token;
        });
    }
    private void configureState47() {
        state[47].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.MULTIPLY);
            return token;
        });
    }
    private void configureState48() {
        state[48].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.DIVIDE);
            return token;
        });
    }
    private void configureState49() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();
        
        state[49].setTransitionMap(map);
        state[49].setTokenBuilder((string)-> {
        });
    }
    private void configureState50() {
        state[50].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.AND);
            return token;
        });
    }
    private void configureState51() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();
        
        state[51].setTransitionMap(map);
        state[51].setTokenBuilder((string)-> {
        });
    }
    private void configureState52() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();
        
        state[52].setTransitionMap(map);
        state[52].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.OR);
            return token;
        });
    }
    private void configureState53() {
        Map<Character, LexerState> map = new HashMap<Character, LexerState>();
        
        state[53].setTransitionMap(map);
        state[53].setTokenBuilder((string)-> {
        });
    }
    private void configureState54() {
        state[54].setTokenBuilder((string)-> {
            Token token = new ReservedToken(Terminal.NOT_EQ);
            return token;
        });
    }
}
