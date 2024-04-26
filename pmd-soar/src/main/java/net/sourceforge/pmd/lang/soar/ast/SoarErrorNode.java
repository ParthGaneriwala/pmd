/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar.ast;

import org.antlr.v4.runtime.Token;

import net.sourceforge.pmd.lang.ast.impl.antlr4.BaseAntlrErrorNode;

public final class SoarErrorNode extends BaseAntlrErrorNode<SoarNode> implements SoarNode {

    SoarErrorNode(Token token) {
        super(token);
    }

}
