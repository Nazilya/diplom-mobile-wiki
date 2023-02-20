## Учебный проект по автоматизации тестирования мобильного приложения Wikipedia

<p align="center">
<img title="Работа в Сбере" src="images/screens/wiki-logo.jpeg">
</p>


## :maple_leaf: Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

## :maple_leaf:Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://developer.android.com/studio/"><img src="images/logo/androidstudio.svg" width="50" height="50"  alt="AndroidStudio"/></a>
<a href="https://appium.io/"><img src="images/logo/appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="https://appium.io/"><img src="images/logo/appium-inspector.png" width="50" height="50"  alt="AppiumInspector"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://www.browserstack.com/"><img src="images/logo/browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="images/logo/jira-logo.svg" width="50" height="50"  alt="Atlassian Jira"/></a>
</p>

## :maple_leaf: Список проверок, реализованных в автотестах

- [x] Проверка элементов навигационного меню


## :maple_leaf: Запуск тестов

###  Локальный запуск :
1. Запуск с командной строки: gradle clean test
2. Получение отчёта: gradle allureServe

###  Удаленный запуск (в Jenkins):

