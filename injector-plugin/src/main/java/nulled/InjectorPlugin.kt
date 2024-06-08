package nulled

import org.gradle.api.Plugin
import org.gradle.api.Project

open class InjectorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create("injector", InjectTask::class.java)
    }
}