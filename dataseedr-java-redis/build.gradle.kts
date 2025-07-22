plugins {
    id("buildlogic.java-library-conventions")
}

dependencies {
    api(project(":dataseedr-java-core"))
    compileOnly("redis.clients:jedis:6.0.0")

    testImplementation("redis.clients:jedis:6.0.0")
}
