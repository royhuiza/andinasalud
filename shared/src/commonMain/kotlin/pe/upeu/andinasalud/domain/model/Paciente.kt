package pe.upeu.andinasalud.domain.model

data class Paciente(
    val id: String,
    val firstName: String,
    val lastName: String,
    val dni: String,
    val email: String,
    val phone: String
)
