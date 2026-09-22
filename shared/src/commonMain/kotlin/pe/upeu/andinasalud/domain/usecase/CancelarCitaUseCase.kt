package pe.upeu.andinasalud.domain.usecase

import pe.upeu.andinasalud.domain.repository.CitaRepository

class CancelarCitaUseCase(private val repository: CitaRepository) {
    suspend operator fun invoke(id: String): Result<Unit> = repository.cancelAppointment(id)
}
