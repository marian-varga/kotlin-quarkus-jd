package com.love2integrate

import jakarta.data.repository.CrudRepository
import jakarta.data.repository.Repository

@Repository
interface MyRepository : CrudRepository<MyEntity, String>