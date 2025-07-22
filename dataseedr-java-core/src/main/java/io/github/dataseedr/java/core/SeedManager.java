package io.github.dataseedr.java.core;

import java.util.List;
import lombok.Builder;
import lombok.Singular;

@Builder
public class SeedManager {
    @Singular
    private final List<Seeder> seeders;

    public void clean() {
        this.seeders.forEach(Seeder::clean);
    }

    public void seed(String name) {
        this.seeders.forEach(seeder -> seeder.seed(name));
    }
}
