package kingdom

enum class Weapons(private val nameWeapons: String) {
    SWORD("sword"),
    DAGGER("dagger"),
    BOW("bow"),
    COMPOSITE_BOW("composite bow"),
    AXE("axe"),
    AK47("ak-47"),
    STAFF("staff"),
    NONE("none");

    override fun toString(): String {
        return nameWeapons
    }
}