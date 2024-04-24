/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar;

import net.sourceforge.pmd.lang.AbstractPmdLanguageVersionHandler;
import net.sourceforge.pmd.lang.ast.Parser;
import net.sourceforge.pmd.lang.soar.ast.PmdSoarParser;

public class SoarHandler extends AbstractPmdLanguageVersionHandler {

    @Override
    public Parser getParser() {
        return new PmdSoarParser();
    }
}
