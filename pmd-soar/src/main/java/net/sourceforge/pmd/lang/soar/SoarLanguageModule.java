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
    private static final String ID = "swift";

    /**
     * Create a new instance of Soar Language Module.
     */
    public SoarLanguageModule() {
        super(LanguageMetadata.withId(ID).name("Soar")
                              .extensions("soar")
                              .addVersion("4.2")
                              .addVersion("5.0")
                              .addVersion("5.1")
                              .addVersion("5.2")
                              .addVersion("5.3")
                              .addVersion("5.4")
                              .addVersion("5.5")
                              .addVersion("5.6")
                              .addVersion("5.7")
                              .addVersion("5.8")
                              .addDefaultVersion("5.9"),
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
