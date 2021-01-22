# Gradle Jacoco merge example

Example project demonstrating merging Jacoco code coverage results
from multiple test tasks into a single Jacoco report.

For example, if the project has `test` and `integrationTest` tasks defined:

```
// Combine the coverage data from the "test" and "integrationTest" tasks into a single coverage report
// under the "jacocoTestReport" task
jacocoTestReport {
    dependsOn test, integrationTest
    executionData { tasks.withType(Test).findAll { it.jacoco.destinationFile.exists() }*.jacoco.destinationFile }
}
```

Credit to the very helpful folks who answered this StackOverflow question: https://stackoverflow.com/a/57330075
