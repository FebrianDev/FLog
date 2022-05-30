# FLog
FLog is a simple log library for Android

## Installation

**Step 1:** Add it in your settings.gradle at the end of repositories:

```css
dependencyResolutionManagement {
    ...
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2:** Add the dependency

```css
dependencies {
   implementation 'com.github.FebrianDev:FLog:v1.0.0'
}
```
Then sync gradle build files.

## Usage

Once installed, you can add the FLog from within the context of your MainActivity like so:

```kotlin
// Test Flog
Flog.v("Hello Verbose")
Flog.d("Hello Debug")
Flog.i("Hello Info")
Flog.w("Hello Warn")
Flog.e("Hello Error")
