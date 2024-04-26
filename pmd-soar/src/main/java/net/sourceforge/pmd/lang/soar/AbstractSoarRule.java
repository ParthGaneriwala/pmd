/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar;

import net.sourceforge.pmd.lang.rule.AbstractVisitorRule;
import net.sourceforge.pmd.lang.soar.ast.SoarVisitor;
import net.sourceforge.pmd.reporting.RuleContext;

public abstract class AbstractSoarRule extends AbstractVisitorRule {

    protected AbstractSoarRule() {
        // inheritance constructor
    }

    @Override
    public abstract SoarVisitor<RuleContext, ?> buildVisitor();
}
