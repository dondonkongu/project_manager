package com.example.projectmanager.Repository

import com.example.projectmanager.Domain.TeamDomain

class ProfileRepository {
    val myTeamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application ", "Project in Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend ", "Project in Progress"),
        TeamDomain("Kotlin Developer ", "Completed"),

        )

    val archiveItems: MutableList<String> = mutableListOf(
        "UI/UI ScreenShot",
        "Kotlin Source Code",
        "Source Code"

    )
}