/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.soar;

import net.sourceforge.pmd.cpd.CpdLexer;
import net.sourceforge.pmd.lang.LanguagePropertyBundle;
import net.sourceforge.pmd.lang.LanguageRegistry;
import net.sourceforge.pmd.lang.impl.SimpleLanguageModuleBase;
import net.sourceforge.pmd.lang.soar.cpd.SoarCpdLexer;

/**
 * Language Module for Soar
 */
public class SoarLanguageModule extends SimpleLanguageModuleBase {
    private static final String ID = "soar";

    /**
     * Create a new instance of Soar Language Module.
     */
    public SoarLanguageModule() {
        super(LanguageMetadata.withId(ID).name("Soar")
                              .extensions("soar")
                              .addDefaultVersion("1.0"),
              new SoarHandler());
    }

    public static SoarLanguageModule getInstance() {
        return (SoarLanguageModule) LanguageRegistry.PMD.getLanguageById(ID);
    }

    @Override
    public CpdLexer createCpdLexer(LanguagePropertyBundle bundle) {
        return new SoarCpdLexer();
    }
}
