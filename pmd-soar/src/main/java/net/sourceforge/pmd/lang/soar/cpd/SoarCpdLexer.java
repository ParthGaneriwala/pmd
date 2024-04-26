/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar.cpd;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

import net.sourceforge.pmd.cpd.impl.AntlrCpdLexer;
import net.sourceforge.pmd.lang.soar.ast.SoarLexer;


/**
 * SoarTokenizer
 *
 * <p>Note: This class has been called SoarTokenizer in PMD 6</p>.
 */
public class SoarCpdLexer extends AntlrCpdLexer {

    @Override
    protected Lexer getLexerForSource(final CharStream charStream) {
        return new SoarLexer(charStream);
    }
}
