import org.openehealth.ipf.modules.cda.CDAR2Renderer;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import java.io.FileInputStream;

public class App {

    public static void main(String[] args) throws Throwable {
        FileInputStream file = new FileInputStream("/Users/Admin/Desktop/minzdrav/SampleCDADocumentRuMedSertOfBirth.xml");
        //unmarshalling
        ClinicalDocument cda = CDAUtil.load(file);

        //marshalling
        CDAR2Renderer renderer = new CDAR2Renderer();
        System.out.println(renderer.render(cda));
    }

}
