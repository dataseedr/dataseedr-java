package io.github.dataseedr.java.redis;

import io.github.dataseedr.java.core.Seeder;
import redis.clients.jedis.UnifiedJedis;

public class RedisSeeder implements Seeder {
    private final UnifiedJedis client;

    public RedisSeeder(String connectionString) {
        this.client = new UnifiedJedis(connectionString);
    }

    @Override
    public void clean() {
        this.client.flushAll();
    }

    @Override
    public void seed(String name) {}
}
