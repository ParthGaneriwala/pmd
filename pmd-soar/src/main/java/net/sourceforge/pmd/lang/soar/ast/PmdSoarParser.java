/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar.ast;

import net.sourceforge.pmd.lang.ast.impl.antlr4.AntlrBaseParser;
import net.sourceforge.pmd.lang.soar.ast.SoarParser.SoarTopLevel;
import org.antlr.v4.runtime.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adapter for the SoarParser.
 */
public final class PmdSoarParser extends AntlrBaseParser<SoarNode, SoarTopLevel> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PmdSoarParser.class);

    @Override
    protected SoarTopLevel parse(final Lexer lexer, ParserTask task) {
        SoarParser parser = new SoarParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                LOGGER.warn("Syntax error at {}:{}:{}: {}", task.getFileId().getOriginalPath(),
                        line, charPositionInLine, msg);
                // TODO: eventually we should throw a parse exception
                // throw new ParseException(msg).withLocation(FileLocation.caret(task.getFileId(), line, charPositionInLine));
            }
        });
        return parser.topLevel().makeAstInfo(task);
    }

    @Override
    protected Lexer getLexer(final CharStream source) {
        return new SoarLexer(source);
    }
}
