package com.love2integrate

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.io.Serializable

@Entity
class MyEntity : Serializable {
    @Id
    var field: String? = null
}