plugins {
    application
    id("common-build")
}

application {
    mainClass.set("com.playground.gui.PlaygroundUI")
}



dependencies{
    implementation(project(":PlaygroundCore"))
}