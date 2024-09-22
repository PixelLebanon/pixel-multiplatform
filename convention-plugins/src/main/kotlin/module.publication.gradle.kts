import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.`maven-publish`

//plugins {
//    `maven-publish`
//    signing
//}
//
//publishing {
//    // Configure all publications
//    publications.withType<MavenPublication> {
//        // Stub javadoc.jar artifact
//        artifact(tasks.register("${name}JavadocJar", Jar::class) {
//            archiveClassifier.set("javadoc")
//            archiveAppendix.set(this@withType.name)
//        })
//
//        // Provide artifacts information required by Maven Central
//        pom {
//            name.set("Pixel Multiplatform Library")
//            description.set("A Multiplatform UI Library for Android and iOS")
//            url.set("https://github.com/PixelLebanon/pixel-multiplatform")
//
//            licenses {
//                license {
//                    name.set("MIT")
//                    url.set("https://opensource.org/licenses/MIT")
//                }
//            }
//            developers {
//                developer {
//                    id.set("Vordead")
//                    name.set("Mohamad Hamade")
//                    organization.set("PixelLebanon")
//                    organizationUrl.set("io.github.pixellebanon")
//                }
//            }
//            scm {
//                url.set("https://github.com/PixelLebanon/pixel-multiplatform")
//            }
//        }
//    }
//}
//
//signing {
//    if (project.hasProperty("signing.gnupg.keyName")) {
//        useGpgCmd()
//        sign(publishing.publications)
//    }
//}
