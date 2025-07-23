package io.github.dataseedr.java.redis;

import io.github.dataseedr.java.core.SeedManager;
import org.junit.jupiter.api.Test;

class RedisSeederTest {
    @Test
    void testIsUsable() {
        var manager = SeedManager.builder()
                .seeder(new RedisSeeder("redis://127.0.0.1:6379"))
                .build();
        manager.clean();
    }
}
