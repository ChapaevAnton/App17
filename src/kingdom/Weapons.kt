package kingdom

enum class Weapons(private val nameWeapons: String) {
    SWORD("sword"),
    DAGGER("dagger"),
    BOW("bow"),
    AXE("axe"),
    STAFF("staff"),
    NONE("none");

    override fun toString(): String {
        return nameWeapons
    }
}