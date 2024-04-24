package net.sourceforge.pmd.lang.soar.ast;/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

import net.sourceforge.pmd.lang.ast.AstInfo;
import net.sourceforge.pmd.lang.ast.Parser.ParserTask;
import net.sourceforge.pmd.lang.ast.RootNode;
import net.sourceforge.pmd.lang.soar.ast.SoarParser.SoarTopLevel;
import org.antlr.v4.runtime.ParserRuleContext;

// package private base class
abstract class SoarRootNode extends SoarInnerNode implements RootNode {

    private AstInfo<SoarTopLevel> astInfo;

    SoarRootNode(ParserRuleContext parent, int invokingStateNumber) {
        super(parent, invokingStateNumber);
    }

    @Override
    public AstInfo<SoarTopLevel> getAstInfo() {
        return astInfo;
    }

    SoarTopLevel makeAstInfo(ParserTask task) {
        SoarTopLevel me = (SoarTopLevel) this;
        this.astInfo = new AstInfo<>(task, me);
        return me;
    }

}
