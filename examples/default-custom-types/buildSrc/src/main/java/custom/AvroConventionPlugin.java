package custom;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import com.bakdata.gradle.avro.AvroPlugin;
import com.bakdata.gradle.avro.AvroExtension;

public class AvroConventionPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getPluginManager().apply(AvroPlugin.class);
        AvroExtension avroExtension = project.getExtensions().findByType(AvroExtension.class);
        avroExtension.logicalTypeFactory("timezone", TimeZoneLogicalTypeFactory.class);
        avroExtension.customConversion(TimeZoneConversion.class);
    }
}
