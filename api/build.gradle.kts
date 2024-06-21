plugins {
    id("buildlogic.basic-library")
}

version = "0.1"

dependencies {
    api(libs.kotlinx.datetime)
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        version = version.toString() + if (project.hasProperty("release")) "" else "-SNAPSHOT"
    }
}
