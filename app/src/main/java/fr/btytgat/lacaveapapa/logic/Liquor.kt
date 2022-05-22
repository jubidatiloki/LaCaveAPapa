package fr.btytgat.lacaveapapa.logic

import fr.btytgat.lacaveapapa.logic.enums.LiquorTypeEnum

data class Liquor (
    private val id: String,
    private val name: String,
    private val type: LiquorTypeEnum,
    private val description: String
)