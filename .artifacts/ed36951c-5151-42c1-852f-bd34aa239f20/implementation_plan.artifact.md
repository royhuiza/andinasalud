# Implementation Plan - AndinaSalud Mobile App

This plan covers the development of the AndinaSalud mobile application using Kotlin Multiplatform and Compose Multiplatform, following the functional requirements RF-01 to RF-08.

## Proposed Changes

### Data Layer (In-Memory)
#### [NEW] [Models.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/Models.kt)
Definition of data classes: `Patient`, `Appointment`, `Specialty`, `Location`, and `AppointmentStatus`.

#### [NEW] [AndinaRepository.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/AndinaRepository.kt)
In-memory data management with simulated delays (800ms) for loading states.

### Navigation & Theming
#### [NEW] [AndinaTheme.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/ui/theme/AndinaTheme.kt)
Material 3 theme configuration with Light/Dark mode support.

#### [MODIFY] [App.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/App.kt)
Main entry point, Navigation implementation (BottomBar), and Screen routing.

### UI Components & Screens
#### [NEW] [Home.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/ui/screens/Home.kt)
Greeting, Next Appointment Card, Quick Actions.

#### [NEW] [AppointmentList.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/ui/screens/AppointmentList.kt)
Search, Filtering by Chips, Ordered List, Loading/Empty states.

#### [NEW] [AppointmentDetail.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/ui/screens/AppointmentDetail.kt)
Detail view and Cancellation dialog.

#### [NEW] [AppointmentForm.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/ui/screens/AppointmentForm.kt)
Validation logic and form fields.

#### [NEW] [Profile.kt](file:///D:/2026-2/DAM/AndinaSalud/shared/src/commonMain/kotlin/pe/upeu/andinasalud/ui/screens/Profile.kt)
Patient info and Theme toggle.

## Verification Plan
### Automated Tests
- Run `:androidApp:assembleDebug` to verify Android build.
- I will implement basic unit tests for the Repository logic if time permits.

### Manual Verification
- Verify that every screen shows a loading indicator for at least 800ms.
- Verify that Dark Mode applies globally.
- Verify that the Search filters correctly (case/accent insensitive).
- Verify navigation and back button behavior.
