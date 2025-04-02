package com.example.projectmanager.Repository

import com.example.projectmanager.Domain.OngoingDomain

class MainRepository {
    val items = listOf(
        OngoingDomain("Food app","June 12, 2023",50, "ongoing1"),
        OngoingDomain("AI Recording","April 11, 2024",60, "ongoing2"),
        OngoingDomain("Weather app","July 25, 2023",25, "ongoing3"),
        OngoingDomain("E-book app","March 6, 2025",80, "ongoing4")

    )
}