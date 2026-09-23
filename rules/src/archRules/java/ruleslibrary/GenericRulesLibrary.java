package ruleslibrary;

import com.netflix.nebula.archrules.core.ArchRulesService;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.Priority;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

import java.util.Map;

public class GenericRulesLibrary implements ArchRulesService {
    private static final ArchRule MY_RULE = ArchRuleDefinition.priority(Priority.MEDIUM)
            .noClasses()
            .should()
            .accessClassesThat().resideInAPackage("org.joda.time..")
            .allowEmptyShould(true);
    @Override
    public Map<String, ArchRule> getRules() {
        return Map.of("no joda", MY_RULE);
    }
}
