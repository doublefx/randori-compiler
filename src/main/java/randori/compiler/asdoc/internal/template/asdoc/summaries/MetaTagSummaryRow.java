/***
 * Copyright 2013 Teoti Graphix, LLC.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * 
 * @author Michael Schmalle <mschmalle@teotigraphix.com>
 */

package randori.compiler.asdoc.internal.template.asdoc.summaries;

import org.apache.flex.compiler.definitions.IDocumentableDefinition;
import org.apache.flex.compiler.definitions.IMetadataDefinition;

import randori.compiler.asdoc.config.IDocConfiguration;
import randori.compiler.asdoc.internal.template.asdoc.rows.SummaryRowTemplate;

public abstract class MetaTagSummaryRow extends SummaryRowTemplate
{
    public MetaTagSummaryRow(IDocConfiguration config)
    {
        super(config);
    }

    @Override
    protected void convertRow()
    {
        getRowConverter().addName(this, getDefinition());
        getRowConverter().addShortDescription(this,
                (IDocumentableDefinition) getDefinition());
        getRowConverter().addName(this, getDefinition());
        getRowConverter().addDefinedBy(this,
                (IMetadataDefinition) getDefinition());
    }

    @Override
    protected void renderRow()
    {
    }

}
