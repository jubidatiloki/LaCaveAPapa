package fr.btytgat.lacaveapapa.logic

import java.time.LocalDate

data class Historic (
    private val id: String,
    private val idCellar: String,
    private val date: LocalDate,
    private val action: String,
    private val liquorName: String,
    private val quantity: Int?,
    private val comment: String
)