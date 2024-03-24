data class Club(
    val name: String,
    val premierLeagueTrophies: Int,
    val faCupTrophies: Int,
    val eflCupTrophies: Int,
    val championsLeagueTrophies: Int,
    val europaLeagueTrophies: Int
) {
    val totalTrophies: Int
        get() = premierLeagueTrophies + faCupTrophies + eflCupTrophies + championsLeagueTrophies + europaLeagueTrophies

    fun recap(): String {
        return "$name berhasil meraih $premierLeagueTrophies trofi Liga Primer Inggris, $faCupTrophies trofi FA, $eflCupTrophies trofi EFL, $championsLeagueTrophies trofi Liga Champions, dan $europaLeagueTrophies trofi Liga Eropa UEFA."
    }
}