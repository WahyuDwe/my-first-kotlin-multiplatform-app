package org.dwe.mycomposemultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform