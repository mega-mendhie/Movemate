# Movemate

This is a simple Android app to implement the Movemate design. It also exemplifies clean user interface design coupled with clean architecture principles.  It's can serve as a reference for developers aiming to build scalable and maintainable Android applications.

## Features

-   **Clean Architecture**: Adheres to the principles of clean architecture, ensuring a clear separation of concerns across different layers of the application.

-   **Modern UI**: Implements contemporary UI/UX patterns to provide an intuitive user experience.

-   **Modular Design**: Structured to facilitate easy testing and scalability.

## Getting Started
**Prerequisites**

-   Android Studio Bumblebee or later

-   Android SDK 31 or higher

-   Gradle 7.0 or higher

### Installation

1.  **Clone the repository**:

    `git clone https://github.com/mega-mendhie/Movemate.git`

2.  **Open in Android Studio**:

    -   Launch Android Studio.
    -   Select `Open an existing project`.
    -   Navigate to the cloned `Movemate`  directory and open it.

3.  **Build and run the project**:

    -   Allow Android Studio to synchronize and build the project.
    -   Resolve any dependencies if prompted.
    -   Click the `Run`  button or use `Shift + F10`  to build and deploy the app.

## Project Structure

The project follows MVVM architecture aligned with clean architecture principles:

-   **presentation**: Contains the Android application module, including UI components and dependency injection setup.

-   **data**: Handles data sources, such as local database interactions.

-   **domain**: Defines the business logic and use cases.


## Core Libraries

The project leverages several modern Android libraries to streamline development, ensure scalability, and improve maintainability. Below is a list of the main libraries used and their purposes:

- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [Hilt](https://dagger.dev/hilt/) - A fully static and optimized compile-time dependency injection framework for Android.
- [Glide](https://bumptech.github.io/glide/) - An image loading and caching library for Android focused on smooth scrolling
- [Navigation Component](https://developer.android.com/training/testing/espresso) -To implement and easy navigation between fragments
- [Data Binding](https://developer.android.com/training/testing/espresso) - Bind data to app user interface
- [Room](https://developer.android.com/training/data-storage/room) - For local database management

## Screenshots 🌞
<img  src="https://raw.githubusercontent.com/mega-mendhie/Movemate/refs/heads/main/images/scrn1.png"  width="40%"> | <img  src="https://raw.githubusercontent.com/mega-mendhie/Movemate/refs/heads/main/images/scrn2.png"  width="40%"> | <img  src="https://raw.githubusercontent.com/mega-mendhie/Movemate/refs/heads/main/images/scrn3.png"  width="40%"> | <img  src="https://raw.githubusercontent.com/mega-mendhie/Movemate/refs/heads/main/images/scrn4.png"  width="40%">