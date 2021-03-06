/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package development.downright.cucumberbeans.antlr.integration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import development.downright.cucumberbeans.antlr.GherkinTokenEnum;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
/**
 * Creates the Hierarchy of GherkinTokens accounting for their category and id.
 * @author Downright-Development
 */
public class GherkinLanguageHierarchy extends LanguageHierarchy<GherkinTokenId>{
    
    private static List<GherkinTokenId> tokens = new ArrayList<GherkinTokenId>();
    private static Map<Integer, GherkinTokenId> idToToken = new HashMap<Integer, GherkinTokenId>();

    static {
        GherkinTokenEnum[] tokenTypes = GherkinTokenEnum.values();
        for (GherkinTokenEnum tokenType : tokenTypes) {
            tokens.add(new GherkinTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (GherkinTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized GherkinTokenId getToken(int id) {
        return idToToken.get(id);
    }

    protected synchronized Collection<GherkinTokenId> createTokenIds() {
        return tokens;
    }

    protected synchronized Lexer<GherkinTokenId> createLexer(LexerRestartInfo<GherkinTokenId> info) {
        return new IntegrationGherkinLexer(info);
    }

    protected String mimeType() {
        return "text/x-gherkin";
    }
    
}
