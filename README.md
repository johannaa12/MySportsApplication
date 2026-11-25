# My Sports - Android Application

A modern Android application built in **Kotlin** and **XML** featuring a multi-level navigation architecture using `BottomNavigationView` and Android `Fragment` transactions.

---

## 📱 App Overview & Architecture

The **My Sports** app implements a two-tier navigation structure:

1. **Primary Top-Level Destinations**: Accessible via the bottom navigation bar:
   - 🏠 **Home**: Default landing fragment
   - 👤 **Account**: Account overview fragment
   - ⚙️ **Profile**: User profile fragment
   - 🏆 **My Sports**: Primary sports hub fragment
2. **Secondary Sport Destinations**:
   - Within **My Sports**, users can select specific sports (*Football*, *Basketball*, *Volleyball*, *Tennis*, *Badminton*, *Baseball*, *Swimming*, *Boxing*).
   - Selecting a sport navigates to a dedicated **Sport Detail** view (`SportDetailFragment`) displaying sport-specific information.
   - Supports native hardware/gesture back-navigation (`addToBackStack`) and an in-app "Back to My Sports" action to return to the sports list seamlessly.

---

## 🛠️ Built With

* **Language**: [Kotlin](https://kotlinlang.org/)
* **UI Framework**: Android XML Layouts & Material Components (`BottomNavigationView`, `FrameLayout`, `ScrollView`, `LinearLayout`)
* **Architecture Components**: AndroidX `Fragment`, `AppCompatActivity`, `FragmentManager`
* **Build System**: Gradle with Kotlin DSL (`build.gradle.kts`)

---

## 🚀 How to Run the App

1. **Clone the repository**:
   ```bash
   git clone https://github.com/johannaa12/MySportsApplication.git
   ```
2. **Open in Android Studio**:
   - Launch Android Studio.
   - Select **File > Open** and choose the `MySportsApplication` project directory.
3. **Build & Run**:
   - Wait for Gradle sync to complete.
   - Select an Android Virtual Device (Emulator) or a connected physical Android device.
   - Click **Run** (`Shift + F10` or ▶️).

---

## 🧪 Testing

The project includes unit tests for Fragment instantiation and parameter handling:
```bash
./gradlew test
```
