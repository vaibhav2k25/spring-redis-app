package dev.scorpio.redis.service;

import dev.scorpio.redis.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(value = "users", key = "#userId")
    public User getUserById(Long userId) {
        simulateSlowService();
        return new User(userId, "User_" + userId);
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000L); // Simulate delay
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
