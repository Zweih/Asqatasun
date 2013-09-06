/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2013  Open-S Company
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */

package org.opens.tanaguru.rules.rgaa22;

import org.opens.tanaguru.ruleimplementation.AbstractPageRuleWithSelectorAndCheckerImplementation;
import org.opens.tanaguru.rules.elementchecker.pertinence.TextPertinenceChecker;
import org.opens.tanaguru.rules.elementselector.ElementSelector;
import org.opens.tanaguru.rules.elementselector.SimpleElementSelector;
import static org.opens.tanaguru.rules.keystore.HtmlElementStore.TITLE_ELEMENT;
import static org.opens.tanaguru.rules.keystore.RemarkMessageStore.NOT_PERTINENT_TITLE_MSG;

/**
 * Implementation of the rule 9.7 of the referential RGAA 2.2.
 * <br/>
 * For more details about the implementation, refer to <a href="http://www.tanaguru.org/en/content/rgaa22-rule-9-7">the rule 9.7 design page.</a>
 * @see <a href="http://rgaa.net/Pertinence-du-titre-de-la-page.html"> 9.7 rule specification
 *
 * @author jkowalczyk
 */
public class Rgaa22Rule09071 extends AbstractPageRuleWithSelectorAndCheckerImplementation {

    /* The selector */
    private static final ElementSelector ELEMENT_SELECTOR = 
            new SimpleElementSelector(TITLE_ELEMENT);
    
    /* Title blacklisted nomenclature */
    private static final String TITLE_BLACKLIST_NOM = "UnexplicitPageTitle";
    
    /**
     * Default constructor
     */
    public Rgaa22Rule09071 () {
        super(
                ELEMENT_SELECTOR,
                new TextPertinenceChecker(
                    true, 
                    null, 
                    TITLE_BLACKLIST_NOM, 
                    NOT_PERTINENT_TITLE_MSG, 
                    null
                )
            );
    }

}