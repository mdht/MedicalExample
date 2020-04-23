import org.apache.commons.lang3.builder.RecursiveToStringStyle;


@Deprecated
public class CustomStyle extends RecursiveToStringStyle {

    public CustomStyle() {
        super();
        super.setUseClassName(false);
        super.setUseIdentityHashCode(false);
        super.setContentStart("{");
        super.setContentEnd("}");
        super.setArrayStart("[");
        super.setArrayEnd("]");
        super.setFieldSeparator(",");
        super.setFieldNameValueSeparator(":");
        super.setNullText("null");
        super.setSummaryObjectStartText("\"<");
        super.setSummaryObjectEndText(">\"");
        super.setSizeStartText("\"<size=");
        super.setSizeEndText(">\"");
    }
}