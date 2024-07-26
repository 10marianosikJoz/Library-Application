plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "Library"
include("account")
include("book")
include("rental")
include("payment")
include("infrastructure")
