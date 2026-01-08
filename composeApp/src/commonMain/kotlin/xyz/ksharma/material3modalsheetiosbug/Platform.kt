package xyz.ksharma.material3modalsheetiosbug

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform