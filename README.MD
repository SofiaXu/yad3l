# yad3l
yad3l (**Y**et **A** **DDD** **L**ite) is a 
light Weight, Progressive DDD Clean Architecture 
for Spring and Android.

## Project Structure
```yaml
yad3l: # Main Container
  - "yad3l-application" # Application Layer
  - yad3l-components: # Components
      - "yad3l-components-android" # Components for android
      - "yad3l-components-common" # Common Components
      - "yad3l-components-spring" # Components for Spring
  - "yad3l-domain" # Domain Layer
  - "yad3l-infrastructure" # Infrastructure Layer
  - yad3l-starters:
      - "yad3l-android-starter" # Starter for Android
      - "yad3l-spring-starter" # Starter for Spring
```