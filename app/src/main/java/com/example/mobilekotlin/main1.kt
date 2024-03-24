fun main() {
    val clubs = mutableListOf<Club>(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 6, 3, 1),
        Club("Chelsea", 6, 6, 5, 3, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0)
    )

    val sortedClubs = filterAndSort(clubs, ::sortByNumberTrophyTotal)
    // Hasil sorting total trofi
    println("==========================================================")
    println("Urutan klub berdasarkan jumlah total trofi: ")
    sortedClubs.forEach { club -> println("${club.name}: ${club.totalTrophies}trophy") }

    val filteredClubs = filterAndSort(clubs, ::filterByUCLUEL)
    println("==========================================================")
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    filteredClubs.forEach { println(it.name) }

    // Panggil extension function Club recap
    println("==========================================================")
    println("\t\t\t\tRECAP PEROLEHAN TROFI")
    println("==========================================================")
    println(clubs.find { it.name == "Liverpool" }?.recap())
    println(clubs.find { it.name == "Manchester United" }?.recap())
    println(clubs.find { it.name == "Chelsea" }?.recap())
    println(clubs.find { it.name == "Manchester City" }?.recap())
    println(clubs.find { it.name == "Arsenal" }?.recap())
}

fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    return clubs.sortedByDescending { it.totalTrophies }
}

// Fungsi filter
fun filterByUCLUEL(clubs: List<Club>): List<Club> {
    return clubs.filter { it.championsLeagueTrophies == 0 && it.europaLeagueTrophies == 0 }
}
