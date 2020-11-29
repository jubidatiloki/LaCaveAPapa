package fr.procorp.lacaveapapa.logic.historic


data class HistoricEntity (
    var id: Long,
    var date: String,
    var wineName: String,
    var action: HistoricAction,
    var quantity: Long?,
    var storageName: String
)

enum class HistoricAction(var label: String){
    REMOVE("remove"),
    ADD("ajout"),
    EDIT("édition")
}