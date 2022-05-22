package fr.btytgat.lacaveapapa.logic

data class Cellar(
    private val id: String,
    private val idParent: String?,
    private val name: String,
    private val description: String
)
