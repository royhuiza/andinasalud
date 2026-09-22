package pe.upeu.andinasalud.domain.model

import kotlinx.datetime.LocalDateTime

data class Cita(
    val id: String,
    val specialty: String,
    val doctor: Medico,
    val location: Sede,
    val dateTime: LocalDateTime,
    val status: EstadoCita,
    val reason: String,
    val instructions: String
)
