# Changelog

All notable changes to this project will be documented in this file.

## [2.0.0](https://github.com/bakdata/gradle-avro-plugin/tree/2.0.0) - 2026-03-17
### What's changed

* initial import by @davidmc24

* fix exception message when unsupported file extension is used by @davidmc24

* use logic from avro-tools SpecificCompilerTool by @davidmc24

* separate handling of different file types by @davidmc24

* support compiling schemas with dependencies by @davidmc24

* share code between tasks by @davidmc24

* put the tasks in a source generation group by @davidmc24

* tweak intellij project file generation by @davidmc24

* incude dot before file extension by @davidmc24

* support configuring different string types by @davidmc24

* add license by @davidmc24

* add readme, changes by @davidmc24

* fix link in readme by @davidmc24

* add support for publishing by @davidmc24

* remove unused method by @davidmc24

* update to 0.1.0 by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.2.0'. by @davidmc24

* updated changelog by @davidmc24

* fix null pointer exception when build directory doesn't exist by @davidmc24

* extract getMainSourceSet and getTestSourceSet methods by @davidmc24

* update changelog and version by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.1.2'. by @davidmc24

* fix dependencies by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.1.3'. by @davidmc24

* clean generated java files before re-generating them by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.1.4'. by @davidmc24

* Improve documentation by @davidmc24

* upgrade gradle to 1.12 by @davidmc24

* update dependencies (avro 1.7.6, spock 0.7) by @davidmc24

* Add support for qualified plugin ID by @davidmc24

* new version: 0.2.0 by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.2.1'. by @davidmc24

* add usage instructions for gradle 2.1+ by @davidmc24

* register generated source directories even if they don't already exist. (#1) by @davidmc24

* Add avro-base plugin, which exposes tasks and the extension without creating tasks, defaults, etc. by @davidmc24

* Document how to use avro-base by @davidmc24

* add travis support by @davidmc24

* add travis badge to readme by @davidmc24

* added  output encoding option (requires Avro 1.7.7) by @keeganwitt

* updated to Avro 1.7.7 by @keeganwitt

* Merge pull request #2 from keeganwitt/master by @davidmc24

* [Gradle Release Plugin] - pre tag commit:  '0.3.0'. by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.3.1'. by @davidmc24

