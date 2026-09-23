package mylib.archrules;

import com.netflix.nebula.archrules.core.ArchRulesService;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.Priority;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

import java.util.Map;

public class MyLibArchRules implements ArchRulesService {
    private static final ArchRule USE_INSTRUMENTED_THREAD_POOLS = ArchRuleDefinition.priority(Priority.HIGH)
            .noClasses()
            .that().resideOutsideOfPackage("mylib..")
            .should()
            .callMethod("java.util.concurrent.Executors", "newFixedThreadPool", "int")
            .because("MyLibrary should be used to create thread pools so that we have metrics")
            .allowEmptyShould(true);

    @Override
    public Map<String, ArchRule> getRules() {
        return Map.of("use instrumented thread pools", USE_INSTRUMENTED_THREAD_POOLS);
    }
}
