import java.io.FileInputStream;

import org.eclipse.mdht.uml.cda.ClinicalDocument;
import org.eclipse.mdht.uml.cda.IdentityDoc;
import org.eclipse.mdht.uml.cda.Participant1;
import org.eclipse.mdht.uml.cda.util.CDAUtil;

 public class App {

    public static void main(String[] args) throws Throwable {
        FileInputStream file = new FileInputStream("src/test/resources/SampleCDADocumentRuMedSertOfBirth.xml");
        //unmarshalling
        ClinicalDocument cda = CDAUtil.load(file);

        //marshalling
    	for (Participant1 p1 : cda.getParticipants()) {
			System.out.println(p1.getAssociatedEntity().getIds().get(0).getRoot());

			p1.getAssociatedEntity().getIds().get(0).setRoot("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			for (IdentityDoc doc : p1.getAssociatedEntity().getIdentityDocs()) {
				System.out.println(doc.getSeries().getText());

				System.out.println(doc.getIssueDate().getValue());

				// System.out.println(doc.getIdentityCardTypeId().getCode());

				// System.out.println(doc.getIssueDate());

				// System.out.println(doc.getIssueOrgCode().getText());

				// System.out.println(doc.getIssueOrgName().getText());
				// System.out.println("get getSeries");
				// System.out.println(doc.getSeries().getText());
				// System.out.println("get getIssueOrgCode");
				// System.out.println(doc.getIssueOrgCode().getText());
				// doc.setSeries(DatatypesFactory.eINSTANCE.createST("hererere"));
				// System.out.println(doc.getSeries().getText());

			}

		}

		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		 

	 
//        CDAR2Renderer renderer = new CDAR2Renderer();
      CDAUtil.save(cda, System.out);
    }

}
