
package com.sample.angular.spa.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.drew.lang.annotations.NotNull;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;

import javax.inject.Inject;

@Model(adaptables = SlingHttpServletRequest.class, adapters = {ComponentExporter.class}, resourceType = CardPanelModel.RESOURCE_TYPE)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CardPanelModel implements ComponentExporter {

    protected static final String RESOURCE_TYPE = "sampleangularspa/components/card-panel";

    @Inject
    @Default(values = "Chart of the Week")
    private String title;
    @Inject
    @Default(values = "European Gas Futures Jump as Gazprom Halts Supplies")
    private String subtitle;
    @Inject
    @Default(values = "European gas prices were on the rise again after Russia’s most recent move to exploit the region’s reliance on its energy. Russian company Gazprom, which has a monopoly on pipeline gas in Russia, released a statement that gas supplies to Poland and Bulgaria were suspended because it had not received payment in rubles. Since the Ukraine invasion began, Russia has transitioned to accepting payments in rubles rather than US dollars or euros as a response to sanctions from Western nations. European wholesale gas futures jumped 20% on the news before paring gains to trade 8% higher at €107 (US$113) per megawatt hour. Prices settled nearly 40% higher on a year-to-date basis with the price increase tallying close to 500% year over year. European leaders fired back, stating that they were being “blackmailed” by Russia and accusing it of “gas imperialism.” Although Russia supplies nearly 50% of gas to the countries that were cut off, local officials said the current supply was stable and alternative delivery options were being explored.")
    private String description = "description";
    @Inject
    @Default(values = "/content/dam/wknd/em-outlook-q222-moe-tcm1125-588699.png")
    private String fileReference;

    @ScriptVariable
    private ValueMap properties;

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

    public String getFileReference() {
        return fileReference;
    }

    @NotNull
    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }

}