* Fix encoding support (#5) by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.3.2'. by @davidmc24

* Fix changelog formatting by @davidmc24

* Defer determination of task output dirs (#6) by @davidmc24

* Update change log by @davidmc24

* update change log for 0.3.2 by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.3.3'. by @davidmc24

* no java is generated from avdl files

* Merge pull request #7 from viacoban/master by @davidmc24

* update changelog by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.3.4'. by @davidmc24

* Fix registration of generated source for compilation (#8) by @davidmc24

* avdl import not working for external dependencies

* Merge pull request #9 from viacoban/multi_project_fix by @davidmc24

* update change log for 0.3.4 by @davidmc24

* [Gradle Release Plugin] - new version commit:  '0.3.5'. by @davidmc24

* Adding fieldVisibility support. by @ejwood79

* Updating CHANGES.md to indicate addition of fieldVisibility. by @ejwood79

* Merge pull request #12 from underarmour/master by @davidmc24

* update, prep for release of 0.4.0 by @davidmc24

* Try migrating to travis' container-based infrastructure by @davidmc24

* Specify legacy maven coords for plugin by @davidmc24

* update documentation by @davidmc24

* improve vcs specification by @davidmc24

* Add support for schemas/protocols/IDL in subdirectories of `src/main/avro`, etc. (#11) by @davidmc24

* Add functional test coverage for enum handling by @davidmc24

* Expose original error messages from avro-compiler when compilation fails by @davidmc24

* update version: 0.5.0 by @davidmc24

* Add support for alternate Velocity template directory.

* Add support for alternate Velocity template directory.

* Merge remote-tracking branch 'refs/remotes/origin/master'

* Various cleanup of codebase by @davidmc24

* Merge branch 'feature/templateDirectory' by @davidmc24

* Additional test coverage for plugin configuration options by @davidmc24

* Add tests for invalid option value scenarios by @davidmc24

* Upgrade gradle wrapper, add checkstyle/codenarc, fix some style issues by @davidmc24

* Better document dependency support by @davidmc24

* Add support for the last remaining Avro compiler option (creation of Setters)

* Minor fixes to ryonday's createSetters feature. by @davidmc24

* Merge branch 'create-setters' by @davidmc24

* 0.6.0 by @davidmc24

* Re-format changelog for easier copy-paste by @davidmc24

* Update release instructions by @davidmc24

* Remove usage of Guava (#18) by @davidmc24

* Minor readme tweak by @davidmc24

* 0.6.1 by @davidmc24

* Remove usage of Apache Commons IO (#19) by @davidmc24

* Add ability to retry duplicate type definitions, with new configuration option "retryDuplicateTypes" (#13) by @davidmc24

* Don't ignore gradle wrapper jar by @davidmc24

* Simplify processing queues by @davidmc24

* Make duplicate retry behavior always-on; no configuration option to disable (#13) by @davidmc24

* Update readme by @davidmc24

* Remove test for removed retryDuplicateTypes configuration option by @davidmc24

* Support snapshots for development testing by @davidmc24

* Rename "encoding" option to "outputCharacterEncoding", allow using java objects for most settings, fix string createSetters arguments by @davidmc24

* Remove unused method by @davidmc24

* Automatically use encoding from `JavaCompile` task as "outputCharacterEncoding", if set by @davidmc24

* Change default outputCharacterEncoding to system default (#20) by @davidmc24

* Use travis build matrix to test java 7/8 build compatibility by @davidmc24

* 0.7.0 by @davidmc24

* 0.8.0-SNAPSHOT by @davidmc24

* Update changelog with missing issue link by @davidmc24

* Add support for Java 6 (#21) by @davidmc24

* 0.8.0 by @davidmc24

* 0.9.0-SNAPSHOT by @davidmc24

* Upgrade to Avro 1.8.1

* Merge pull request #24 from benmccann/1.8.1 by @davidmc24

* Minor cleanup after pull request #24. by @davidmc24

* Upgrade Gradle to 2.13, add version compatibility testing by @davidmc24

* Restrict test heap size to try to get the new larger test corpus to run in Travis CI. by @davidmc24

* Restrict Gradle memory usage in Travis CI by @davidmc24

* Attempt gradle parallel task execution on Travis CI. by @davidmc24

* Disable parallel execution in Travis CI; instead, restrict the number of versions tested. by @davidmc24

* 0.9.0 by @davidmc24

* 0.9.1-SNAPSHOT by @davidmc24

* fix changelog by @davidmc24

* Update Gradle build. by @davidmc24

* Add license plugin and license headers by @davidmc24

* Add contribution guidelines by @davidmc24

* Make license plugin only apply if greater than java 6 by @davidmc24

* Fix typo: change com.commercehub.gradle.plugin.avro to com.commercehub.gradle.plugin.avro-base

* Merge pull request #28 from erwa/fix-typo-readme by @davidmc24

* Add design docs by @davidmc24

* Build with Gradle 3.3, update version cross-compatibility testing by @davidmc24

* Don't try to test Gradle 3.x compatibility on Java 6 by @davidmc24

* Add code of conduct by @davidmc24

* Try to work around travis-ci failure by @davidmc24

* Revert "Try to work around travis-ci failure" by @davidmc24

* Upgrade gradle to version 4.1 by @davidmc24

* Raise permgen for oracle jdk7 by @davidmc24

* fix environment variables by @davidmc24

* Update description to note location of latest artifacts by @davidmc24

* 0.9.1 by @davidmc24

* 0.10.0-SNAPSHOT by @davidmc24

* Modernize for new baseline compatibility by @davidmc24

* Reduce access to utility methods not intended for re-use by @davidmc24

* Update license plugin by @davidmc24

* Remove explicit type arguments that are no longer needed in Java 7 by @davidmc24

* Tag output directory for better input/output handling by @davidmc24

* Enable all compiler linting by @davidmc24

* Fix java compiler warnings by @davidmc24

* Resolve deprecation warning caused by change in runtime configuration handling in Gradle 3.5 by @davidmc24

* Treat compiler warnings as errors by @davidmc24

* Update release process to use Bintray instead of Gradle Plugin Portal by @davidmc24

* Make MapUtils package-protected by @davidmc24

* Update release instructions to reflect process for configuring bintray publishing by @davidmc24

* 0.10.0 by @davidmc24

* 0.10.1 by @davidmc24

* Update readme to reflect published in jcenter by @davidmc24

* Start testing against java 9 by @davidmc24

* switch back to precise by @davidmc24

* try to work around java9 only being available for trusty by @davidmc24

* try trusty again by @davidmc24

* go back to not doing java9, building on precise by @davidmc24

* fix the specified jdks by @davidmc24

* Update the version of the publish-plugin to allow for actually publishing by @davidmc24

* Merge branch 'fix-0.9.1' by @davidmc24

* try to work around build bufferoverflow in openjdk7 by @davidmc24

* try to add support for openjdk8 and oraclejdk9 by @davidmc24

* centralize default GRADLE_OPTS again by @davidmc24

* build with gradle 4.2.1 by @davidmc24

* Document support for Java 9 by @davidmc24

* - Fixing functional tests on Windows

* Apply PR review

* Improving CHANGES.md on PR

* Merge pull request #35 from eshepelyuk/decimal_logical_type by @davidmc24

* 0.11.0 by @davidmc24

* 0.11.1-SNAPSHOT by @davidmc24

* Try to improve compatibility with kotlin-gradle-plugin (#36) by @davidmc24

* Fix style issues by @davidmc24

* 0.12.0 by @davidmc24

* 0.12.1-SNAPSHOT by @davidmc24

* Improve documentation (#37) by @davidmc24

* Correct compatibility notes in README (closes #39) by @davidmc24

* Upgrade CodeNarc to 1.0 to avoid a build-time Java 7 incompatibility by @davidmc24

* Add notes about how to use with plugin DSL (#40) by @davidmc24

* Try to fix travis build; java 9 was failing due to an image change by @davidmc24

* Update commits in travis build by @davidmc24

* Add warning to README about pre-cleaning behavior (#41) by @davidmc24

* Update formatting in README by @davidmc24

* Remove pre-cleaning behavior (#41) by @davidmc24

* 0.13.0 by @davidmc24

* 0.13.1-SNAPSHOT by @davidmc24

* Support for validation of default values in schema (#42)

* Failing test fix (#42)

* Add info in changes.md and make it clear that validation of defaults will be always 'on' in future versions. (#42)

* Merge pull request #43 from rafal-glowinski/schema_defaults_validation by @davidmc24

* Improvde task documentation in plugin build by @davidmc24

* Upgrade gradle to 4.5, update testing compatibility by @davidmc24

* 0.14.0 by @davidmc24

* 0.14.1-SNAPSHOT by @davidmc24

* Update Gradle to 4.6, update compatibility testing to include up to Gradle 4.6 and Java 10 by @davidmc24

* Comment on version compatibility by @davidmc24

* Try to add Java 10 and Java 11 support to Travis CI build; drops Java 7 support from Travis CI build by @davidmc24

* Update Travis CI config to reflect that Oracle JDK 10 isn't supported yet by @davidmc24

* Upgrade the version of Kotlin we test against to 1.2.31 by @davidmc24

* Correct change log (missing kotlin testing change) by @davidmc24

* Update travis config to allow failures in Java 11, as it won't be supported until Gradle 4.7 by @davidmc24

* see if turning sudo on fixed openjdk 9 download issue by @davidmc24

* Fixed infinite loop when a schema file contains multiple definitions of the same type (#47) by @davidmc24

* 0.14.1 by @davidmc24

* 0.14.2-SNAPSHOT by @davidmc24

* Stop creating default generated output directories when `outputDir` is customized and IntelliJ integration is used (#52) by @davidmc24

* 0.14.2 by @davidmc24

* 0.14.3-SNAPSHOT by @davidmc24

* Try expanding JDK version coverage in travis by @davidmc24

* Remove working JDKs from allow_failures, try a workaround for openjdk7 by @davidmc24

* more jdk compatibility tweaks by @davidmc24

* tweak memory settings for java 7 by @davidmc24

* tidy up matrix builds by @davidmc24

* don't allow java 7 failures by @davidmc24

* Update Gradle to 4.8, address Java 11 compatibility issues by @davidmc24

* don't allow failures in java 11 by @davidmc24

* try to get CI working by @davidmc24

* correct variables syntax by @davidmc24

* try to fix encryption error with java7 by @davidmc24

* try to fix encryption error with java7 by @davidmc24

* try to integrate code_quality by @davidmc24

* Add security policy by @davidmc24

* Merge pull request #53 from commercehub-oss/security-docs by @davidmc24

* Merge branch 'master' of github.com:commercehub-oss/gradle-avro-plugin by @davidmc24

* Add support for generating schema files (#56) by @davidmc24

* try to fix ssl issue for oraclejdk7 by @davidmc24

* try to fix ssl issue for oraclejdk7 by @davidmc24

* Update instructions for historical versions by @davidmc24

* remove oraclejdk7 build by @davidmc24

* Clarify instructions for generating schema files (#56) by @davidmc24

* Upgrade to gradle 4.9 by @davidmc24

* 0.15.0 by @davidmc24

* Upgrade gradle-bintray-plugin to 1.8.1 by @davidmc24

* 0.15.1-SNAPSHOT by @davidmc24

* Improve kotlin DSL support (fix boolean settings compatibility) by @davidmc24

* 0.15.1 by @davidmc24

* 0.15.2-SNAPSHOT by @davidmc24

* Add tests for build cache support by @davidmc24

* Fixing avro plugin cache by @dcabasson

* Merge branch 'fix_cache2' into build-cache by @davidmc24

* Update contribution to complete support for gradle build cache (#48) by @davidmc24

* Update plugin publishing mode to address Gradle 5.0 deprecation warning by @davidmc24

* Update gradle wrapper/testing to version 4.10.2 by @davidmc24

* Remove oracle JDKs from config by @davidmc24

* 0.16.0 by @davidmc24

* 0.16.1-SNAPSHOT by @davidmc24

* Add test to validate examples by @davidmc24

* Avro 1.9.0-SNAPSHOT, with jsr310 enabled by @rocketraman

* Support configuration of date/time logical type by @rocketraman

* Update custom record.vm to match upstream Avro 1.9 by @rocketraman

* Remove validateDefaults option by @rocketraman

* Fix code style violations by @rocketraman

* Build against Avro 1.9 release candidate by @rocketraman

* Use release version of Avro 1.9 by @rocketraman

* Merge pull request #70 from rocketraman/avro-1.9 by @davidmc24

* Update readme, changelog, and travis config; remove jdk7 add jdk12/ea by @davidmc24

* 0.17.0 by @davidmc24

* 0.17.1-SNAPSHOT by @davidmc24

* added a kotlin DSL example - becuase it took me a while to get it working by @jeeftor

* Merge pull request #78 from jeeftor/master by @davidmc24

* Various updates by @davidmc24

* Use new Lazy Configuration approach rather than internal conventions API by @davidmc24

* Remove .gitlab-ci.yml by @davidmc24

* Avro 1.9.0 -> 1.9.1 by @rocketraman

* Merge pull request #85 from rocketraman/avro-1.9.1 by @davidmc24

* Restore Avro 1.9.0 compatibility testing by @davidmc24

* Adjust GenerateAvroProtocolTask to properly declare classpath inputs by @davidmc24

* Update gradle to 5.6.2 by @davidmc24

* Try a simple github actions CI job by @davidmc24

* Try again with github actions by @davidmc24

* Adjust CI output by @davidmc24

* Try again to avoid gradle welcome banner in CI by @davidmc24

* try turning on github actions compatibility tests by @davidmc24

* fix ci syntax by @davidmc24

* fix yaml indentation by @davidmc24

* comment out fail fast by @davidmc24

* fix matrix structure by @davidmc24

* try matrix with allowed failures by @davidmc24

* give up on conditional failures allowed for now; exclude java 13 by @davidmc24

* info output for builds by @davidmc24

* Try to resolve the test failures on windows regarding default encoding handling by @davidmc24

* Fix encoding support on windows, for real this time by @davidmc24

* add unsupported-java-versions job by @davidmc24

* run the unsupported java versions job on all the OS versions by @davidmc24

* Update badge to use github actions rather than travis by @davidmc24

* fix CI badge syntax by @davidmc24

* fix CI badge image by @davidmc24

* Merge branch 'github-actions' by @davidmc24

* add support for generating optional getters

* add doc for optional getter field generation

* Merge pull request #90 from bspeakmon/feature/add-optional-type-support by @davidmc24

* Update changelog to note the recent merged pull request by @davidmc24

* disable the gradle daemon to try to eliminate the sporadic clean failure on windows by @davidmc24

* Remove security policy; not a CommerceHub OSS project any more by @davidmc24

* Update various files for commercehub-oss -> davidmc24 github move by @davidmc24

* Update issue templates by @davidmc24

* Update bug_report.md to add a checklist by @davidmc24

* Update feature_request.md to include a checklist by @davidmc24

* Working version of custom conversions against modern gradle; still need to adjust for earlier versions by @davidmc24

* Don't use MapProperty yet; it wasn't introduced until Gradle 5.1 by @davidmc24

* Don't use ListProperty by @davidmc24

* Don't use Class.newInstance(), as it was deprecated in Java 11 by @davidmc24

* Merge branch 'customConversions' by @davidmc24

* don't bother doing maintenance builds on old OS versions; only use latest by @davidmc24

* update another place with os versions that I missed by @davidmc24

* 0.18.0 by @davidmc24

* 0.18.1-SNAPSHOT by @davidmc24

* Add support for Gradle 6.0-6.2, drop support for gradle <5.1 (#101) by @davidmc24

* update to Avro 1.9.2 since https://issues.apache.org/jira/browse/AVRO-2548 has been fixed there by @markush81

* Merge pull request #104 from markush81/master by @davidmc24

* Update changelog for #104 by @davidmc24

* Add support for Java 13 by @davidmc24

* Add support for testing multiple kotlin versions by @davidmc24

* Update plugin's own build to address some deprecation warnings of APIs being removed in Gradle 7 by @davidmc24

* BuildCacheSupportFunctionalSpec no longer needs an @IgnoreIf, as we only support versions where the Build Cache is supported. by @davidmc24

* Remove license plugin by @davidmc24

* Lots of test updates by @davidmc24

* Add tests for Kotlin DSL usage (#61) by @davidmc24

* Handle a test that appears to fail on Windows due to weird file locking behaviors by @davidmc24

* Update to note a Kotlin-Java version incompatibility by @davidmc24

* Update to gradle 6.2.2 by @davidmc24

* Official Gradle Wrapper Validation Action by @davidmc24

* Support Task Configuration Avoidance (#97) by @davidmc24

* Update test result directory names by @davidmc24

* Work around a bug showing in Gradle 5.1 by @davidmc24

* See if we can get Java 14 support working with a Gradle 6.3 nightly build by @davidmc24

* Update codenarc support so it works in Java 14+; update compatibility notes by @davidmc24

* 0.19.0 by @davidmc24

* 0.19.1-SNAPSHOT by @davidmc24

* Create FUNDING.yml by @davidmc24

* Update bug_report.md by @davidmc24

* Fix schema dependency resolution when types are referenced with a `{ "type": NAME }` block rather than just `NAME` (#107) by @davidmc24

* Eliminate `NullPointerException` handling in schema dependency resolution, as it no longer appears to be needed. by @davidmc24

* 0.19.1 by @davidmc24

* 0.19.2-SNAPSHOT by @davidmc24

* Add  (#115) by @davidmc24

* Update version compatibility support by @davidmc24

* 0.20.0 by @davidmc24

* 0.20.1-SNAPSHOT by @davidmc24

* Tweak how the jobs are run to reduce execution time and unreliability by @davidmc24

* try using eskatos/gradle-command-action to improve build speed by @davidmc24

* Update to Avro 1.10.0 by @mcwhitak

* Test cleanup and CHANGES.md additions for Avro 1.10.0 support by @mcwhitak

* Fix test name for optionalGettersForNullableFieldsOnly by @mcwhitak

* Formatting fixes and test simplification by @mcwhitak

* try turning on build scans by @davidmc24

* fix the build by @davidmc24

* some build tweaks for performance by @davidmc24

* Correcting cache annotation for classpath by @dcabasson

* Correcting cache annotation for classpath - add items to unreleased changelog by @dcabasson

* Merge pull request #118 from dcabasson/cache by @davidmc24

* Add a test project to aid in reproducing problems by @davidmc24

* Merge branch 'master' into avro-1.10.0 by @mcwhitak

* Merge branch 'avro-1.10.0' of https://github.com/mcwhitak/gradle-avro-plugin into avro-1.10.0 by @mcwhitak

* Fix optionalGettersForNullableFieldsOnly test naming and CHANGES formatting by @mcwhitak

* Ensure option conditions are checked against relevant file portions by @mcwhitak

* Remove apache staging dependency and pull release from JCenter by @mcwhitak

* Confirm that the nullable getter is still generated when createOptionalGetters is enabled by @davidmc24

* Merge branch 'master' of github.com:davidmc24/gradle-avro-plugin into avro-1.10.0 by @mcwhitak

* Ensure createOptionalGetters test checks correct mainClassContent by @mcwhitak

* Remove extraneous newline from test repository definition by @mcwhitak

* Merge pull request #119 from mcwhitak/avro-1.10.0 by @davidmc24

* 0.21.0 by @davidmc24

* 0.21.1-SNAPSHOT by @davidmc24

* add coverage reporting using JaCoCo and Codecov by @davidmc24

* flag codecov report by OS by @davidmc24

* Add support for multiple IDL files with the same name in different directories (#123) by @davidmc24

* Update AvroUtils and Strings, with unit test coverage by @davidmc24

* Fix codenarc failures by @davidmc24

* Fix a test typo (Fixes #125) by @davidmc24

* Update test-project to remove references to dataTimeLogicalType by @davidmc24

* Plugin DSL is no longer incubating, and is now recommended. by @davidmc24

* Upgrade to Avro 0.10.1 because of https://issues.apache.org/jira/browse/AVRO-2924 by @vlk32

* Added compatibility testing against 1.10.0 and 1.10.1 by @vlk32

* More spock assert about generated Java Code was added. Type uuid is not compilable with Avro 1.10.1 by @vlk32

* Avro 1.10.1 was set also in test-project/build.gradle by @vlk32

* Merge pull request #131 from vlk32/master by @davidmc24

* Minor post pull-request-merge tweaks by @davidmc24

* Update compatibility with Java/Gradle, tweak build spead by @davidmc24

* Improve Java version support by @davidmc24

* Correct Java 15 Gradle version compatibility by @davidmc24

* Add support for configuration cache and update kotlin testing by @davidmc24

* Make codenarc happy by @davidmc24

* Address not all versions of kotlin plugin supporting config cache by @davidmc24

* Merge pull request #132 from davidmc24/config-cache by @davidmc24

* 0.22.0 by @davidmc24

* 0.23.0-SNAPSHOT by @davidmc24

* Add link to discussions for Q&A by @davidmc24

* Revert "Add link to discussions for Q&A" by @davidmc24

* Add link to discussions for Q&A by @davidmc24

* Merge pull request #137 from davidmc24/template-chooser by @davidmc24

* Add feature requests to template chooser by @davidmc24

* Try moving feature requests to discussions by @davidmc24

* Update README to reflect changes in historical version handling by @davidmc24

* Update notes about pre-1.0 versions by @davidmc24

* Work towards a 1.0 release by @davidmc24

* Fix up POMs, add signing; to satisfy Maven Central requirements by @davidmc24

* 1.0.0 by @davidmc24

* 1.0.1-SNAPSHOT by @davidmc24

* 1.0.0 (take 2) by @davidmc24

* 1.0.0 (take 3) by @davidmc24

* 1.0.1-SNAPSHOT by @davidmc24

* Remove remaining references to jcenter by @davidmc24

* Build using Avro 1.10.2 by @davidmc24

* Build using Gradle 6.8.3 by @davidmc24

* Try running compatibility tests from github actions rather than gradle by @davidmc24

* Try extracting kotlin plugin compatibility testing to its own workflow by @davidmc24

* Try to fix CI job by @davidmc24

* Try to fix CI job by @davidmc24

* Fix testKotlinPluginCompatibility by @davidmc24

* Next try at kotlin compatibility by @davidmc24

* More matrix stuff by @davidmc24

* More matrix compatibility tweaks by @davidmc24

* More matrix compatibility tweaks by @davidmc24

* More matrix compatibility tweaks by @davidmc24

* More matrix compatibility tweaks by @davidmc24

* Upgrade gradle used to build the project to 7.0-rc-1 in order to support the build running on Java 16 by @davidmc24

* More changes for Gradle 7 compatibility by @davidmc24

* Add gradle compatibility tests by @davidmc24

* More spock 2.0 and Gradle 7 compatibility changes by @davidmc24

* Fix checkstyle violation by @davidmc24

* Tweak CI targets by @davidmc24

* Adjust compatibility notes/testing for java 16/17 by @davidmc24

* Use nexus publish plugin to automate management of OSSRH interactions by @davidmc24

* Merge branch 'publishing' by @davidmc24

* Merge branch 'master' into matrix-compat by @davidmc24

* Adjust test report directories by @davidmc24

* Fix os compatibility tests by @davidmc24

* Merge branch 'matrix-compat' by @davidmc24

* Update changelog by @davidmc24

* 1.1.0 by @davidmc24

* 1.1.1-SNAPSHOT by @davidmc24

* Try to fix publishing by @davidmc24

* Temporary change to test the CI publishing fix by @davidmc24

* Revert "Temporary change to test the CI publishing fix" by @davidmc24

* Merge branch 'fix-publish' by @davidmc24

* Re-add support for Avro 1.9.x by @davidmc24

* Update release notes by @davidmc24

* Throw error if avdl will be overwritten by @olahungerford

* Add to changelog by @olahungerford

* Minor touchups on avpr conflict detection by @davidmc24

* Add support for better coverage reporting... and disable it because it conflicts with configuration caching in Gradle 7.0 by @davidmc24

* Merge branch 'feature/fail-if-avpr-will-be-overwritten' by @davidmc24

* 1.2.0 by @davidmc24

* 1.2.1-SNAPSHOT by @davidmc24

* Add examples/default-custom-types by @davidmc24

* Update for Gradle 7.1 by @davidmc24

* update to setup-java v2 by @davidmc24

* Update comment on code coverage support by @davidmc24

* Update build/test to Gradle 7.1.1 by @davidmc24

* Update test-project to reproduce #167 by @davidmc24

* Explicitly declare dependencies between sources jar tasks and GenerateAvroJavaTasks (#167) by @davidmc24

* Satisfy checkstyle by @davidmc24

* Simplify sources jar handling and fix configuration avoidance by @davidmc24

* Fix compatibility with Gradle before 6.0 by @davidmc24

* 1.2.1 by @davidmc24

* 1.2.2-SNAPSHOT by @davidmc24

* Upgrade to Gradle 7.2 by @davidmc24

* Update CI to indicate that Java 17 has been released, even though it's not supported yet. by @davidmc24

* Upgrade CodeNarc to build cleanly on Java 17 by @davidmc24

* Add some scripts to aid troubleshooting by @davidmc24

* Update readme to use implementation rather than compile configuration by @davidmc24

* Add avsc-from-external-jar and avsc-from-subproject examples by @davidmc24

* Make some minor adjustments to GradleAvroProtocolTask due to investigation of #174 by @davidmc24

* Add design for potential "additional schema" configurations feature by @davidmc24

* Add block to example to show custom resource dir usage by @davidmc24

* Update avsc-from-subproject example to compile schema for schema project, exclude generated classes from cat jar by @davidmc24

* Fix cachability for cat jar in example by @davidmc24

* don't delegate to the system classloader, even implicitly by @davidmc24

* Add an example that generated a UUID field by @davidmc24

* Add test project for kotlin by @davidmc24

* Update for avro 1.11.0 by @davidmc24

* Drop support for Avro 1.9.0-1.10.2 by @davidmc24

* Update kotlin compatibility testing by @davidmc24

* Update Java compatibility testing by @davidmc24

* Update to build with Gradle 7.3; add Java 17 compatibility by @davidmc24

* Attempt to fix kotlin compatibility testing by @davidmc24

* More kotlin compatibility testing fixes by @davidmc24

* update to gradle-build-action v2 by @davidmc24

* 1.3.0 by @davidmc24

* 1.3.1-SNAPSHOT by @davidmc24

* enable automatic staging repository releasing by @davidmc24

* Drop kotlin plugin integration by @davidmc24

* Add note about seeking new maintainer to readme by @davidmc24

* 1.4.0 by @davidmc24

* 1.4.1-SNAPSHOT by @davidmc24

* Add 'additionalVelocityTool' capability. Allows user to provide tools that will be available in Velocity templates at generation time.

* Merge pull request #211 from dcracauer/master by @davidmc24

* Update changelog by @davidmc24

* Update versions of Gradle/Avro/Java by @davidmc24

* 1.5.0 by @davidmc24

* 1.5.1-SNAPSHOT by @davidmc24

* Support specifying classpath for additional velocity tool classes by @crtlib

* Add test for classpath property in GenerateAvroJavaTask by @crtlib

* Merge pull request #222 from crtlib/master by @davidmc24

* Minor cleanup by @davidmc24

* Fix test: escape backslashes in a Windows path by @crtlib

* Merge pull request #223 from crtlib/master by @davidmc24

* Drop Java compatibility testing for outdated versions by @davidmc24

* Update for Gradle 7.6 and Java 19 by @davidmc24

* Fix up cross-version compatibility for the Gradle 7.6 adjustments by @davidmc24

* Update changelog by @davidmc24

* 1.6.0 by @davidmc24

* 1.6.1-SNAPSHOT by @davidmc24

* Update changelog by @davidmc24

* Add ability to use conversions and type factories residing outside of build classpath by @erdi

* Fix compatibility with Gradle < 7.1 by @erdi

* Add documentation for using conversions and type factories located outside of build classpath by @erdi

* Add deprecations for methods used to configure conversions and type factories with classes by @erdi

* Merge pull request #228 from erdi/conversions-and-type-factories-outside-build-classpath by @davidmc24

* Prep for 1.7.0 release by @davidmc24

* 1.7.1-SNAPSHOT by @davidmc24

* Fix vulnerabilities in transitive dependencies by @trains-are-super

* Merge pull request #229 from BlacCello/fix-vuln by @davidmc24

* 1.7.1 by @davidmc24

* 1.7.2-SNAPSHOT by @davidmc24

* Update github actions that ran in node 12 by @davidmc24

* Fix Kotlin DSL setup snippet by @TopHatCroat

* Merge pull request #231 from TopHatCroat/master by @davidmc24

* Disable javadoc warnings by @davidmc24

* Update Avro to 1.11.2 by @davidmc24

* 1.8.0 by @davidmc24

* 1.8.1-SNAPSHOT by @davidmc24

* update avro to 1.11.3 by @raphaelauv

* update readme for avro v1.11.3 by @mavogel

* remove create protocol test for empty name. See https://github.com/davidmc24/gradle-avro-plugin/pull/238#issuecomment-1752965000 for details by @mavogel

* Merge pull request #239 from mavogel/bump/avro by @davidmc24

* 1.9.0 by @davidmc24

* 1.9.1-SNAPSHOT by @davidmc24

* Upgrade commons-compress due to CVS-2023-42503 by @davidmc24

* 1.9.1 by @davidmc24

* 1.9.2-SNAPSHOT by @davidmc24

* Update README.md by @davidmc24

* Update workflows and docs for fork by @philipp94831 in [#1](https://github.com/bakdata/gradle-avro-plugin/pull/1)

* Build using bakdata CI by @philipp94831 in [#3](https://github.com/bakdata/gradle-avro-plugin/pull/3)

* Upgrade to Avro 1.12.1 by @philipp94831 in [#4](https://github.com/bakdata/gradle-avro-plugin/pull/4)


### New Contributors
* @philipp94831 made their first contribution in [#4](https://github.com/bakdata/gradle-avro-plugin/pull/4)
* @davidmc24 made their first contribution
* @mavogel made their first contribution
* @raphaelauv made their first contribution
* @TopHatCroat made their first contribution
* @trains-are-super made their first contribution
* @erdi made their first contribution
* @crtlib made their first contribution
* @ made their first contribution
* @olahungerford made their first contribution
* @vlk32 made their first contribution
* @mcwhitak made their first contribution
* @dcabasson made their first contribution
* @markush81 made their first contribution
* @rocketraman made their first contribution
* @jeeftor made their first contribution
* @ejwood79 made their first contribution
* @keeganwitt made their first contribution

<!-- generated by git-cliff -->
