package lexer;

import lexer.lexerstate.LexerState;
import lexer.scanner.Reader;
import token.Token;

public class Lexer {
    private Token currentToken;
    private Reader scanner;
    private LexerState startState;

    public void parseNextToken() {
        String string = scanner.getCurrentString();
        LexerState currentState = startState;

        for(char c: string.toCharArray()) {
            currentState = currentState.move(c);
        }

        currentToken = currentState.getToken(string);
    }

    public Token getCurrentToken() {
        return currentToken;
    }

    public boolean isEmpty() {
        return scanner.hasNoString();
    }
}
