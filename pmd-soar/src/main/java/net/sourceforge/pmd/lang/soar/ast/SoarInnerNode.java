/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar.ast;

import org.antlr.v4.runtime.ParserRuleContext;

import net.sourceforge.pmd.lang.ast.AstVisitor;
import net.sourceforge.pmd.lang.ast.impl.antlr4.BaseAntlrInnerNode;

// package private base class
abstract class SoarInnerNode
    extends BaseAntlrInnerNode<SoarNode> implements SoarNode {

    SoarInnerNode() {
        super();
    }

    SoarInnerNode(ParserRuleContext parent, int invokingStateNumber) {
        super(parent, invokingStateNumber);
    }

    @Override
    public <P, R> R acceptVisitor(AstVisitor<? super P, ? extends R> visitor, P data) {
        if (visitor instanceof SoarVisitor) {
            // some of the generated antlr nodes have no accept method...
            return ((SoarVisitor<? super P, ? extends R>) visitor).visitSoarNode(this, data);
        }
        return visitor.visitNode(this, data);
    }


    @Override // override to make visible in package
    protected PmdAsAntlrInnerNode<SoarNode> asAntlrNode() {
        return super.asAntlrNode();
    }

    @Override
    public String getXPathNodeName() {
        return SoarParser.DICO.getXPathNameOfRule(getRuleIndex());
    }
}
