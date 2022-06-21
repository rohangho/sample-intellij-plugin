package com.github.rohangho.sampleintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.rohangho.sampleintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
