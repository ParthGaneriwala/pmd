/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar.ast;

import org.antlr.v4.runtime.Token;
import org.checkerframework.checker.nullness.qual.NonNull;

import net.sourceforge.pmd.lang.ast.impl.antlr4.BaseAntlrTerminalNode;

public final class SoarTerminalNode extends BaseAntlrTerminalNode<SoarNode> implements SoarNode {

    SoarTerminalNode(Token token) {
        super(token);
    }

    @Override
    public @NonNull String getText() {
        String constImage = SoarParser.DICO.getConstantImageOfToken(getFirstAntlrToken());
        return constImage == null ? getFirstAntlrToken().getText()
                                  : constImage;
    }

    @Override
    public String getXPathNodeName() {
        return SoarParser.DICO.getXPathNameOfToken(getFirstAntlrToken().getType());
    }

}
