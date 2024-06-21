plugins {
    id("buildlogic.basic-library")
}

version = "0.2"

dependencies {
    api(projects.api)
    implementation(libs.guava)
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        version = version.toString() + if (project.hasProperty("release")) "" else "-SNAPSHOT"
    }
}
