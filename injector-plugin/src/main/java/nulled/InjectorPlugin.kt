package nulled

import org.gradle.api.Plugin
import org.gradle.api.Project

class InjectorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create("inject", InjectTask::class.java)
    }
}