plugins {
    id("buildlogic.java-common-conventions")
    `java-library`

    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()

    pom {
        name.set(project.name)
        description.set("A library that streamlines integration testing by resetting services and seeding test data with minimal effort.")
        url.set("https://github.com/chehsunliu/seeder.java")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("chehsunliu")
                name.set("Che-Hsun Liu")
                url.set("https://github.com/chehsunliu")
            }
        }
        scm {
            url.set("https://github.com/dataseedr/dataseedr-java")
            connection.set("scm:git:git://github.com/dataseedr/dataseedr-java.git")
            developerConnection.set("scm:git:ssh://git@github.com/dataseedr/dataseedr-java.git")
        }
    }
}
