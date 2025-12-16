package com.love2integrate

import io.quarkus.runtime.StartupEvent
import jakarta.enterprise.context.ApplicationScoped
import jakarta.enterprise.event.Observes
import jakarta.transaction.Transactional

@ApplicationScoped
class DataInitializer(val myRepository: MyRepository) {

    @Transactional
    fun onStartup(@Observes ev: StartupEvent) {
        myRepository.insertAll(listOf(
            MyEntity().apply { field = "test value" },
            MyEntity().apply { field = "test value2" }))
    }
}